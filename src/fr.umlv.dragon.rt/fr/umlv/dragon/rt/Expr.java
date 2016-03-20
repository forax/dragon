package fr.umlv.dragon.rt;

public interface Expr {
  default void prettyPrint(StringBuilder builder, @SuppressWarnings("unused") String spaces) {
    builder.append(toString());
  }
}
