package fr.umlv.dragon.rt;

import fr.umlv.dragon.ast.Expr;

public class Return implements Expr {
  private final Expr expr;

  public Return(Expr expr) {
    this.expr = expr;
  }
  
  public Expr expr() {
    return expr;
  }
  
  @Override
  public String toString() {
    return "return " + expr;
  }
}
