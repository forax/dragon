package fr.umlv.dragon.ast;

import java.io.Reader;

import fr.umlv.dragon.ast.ASTEvaluator.TokenEvaluator;
import fr.umlv.dragon.grammar.tools.Analyzers;
import fr.umlv.dragon.grammar.tools.TerminalEvaluator;
import fr.umlv.dragon.rt.Block;

public class ASTBuilder {
  public static Block buildAST(Reader reader) {
    TerminalEvaluator<CharSequence> terminalEvaluator = new TokenEvaluator();
    ASTEvaluator grammarEvaluator = new ASTEvaluator();
    Analyzers.run(reader, terminalEvaluator, grammarEvaluator, null, null);
    return grammarEvaluator.script;
  }  
}
