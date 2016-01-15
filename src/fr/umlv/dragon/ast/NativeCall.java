package fr.umlv.dragon.ast;

import java.util.function.BiFunction;
import java.util.function.Function;

import fr.umlv.dragon.rt.Dict;

public interface NativeCall {
  Object call(Dict globals, Object receiver, Object... args);
  
  public static NativeCall function(Function<Object, Object> fun) {
    return (globals, receiver, args) -> fun.apply(args[0]);
  }
  public static NativeCall function(BiFunction<Object, Object, Object> fun) {
    return (globals, receiver, args) -> fun.apply(args[0], args[1]);
  }
  
  public static NativeCall method(Function<Object, Object> fun) {
    return (globals, receiver, args) -> fun.apply(receiver);
  }
  public static NativeCall method(BiFunction<Object, Object, Object> fun) {
    return (globals, receiver, args) -> fun.apply(receiver, args[0]);
  }
}
