package fr.umlv.dragon.grammar.parser;

import fr.umlv.dragon.grammar.parser.NonTerminalEnum;
import fr.umlv.dragon.grammar.parser.ProductionEnum;
import fr.umlv.dragon.grammar.parser.TerminalEnum;
import fr.umlv.tatoo.runtime.parser.AcceptAction;
import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.BranchAction;
import fr.umlv.tatoo.runtime.parser.ErrorAction;
import fr.umlv.tatoo.runtime.parser.ExitAction;
import fr.umlv.tatoo.runtime.parser.ParserTable;
import fr.umlv.tatoo.runtime.parser.ReduceAction;
import fr.umlv.tatoo.runtime.parser.ShiftAction;
import fr.umlv.tatoo.runtime.parser.StateMetadata;
import java.util.EnumMap;

/** 
 *  This class is generated - please do not edit it 
 */
public class ParserDataTable {
  private ParserDataTable() {
   accept = AcceptAction.<TerminalEnum,ProductionEnum,VersionEnum>getInstance();
   exit = ExitAction.<TerminalEnum,ProductionEnum,VersionEnum>getInstance();
    initscriptGotoes();
    initblockGotoes();
    initargsGotoes();
    initinstrGotoes();
    initparamGotoes();
    initexprGotoes();
    initeoiGotoes();
    initparamsGotoes();
    initnameGotoes();
    reduceargs_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.args_rec,2,argsGotoes);
    reduceexpr_le = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_le,3,exprGotoes);
    reduceparams_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.params_empty,0,paramsGotoes);
    reduceexpr_dict = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_dict,3,exprGotoes);
    reduceexpr_ge = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_ge,3,exprGotoes);
    reduceeoi_semi = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.eoi_semi,1,eoiGotoes);
    reduceparams_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.params_rec,2,paramsGotoes);
    reduceparam_id_varargs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.param_id_varargs,2,paramGotoes);
    reduceinstr_assign = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_assign,4,instrGotoes);
    reduceblock_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_empty,0,blockGotoes);
    reduceeoi_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.eoi_empty,0,eoiGotoes);
    reduceexpr_array = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_array,3,exprGotoes);
    reduceexpr_eq = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_eq,3,exprGotoes);
    reduceexpr_add = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_add,3,exprGotoes);
    reduceexpr_parens = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_parens,3,exprGotoes);
    reduceexpr_mthcall_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_mthcall_lambda,11,exprGotoes);
    reduceblock_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_rec,2,blockGotoes);
    reduceparam_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.param_id,1,paramGotoes);
    reduceexpr_numeric = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_numeric,1,exprGotoes);
    reducescript = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.script,1,scriptGotoes);
    reduceexpr_gt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_gt,3,exprGotoes);
    reduceexpr_ne = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_ne,3,exprGotoes);
    reduceinstr_while = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_while,5,instrGotoes);
    reduceexpr_if = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if,6,exprGotoes);
    reduceexpr_funcall_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_funcall_lambda,9,exprGotoes);
    reduceinstr_return = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_return,3,instrGotoes);
    reduceexpr_lt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_lt,3,exprGotoes);
    reduceexpr_mul = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_mul,3,exprGotoes);
    reduceexpr_div = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_div,3,exprGotoes);
    reducename_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.name_id,1,nameGotoes);
    reduceexpr_rem = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_rem,3,exprGotoes);
    reduceexpr_funcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_funcall,4,exprGotoes);
    reduceexpr_lambda_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_lambda_expr,4,exprGotoes);
    reduceinstr_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_expr,2,instrGotoes);
    reduceinstr_assign_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_assign_lambda,8,instrGotoes);
    reducename_text = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.name_text,1,nameGotoes);
    reduceexpr_sub = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_sub,3,exprGotoes);
    reduceexpr_name = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_name,1,exprGotoes);
    reduceexpr_mthcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_mthcall,6,exprGotoes);
    reduceargs_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.args_empty,0,argsGotoes);
    reduceexpr_if_unbalanced = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if_unbalanced,5,exprGotoes);
    reduceexpr_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_access,3,exprGotoes);
    shift45 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(45);
    shift59 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(59);
    shift88 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(88);
    shift43 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(43);
    shift25 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(25);
    shift51 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(51);
    shift4 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(4);
    shift26 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(26);
    shift66 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(66);
    shift61 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(61);
    shift74 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(74);
    shift72 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(72);
    shift6 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(6);
    shift77 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(77);
    shift12 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(12);
    shift54 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(54);
    shift9 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(9);
    shift93 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(93);
    shift17 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(17);
    shift5 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(5);
    shift18 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(18);
    shift35 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(35);
    shift63 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(63);
    shift60 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(60);
    shift83 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(83);
    shift13 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(13);
    shift47 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(47);
    shift7 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(7);
    shift29 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(29);
    shift37 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(37);
    shift49 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(49);
    shift91 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(91);
    shift22 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(22);
    shift19 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(19);
    shift82 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(82);
    shift41 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(41);
    shift53 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(53);
    shift85 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(85);
    shift16 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(16);
    shift69 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(69);
    shift57 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(57);
    shift21 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(21);
    shift14 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(14);
    shift71 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(71);
    shift33 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(33);
    shift11 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(11);
    shift39 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(39);
    shift27 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(27);
    shift31 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(31);
    shift56 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(56);
    shift23 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(23);
    shift68 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(68);
    error0 = new ErrorAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    branch0 = new BranchAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    initrparArray();
    initremArray();
    initltArray();
    initeqArray();
    initmulArray();
    init__eof__Array();
    init_whileArray();
    initdotArray();
    initleArray();
    init_returnArray();
    initloptArray();
    initlparArray();
    initneArray();
    initdivArray();
    initintegerArray();
    initroptArray();
    inittextArray();
    initgtArray();
    initidArray();
    initantislashArray();
    initlcurlArray();
    initaddArray();
    initsemicolonArray();
    initeolArray();
    initrcurlArray();
    initassignArray();
    init_ifArray();
    initsubArray();
    initgeArray();
    initarrowArray();
    EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]> tableMap =
      new EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]>(TerminalEnum.class);
      
    tableMap.put(TerminalEnum.rpar,rparArray);
    tableMap.put(TerminalEnum.rem,remArray);
    tableMap.put(TerminalEnum.lt,ltArray);
    tableMap.put(TerminalEnum.eq,eqArray);
    tableMap.put(TerminalEnum.mul,mulArray);
    tableMap.put(TerminalEnum.__eof__,__eof__Array);
    tableMap.put(TerminalEnum._while,_whileArray);
    tableMap.put(TerminalEnum.dot,dotArray);
    tableMap.put(TerminalEnum.le,leArray);
    tableMap.put(TerminalEnum._return,_returnArray);
    tableMap.put(TerminalEnum.lopt,loptArray);
    tableMap.put(TerminalEnum.lpar,lparArray);
    tableMap.put(TerminalEnum.ne,neArray);
    tableMap.put(TerminalEnum.div,divArray);
    tableMap.put(TerminalEnum.integer,integerArray);
    tableMap.put(TerminalEnum.ropt,roptArray);
    tableMap.put(TerminalEnum.text,textArray);
    tableMap.put(TerminalEnum.gt,gtArray);
    tableMap.put(TerminalEnum.id,idArray);
    tableMap.put(TerminalEnum.antislash,antislashArray);
    tableMap.put(TerminalEnum.lcurl,lcurlArray);
    tableMap.put(TerminalEnum.add,addArray);
    tableMap.put(TerminalEnum.semicolon,semicolonArray);
    tableMap.put(TerminalEnum.eol,eolArray);
    tableMap.put(TerminalEnum.rcurl,rcurlArray);
    tableMap.put(TerminalEnum.assign,assignArray);
    tableMap.put(TerminalEnum._if,_ifArray);
    tableMap.put(TerminalEnum.sub,subArray);
    tableMap.put(TerminalEnum.ge,geArray);
    tableMap.put(TerminalEnum.arrow,arrowArray);
    initBranchArrayTable();
    
    StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] tableMetadata = createStateMetadataTable();
    
    EnumMap<NonTerminalEnum,Integer> tableStarts =
      new EnumMap<NonTerminalEnum,Integer>(NonTerminalEnum.class);
    tableStarts.put(NonTerminalEnum.script,0);
    table = new ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>(tableMap,branchArrayTable,tableMetadata,tableStarts,VersionEnum.values(),96,TerminalEnum.__eof__,null);
  } 

  // metadata aren't stored in local vars because it freak-out the register allocator of android
  @SuppressWarnings("unchecked")
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] createStateMetadataTable() {
        metadata0id_metadata0reducename_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reducename_id);
    metadata0antislash_metadata0reduceparams_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.antislash,reduceparams_empty);
    metadata0rpar_metadata0reduceexpr_funcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_funcall);
    metadata0rpar_metadata0reduceexpr_parens = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_parens);
    metadata0ne_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ne,null);
    metadata0rpar_metadata0reduceexpr_mthcall_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_mthcall_lambda);
    metadata0eoi_metadata0reduceinstr_assign = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.eoi,reduceinstr_assign);
    metadata0__eof___metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.__eof__,null);
    metadata0rpar_metadata0reduceexpr_mthcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_mthcall);
    metadata0ge_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ge,null);
    metadata0le_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.le,null);
    metadata0assign_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.assign,null);
    metadata0block_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,null);
    metadata0name_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.name,null);
    metadata0id_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,null);
    metadata0lpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,null);
    metadata0dot_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dot,null);
    metadata0sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.sub,null);
    metadata0add_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.add,null);
    metadata0rpar_metadata0reduceexpr_if_unbalanced = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_if_unbalanced);
    metadata0rpar_metadata0reduceinstr_assign_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceinstr_assign_lambda);
    metadata0_while_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._while,null);
    metadata0arrow_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.arrow,null);
    metadata0ropt_metadata0reduceexpr_array = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ropt,reduceexpr_array);
    metadata0div_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.div,null);
    metadata0params_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.params,null);
    metadata0_return_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._return,null);
    metadata0lt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lt,null);
    metadata0rpar_metadata0reduceexpr_if = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_if);
    metadata0rpar_metadata0reduceexpr_funcall_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_funcall_lambda);
    metadata0args_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.args,null);
    metadata0expr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr,null);
    metadata0eq_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eq,null);
    metadata0rpar_metadata0reduceinstr_while = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceinstr_while);
    metadata0param_metadata0reduceparams_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.param,reduceparams_rec);
    metadata0instr_metadata0reduceblock_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,reduceblock_rec);
    metadata0lpar_metadata0reduceblock_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,reduceblock_empty);
    metadata0lpar_metadata0reduceargs_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,reduceargs_empty);
    metadata0gt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.gt,null);
    metadata0_if_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._if,null);
    metadata0eoi_metadata0reduceinstr_expr = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.eoi,reduceinstr_expr);
    metadata0lcurl_metadata0reduceargs_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lcurl,reduceargs_empty);
    metadata0eol_metadata0reduceblock_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceblock_empty);
    metadata0lopt_metadata0reduceargs_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lopt,reduceargs_empty);
    metadata0rcurl_metadata0reduceexpr_dict = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rcurl,reduceexpr_dict);
    metadata0script_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.script,null);
    metadata0integer_metadata0reduceexpr_numeric = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.integer,reduceexpr_numeric);
    metadata0null_metadata0reduceblock_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(null,reduceblock_empty);
    metadata0text_metadata0reducename_text = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.text,reducename_text);
    metadata0mul_metadata0reduceparam_id_varargs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.mul,reduceparam_id_varargs);
    metadata0mul_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.mul,null);
    metadata0rem_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rem,null);
    metadata0semicolon_metadata0reduceeoi_semi = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.semicolon,reduceeoi_semi);
    metadata0eoi_metadata0reduceinstr_return = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.eoi,reduceinstr_return);

    return (StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[])new StateMetadata<?,?,?,?>[]{metadata0null_metadata0reduceblock_empty,metadata0script_metadata0null,metadata0__eof___metadata0null,metadata0block_metadata0null,metadata0_return_metadata0null,metadata0_if_metadata0null,metadata0lpar_metadata0null,metadata0lopt_metadata0reduceargs_empty,metadata0args_metadata0null,metadata0antislash_metadata0reduceparams_empty,metadata0params_metadata0null,metadata0id_metadata0null,metadata0mul_metadata0reduceparam_id_varargs,metadata0arrow_metadata0null,metadata0lpar_metadata0reduceblock_empty,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_parens,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0antislash_metadata0reduceparams_empty,metadata0params_metadata0null,metadata0arrow_metadata0null,metadata0id_metadata0reducename_id,metadata0lcurl_metadata0reduceargs_empty,metadata0args_metadata0null,metadata0integer_metadata0reduceexpr_numeric,metadata0text_metadata0reducename_text,metadata0rcurl_metadata0reduceexpr_dict,metadata0expr_metadata0null,metadata0lt_metadata0null,metadata0expr_metadata0null,metadata0rem_metadata0null,metadata0expr_metadata0null,metadata0sub_metadata0null,metadata0expr_metadata0null,metadata0gt_metadata0null,metadata0expr_metadata0null,metadata0eq_metadata0null,metadata0expr_metadata0null,metadata0mul_metadata0null,metadata0expr_metadata0null,metadata0ne_metadata0null,metadata0expr_metadata0null,metadata0div_metadata0null,metadata0expr_metadata0null,metadata0add_metadata0null,metadata0expr_metadata0null,metadata0ge_metadata0null,metadata0expr_metadata0null,metadata0dot_metadata0null,metadata0name_metadata0null,metadata0lpar_metadata0reduceargs_empty,metadata0args_metadata0null,metadata0rpar_metadata0reduceexpr_mthcall,metadata0antislash_metadata0reduceparams_empty,metadata0params_metadata0null,metadata0arrow_metadata0null,metadata0eol_metadata0reduceblock_empty,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_mthcall_lambda,metadata0_while_metadata0null,metadata0lpar_metadata0null,metadata0expr_metadata0null,metadata0le_metadata0null,metadata0expr_metadata0null,metadata0name_metadata0null,metadata0lpar_metadata0reduceargs_empty,metadata0args_metadata0null,metadata0rpar_metadata0reduceexpr_funcall,metadata0antislash_metadata0reduceparams_empty,metadata0params_metadata0null,metadata0arrow_metadata0null,metadata0eol_metadata0reduceblock_empty,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_funcall_lambda,metadata0instr_metadata0reduceblock_rec,metadata0expr_metadata0null,metadata0semicolon_metadata0reduceeoi_semi,metadata0eoi_metadata0reduceinstr_expr,metadata0expr_metadata0null,metadata0param_metadata0reduceparams_rec,metadata0block_metadata0null,metadata0rpar_metadata0reduceinstr_while,metadata0eol_metadata0reduceblock_empty,metadata0block_metadata0null,metadata0rpar_metadata0reduceinstr_assign_lambda,metadata0expr_metadata0null,metadata0eoi_metadata0reduceinstr_assign,metadata0ropt_metadata0reduceexpr_array,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0rpar_metadata0reduceexpr_if_unbalanced,metadata0expr_metadata0null,metadata0rpar_metadata0reduceexpr_if,metadata0expr_metadata0null,metadata0eoi_metadata0reduceinstr_return};
  }

  
  private int[] scriptGotoes;

  private void initscriptGotoes() {
    scriptGotoes = 
      new int[]{1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] blockGotoes;

  private void initblockGotoes() {
    blockGotoes = 
      new int[]{3,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,15,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,58,-1,-1,-1,-1,81,-1,-1,-1,-1,-1,-1,-1,-1,-1,73,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,84,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] argsGotoes;

  private void initargsGotoes() {
    argsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,8,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,24,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,52,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrGotoes;

  private void initinstrGotoes() {
    instrGotoes = 
      new int[]{-1,-1,-1,75,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,-1,-1,-1,-1,-1,-1,-1,75,-1,-1,75,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] paramGotoes;

  private void initparamGotoes() {
    paramGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,80,-1,-1,-1,-1,-1,-1,-1,-1,-1,80,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,80,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,80,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] exprGotoes;

  private void initexprGotoes() {
    exprGotoes = 
      new int[]{-1,-1,-1,76,94,-1,89,-1,28,-1,-1,-1,-1,79,-1,76,-1,-1,86,-1,-1,79,-1,-1,28,-1,-1,-1,-1,30,-1,32,-1,34,-1,36,-1,38,-1,40,-1,42,-1,44,-1,46,-1,48,-1,-1,-1,-1,28,-1,-1,-1,79,-1,76,-1,-1,62,-1,64,-1,-1,-1,28,-1,-1,-1,79,-1,76,-1,-1,-1,-1,-1,-1,-1,76,-1,-1,76,-1,-1,-1,-1,90,92,-1,-1,-1,-1,-1};
  }
  
  private int[] eoiGotoes;

  private void initeoiGotoes() {
    eoiGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,78,-1,-1,-1,-1,-1,-1,-1,-1,-1,87,-1,-1,-1,-1,-1,-1,-1,95,-1};
  }
  
  private int[] paramsGotoes;

  private void initparamsGotoes() {
    paramsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,10,-1,-1,-1,-1,-1,-1,-1,-1,-1,20,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,70,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] nameGotoes;

  private void initnameGotoes() {
    nameGotoes = 
      new int[]{-1,-1,-1,65,65,-1,65,-1,65,-1,-1,-1,-1,65,-1,65,-1,-1,65,-1,-1,65,-1,-1,65,-1,-1,-1,-1,65,-1,65,-1,65,-1,65,-1,65,-1,65,-1,65,-1,65,-1,65,-1,65,-1,50,-1,-1,65,-1,-1,-1,65,-1,65,-1,-1,65,-1,65,-1,-1,-1,65,-1,-1,-1,65,-1,65,-1,-1,-1,-1,-1,-1,-1,65,-1,-1,65,-1,-1,-1,-1,65,65,-1,-1,-1,-1,-1};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rparArray;
  @SuppressWarnings("unchecked")
  private void initrparArray() {
    rparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceblock_empty,shift16,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,reduceargs_rec,branch0,reduceexpr_lt,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,reduceexpr_gt,branch0,reduceexpr_eq,branch0,reduceexpr_mul,branch0,reduceexpr_ne,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,reduceexpr_ge,branch0,reduceexpr_access,reduceargs_empty,shift53,reduceexpr_mthcall,branch0,branch0,branch0,reduceblock_empty,shift59,reduceexpr_mthcall_lambda,branch0,branch0,reduceblock_empty,branch0,reduceexpr_le,reduceexpr_name,reduceargs_empty,shift68,reduceexpr_funcall,branch0,branch0,branch0,reduceblock_empty,shift74,reduceexpr_funcall_lambda,reduceblock_rec,reduceeoi_empty,reduceeoi_semi,reduceinstr_expr,reduceexpr_lambda_expr,branch0,shift82,reduceinstr_while,reduceblock_empty,shift85,reduceinstr_assign_lambda,reduceeoi_empty,reduceinstr_assign,reduceexpr_array,branch0,shift91,reduceexpr_if_unbalanced,shift93,reduceexpr_if,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] remArray;
  @SuppressWarnings("unchecked")
  private void initremArray() {
    remArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,shift31,branch0,shift31,branch0,reduceexpr_rem,branch0,shift31,branch0,shift31,branch0,shift31,branch0,reduceexpr_mul,branch0,shift31,branch0,reduceexpr_div,branch0,shift31,branch0,shift31,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,shift31,branch0,shift31,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,shift31,branch0,branch0,shift31,branch0,branch0,branch0,branch0,branch0,branch0,shift31,branch0,reduceexpr_array,shift31,shift31,reduceexpr_if_unbalanced,shift31,reduceexpr_if,shift31,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] ltArray;
  @SuppressWarnings("unchecked")
  private void initltArray() {
    ltArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,shift29,branch0,reduceexpr_lt,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,reduceexpr_gt,branch0,reduceexpr_eq,branch0,reduceexpr_mul,branch0,reduceexpr_ne,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,reduceexpr_ge,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,shift29,branch0,reduceexpr_le,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,shift29,branch0,branch0,shift29,branch0,branch0,branch0,branch0,branch0,branch0,shift29,branch0,reduceexpr_array,shift29,shift29,reduceexpr_if_unbalanced,shift29,reduceexpr_if,shift29,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eqArray;
  @SuppressWarnings("unchecked")
  private void initeqArray() {
    eqArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,shift37,branch0,reduceexpr_lt,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,reduceexpr_gt,branch0,reduceexpr_eq,branch0,reduceexpr_mul,branch0,reduceexpr_ne,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,reduceexpr_ge,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,shift37,branch0,reduceexpr_le,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,shift37,branch0,branch0,shift37,branch0,branch0,branch0,branch0,branch0,branch0,shift37,branch0,reduceexpr_array,shift37,shift37,reduceexpr_if_unbalanced,shift37,reduceexpr_if,shift37,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] mulArray;
  @SuppressWarnings("unchecked")
  private void initmulArray() {
    mulArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift12,branch0,branch0,branch0,branch0,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,shift39,branch0,shift39,branch0,reduceexpr_rem,branch0,shift39,branch0,shift39,branch0,shift39,branch0,reduceexpr_mul,branch0,shift39,branch0,reduceexpr_div,branch0,shift39,branch0,shift39,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,shift39,branch0,shift39,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,shift39,branch0,branch0,shift39,branch0,branch0,branch0,branch0,branch0,branch0,shift39,branch0,reduceexpr_array,shift39,shift39,reduceexpr_if_unbalanced,shift39,reduceexpr_if,shift39,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] __eof__Array;
  @SuppressWarnings("unchecked")
  private void init__eof__Array() {
    __eof__Array=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,accept,accept,reducescript,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,branch0,branch0,reduceexpr_lt,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,reduceexpr_gt,branch0,reduceexpr_eq,branch0,reduceexpr_mul,branch0,reduceexpr_ne,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,reduceexpr_ge,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,branch0,reduceexpr_le,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reduceblock_rec,reduceeoi_empty,reduceeoi_semi,reduceinstr_expr,reduceexpr_lambda_expr,branch0,branch0,reduceinstr_while,branch0,branch0,reduceinstr_assign_lambda,reduceeoi_empty,reduceinstr_assign,reduceexpr_array,branch0,branch0,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _whileArray;
  @SuppressWarnings("unchecked")
  private void init_whileArray() {
    _whileArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift60,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceblock_empty,shift60,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,branch0,branch0,reduceexpr_lt,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,reduceexpr_gt,branch0,reduceexpr_eq,branch0,reduceexpr_mul,branch0,reduceexpr_ne,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,reduceexpr_ge,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,reduceblock_empty,shift60,reduceexpr_mthcall_lambda,branch0,branch0,reduceblock_empty,branch0,reduceexpr_le,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,reduceblock_empty,shift60,reduceexpr_funcall_lambda,reduceblock_rec,reduceeoi_empty,reduceeoi_semi,reduceinstr_expr,reduceexpr_lambda_expr,branch0,shift60,reduceinstr_while,reduceblock_empty,shift60,reduceinstr_assign_lambda,reduceeoi_empty,reduceinstr_assign,reduceexpr_array,branch0,branch0,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dotArray;
  @SuppressWarnings("unchecked")
  private void initdotArray() {
    dotArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,shift49,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,shift49,branch0,shift49,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,shift49,branch0,branch0,shift49,branch0,branch0,branch0,branch0,branch0,branch0,shift49,branch0,reduceexpr_array,shift49,shift49,reduceexpr_if_unbalanced,shift49,reduceexpr_if,shift49,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] leArray;
  @SuppressWarnings("unchecked")
  private void initleArray() {
    leArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,shift63,branch0,reduceexpr_lt,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,reduceexpr_gt,branch0,reduceexpr_eq,branch0,reduceexpr_mul,branch0,reduceexpr_ne,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,reduceexpr_ge,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,shift63,branch0,reduceexpr_le,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,shift63,branch0,branch0,shift63,branch0,branch0,branch0,branch0,branch0,branch0,shift63,branch0,reduceexpr_array,shift63,shift63,reduceexpr_if_unbalanced,shift63,reduceexpr_if,shift63,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _returnArray;
  @SuppressWarnings("unchecked")
  private void init_returnArray() {
    _returnArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceblock_empty,shift4,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,branch0,branch0,reduceexpr_lt,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,reduceexpr_gt,branch0,reduceexpr_eq,branch0,reduceexpr_mul,branch0,reduceexpr_ne,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,reduceexpr_ge,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,reduceblock_empty,shift4,reduceexpr_mthcall_lambda,branch0,branch0,reduceblock_empty,branch0,reduceexpr_le,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,reduceblock_empty,shift4,reduceexpr_funcall_lambda,reduceblock_rec,reduceeoi_empty,reduceeoi_semi,reduceinstr_expr,reduceexpr_lambda_expr,branch0,shift4,reduceinstr_while,reduceblock_empty,shift4,reduceinstr_assign_lambda,reduceeoi_empty,reduceinstr_assign,reduceexpr_array,branch0,branch0,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] loptArray;
  @SuppressWarnings("unchecked")
  private void initloptArray() {
    loptArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift7,shift7,branch0,shift7,reduceargs_empty,shift7,branch0,branch0,branch0,branch0,shift7,reduceblock_empty,shift7,reduceexpr_parens,reducename_id,shift7,branch0,branch0,shift7,reducename_id,reduceargs_empty,shift7,reduceexpr_numeric,reducename_text,reduceexpr_dict,reduceargs_rec,shift7,reduceexpr_lt,shift7,reduceexpr_rem,shift7,reduceexpr_sub,shift7,reduceexpr_gt,shift7,reduceexpr_eq,shift7,reduceexpr_mul,shift7,reduceexpr_ne,shift7,reduceexpr_div,shift7,reduceexpr_add,shift7,reduceexpr_ge,branch0,reduceexpr_access,reduceargs_empty,shift7,reduceexpr_mthcall,branch0,branch0,shift7,reduceblock_empty,shift7,reduceexpr_mthcall_lambda,branch0,shift7,reduceblock_empty,shift7,reduceexpr_le,reduceexpr_name,reduceargs_empty,shift7,reduceexpr_funcall,branch0,branch0,shift7,reduceblock_empty,shift7,reduceexpr_funcall_lambda,reduceblock_rec,reduceeoi_empty,reduceeoi_semi,reduceinstr_expr,reduceexpr_lambda_expr,branch0,shift7,reduceinstr_while,reduceblock_empty,shift7,reduceinstr_assign_lambda,reduceeoi_empty,reduceinstr_assign,reduceexpr_array,shift7,shift7,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lparArray;
  @SuppressWarnings("unchecked")
  private void initlparArray() {
    lparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift14,shift14,shift6,shift14,reduceargs_empty,shift14,branch0,branch0,branch0,branch0,shift14,reduceblock_empty,shift14,reduceexpr_parens,reducename_id,shift14,branch0,branch0,shift14,reducename_id,reduceargs_empty,shift14,reduceexpr_numeric,reducename_text,reduceexpr_dict,reduceargs_rec,shift14,reduceexpr_lt,shift14,reduceexpr_rem,shift14,reduceexpr_sub,shift14,reduceexpr_gt,shift14,reduceexpr_eq,shift14,reduceexpr_mul,shift14,reduceexpr_ne,shift14,reduceexpr_div,shift14,reduceexpr_add,shift14,reduceexpr_ge,branch0,shift51,reduceargs_empty,shift14,reduceexpr_mthcall,branch0,branch0,shift14,reduceblock_empty,shift14,reduceexpr_mthcall_lambda,shift61,shift14,reduceblock_empty,shift14,reduceexpr_le,shift66,reduceargs_empty,shift14,reduceexpr_funcall,branch0,branch0,shift14,reduceblock_empty,shift14,reduceexpr_funcall_lambda,reduceblock_rec,reduceeoi_empty,reduceeoi_semi,reduceinstr_expr,reduceexpr_lambda_expr,branch0,shift14,reduceinstr_while,reduceblock_empty,shift14,reduceinstr_assign_lambda,reduceeoi_empty,reduceinstr_assign,reduceexpr_array,shift14,shift14,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] neArray;
  @SuppressWarnings("unchecked")
  private void initneArray() {
    neArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,shift41,branch0,reduceexpr_lt,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,reduceexpr_gt,branch0,reduceexpr_eq,branch0,reduceexpr_mul,branch0,reduceexpr_ne,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,reduceexpr_ge,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,shift41,branch0,reduceexpr_le,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,shift41,branch0,branch0,shift41,branch0,branch0,branch0,branch0,branch0,branch0,shift41,branch0,reduceexpr_array,shift41,shift41,reduceexpr_if_unbalanced,shift41,reduceexpr_if,shift41,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] divArray;
  @SuppressWarnings("unchecked")
  private void initdivArray() {
    divArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,shift43,branch0,shift43,branch0,reduceexpr_rem,branch0,shift43,branch0,shift43,branch0,shift43,branch0,reduceexpr_mul,branch0,shift43,branch0,reduceexpr_div,branch0,shift43,branch0,shift43,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,shift43,branch0,shift43,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,shift43,branch0,branch0,shift43,branch0,branch0,branch0,branch0,branch0,branch0,shift43,branch0,reduceexpr_array,shift43,shift43,reduceexpr_if_unbalanced,shift43,reduceexpr_if,shift43,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] integerArray;
  @SuppressWarnings("unchecked")
  private void initintegerArray() {
    integerArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift25,shift25,branch0,shift25,reduceargs_empty,shift25,branch0,branch0,branch0,branch0,shift25,reduceblock_empty,shift25,reduceexpr_parens,reducename_id,shift25,branch0,branch0,shift25,reducename_id,reduceargs_empty,shift25,reduceexpr_numeric,reducename_text,reduceexpr_dict,reduceargs_rec,shift25,reduceexpr_lt,shift25,reduceexpr_rem,shift25,reduceexpr_sub,shift25,reduceexpr_gt,shift25,reduceexpr_eq,shift25,reduceexpr_mul,shift25,reduceexpr_ne,shift25,reduceexpr_div,shift25,reduceexpr_add,shift25,reduceexpr_ge,branch0,reduceexpr_access,reduceargs_empty,shift25,reduceexpr_mthcall,branch0,branch0,shift25,reduceblock_empty,shift25,reduceexpr_mthcall_lambda,branch0,shift25,reduceblock_empty,shift25,reduceexpr_le,reduceexpr_name,reduceargs_empty,shift25,reduceexpr_funcall,branch0,branch0,shift25,reduceblock_empty,shift25,reduceexpr_funcall_lambda,reduceblock_rec,reduceeoi_empty,reduceeoi_semi,reduceinstr_expr,reduceexpr_lambda_expr,branch0,shift25,reduceinstr_while,reduceblock_empty,shift25,reduceinstr_assign_lambda,reduceeoi_empty,reduceinstr_assign,reduceexpr_array,shift25,shift25,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] roptArray;
  @SuppressWarnings("unchecked")
  private void initroptArray() {
    roptArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceargs_empty,shift88,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,reduceargs_rec,branch0,reduceexpr_lt,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,reduceexpr_gt,branch0,reduceexpr_eq,branch0,reduceexpr_mul,branch0,reduceexpr_ne,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,reduceexpr_ge,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,branch0,reduceexpr_le,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,branch0,branch0,branch0,reduceexpr_lambda_expr,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_array,branch0,branch0,reduceexpr_if_unbalanced,branch0,reduceexpr_if,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] textArray;
  @SuppressWarnings("unchecked")
  private void inittextArray() {
    textArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift26,shift26,branch0,shift26,reduceargs_empty,shift26,branch0,branch0,branch0,branch0,shift26,reduceblock_empty,shift26,reduceexpr_parens,reducename_id,shift26,branch0,branch0,shift26,reducename_id,reduceargs_empty,shift26,reduceexpr_numeric,reducename_text,reduceexpr_dict,reduceargs_rec,shift26,reduceexpr_lt,shift26,reduceexpr_rem,shift26,reduceexpr_sub,shift26,reduceexpr_gt,shift26,reduceexpr_eq,shift26,reduceexpr_mul,shift26,reduceexpr_ne,shift26,reduceexpr_div,shift26,reduceexpr_add,shift26,reduceexpr_ge,shift26,reduceexpr_access,reduceargs_empty,shift26,reduceexpr_mthcall,branch0,branch0,shift26,reduceblock_empty,shift26,reduceexpr_mthcall_lambda,branch0,shift26,reduceblock_empty,shift26,reduceexpr_le,reduceexpr_name,reduceargs_empty,shift26,reduceexpr_funcall,branch0,branch0,shift26,reduceblock_empty,shift26,reduceexpr_funcall_lambda,reduceblock_rec,reduceeoi_empty,reduceeoi_semi,reduceinstr_expr,reduceexpr_lambda_expr,branch0,shift26,reduceinstr_while,reduceblock_empty,shift26,reduceinstr_assign_lambda,reduceeoi_empty,reduceinstr_assign,reduceexpr_array,shift26,shift26,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] gtArray;
  @SuppressWarnings("unchecked")
  private void initgtArray() {
    gtArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,shift35,branch0,reduceexpr_lt,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,reduceexpr_gt,branch0,reduceexpr_eq,branch0,reduceexpr_mul,branch0,reduceexpr_ne,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,reduceexpr_ge,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,shift35,branch0,reduceexpr_le,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,shift35,branch0,branch0,shift35,branch0,branch0,branch0,branch0,branch0,branch0,shift35,branch0,reduceexpr_array,shift35,shift35,reduceexpr_if_unbalanced,shift35,reduceexpr_if,shift35,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] idArray;
  @SuppressWarnings("unchecked")
  private void initidArray() {
    idArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift17,shift22,branch0,shift22,reduceargs_empty,shift22,reduceparams_empty,shift11,reduceparam_id,reduceparam_id_varargs,shift22,reduceblock_empty,shift17,reduceexpr_parens,reducename_id,shift22,reduceparams_empty,shift11,shift22,reducename_id,reduceargs_empty,shift22,reduceexpr_numeric,reducename_text,reduceexpr_dict,reduceargs_rec,shift22,reduceexpr_lt,shift22,reduceexpr_rem,shift22,reduceexpr_sub,shift22,reduceexpr_gt,shift22,reduceexpr_eq,shift22,reduceexpr_mul,shift22,reduceexpr_ne,shift22,reduceexpr_div,shift22,reduceexpr_add,shift22,reduceexpr_ge,shift22,reduceexpr_access,reduceargs_empty,shift22,reduceexpr_mthcall,reduceparams_empty,shift11,shift22,reduceblock_empty,shift17,reduceexpr_mthcall_lambda,branch0,shift22,reduceblock_empty,shift22,reduceexpr_le,reduceexpr_name,reduceargs_empty,shift22,reduceexpr_funcall,reduceparams_empty,shift11,shift22,reduceblock_empty,shift17,reduceexpr_funcall_lambda,reduceblock_rec,reduceeoi_empty,reduceeoi_semi,reduceinstr_expr,reduceexpr_lambda_expr,reduceparams_rec,shift17,reduceinstr_while,reduceblock_empty,shift17,reduceinstr_assign_lambda,reduceeoi_empty,reduceinstr_assign,reduceexpr_array,shift22,shift22,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] antislashArray;
  @SuppressWarnings("unchecked")
  private void initantislashArray() {
    antislashArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift9,shift9,branch0,shift9,reduceargs_empty,shift9,branch0,branch0,branch0,branch0,shift9,reduceblock_empty,shift9,reduceexpr_parens,reducename_id,shift19,branch0,branch0,shift9,reducename_id,reduceargs_empty,shift9,reduceexpr_numeric,reducename_text,reduceexpr_dict,reduceargs_rec,shift9,reduceexpr_lt,shift9,reduceexpr_rem,shift9,reduceexpr_sub,shift9,reduceexpr_gt,shift9,reduceexpr_eq,shift9,reduceexpr_mul,shift9,reduceexpr_ne,shift9,reduceexpr_div,shift9,reduceexpr_add,shift9,reduceexpr_ge,branch0,reduceexpr_access,reduceargs_empty,shift54,reduceexpr_mthcall,branch0,branch0,shift9,reduceblock_empty,shift9,reduceexpr_mthcall_lambda,branch0,shift9,reduceblock_empty,shift9,reduceexpr_le,reduceexpr_name,reduceargs_empty,shift69,reduceexpr_funcall,branch0,branch0,shift9,reduceblock_empty,shift9,reduceexpr_funcall_lambda,reduceblock_rec,reduceeoi_empty,reduceeoi_semi,reduceinstr_expr,reduceexpr_lambda_expr,branch0,shift9,reduceinstr_while,reduceblock_empty,shift9,reduceinstr_assign_lambda,reduceeoi_empty,reduceinstr_assign,reduceexpr_array,shift9,shift9,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lcurlArray;
  @SuppressWarnings("unchecked")
  private void initlcurlArray() {
    lcurlArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift23,shift23,branch0,shift23,reduceargs_empty,shift23,branch0,branch0,branch0,branch0,shift23,reduceblock_empty,shift23,reduceexpr_parens,reducename_id,shift23,branch0,branch0,shift23,reducename_id,reduceargs_empty,shift23,reduceexpr_numeric,reducename_text,reduceexpr_dict,reduceargs_rec,shift23,reduceexpr_lt,shift23,reduceexpr_rem,shift23,reduceexpr_sub,shift23,reduceexpr_gt,shift23,reduceexpr_eq,shift23,reduceexpr_mul,shift23,reduceexpr_ne,shift23,reduceexpr_div,shift23,reduceexpr_add,shift23,reduceexpr_ge,branch0,reduceexpr_access,reduceargs_empty,shift23,reduceexpr_mthcall,branch0,branch0,shift23,reduceblock_empty,shift23,reduceexpr_mthcall_lambda,branch0,shift23,reduceblock_empty,shift23,reduceexpr_le,reduceexpr_name,reduceargs_empty,shift23,reduceexpr_funcall,branch0,branch0,shift23,reduceblock_empty,shift23,reduceexpr_funcall_lambda,reduceblock_rec,reduceeoi_empty,reduceeoi_semi,reduceinstr_expr,reduceexpr_lambda_expr,branch0,shift23,reduceinstr_while,reduceblock_empty,shift23,reduceinstr_assign_lambda,reduceeoi_empty,reduceinstr_assign,reduceexpr_array,shift23,shift23,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] addArray;
  @SuppressWarnings("unchecked")
  private void initaddArray() {
    addArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,shift45,branch0,shift45,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,shift45,branch0,shift45,branch0,reduceexpr_mul,branch0,shift45,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,shift45,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,shift45,branch0,shift45,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,shift45,branch0,branch0,shift45,branch0,branch0,branch0,branch0,branch0,branch0,shift45,branch0,reduceexpr_array,shift45,shift45,reduceexpr_if_unbalanced,shift45,reduceexpr_if,shift45,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] semicolonArray;
  @SuppressWarnings("unchecked")
  private void initsemicolonArray() {
    semicolonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,branch0,branch0,reduceexpr_lt,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,reduceexpr_gt,branch0,reduceexpr_eq,branch0,reduceexpr_mul,branch0,reduceexpr_ne,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,reduceexpr_ge,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,branch0,reduceexpr_le,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,shift77,branch0,branch0,reduceexpr_lambda_expr,branch0,branch0,branch0,branch0,branch0,branch0,shift77,branch0,reduceexpr_array,branch0,branch0,reduceexpr_if_unbalanced,branch0,reduceexpr_if,shift77,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eolArray;
  @SuppressWarnings("unchecked")
  private void initeolArray() {
    eolArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift83,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift57,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift72,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rcurlArray;
  @SuppressWarnings("unchecked")
  private void initrcurlArray() {
    rcurlArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceargs_empty,shift27,reduceexpr_numeric,reducename_text,reduceexpr_dict,reduceargs_rec,branch0,reduceexpr_lt,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,reduceexpr_gt,branch0,reduceexpr_eq,branch0,reduceexpr_mul,branch0,reduceexpr_ne,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,reduceexpr_ge,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,branch0,reduceexpr_le,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,branch0,branch0,branch0,reduceexpr_lambda_expr,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_array,branch0,branch0,reduceexpr_if_unbalanced,branch0,reduceexpr_if,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] assignArray;
  @SuppressWarnings("unchecked")
  private void initassignArray() {
    assignArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _ifArray;
  @SuppressWarnings("unchecked")
  private void init_ifArray() {
    _ifArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift5,shift5,branch0,shift5,reduceargs_empty,shift5,branch0,branch0,branch0,branch0,shift5,reduceblock_empty,shift5,reduceexpr_parens,reducename_id,shift5,branch0,branch0,shift5,reducename_id,reduceargs_empty,shift5,reduceexpr_numeric,reducename_text,reduceexpr_dict,reduceargs_rec,shift5,reduceexpr_lt,shift5,reduceexpr_rem,shift5,reduceexpr_sub,shift5,reduceexpr_gt,shift5,reduceexpr_eq,shift5,reduceexpr_mul,shift5,reduceexpr_ne,shift5,reduceexpr_div,shift5,reduceexpr_add,shift5,reduceexpr_ge,branch0,reduceexpr_access,reduceargs_empty,shift5,reduceexpr_mthcall,branch0,branch0,shift5,reduceblock_empty,shift5,reduceexpr_mthcall_lambda,branch0,shift5,reduceblock_empty,shift5,reduceexpr_le,reduceexpr_name,reduceargs_empty,shift5,reduceexpr_funcall,branch0,branch0,shift5,reduceblock_empty,shift5,reduceexpr_funcall_lambda,reduceblock_rec,reduceeoi_empty,reduceeoi_semi,reduceinstr_expr,reduceexpr_lambda_expr,branch0,shift5,reduceinstr_while,reduceblock_empty,shift5,reduceinstr_assign_lambda,reduceeoi_empty,reduceinstr_assign,reduceexpr_array,shift5,shift5,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] subArray;
  @SuppressWarnings("unchecked")
  private void initsubArray() {
    subArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,shift33,branch0,shift33,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,shift33,branch0,shift33,branch0,reduceexpr_mul,branch0,shift33,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,shift33,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,shift33,branch0,shift33,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,shift33,branch0,branch0,shift33,branch0,branch0,branch0,branch0,branch0,branch0,shift33,branch0,reduceexpr_array,shift33,shift33,reduceexpr_if_unbalanced,shift33,reduceexpr_if,shift33,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] geArray;
  @SuppressWarnings("unchecked")
  private void initgeArray() {
    geArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_parens,reducename_id,branch0,branch0,branch0,branch0,reducename_id,branch0,branch0,reduceexpr_numeric,reducename_text,reduceexpr_dict,shift47,branch0,reduceexpr_lt,branch0,reduceexpr_rem,branch0,reduceexpr_sub,branch0,reduceexpr_gt,branch0,reduceexpr_eq,branch0,reduceexpr_mul,branch0,reduceexpr_ne,branch0,reduceexpr_div,branch0,reduceexpr_add,branch0,reduceexpr_ge,branch0,reduceexpr_access,branch0,branch0,reduceexpr_mthcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,shift47,branch0,reduceexpr_le,reduceexpr_name,branch0,branch0,reduceexpr_funcall,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,shift47,branch0,branch0,shift47,branch0,branch0,branch0,branch0,branch0,branch0,shift47,branch0,reduceexpr_array,shift47,shift47,reduceexpr_if_unbalanced,shift47,reduceexpr_if,shift47,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] arrowArray;
  @SuppressWarnings("unchecked")
  private void initarrowArray() {
    arrowArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceparams_empty,shift13,reduceparam_id,reduceparam_id_varargs,branch0,branch0,branch0,branch0,branch0,branch0,reduceparams_empty,shift21,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceparams_empty,shift56,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceparams_empty,shift71,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceparams_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] branchArrayTable;
  @SuppressWarnings("unchecked")
  private void initBranchArrayTable() {
    branchArrayTable=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,exit,exit,reducescript,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reduceexpr_parens,reducename_id,error0,error0,error0,error0,reducename_id,error0,error0,reduceexpr_numeric,reducename_text,reduceexpr_dict,error0,error0,reduceexpr_lt,error0,reduceexpr_rem,error0,reduceexpr_sub,error0,reduceexpr_gt,error0,reduceexpr_eq,error0,reduceexpr_mul,error0,reduceexpr_ne,error0,reduceexpr_div,error0,reduceexpr_add,error0,reduceexpr_ge,error0,reduceexpr_access,error0,error0,reduceexpr_mthcall,error0,error0,error0,error0,error0,reduceexpr_mthcall_lambda,error0,error0,error0,error0,reduceexpr_le,reduceexpr_name,error0,error0,reduceexpr_funcall,error0,error0,error0,error0,error0,reduceexpr_funcall_lambda,reduceblock_rec,reduceeoi_empty,reduceeoi_semi,reduceinstr_expr,reduceexpr_lambda_expr,error0,error0,reduceinstr_while,error0,error0,reduceinstr_assign_lambda,reduceeoi_empty,reduceinstr_assign,reduceexpr_array,error0,error0,reduceexpr_if_unbalanced,error0,reduceexpr_if,reduceeoi_empty,reduceinstr_return};
  }

  private final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> table;
  
  public static final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> createTable() {
    return new ParserDataTable().table;
  }

  private final AcceptAction<TerminalEnum,ProductionEnum,VersionEnum> accept;
  private final ExitAction<TerminalEnum,ProductionEnum,VersionEnum> exit;

  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceargs_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_le;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparams_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_dict;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_ge;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceeoi_semi;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparams_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparam_id_varargs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_assign;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceeoi_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_array;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_eq;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_add;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_parens;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_mthcall_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparam_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_numeric;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducescript;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_gt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_ne;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_while;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_funcall_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_return;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_lt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_mul;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_div;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducename_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_rem;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_funcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_lambda_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_assign_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducename_text;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_sub;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_name;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_mthcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceargs_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if_unbalanced;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_access;

  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift45;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift59;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift88;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift43;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift25;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift51;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift4;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift26;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift66;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift61;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift74;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift72;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift6;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift77;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift12;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift54;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift9;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift93;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift17;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift5;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift18;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift35;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift63;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift60;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift83;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift13;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift47;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift7;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift29;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift37;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift49;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift91;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift22;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift19;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift82;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift41;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift53;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift85;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift16;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift69;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift57;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift21;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift14;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift71;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift33;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift11;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift39;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift27;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift31;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift56;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift23;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift68;


  private final ErrorAction<TerminalEnum,ProductionEnum,VersionEnum> error0;

  private final BranchAction<TerminalEnum,ProductionEnum,VersionEnum> branch0;


  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reducename_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0antislash_metadata0reduceparams_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_funcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_parens;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ne_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_mthcall_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eoi_metadata0reduceinstr_assign;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0__eof___metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_mthcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ge_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0le_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0assign_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0name_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dot_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0add_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_if_unbalanced;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceinstr_assign_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_while_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0arrow_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ropt_metadata0reduceexpr_array;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0div_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0params_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_return_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_if;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_funcall_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0args_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eq_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceinstr_while;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0param_metadata0reduceparams_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0reduceblock_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0reduceblock_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0reduceargs_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0gt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_if_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eoi_metadata0reduceinstr_expr;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lcurl_metadata0reduceargs_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceblock_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lopt_metadata0reduceargs_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rcurl_metadata0reduceexpr_dict;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0script_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0integer_metadata0reduceexpr_numeric;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0null_metadata0reduceblock_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0text_metadata0reducename_text;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0mul_metadata0reduceparam_id_varargs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0mul_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rem_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0semicolon_metadata0reduceeoi_semi;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eoi_metadata0reduceinstr_return;
}
