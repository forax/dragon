package fr.umlv.dragon.rt;

import static fr.umlv.dragon.rt.Utils.requireNonNull;

public class Block implements Expr {
  private final Array<Expr> exprs;

  public Block(Array<Expr> exprs) {
    requireNonNull(exprs, "exprs");
    this.exprs = exprs;
  }
  
  public Array<Expr> exprs() {
    return exprs;
  }
  
  @Override
  public String toString() {
    return Utils.prettyPrintAsString(this);
  }
  
  @Override
  public void prettyPrint(StringBuilder builder, String spaces) {
    if (exprs.size() == 1) {
      exprs.get(0).prettyPrint(builder, spaces);
      return; 
    }
    String shiftedSpaces = spaces + "  "; 
    builder.append("(\n");
    for(Expr expr: exprs) {
      builder.append(shiftedSpaces);
      expr.prettyPrint(builder, shiftedSpaces);
      builder.append("\n");
    }
    builder.append(spaces).append(")\n");
  }
}
