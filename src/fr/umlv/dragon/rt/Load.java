package fr.umlv.dragon.rt;

import static fr.umlv.dragon.rt.Utils.requireNonNull;

public class Load implements Expr {
  private final String name;

  public Load(String name) {
    requireNonNull(name, "name");
    this.name = name;
  }
  
  public String name() {
    return name;
  }
  
  @Override
  public String toString() {
    return name;
  }
}
