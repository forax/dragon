package fr.umlv.dragon.ast;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;

import fr.umlv.dragon.rt.Array;
import fr.umlv.dragon.rt.Block;
import fr.umlv.dragon.rt.Call;
import fr.umlv.dragon.rt.Dict;
import fr.umlv.dragon.rt.Fun;
import fr.umlv.dragon.rt.If;
import fr.umlv.dragon.rt.Literal;
import fr.umlv.dragon.rt.Load;
import fr.umlv.dragon.rt.Parameter;
import fr.umlv.dragon.rt.RTError;
import fr.umlv.dragon.rt.Return;
import fr.umlv.dragon.rt.Store;
import fr.umlv.dragon.rt.While;

public class Interpreter {
  static class Env {
    final HashMap<String, Object> slots = new HashMap<>();
    final Dict globals;
    
    public Env(Dict globals) {
      this.globals = globals;
    }

    public Object load(String name) {
      Object value = slots.get(name);
      if (value != null) {
        return value;
      }
      return globals.get(name);
    }
    
    public void store(String name, Object value) {
      slots.put(name, value);
    }
  }
  
  @SuppressWarnings("serial")
  static class ReturnError extends Error {
    final Object value;
    
    ReturnError(Object value) {
      super(null, null, false, false);
      this.value = value;
    }
  }
  
  static final Dict MAPPING_NAMES =
      Dict.of("wait", "", "notify", "", "notifyAll", "", "getClass", "",
              "equals", "", "hashCode", "", "toString", "");
  
  private static final ClassValue<Dict> VIRTUAL_DICT = new ClassValue<Dict>() {
    @Override
    protected Dict computeValue(Class<?> type) {
      Dict dict = new Dict();
      Lookup lookup = MethodHandles.publicLookup();
      Arrays.stream(type.getMethods())
        .filter(m -> !Modifier.isStatic(m.getModifiers()))
        .filter(m -> m.getDeclaringClass() != Object.class)
        .forEach(m -> {
          MethodHandle rawMH;
          try {
            rawMH = lookup.unreflect(m);
          } catch (IllegalAccessException e) {
            return; // skip it
          }
          
          MethodHandle mh = rawMH.asType(rawMH.type().generic()).asSpreader(Object[].class, m.getParameterCount());
          
          Array<Parameter> parameters = new Array<>();
          Arrays.stream(m.getParameters()).map(p -> new Parameter(p.getName(), false)).forEach(parameters::append);
          Fun fun = new Fun(parameters, (globals, receiver, args) -> {
            try {
              return mh.invoke(receiver, args);
            } catch(Throwable e) {
              if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
              }
              if (e instanceof Error) {
                throw (Error)e;
              }
              throw new RTError(e);
            }
          });
          
          String name = m.getName();
          if (!dict.containsKey(name)) {   //FIXME, manage overloads
            dict.append(name, fun);
          }
        });
      
      dict.append("==", new Fun(Parameter.of("other"), NativeCall.method(Object::equals)));
      dict.append("!=", new Fun(Parameter.of("other"), NativeCall.method((a, b) -> a.equals(b))));
      dict.append("hash", new Fun(Parameter.of(), NativeCall.method(Object::hashCode)));
      dict.append("str", new Fun(Parameter.of(), NativeCall.method(Object::toString)));
      
      //System.out.println("dict for " + type.getName());
      //System.out.println(dict);
      
      return dict;
    }
  };
  
  private static final Object UNDEFINED = null;  //FIXME
  
  private static final Visitor<Env, Object> VISITOR;
  static {
    Visitor<Env, Object> visitor = new Visitor<>();
    visitor
      .when(Literal.class, (literal, env) -> {
        switch(literal.kind()) {
        case INTEGER:
          return Interpreter.VISITOR.call(
              new Call(Optional.empty(), new Load("int"), Array.of(new Literal(Literal.Kind.STRING, literal.value()))),
              env);
        default:
          return literal.value();  
        }
      })
      .when(Block.class, (block, env) -> {
        Object result = UNDEFINED;
        for(Expr expr: block.exprs()) {
          result = Interpreter.VISITOR.call(expr, env);
        }
        return result;
      })
      .when(Load.class, (load, env) -> {
         return env.load(load.name());
      })
      .when(Store.class, (store, env) -> {
        env.store(store.name(), Interpreter.VISITOR.call(store.expr(), env));
        return UNDEFINED;
      })
      .when(If.class, (_if, env) -> {
        Object condition = Interpreter.VISITOR.call(_if.condition(), env);
        if ((Boolean)condition) {
          return Interpreter.VISITOR.call(_if.trueExpr(), env);
        }
        return Interpreter.VISITOR.call(_if.falseExpr(), env);
      })
      .when(While.class, (_while, env) -> {
        while((Boolean)Interpreter.VISITOR.call(_while.condition(), env)) {
          Interpreter.VISITOR.call(_while.body(), env);
        }
        return UNDEFINED;
      })
      .when(Call.class, (call, env) -> {
        Fun fun;
        Object receiver;
        if (call.receiver().isPresent()) {
          receiver = Interpreter.VISITOR.call(call.receiver().get(), env);
          Dict dict = VIRTUAL_DICT.get(receiver.getClass());
          String name = (call.name() instanceof Load)? ((Load)call.name()).name() :(String)Interpreter.VISITOR.call(call.name(), env);
          fun = (Fun)dict.get(name);
        } else {
          receiver = UNDEFINED;
          fun = (Fun)Interpreter.VISITOR.call(call.name(), env);
        }
        
        Object[] args = new Object[call.args().length()];
        for(int i = 0; i < args.length; i++) {
          args[i] = Interpreter.VISITOR.call(call.args().get(i), env);
        }
        return fun.nativeCall().call(env.globals, receiver, args);
      })
      .when(Return.class, (_return, env) -> {
        Object value = Interpreter.VISITOR.call(_return.expr(), env);
        throw new ReturnError(value);
      })
      .when(Fun.class, (fun, env) -> {
        return fun;
      });
    VISITOR = visitor;
  }
  
  public static Object interpret(Fun fun, Dict globals, Object receiver, Object[] args) {
    Env env = new Env(globals);
    env.store("this", receiver);
    for(int i = 0; i < args.length; i++) {
      env.store(fun.params().get(i).name(), args[i]);
    }
    try {
      return VISITOR.call(fun.body(), env);
    } catch(ReturnError returnError) {
      return returnError.value;
    }
  }
}
