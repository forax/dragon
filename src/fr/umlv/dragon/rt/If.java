package fr.umlv.dragon.rt;

import fr.umlv.dragon.ast.Expr;

public class If implements Expr {
  private final Expr condition;
  private final Expr trueExpr;
  private final Expr falseExpr;

  public If(Expr condition, Expr trueExpr, Expr falseExpr) {
    Utils.requireNonNull(condition, "condition");
    Utils.requireNonNull(trueExpr, "trueExpr");
    Utils.requireNonNull(falseExpr, "falseExpr");
    this.condition = condition;
    this.trueExpr = trueExpr;
    this.falseExpr = falseExpr;
  }
  
  public Expr condition() {
    return condition;
  }
  public Expr trueExpr() {
    return trueExpr;
  }
  public Expr falseExpr() {
    return falseExpr;
  }
  
  @Override
  public String toString() {
    return Utils.prettyPrintAsString(this);
  }
  
  @Override
  public void prettyPrint(StringBuilder builder, String spaces) {
    String shiftedSpaces = "  " + spaces;
    builder.append("if(").append(condition).append('\n');
    builder.append(shiftedSpaces);
    trueExpr.prettyPrint(builder, shiftedSpaces);
    builder.append('\n');
    builder.append(shiftedSpaces);
    falseExpr.prettyPrint(builder, shiftedSpaces);
    builder.append(spaces).append(")\n");
  }
}
