package fr.umlv.dragon.rt;

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
