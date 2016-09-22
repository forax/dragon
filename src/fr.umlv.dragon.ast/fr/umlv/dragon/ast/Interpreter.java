package fr.umlv.dragon.ast;

import fr.umlv.dragon.rt.Array;
import fr.umlv.dragon.rt.Block;
import fr.umlv.dragon.rt.Dict;
import fr.umlv.dragon.rt.Parameter;

public interface Interpreter {
  public Object interpret(Array<Parameter> parameters, Block body, Dict globals, Object receiver, Object[] args);
}
