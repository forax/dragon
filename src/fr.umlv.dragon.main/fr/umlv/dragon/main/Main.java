package fr.umlv.dragon.main;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

import fr.umlv.dragon.ast.ASTBuilder;
import fr.umlv.dragon.ast.Interpreter;
import fr.umlv.dragon.rt.Array;
import fr.umlv.dragon.rt.Block;
import fr.umlv.dragon.rt.Dict;
import fr.umlv.dragon.rt.Fun;
import fr.umlv.dragon.rt.Parameter;
import fr.umlv.dragon.rt.NativeCall;
import fr.umlv.dragon.rt.RTError;

public class Main {
  @SuppressWarnings("unused")
  private static Object integer(Dict globals, Object receiver, Object[] args) {
    return Integer.parseInt((String)args[0]);
  }
  @SuppressWarnings("unused")
  private static Object print(Dict globals, Object receiver, Object[] args) {
    System.out.println(Arrays.stream(args).map(String::valueOf).collect(Collectors.joining(" ")));
    return null;
  }
  @SuppressWarnings("unused")
  private static Object assert_(Dict globals, Object receiver, Object[] args) {
    if (!(Boolean)args[0]) {
      throw new RTError("assertion failed !");
    }
    return null;
  }
  @SuppressWarnings("unused")
  private static Object def(Dict globals, Object receiver, Object[] args) {
    //System.out.println("def: " + Arrays.toString(args));
    
    Object value = args[1];
    globals.append(args[0].toString(), value);
    return value;
  }
  @SuppressWarnings("unused")
  private static Object array(Dict globals, Object receiver, Object[] args) {
    return Array.of(args).freeze();  
  }
  @SuppressWarnings("unused")
  private static Object dict(Dict globals, Object receiver, Object[] args) {
    return Dict.of(args).freeze();
  }
  
  public static void main(String[] arguments) throws IOException {
    try(Reader reader = (arguments.length == 1)? Files.newBufferedReader(Paths.get(arguments[0])): new InputStreamReader(System.in)) {      
      @SuppressWarnings("unchecked")
      Dict globals = Dict.of(
          "int", new Fun(Parameter.of("text"), Main::integer),
          "print", new Fun(new Array<Parameter>().append(new Parameter("values", true)).freeze(), Main::print),
          "assert", new Fun(new Array<Parameter>().append(new Parameter("condition", false)).freeze(), Main::assert_),
          "def", new Fun(Parameter.of("name", "value"), Main::def),
          "array", new Fun(new Array<Parameter>().append(new Parameter("values", true)).freeze(), Main::array),
          "dict", new Fun(new Array<Parameter>().append(new Parameter("values", true)).freeze(), Main::dict),
          "+",  new Fun(Parameter.of("a", "b"), NativeCall.function((a, b) -> Math.addExact((Integer)a, (Integer)b))),
          "-",  new Fun(Parameter.of("a", "b"), NativeCall.function((a, b) -> Math.subtractExact((Integer)a, (Integer)b))),
          "*",  new Fun(Parameter.of("a", "b"), NativeCall.function((a, b) -> Math.multiplyExact((Integer)a, (Integer)b))),
          "/",  new Fun(Parameter.of("a", "b"), NativeCall.function((a, b) -> (Integer)a/(Integer)b)),
          "==", new Fun(Parameter.of("a", "b"), NativeCall.function(Objects::equals)),
          "!=", new Fun(Parameter.of("a", "b"), NativeCall.function((a, b) -> !Objects.equals(a, b))),
          "<",  new Fun(Parameter.of("a", "b"), NativeCall.function((a, b) -> ((Comparable<Object>)a).compareTo(b) < 0)),
          "<=", new Fun(Parameter.of("a", "b"), NativeCall.function((a, b) -> ((Comparable<Object>)a).compareTo(b) <= 0)),
          ">",  new Fun(Parameter.of("a", "b"), NativeCall.function((a, b) -> ((Comparable<Object>)a).compareTo(b) > 0)),
          ">=", new Fun(Parameter.of("a", "b"), NativeCall.function((a, b) -> ((Comparable<Object>)a).compareTo(b) >= 0))
          );
      
      Interpreter interpreter =  ServiceLoader.load(Interpreter.class).iterator().next();
      Block script = ASTBuilder.buildAST(reader);
      Array<Parameter> params = Array.of(new Parameter("ARGS", false));
      interpreter.interpret(params, script, globals, new Object(), new Object[] { Array.of(arguments) });
    }
  }
}
