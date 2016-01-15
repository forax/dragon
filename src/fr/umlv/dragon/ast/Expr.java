package fr.umlv.dragon.ast;

public interface Expr {
  default void prettyPrint(StringBuilder builder, String spaces) {
    builder.append(toString());
  }
}
