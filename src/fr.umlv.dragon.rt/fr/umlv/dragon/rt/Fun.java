package fr.umlv.dragon.rt;

import static java.util.stream.Collectors.joining;

public class Fun implements Expr {
  private final Array<Parameter> params;
  private final Block body;
  private final NativeCall nativeCall;
  
  private static final Block EMPTY_BLOCK = new Block(Array.<Expr>of(new Literal(Literal.Kind.COMMENT, "native function")).freeze());
  
  public Fun(Array<Parameter> params, Block body, NativeCall nativeCall) {
    Utils.requireNonNull(params, "params");
    Utils.requireNonNull(body, "body");
    Utils.requireNonNull(nativeCall, "nativeCall");
    this.params = params;
    this.body = body;
    this.nativeCall = nativeCall;
  }
  
  public Fun(Array<Parameter> params, NativeCall nativeCall) {
    this(params, EMPTY_BLOCK, nativeCall);
  }
  
  /*
  public Fun(Array<Parameter> params, Block body) {
    Utils.requireNonNull(params, "params");
    Utils.requireNonNull(body, "body");
    this.params = params;
    this.body = body;
    this.nativeCall = (globals, receiver, args) -> Interpreter.interpret(this, globals, receiver, args);
  }*/
  
  public Array<Parameter> params() {
    return params;
  }
  public Block body() {
    return body;
  }
  public NativeCall nativeCall() {
    return nativeCall;
  }
  
  @Override
  public String toString() {
    return Utils.prettyPrintAsString(this);
  }
  
  @Override
  public void prettyPrint(StringBuilder builder, String spaces) {
    builder.append('\\');
    builder.append(params.stream().map(Parameter::toString).collect(joining(", ")));
    builder.append(" -> ");  //FIXME
    body.prettyPrint(builder, spaces);
  }
}
