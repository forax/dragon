package fr.umlv.dragon.rt;

public class Parameter {
  private final String name;
  private final boolean varargs;
  
  public Parameter(String name, boolean varargs) {
    Utils.requireNonNull(name, "name");
    this.name = name;
    this.varargs = varargs;
  }
  
  public String name() {
    return name;
  }
  public boolean varargs() {
    return varargs;
  }
  
  @Override
  public String toString() {
    return name + (varargs? "*": "");
  }
  
  public static Array<Parameter> of(String... names) {
    Array<Parameter> array = new Array<>();
    for(String name: names) {
      array.append(new Parameter(name, false));
    }
    return array.freeze();
  }
}
