package fr.umlv.dragon.rt;

public class Store implements Expr {
  private final String name;
  private final Expr expr;

  public Store(String name, Expr expr) {
    Utils.requireNonNull(name, "name");
    Utils.requireNonNull(expr, "expr");
    this.name = name;
    this.expr = expr;
  }
  
  public String name() {
    return name;
  }
  public Expr expr() {
    return expr;
  }
  
  @Override
  public String toString() {
    return Utils.prettyPrintAsString(this);
  }
  
  @Override
  public void prettyPrint(StringBuilder builder, String spaces) {
    builder.append(name).append(" = ");
    expr.prettyPrint(builder, spaces);
  }
}
