module fr.umlv.dragon.eval {
  requires public fr.umlv.dragon.rt;
  requires fr.umlv.dragon.ast;
  
  //exports fr.umlv.dragon.eval;
  
  provides fr.umlv.dragon.ast.Interpreter with fr.umlv.dragon.eval.InterpreterImpl;
}