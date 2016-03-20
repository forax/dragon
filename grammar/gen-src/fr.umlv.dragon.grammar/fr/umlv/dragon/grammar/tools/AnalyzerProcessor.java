package fr.umlv.dragon.grammar.tools;

  import fr.umlv.dragon.rt.Array;
    import fr.umlv.dragon.rt.Expr;
    import fr.umlv.dragon.rt.Literal;
    import fr.umlv.dragon.rt.Parameter;
  
import fr.umlv.dragon.grammar.lexer.RuleEnum;
import fr.umlv.dragon.grammar.parser.TerminalEnum;
import fr.umlv.dragon.grammar.parser.NonTerminalEnum;
import fr.umlv.dragon.grammar.parser.ProductionEnum;
import fr.umlv.dragon.grammar.tools.TerminalEvaluator;
import fr.umlv.dragon.grammar.tools.GrammarEvaluator;

import fr.umlv.tatoo.runtime.buffer.LexerBuffer;
import fr.umlv.tatoo.runtime.tools.AnalyzerListener;
import fr.umlv.tatoo.runtime.tools.DataViewer;
import fr.umlv.tatoo.runtime.tools.SemanticStack;

/**  This class is called by the parser when
 *  <ol>
 *    <li>a terminal is shifted</li>
 *    <li>a non terminal is reduced</li>
 *    <li>a non terminal is accepted</li>
 *   </ol>
 *   In that case, depending on the information of the .xtls, terminal and non-terminal
 *   values are pushed/pop from a semantic stack.
 *   
 *   Furthermore, in case of error recovery, values of the stack can be pop out
 *   depending if the last recognized element is a terminal or a non-terminal.
 * 
 *  This class is generated - please do not edit it 
 */
public class AnalyzerProcessor<B extends LexerBuffer,D>
  implements AnalyzerListener<RuleEnum,B,TerminalEnum,NonTerminalEnum,ProductionEnum> {
          
  private final GrammarEvaluator grammarEvaluator;
  private final TerminalEvaluator<? super D> terminalEvaluator;
  private final DataViewer<? super B,? extends D> dataViewer;
  private final SemanticStack stack;
  
  protected AnalyzerProcessor(TerminalEvaluator<? super D> terminalEvaluator, GrammarEvaluator grammarEvaluator, DataViewer<? super B,? extends D> dataViewer, SemanticStack stack) {
    this.terminalEvaluator=terminalEvaluator;
    this.grammarEvaluator=grammarEvaluator;
    this.dataViewer=dataViewer;
    this.stack=stack;
  }
  
  /** Creates a tools listener that redirect accept/shift/reduce and comment to the terminal Evaluator
      and the grammar evaluator..
      This constructor allows to share the same stack between more
      than one parser processor.
      @param terminalEvaluator the terminal evaluator.
      @param grammarEvaluator the grammar evaluator.
      @param stack the stack used by the processor
   */
  public static <B extends LexerBuffer,D> AnalyzerProcessor<B,D>
    createAnalyzerProcessor(TerminalEvaluator<? super D> terminalEvaluator, GrammarEvaluator grammarEvaluator, DataViewer<? super B,? extends D> dataViewer, SemanticStack stack) {
    
    return new AnalyzerProcessor<B,D>(terminalEvaluator,grammarEvaluator,dataViewer,stack);
  }
  
  public void comment(RuleEnum rule, B buffer) {
    throw new AssertionError("unknown rule "+rule);
  }
 
   public void shift(TerminalEnum terminal, RuleEnum rule, B buffer) {
     D data;
     switch(terminal) {      case assign: {
                       return;
           }
                 case dot: {
                       return;
           }
                 case semicolon: {
                       return;
           }
                 case antislash: {
                       return;
           }
                 case arrow: {
                       return;
           }
                 case eol: {
                       return;
           }
                 case lpar: {
                       return;
           }
                 case rpar: {
                       return;
           }
                 case lopt: {
                       return;
           }
                 case ropt: {
                       return;
           }
                 case lcurl: {
                       return;
           }
                 case rcurl: {
                       return;
           }
                 case add: {
                       return;
           }
                 case sub: {
                       return;
           }
                 case mul: {
                       return;
           }
                 case div: {
                       return;
           }
                 case rem: {
                       return;
           }
                 case eq: {
                       return;
           }
                 case ne: {
                       return;
           }
                 case lt: {
                       return;
           }
                 case le: {
                       return;
           }
                 case gt: {
                       return;
           }
                 case ge: {
                       return;
           }
                 case _if: {
                       return;
           }
                 case _while: {
                       return;
           }
                 case _return: {
                       return;
           }
                 case text: {
         data=dataViewer.view(buffer);
                                  fr.umlv.dragon.rt.Literal text=terminalEvaluator.text(data);
                                      stack.push_Object(text);
                                 return;
           }
                 case integer: {
         data=dataViewer.view(buffer);
                                  fr.umlv.dragon.rt.Literal integer=terminalEvaluator.integer(data);
                                      stack.push_Object(integer);
                                 return;
           }
                 case id: {
         data=dataViewer.view(buffer);
                                  fr.umlv.dragon.rt.Literal id=terminalEvaluator.id(data);
                                      stack.push_Object(id);
                                 return;
           }
                 case __eof__: {
                       return;
           }
                 }
     throw new AssertionError("unknown terminal "+terminal);
   }
    
    
    @SuppressWarnings("unchecked")
    public void reduce(ProductionEnum production) {
      switch(production) {           case script: { // not synthetic
                                 Array<Expr> block=(Array<Expr>)stack.pop_Object();
                                           grammarEvaluator.script(block);
                      
          }
          return;
                    case block_rec: { // not synthetic
                                 Expr instr=(Expr)stack.pop_Object();
                                          Array<Expr> block=(Array<Expr>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.block_rec(block,instr));
                      
          }
          return;
                    case block_empty: { // not synthetic
                                       stack.push_Object(grammarEvaluator.block_empty());
                      
          }
          return;
                    case eoi_semi: { // not synthetic
            
          }
          return;
                    case eoi_empty: { // not synthetic
            
          }
          return;
                    case instr_expr: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_expr(expr));
                      
          }
          return;
                    case instr_assign: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                          Literal id=(Literal)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_assign(id,expr));
                      
          }
          return;
                    case instr_assign_lambda: { // not synthetic
                                 Array<Expr> block=(Array<Expr>)stack.pop_Object();
                                          Array<Parameter> params=(Array<Parameter>)stack.pop_Object();
                                          Literal id=(Literal)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_assign_lambda(id,params,block));
                      
          }
          return;
                    case instr_while: { // not synthetic
                                 Array<Expr> block=(Array<Expr>)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_while(expr,block));
                      
          }
          return;
                    case instr_return: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.instr_return(expr));
                      
          }
          return;
                    case args_rec: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                          Array<Expr> args=(Array<Expr>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.args_rec(args,expr));
                      
          }
          return;
                    case args_empty: { // not synthetic
                                       stack.push_Object(grammarEvaluator.args_empty());
                      
          }
          return;
                    case param_id_varargs: { // not synthetic
                                 Literal id=(Literal)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.param_id_varargs(id));
                      
          }
          return;
                    case param_id: { // not synthetic
                                 Literal id=(Literal)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.param_id(id));
                      
          }
          return;
                    case params_rec: { // not synthetic
                                 Parameter param=(Parameter)stack.pop_Object();
                                          Array<Parameter> params=(Array<Parameter>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.params_rec(params,param));
                      
          }
          return;
                    case params_empty: { // not synthetic
                                       stack.push_Object(grammarEvaluator.params_empty());
                      
          }
          return;
                    case name_id: { // not synthetic
                                 Literal id=(Literal)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.name_id(id));
                      
          }
          return;
                    case name_text: { // not synthetic
                                 Literal text=(Literal)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.name_text(text));
                      
          }
          return;
                    case expr_numeric: { // not synthetic
                                 Literal integer=(Literal)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_numeric(integer));
                      
          }
          return;
                    case expr_name: { // not synthetic
                                 Literal name=(Literal)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_name(name));
                      
          }
          return;
                    case expr_parens: { // not synthetic
                                 Array<Expr> block=(Array<Expr>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_parens(block));
                      
          }
          return;
                    case expr_array: { // not synthetic
                                 Array<Expr> args=(Array<Expr>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_array(args));
                      
          }
          return;
                    case expr_dict: { // not synthetic
                                 Array<Expr> args=(Array<Expr>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_dict(args));
                      
          }
          return;
                    case expr_if: { // not synthetic
                                 Expr expr3=(Expr)stack.pop_Object();
                                          Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_if(expr,expr2,expr3));
                      
          }
          return;
                    case expr_if_unbalanced: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_if_unbalanced(expr,expr2));
                      
          }
          return;
                    case expr_lambda_expr: { // not synthetic
                                 Expr expr=(Expr)stack.pop_Object();
                                          Array<Parameter> params=(Array<Parameter>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_lambda_expr(params,expr));
                      
          }
          return;
                    case expr_funcall: { // not synthetic
                                 Array<Expr> args=(Array<Expr>)stack.pop_Object();
                                          Literal name=(Literal)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_funcall(name,args));
                      
          }
          return;
                    case expr_funcall_lambda: { // not synthetic
                                 Array<Expr> block=(Array<Expr>)stack.pop_Object();
                                          Array<Parameter> params=(Array<Parameter>)stack.pop_Object();
                                          Array<Expr> args=(Array<Expr>)stack.pop_Object();
                                          Literal name=(Literal)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_funcall_lambda(name,args,params,block));
                      
          }
          return;
                    case expr_mthcall: { // not synthetic
                                 Array<Expr> args=(Array<Expr>)stack.pop_Object();
                                          Literal name=(Literal)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_mthcall(expr,name,args));
                      
          }
          return;
                    case expr_mthcall_lambda: { // not synthetic
                                 Array<Expr> block=(Array<Expr>)stack.pop_Object();
                                          Array<Parameter> params=(Array<Parameter>)stack.pop_Object();
                                          Array<Expr> args=(Array<Expr>)stack.pop_Object();
                                          Literal name=(Literal)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_mthcall_lambda(expr,name,args,params,block));
                      
          }
          return;
                    case expr_access: { // not synthetic
                                 Literal name=(Literal)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_access(expr,name));
                      
          }
          return;
                    case expr_mul: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_mul(expr,expr2));
                      
          }
          return;
                    case expr_div: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_div(expr,expr2));
                      
          }
          return;
                    case expr_rem: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_rem(expr,expr2));
                      
          }
          return;
                    case expr_add: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_add(expr,expr2));
                      
          }
          return;
                    case expr_sub: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_sub(expr,expr2));
                      
          }
          return;
                    case expr_eq: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_eq(expr,expr2));
                      
          }
          return;
                    case expr_ne: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_ne(expr,expr2));
                      
          }
          return;
                    case expr_lt: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_lt(expr,expr2));
                      
          }
          return;
                    case expr_le: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_le(expr,expr2));
                      
          }
          return;
                    case expr_gt: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_gt(expr,expr2));
                      
          }
          return;
                    case expr_ge: { // not synthetic
                                 Expr expr2=(Expr)stack.pop_Object();
                                          Expr expr=(Expr)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.expr_ge(expr,expr2));
                      
          }
          return;
                    default:
             throw new AssertionError("unknown production "+production);
       }
    }

     public void accept(NonTerminalEnum nonterminal) {
       switch(nonterminal) {            case script:
             grammarEvaluator.acceptScript();
             return;
                     default:
       }
        throw new AssertionError("unknown start nonterminal "+nonterminal);
     }

      public void popTerminalOnError(TerminalEnum terminal) {
        switch(terminal) {             case assign:
              
              return;
                         case dot:
              
              return;
                         case semicolon:
              
              return;
                         case antislash:
              
              return;
                         case arrow:
              
              return;
                         case eol:
              
              return;
                         case lpar:
              
              return;
                         case rpar:
              
              return;
                         case lopt:
              
              return;
                         case ropt:
              
              return;
                         case lcurl:
              
              return;
                         case rcurl:
              
              return;
                         case add:
              
              return;
                         case sub:
              
              return;
                         case mul:
              
              return;
                         case div:
              
              return;
                         case rem:
              
              return;
                         case eq:
              
              return;
                         case ne:
              
              return;
                         case lt:
              
              return;
                         case le:
              
              return;
                         case gt:
              
              return;
                         case ge:
              
              return;
                         case _if:
              
              return;
                         case _while:
              
              return;
                         case _return:
              
              return;
                         case text:
              stack.pop_Object();
              return;
                         case integer:
              stack.pop_Object();
              return;
                         case id:
              stack.pop_Object();
              return;
                         case __eof__:
              
              return;
                     }
        throw new AssertionError("unknown terminal "+terminal);
      }
 
      public void popNonTerminalOnError(NonTerminalEnum nonTerminal) {
        switch(nonTerminal) {             case script:
              
              return;
                         case block:
              stack.pop_Object();
              return;
                         case eoi:
              
              return;
                         case instr:
              stack.pop_Object();
              return;
                         case args:
              stack.pop_Object();
              return;
                         case param:
              stack.pop_Object();
              return;
                         case params:
              stack.pop_Object();
              return;
                         case name:
              stack.pop_Object();
              return;
                         case expr:
              stack.pop_Object();
              return;
                     }
        throw new AssertionError("unknown nonterminal "+nonTerminal);
      }
}