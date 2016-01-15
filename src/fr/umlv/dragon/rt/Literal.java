package fr.umlv.dragon.rt;

import fr.umlv.dragon.ast.Expr;

public class Literal implements Expr {
  public enum Kind {
    ID,
    INTEGER,
    SYMBOL,
    STRING,
    COMMENT
  }
  
  private final Kind kind;
  private final String value;

  public Literal(Kind kind, String value) {
    Utils.requireNonNull(kind, "kind");
    Utils.requireNonNull(value, "value");
    this.kind = kind;
    this.value = value;
  }
  
  public Kind kind() {
    return kind;
  }
  public String value() {
    return value;
  }
  
  @Override
  public String toString() {
    switch(kind) {
    case ID:
    case INTEGER:
      return value;
    case SYMBOL:
      return value + ':';
    case STRING:
      return '\'' + value + '\'';
    default: //case COMMENT
      return '"' + value + '"';
    }
  }
}
