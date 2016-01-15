package fr.umlv.dragon.rt;

import fr.umlv.dragon.ast.Expr;

class Utils {
  static void requireNonNull(Object o, String name) {
    if (o == null) {
      throw newRTError(name);
    }
  }

  static RTError newRTError(String name) {
    return new RTError(name + " is undefined");
  }
  
  static String prettyPrintAsString(Expr expr) {
    StringBuilder builder = new StringBuilder();
    expr.prettyPrint(builder, "");
    return builder.toString();
  }
}
