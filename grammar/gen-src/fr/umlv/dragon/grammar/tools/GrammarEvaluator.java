package fr.umlv.dragon.grammar.tools;

import fr.umlv.dragon.ast.Expr;
import fr.umlv.dragon.rt.Array;
import fr.umlv.dragon.rt.Literal;
import fr.umlv.dragon.rt.Parameter;

/** 
 *  This class is generated - please do not edit it 
 */
public interface GrammarEvaluator {
  /** This methods is called after the reduction of the non terminal script
   *  by the grammar production script.
   *  <code>script ::= block</code>
   */
  public void script(Array<Expr> block);
  /** This methods is called after the reduction of the non terminal block
   *  by the grammar production block_rec.
   *  <code>block ::= block instr</code>
   */
  public Array<Expr> block_rec(Array<Expr> block,Expr instr);
  /** This methods is called after the reduction of the non terminal block
   *  by the grammar production block_empty.
   *  <code>block ::=</code>
   */
  public Array<Expr> block_empty();
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_expr.
   *  <code>instr ::= expr eoi</code>
   */
  public Expr instr_expr(Expr expr);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_assign.
   *  <code>instr ::= id assign expr eoi</code>
   */
  public Expr instr_assign(Literal id,Expr expr);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_assign_lambda.
   *  <code>instr ::= id assign antislash params eol block rpar</code>
   */
  public Expr instr_assign_lambda(Literal id,Array<Parameter> params,Array<Expr> block);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_while.
   *  <code>instr ::= _while lpar expr block rpar</code>
   */
  public Expr instr_while(Expr expr,Array<Expr> block);
  /** This methods is called after the reduction of the non terminal instr
   *  by the grammar production instr_return.
   *  <code>instr ::= _return expr eoi</code>
   */
  public Expr instr_return(Expr expr);
  /** This methods is called after the reduction of the non terminal args
   *  by the grammar production args_rec.
   *  <code>args ::= args expr</code>
   */
  public Array<Expr> args_rec(Array<Expr> args,Expr expr);
  /** This methods is called after the reduction of the non terminal args
   *  by the grammar production args_empty.
   *  <code>args ::=</code>
   */
  public Array<Expr> args_empty();
  /** This methods is called after the reduction of the non terminal param
   *  by the grammar production param_id_varargs.
   *  <code>param ::= id mul</code>
   */
  public Parameter param_id_varargs(Literal id);
  /** This methods is called after the reduction of the non terminal param
   *  by the grammar production param_id.
   *  <code>param ::= id</code>
   */
  public Parameter param_id(Literal id);
  /** This methods is called after the reduction of the non terminal params
   *  by the grammar production params_rec.
   *  <code>params ::= params param</code>
   */
  public Array<Parameter> params_rec(Array<Parameter> params,Parameter param);
  /** This methods is called after the reduction of the non terminal params
   *  by the grammar production params_empty.
   *  <code>params ::=</code>
   */
  public Array<Parameter> params_empty();
  /** This methods is called after the reduction of the non terminal name
   *  by the grammar production name_id.
   *  <code>name ::= id</code>
   */
  public Literal name_id(Literal id);
  /** This methods is called after the reduction of the non terminal name
   *  by the grammar production name_text.
   *  <code>name ::= text</code>
   */
  public Literal name_text(Literal text);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_numeric.
   *  <code>expr ::= integer</code>
   */
  public Expr expr_numeric(Literal integer);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_name.
   *  <code>expr ::= name</code>
   */
  public Expr expr_name(Literal name);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_parens.
   *  <code>expr ::= lpar block rpar</code>
   */
  public Expr expr_parens(Array<Expr> block);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_array.
   *  <code>expr ::= lopt args ropt</code>
   */
  public Expr expr_array(Array<Expr> args);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_dict.
   *  <code>expr ::= lcurl args rcurl</code>
   */
  public Expr expr_dict(Array<Expr> args);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_if.
   *  <code>expr ::= _if lpar expr expr expr rpar</code>
   */
  public Expr expr_if(Expr expr,Expr expr2,Expr expr3);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_if_unbalanced.
   *  <code>expr ::= _if lpar expr expr rpar</code>
   */
  public Expr expr_if_unbalanced(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_lambda_expr.
   *  <code>expr ::= antislash params arrow expr</code>
   */
  public Expr expr_lambda_expr(Array<Parameter> params,Expr expr);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_funcall.
   *  <code>expr ::= name lpar args rpar</code>
   */
  public Expr expr_funcall(Literal name,Array<Expr> args);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_funcall_lambda.
   *  <code>expr ::= name lpar args antislash params eol block rpar</code>
   */
  public Expr expr_funcall_lambda(Literal name,Array<Expr> args,Array<Parameter> params,Array<Expr> block);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_mthcall.
   *  <code>expr ::= expr dot name lpar args rpar</code>
   */
  public Expr expr_mthcall(Expr expr,Literal name,Array<Expr> args);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_mthcall_lambda.
   *  <code>expr ::= expr dot name lpar args antislash params eol block rpar</code>
   */
  public Expr expr_mthcall_lambda(Expr expr,Literal name,Array<Expr> args,Array<Parameter> params,Array<Expr> block);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_access.
   *  <code>expr ::= expr dot name</code>
   */
  public Expr expr_access(Expr expr,Literal name);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_mul.
   *  <code>expr ::= expr mul expr</code>
   */
  public Expr expr_mul(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_div.
   *  <code>expr ::= expr div expr</code>
   */
  public Expr expr_div(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_rem.
   *  <code>expr ::= expr rem expr</code>
   */
  public Expr expr_rem(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_add.
   *  <code>expr ::= expr add expr</code>
   */
  public Expr expr_add(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_sub.
   *  <code>expr ::= expr sub expr</code>
   */
  public Expr expr_sub(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_eq.
   *  <code>expr ::= expr eq expr</code>
   */
  public Expr expr_eq(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_ne.
   *  <code>expr ::= expr ne expr</code>
   */
  public Expr expr_ne(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_lt.
   *  <code>expr ::= expr lt expr</code>
   */
  public Expr expr_lt(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_le.
   *  <code>expr ::= expr le expr</code>
   */
  public Expr expr_le(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_gt.
   *  <code>expr ::= expr gt expr</code>
   */
  public Expr expr_gt(Expr expr,Expr expr2);
  /** This methods is called after the reduction of the non terminal expr
   *  by the grammar production expr_ge.
   *  <code>expr ::= expr ge expr</code>
   */
  public Expr expr_ge(Expr expr,Expr expr2);

  public void acceptScript();
}
