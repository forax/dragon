package fr.umlv.dragon;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

import fr.umlv.dragon.ast.ASTEvaluator;
import fr.umlv.dragon.ast.ASTEvaluator.TokenEvaluator;
import fr.umlv.dragon.ast.NativeCall;
import fr.umlv.dragon.grammar.tools.Analyzers;
import fr.umlv.dragon.grammar.tools.TerminalEvaluator;
import fr.umlv.dragon.rt.Array;
import fr.umlv.dragon.rt.Block;
import fr.umlv.dragon.rt.Dict;
import fr.umlv.dragon.rt.Fun;
import fr.umlv.dragon.rt.Parameter;

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

      TerminalEvaluator<CharSequence> terminalEvaluator = new TokenEvaluator();
      ASTEvaluator grammarEvaluator = new ASTEvaluator();

      Analyzers.run(reader, terminalEvaluator, grammarEvaluator, null, null);
      
      //System.out.println("AST\n" + grammarEvaluator.getScript());
      
      Dict globals = Dict.of(
          "int", new Fun(Parameter.of("text"), Main::integer),
          "print", new Fun(new Array<Parameter>().append(new Parameter("values", true)).freeze(), Main::print),
          "def", new Fun(Parameter.of("name", "value"), Main::def),
          "array", new Fun(new Array<Parameter>().append(new Parameter("values", true)).freeze(), Main::array),
          "dict", new Fun(new Array<Parameter>().append(new Parameter("values", true)).freeze(), Main::dict),
          "+",  new Fun(Parameter.of("a", "b"), NativeCall.function((a,b) -> Math.addExact((Integer)a, (Integer)b))),
          "-",  new Fun(Parameter.of("a", "b"), NativeCall.function((a,b) -> Math.subtractExact((Integer)a, (Integer)b))),
          "*",  new Fun(Parameter.of("a", "b"), NativeCall.function((a,b) -> Math.multiplyExact((Integer)a, (Integer)b))),
          "/",  new Fun(Parameter.of("a", "b"), NativeCall.function((a,b) -> (Integer)a/(Integer)b)),
          "==", new Fun(Parameter.of("a", "b"), NativeCall.function(Objects::equals)),
          "!=", new Fun(Parameter.of("a", "b"), NativeCall.function((a, b) -> !Objects.equals(a, b))),
          "<",  new Fun(Parameter.of("a", "b"), NativeCall.function((a, b) -> ((Comparable)a).compareTo(b) < 0)),
          "<=", new Fun(Parameter.of("a", "b"), NativeCall.function((a, b) -> ((Comparable)a).compareTo(b) <= 0)),
          ">",  new Fun(Parameter.of("a", "b"), NativeCall.function((a, b) -> ((Comparable)a).compareTo(b) > 0)),
          ">=", new Fun(Parameter.of("a", "b"), NativeCall.function((a, b) -> ((Comparable)a).compareTo(b) >= 0))
          );
      
      Block script = grammarEvaluator.getScript();
      Array<Parameter> params = Array.of(new Parameter("ARGS", false));
      Fun fun = new Fun(params, script);
      
      fun.nativeCall().call(globals, new Object(), Array.of(arguments));
    }
  }
}
