package fr.umlv.dragon.rt;

import java.util.stream.Collectors;

public class While implements Expr {
  private final Expr condition;
  private final Block body;

  public While(Expr condition, Block body) {
    Utils.requireNonNull(condition, "condition");
    Utils.requireNonNull(body, "body");
    this.condition = condition;
    this.body = body;
  }
  
  public Expr condition() {
    return condition;
  }
  public Block body() {
    return body;
  }
  
  @Override
  public String toString() {
    return "while(" + condition + "\n" + body.exprs().stream().map(Expr::toString).collect(Collectors.joining("\n", "", "\n)"));
  }
  
  @Override
  public void prettyPrint(StringBuilder builder, String spaces) {
    String shiftedSpaces = "  " + spaces;
    builder.append("while(").append(condition).append('\n');
    for(Expr expr: body.exprs()) {
      builder.append(shiftedSpaces);
      expr.prettyPrint(builder, shiftedSpaces);
      builder.append('\n');
    }
    builder.append(spaces).append(")\n");
  }
}
