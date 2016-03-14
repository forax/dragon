package fr.umlv.dragon.rt;

import static fr.umlv.dragon.rt.Utils.requireNonNull;

import java.util.Optional;

public class Call implements Expr {
  private final /*maybenull*/Expr receiver;
  private final Expr name;
  private final Array<Expr> args;

  public Call(Optional<Expr> receiver, Expr name, Array<Expr> args) {
    requireNonNull(receiver, "receiver");
    requireNonNull(name, "name");
    requireNonNull(args, "args");
    this.receiver = receiver.orElse(null);
    this.name = name;
    this.args = args;
  }
  
  public Optional<Expr> receiver() {
    return Optional.ofNullable(receiver);
  }
  public Expr name() {
    return name;
  }
  public Array<Expr> args() {
    return args;
  }
  
  @Override
  public String toString() {
    return Utils.prettyPrintAsString(this);
  }
  
  @Override
  public void prettyPrint(StringBuilder builder, String spaces) {
    if (receiver != null) {
      receiver.prettyPrint(builder, spaces);
      builder.append(".");
    }
    name.prettyPrint(builder, spaces);
    if (args.length() == 0) {
      builder.append("()");
      return;
    }
    builder.append('(');
    for(Expr arg: args) {
      arg.prettyPrint(builder, spaces);
      builder.append(", ");
    }
    builder.setLength(builder.length() - 2);
    builder.append(')');
  }
}
