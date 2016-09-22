package fr.umlv.dragon.ast;

import static fr.umlv.dragon.rt.Literal.Kind.COMMENT;
import static fr.umlv.dragon.rt.Literal.Kind.ID;
import static fr.umlv.dragon.rt.Literal.Kind.INTEGER;
import static fr.umlv.dragon.rt.Literal.Kind.STRING;
import static fr.umlv.dragon.rt.Literal.Kind.SYMBOL;

import java.util.Optional;
import java.util.ServiceLoader;

import fr.umlv.dragon.grammar.tools.GrammarEvaluator;
import fr.umlv.dragon.grammar.tools.TerminalEvaluator;
import fr.umlv.dragon.rt.Array;
import fr.umlv.dragon.rt.Block;
import fr.umlv.dragon.rt.Call;
import fr.umlv.dragon.rt.Expr;
import fr.umlv.dragon.rt.Fun;
import fr.umlv.dragon.rt.If;
import fr.umlv.dragon.rt.Literal;
import fr.umlv.dragon.rt.Load;
import fr.umlv.dragon.rt.Parameter;
import fr.umlv.dragon.rt.Return;
import fr.umlv.dragon.rt.Store;
import fr.umlv.dragon.rt.While;

class ASTEvaluator implements GrammarEvaluator {
  Block script;
  
  static class TokenEvaluator implements TerminalEvaluator<CharSequence> {
    @Override
    public Literal integer(CharSequence data) {
      return new Literal(INTEGER, data.toString());
    }
    @Override
    public Literal id(CharSequence data) {
      return new Literal(ID, data.toString());
    }
    @Override
    public Literal text(CharSequence data) {
      String text = data.toString();
      if (text.startsWith("\"")) {
        return new Literal(COMMENT, text.substring(1, text.length() - 1)); 
      }
      if (text.startsWith("'")) {
        return new Literal(STRING, text.substring(1, text.length() - 1));
      }
      return new Literal(SYMBOL, text.substring(0, text.length() - 1));
    }
  }

  private static Fun createFun(Array<Parameter> params, Block body) {
    Interpreter interpreter =  ServiceLoader.load(Interpreter.class).iterator().next();
    return new Fun(params, body, (globals, receiver, args) -> interpreter.interpret(params, body, globals, receiver, args));
  }
  
  @Override
  public void script(Array<Expr> block) {
    script = new Block(block.freeze());
  }

  @Override
  public Array<Expr> block_rec(Array<Expr> block, Expr instr) {
    return block.append(instr);
  }
  @Override
  public Array<Expr> block_empty() {
    return new Array<>();
  }

  @Override
  public Expr instr_expr(Expr expr) {
    return expr;
  }
  
  @Override
  public Expr instr_assign(Literal id, Expr expr) {
    return new Store(id.value(), expr);
  }
  @Override
  public Expr instr_assign_lambda(Literal id, Array<Parameter> params, Array<Expr> block) {
    return new Store(id.value(), createFun(params.freeze(), new Block(block.freeze())));
  }

  @Override
  public Expr expr_parens(Array<Expr> block) {
    return new Block(block.freeze());
  }
  
  @Override
  public Expr instr_while(Expr expr, Array<Expr> block) {
    return new While(expr, new Block(block.freeze()));
  }
  
  @Override
  public Expr expr_if(Expr expr, Expr expr2, Expr expr3) {
    return new If(expr, expr2, expr3);
  }
  @Override
  public Expr expr_if_unbalanced(Expr expr, Expr expr2) {
    return new If(expr, expr2, new Block(new Array<Expr>().freeze()));
  }

  @Override
  public Expr instr_return(Expr expr) {
    return new Return(expr);
  }

  @Override
  public Array<Expr> args_rec(Array<Expr> args, Expr expr) {
    return args.append(expr);
  }
  @Override
  public Array<Expr> args_empty() {
    return new Array<>();
  }
  
  @Override
  public Parameter param_id(Literal id) {
    return new Parameter(id.value(), false);
  }
  @Override
  public Parameter param_id_varargs(Literal id) {
    return new Parameter(id.value(), true);
  }
  @Override
  public Array<Parameter> params_rec(Array<Parameter> params, Parameter parameter) {
    return params.append(parameter);
  }
  @Override
  public Array<Parameter> params_empty() {
    return new Array<>();
  }

  @Override
  public Expr expr_numeric(Literal integer) {
    return integer;
  }
  
  @Override
  public Literal name_text(Literal text) {
    return text;
  }
  @Override
  public Literal name_id(Literal id) {
    return id;
  }
  @Override
  public Expr expr_name(Literal name) {
    if (name.kind() == Literal.Kind.ID) {
      return new Load(name.value());
    }
    return name;
  }
  
  @Override
  public Expr expr_array(Array<Expr> args) {
    return new Call(Optional.empty(), new Load("array"), args.freeze());
  }
  @Override
  public Expr expr_dict(Array<Expr> args) {
    return new Call(Optional.empty(), new Load("dict"), args.freeze());
  }

  @Override
  public Expr expr_lambda_expr(Array<Parameter> params, Expr expr) {
    return createFun(params.freeze(), new Block(new Array<Expr>().append(expr).freeze()));
  }

  @Override
  public Expr expr_funcall(Literal id, Array<Expr> args) {
    return new Call(Optional.empty(), new Load(id.value()), args.freeze());
  }
  @Override
  public Expr expr_funcall_lambda(Literal id, Array<Expr> args, Array<Parameter> params, Array<Expr> block) {
    return new Call(Optional.empty(), new Load(id.value()), args.append(createFun(params.freeze(), new Block(block.freeze()))).freeze());
  }
  
  @Override
  public Expr expr_access(Expr expr, Literal name) {
    return new Call(Optional.of(expr), name, new Array<Expr>().freeze());
  }
  @Override
  public Expr expr_mthcall(Expr expr, Literal name, Array<Expr> args) {
    return new Call(Optional.of(expr), name, args.freeze());
  }
  @Override
  public Expr expr_mthcall_lambda(Expr expr, Literal name, Array<Expr> args, Array<Parameter> params, Array<Expr> block) {
    return new Call(Optional.of(expr), name, args.append(createFun(params.freeze(), new Block(block.freeze()))).freeze());
  }

  private static Call callOp(String name, Expr expr1, Expr expr2) {
    return new Call(Optional.empty(), new Load(name), Array.of(expr1, expr2).freeze());
  }
  @Override
  public Expr expr_mul(Expr expr, Expr expr2) {
    return callOp("*", expr, expr2);
  }
  @Override
  public Expr expr_div(Expr expr, Expr expr2) {
    return callOp("/", expr, expr2);
  }
  @Override
  public Expr expr_rem(Expr expr, Expr expr2) {
    return callOp("%", expr, expr2);
  }
  @Override
  public Expr expr_add(Expr expr, Expr expr2) {
    return callOp("+", expr, expr2);
  }
  @Override
  public Expr expr_sub(Expr expr, Expr expr2) {
    return callOp("-", expr, expr2);
  }
  @Override
  public Expr expr_eq(Expr expr, Expr expr2) {
    return callOp("==", expr, expr2);
  }
  @Override
  public Expr expr_ne(Expr expr, Expr expr2) {
    return callOp("!=", expr, expr2);
  }

  @Override
  public Expr expr_lt(Expr expr, Expr expr2) {
    return callOp("<", expr, expr2);
  }
  @Override
  public Expr expr_le(Expr expr, Expr expr2) {
    return callOp("<=", expr, expr2);
  }
  @Override
  public Expr expr_gt(Expr expr, Expr expr2) {
    return callOp(">", expr, expr2);
  }
  @Override
  public Expr expr_ge(Expr expr, Expr expr2) {
    return callOp(">=", expr, expr2);
  }

  @Override
  public void acceptScript() {
    // script accepted !!
  }
}
