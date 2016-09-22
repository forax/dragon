package fr.umlv.dragon.eval;

import java.util.HashMap;
import java.util.Objects;
import java.util.function.BiFunction;

import fr.umlv.dragon.rt.Expr;

public class Visitor<E, R> {
  private final HashMap<Class<? extends Expr>, BiFunction<Expr, ? super E, ? extends R>> map = new HashMap<>();
  
  @SuppressWarnings("unchecked")
  public <T extends Expr> Visitor<E, R> when(Class<T> type, BiFunction<? super T, ? super E, ? extends R> fun) {
    Objects.requireNonNull(type);
    Objects.requireNonNull(fun);
    map.put(type, (BiFunction<Expr, ? super E, ? extends R>)fun);
    return this;
  }
  
  public R call(Expr receiver, E env) {
    return map.getOrDefault(receiver.getClass(), noMethod()).apply(receiver, env);
  }

  private static <P, R> BiFunction<Expr, ? super P, ? extends R> noMethod() {
    return (receiver, env) -> { throw new IllegalStateException("no callback for " + receiver.getClass()); };
  }
}
