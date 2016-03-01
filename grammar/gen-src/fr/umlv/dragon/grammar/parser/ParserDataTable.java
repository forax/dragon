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
    initnameGotoes();
    initinstrGotoes();
    initparamsGotoes();
    initblockGotoes();
    initscriptGotoes();
    initeoiGotoes();
    initexprGotoes();
    initparamGotoes();
    initargsGotoes();
    reducename_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.name_id,1,nameGotoes);
    reduceexpr_mthcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_mthcall,6,exprGotoes);
    reduceexpr_array = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_array,3,exprGotoes);
    reduceinstr_return = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_return,3,instrGotoes);
    reduceexpr_parens = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_parens,3,exprGotoes);
    reduceexpr_numeric = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_numeric,1,exprGotoes);
    reduceparam_id_varargs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.param_id_varargs,2,paramGotoes);
    reduceinstr_while = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_while,5,instrGotoes);
    reduceexpr_funcall_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_funcall_lambda,8,exprGotoes);
    reduceargs_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.args_rec,2,argsGotoes);
    reduceexpr_gt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_gt,3,exprGotoes);
    reduceexpr_funcall = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_funcall,4,exprGotoes);
    reduceinstr_assign_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_assign_lambda,7,instrGotoes);
    reduceexpr_sub = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_sub,3,exprGotoes);
    reduceexpr_name = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_name,1,exprGotoes);
    reduceexpr_if_unbalanced = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if_unbalanced,5,exprGotoes);
    reduceinstr_assign = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_assign,4,instrGotoes);
    reduceparams_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.params_rec,2,paramsGotoes);
    reduceeoi_semi = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.eoi_semi,1,eoiGotoes);
    reduceexpr_mthcall_lambda = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_mthcall_lambda,10,exprGotoes);
    reducescript = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.script,1,scriptGotoes);
    reduceparams_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.params_empty,0,paramsGotoes);
    reduceexpr_rem = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_rem,3,exprGotoes);
    reduceexpr_ne = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_ne,3,exprGotoes);
    reduceexpr_lt = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_lt,3,exprGotoes);
    reduceexpr_dict = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_dict,3,exprGotoes);
    reduceexpr_le = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_le,3,exprGotoes);
    reduceblock_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_rec,2,blockGotoes);
    reduceinstr_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.instr_expr,2,instrGotoes);
    reduceexpr_div = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_div,3,exprGotoes);
    reduceexpr_mul = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_mul,3,exprGotoes);
    reduceargs_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.args_empty,0,argsGotoes);
    reduceparam_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.param_id,1,paramGotoes);
    reduceexpr_ge = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_ge,3,exprGotoes);
    reduceexpr_if = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_if,6,exprGotoes);
    reduceexpr_lambda_expr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_lambda_expr,4,exprGotoes);
    reduceeoi_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.eoi_empty,0,eoiGotoes);
    reduceexpr_add = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_add,3,exprGotoes);
    reducename_text = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.name_text,1,nameGotoes);
    reduceexpr_access = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_access,3,exprGotoes);
    reduceblock_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.block_empty,0,blockGotoes);
    reduceexpr_eq = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.expr_eq,3,exprGotoes);
    shift38 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(38);
    shift12 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(12);
    shift56 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(56);
    shift35 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(35);
    shift90 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(90);
    shift64 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(64);
    shift48 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(48);
    shift14 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(14);
    shift87 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(87);
    shift70 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(70);
    shift81 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(81);
    shift22 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(22);
    shift68 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(68);
    shift50 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(50);
    shift86 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(86);
    shift20 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(20);
    shift13 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(13);
    shift24 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(24);
    shift60 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(60);
    shift72 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(72);
    shift30 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(30);
    shift17 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(17);
    shift83 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(83);
    shift33 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(33);
    shift8 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(8);
    shift18 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(18);
    shift46 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(46);
    shift89 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(89);
    shift4 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(4);
    shift42 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(42);
    shift66 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(66);
    shift55 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(55);
    shift31 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(31);
    shift26 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(26);
    shift16 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(16);
    shift40 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(40);
    shift74 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(74);
    shift58 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(58);
    shift10 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(10);
    shift7 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(7);
    shift54 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(54);
    shift78 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(78);
    shift44 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(44);
    shift28 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(28);
    shift29 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(29);
    shift5 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(5);
    shift19 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(19);
    shift62 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(62);
    shift52 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(52);
    error0 = new ErrorAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    branch0 = new BranchAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    init_returnArray();
    initlcurlArray();
    initintegerArray();
    initmulArray();
    initeolArray();
    initleArray();
    initassignArray();
    initsemicolonArray();
    initantislashArray();
    initremArray();
    initrcurlArray();
    initaddArray();
    init_ifArray();
    initgtArray();
    inittextArray();
    init_whileArray();
    initdivArray();
    initneArray();
    initdotArray();
    initsubArray();
    initroptArray();
    initgeArray();
    initlparArray();
    initidArray();
    init__eof__Array();
    initloptArray();
    initeqArray();
    initarrowArray();
    initltArray();
    initrparArray();
    EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]> tableMap =
      new EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]>(TerminalEnum.class);
      
    tableMap.put(TerminalEnum._return,_returnArray);
    tableMap.put(TerminalEnum.lcurl,lcurlArray);
    tableMap.put(TerminalEnum.integer,integerArray);
    tableMap.put(TerminalEnum.mul,mulArray);
    tableMap.put(TerminalEnum.eol,eolArray);
    tableMap.put(TerminalEnum.le,leArray);
    tableMap.put(TerminalEnum.assign,assignArray);
    tableMap.put(TerminalEnum.semicolon,semicolonArray);
    tableMap.put(TerminalEnum.antislash,antislashArray);
    tableMap.put(TerminalEnum.rem,remArray);
    tableMap.put(TerminalEnum.rcurl,rcurlArray);
    tableMap.put(TerminalEnum.add,addArray);
    tableMap.put(TerminalEnum._if,_ifArray);
    tableMap.put(TerminalEnum.gt,gtArray);
    tableMap.put(TerminalEnum.text,textArray);
    tableMap.put(TerminalEnum._while,_whileArray);
    tableMap.put(TerminalEnum.div,divArray);
    tableMap.put(TerminalEnum.ne,neArray);
    tableMap.put(TerminalEnum.dot,dotArray);
    tableMap.put(TerminalEnum.sub,subArray);
    tableMap.put(TerminalEnum.ropt,roptArray);
    tableMap.put(TerminalEnum.ge,geArray);
    tableMap.put(TerminalEnum.lpar,lparArray);
    tableMap.put(TerminalEnum.id,idArray);
    tableMap.put(TerminalEnum.__eof__,__eof__Array);
    tableMap.put(TerminalEnum.lopt,loptArray);
    tableMap.put(TerminalEnum.eq,eqArray);
    tableMap.put(TerminalEnum.arrow,arrowArray);
    tableMap.put(TerminalEnum.lt,ltArray);
    tableMap.put(TerminalEnum.rpar,rparArray);
    initBranchArrayTable();
    
    StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] tableMetadata = createStateMetadataTable();
    
    EnumMap<NonTerminalEnum,Integer> tableStarts =
      new EnumMap<NonTerminalEnum,Integer>(NonTerminalEnum.class);
    tableStarts.put(NonTerminalEnum.script,0);
    table = new ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>(tableMap,branchArrayTable,tableMetadata,tableStarts,VersionEnum.values(),93,TerminalEnum.__eof__,null);
  } 

  // metadata aren't stored in local vars because it freak-out the register allocator of android
  @SuppressWarnings("unchecked")
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] createStateMetadataTable() {
        metadata0lpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,null);
    metadata0rpar_metadata0reduceexpr_if_unbalanced = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_if_unbalanced);
    metadata0lt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lt,null);
    metadata0eoi_metadata0reduceinstr_assign = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.eoi,reduceinstr_assign);
    metadata0lcurl_metadata0reduceargs_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lcurl,reduceargs_empty);
    metadata0le_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.le,null);
    metadata0rpar_metadata0reduceexpr_mthcall_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_mthcall_lambda);
    metadata0text_metadata0reducename_text = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.text,reducename_text);
    metadata0arrow_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.arrow,null);
    metadata0script_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.script,null);
    metadata0rpar_metadata0reduceexpr_funcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_funcall);
    metadata0eol_metadata0reduceblock_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eol,reduceblock_empty);
    metadata0mul_metadata0reduceparam_id_varargs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.mul,reduceparam_id_varargs);
    metadata0lpar_metadata0reduceargs_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,reduceargs_empty);
    metadata0id_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,null);
    metadata0rpar_metadata0reduceexpr_funcall_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_funcall_lambda);
    metadata0instr_metadata0reduceblock_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.instr,reduceblock_rec);
    metadata0add_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.add,null);
    metadata0expr_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.expr,null);
    metadata0lopt_metadata0reduceargs_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lopt,reduceargs_empty);
    metadata0sub_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.sub,null);
    metadata0__eof___metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.__eof__,null);
    metadata0ne_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ne,null);
    metadata0_return_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._return,null);
    metadata0_if_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._if,null);
    metadata0block_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.block,null);
    metadata0_while_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum._while,null);
    metadata0name_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.name,null);
    metadata0assign_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.assign,null);
    metadata0params_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.params,null);
    metadata0semicolon_metadata0reduceeoi_semi = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.semicolon,reduceeoi_semi);
    metadata0mul_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.mul,null);
    metadata0param_metadata0reduceparams_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.param,reduceparams_rec);
    metadata0null_metadata0reduceblock_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(null,reduceblock_empty);
    metadata0eoi_metadata0reduceinstr_return = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.eoi,reduceinstr_return);
    metadata0args_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.args,null);
    metadata0rpar_metadata0reduceinstr_assign_lambda = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceinstr_assign_lambda);
    metadata0ge_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ge,null);
    metadata0ropt_metadata0reduceexpr_array = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.ropt,reduceexpr_array);
    metadata0eoi_metadata0reduceinstr_expr = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.eoi,reduceinstr_expr);
    metadata0id_metadata0reducename_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reducename_id);
    metadata0rpar_metadata0reduceexpr_mthcall = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_mthcall);
    metadata0antislash_metadata0reduceparams_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.antislash,reduceparams_empty);
    metadata0integer_metadata0reduceexpr_numeric = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.integer,reduceexpr_numeric);
    metadata0rpar_metadata0reduceexpr_if = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_if);
    metadata0rem_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rem,null);
    metadata0rcurl_metadata0reduceexpr_dict = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rcurl,reduceexpr_dict);
    metadata0dot_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dot,null);
    metadata0rpar_metadata0reduceinstr_while = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceinstr_while);
    metadata0lpar_metadata0reduceblock_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,reduceblock_empty);
    metadata0div_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.div,null);
    metadata0rpar_metadata0reduceexpr_parens = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceexpr_parens);
    metadata0gt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.gt,null);
    metadata0eq_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eq,null);

    return (StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[])new StateMetadata<?,?,?,?>[]{metadata0null_metadata0reduceblock_empty,metadata0script_metadata0null,metadata0__eof___metadata0null,metadata0block_metadata0null,metadata0_return_metadata0null,metadata0lopt_metadata0reduceargs_empty,metadata0args_metadata0null,metadata0text_metadata0reducename_text,metadata0lcurl_metadata0reduceargs_empty,metadata0args_metadata0null,metadata0antislash_metadata0reduceparams_empty,metadata0params_metadata0null,metadata0arrow_metadata0null,metadata0integer_metadata0reduceexpr_numeric,metadata0lpar_metadata0reduceblock_empty,metadata0block_metadata0null,metadata0_while_metadata0null,metadata0lpar_metadata0null,metadata0_if_metadata0null,metadata0lpar_metadata0null,metadata0id_metadata0reducename_id,metadata0name_metadata0null,metadata0lpar_metadata0reduceargs_empty,metadata0args_metadata0null,metadata0antislash_metadata0reduceparams_empty,metadata0params_metadata0null,metadata0eol_metadata0reduceblock_empty,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_funcall_lambda,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0antislash_metadata0reduceparams_empty,metadata0params_metadata0null,metadata0eol_metadata0reduceblock_empty,metadata0block_metadata0null,metadata0rpar_metadata0reduceinstr_assign_lambda,metadata0instr_metadata0reduceblock_rec,metadata0expr_metadata0null,metadata0ne_metadata0null,metadata0expr_metadata0null,metadata0eq_metadata0null,metadata0expr_metadata0null,metadata0le_metadata0null,metadata0expr_metadata0null,metadata0div_metadata0null,metadata0expr_metadata0null,metadata0dot_metadata0null,metadata0name_metadata0null,metadata0lpar_metadata0reduceargs_empty,metadata0args_metadata0null,metadata0antislash_metadata0reduceparams_empty,metadata0params_metadata0null,metadata0eol_metadata0reduceblock_empty,metadata0block_metadata0null,metadata0rpar_metadata0reduceexpr_mthcall_lambda,metadata0id_metadata0null,metadata0mul_metadata0reduceparam_id_varargs,metadata0param_metadata0reduceparams_rec,metadata0rpar_metadata0reduceexpr_mthcall,metadata0expr_metadata0null,metadata0sub_metadata0null,metadata0expr_metadata0null,metadata0rem_metadata0null,metadata0expr_metadata0null,metadata0ge_metadata0null,metadata0expr_metadata0null,metadata0lt_metadata0null,metadata0expr_metadata0null,metadata0mul_metadata0null,metadata0expr_metadata0null,metadata0add_metadata0null,metadata0expr_metadata0null,metadata0gt_metadata0null,metadata0expr_metadata0null,metadata0semicolon_metadata0reduceeoi_semi,metadata0eoi_metadata0reduceinstr_expr,metadata0expr_metadata0null,metadata0eoi_metadata0reduceinstr_assign,metadata0rpar_metadata0reduceexpr_funcall,metadata0expr_metadata0null,metadata0expr_metadata0null,metadata0rpar_metadata0reduceexpr_if_unbalanced,metadata0expr_metadata0null,metadata0rpar_metadata0reduceexpr_if,metadata0expr_metadata0null,metadata0block_metadata0null,metadata0rpar_metadata0reduceinstr_while,metadata0rpar_metadata0reduceexpr_parens,metadata0expr_metadata0null,metadata0rcurl_metadata0reduceexpr_dict,metadata0ropt_metadata0reduceexpr_array,metadata0expr_metadata0null,metadata0eoi_metadata0reduceinstr_return};
  }

  
  private int[] nameGotoes;

  private void initnameGotoes() {
    nameGotoes = 
      new int[]{-1,-1,-1,21,21,-1,21,-1,-1,21,-1,-1,21,-1,-1,21,-1,21,-1,21,-1,-1,-1,21,-1,-1,-1,21,-1,-1,21,-1,-1,-1,21,-1,-1,-1,21,-1,21,-1,21,-1,21,-1,47,-1,-1,21,-1,-1,-1,21,-1,-1,-1,-1,-1,-1,21,-1,21,-1,21,-1,21,-1,21,-1,21,-1,21,-1,-1,-1,-1,-1,-1,21,21,-1,-1,-1,-1,21,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] instrGotoes;

  private void initinstrGotoes() {
    instrGotoes = 
      new int[]{-1,-1,-1,36,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,36,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,36,-1,-1,-1,-1,-1,-1,36,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,36,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,36,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] paramsGotoes;

  private void initparamsGotoes() {
    paramsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,11,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,32,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] blockGotoes;

  private void initblockGotoes() {
    blockGotoes = 
      new int[]{3,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,15,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,27,-1,-1,-1,-1,-1,-1,34,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,53,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,85,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] scriptGotoes;

  private void initscriptGotoes() {
    scriptGotoes = 
      new int[]{1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] eoiGotoes;

  private void initeoiGotoes() {
    eoiGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,75,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,77,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,92,-1};
  }
  
  private int[] exprGotoes;

  private void initexprGotoes() {
    exprGotoes = 
      new int[]{-1,-1,-1,37,91,-1,59,-1,-1,59,-1,-1,88,-1,-1,37,-1,84,-1,79,-1,-1,-1,59,-1,-1,-1,37,-1,-1,76,-1,-1,-1,37,-1,-1,-1,39,-1,41,-1,43,-1,45,-1,-1,-1,-1,59,-1,-1,-1,37,-1,-1,-1,-1,-1,-1,61,-1,63,-1,65,-1,67,-1,69,-1,71,-1,73,-1,-1,-1,-1,-1,-1,80,82,-1,-1,-1,-1,37,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] paramGotoes;

  private void initparamGotoes() {
    paramGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,57,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,57,-1,-1,-1,-1,-1,-1,57,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,57,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] argsGotoes;

  private void initargsGotoes() {
    argsGotoes = 
      new int[]{-1,-1,-1,-1,-1,6,-1,-1,9,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,23,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _returnArray;
  @SuppressWarnings("unchecked")
  private void init_returnArray() {
    _returnArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift4,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,reduceblock_empty,shift4,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,reduceblock_empty,shift4,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,reduceblock_empty,shift4,reduceinstr_assign_lambda,reduceblock_rec,reduceeoi_empty,branch0,reduceexpr_ne,branch0,reduceexpr_eq,branch0,reduceexpr_le,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,reduceblock_empty,shift4,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,reduceexpr_ge,branch0,reduceexpr_lt,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,reduceexpr_gt,reduceeoi_semi,reduceinstr_expr,reduceeoi_empty,reduceinstr_assign,reduceexpr_funcall,branch0,branch0,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceblock_empty,shift4,reduceinstr_while,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lcurlArray;
  @SuppressWarnings("unchecked")
  private void initlcurlArray() {
    lcurlArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift8,shift8,reduceargs_empty,shift8,reducename_text,reduceargs_empty,shift8,branch0,branch0,shift8,reduceexpr_numeric,reduceblock_empty,shift8,branch0,shift8,branch0,shift8,reducename_id,reduceexpr_name,reduceargs_empty,shift8,branch0,branch0,reduceblock_empty,shift8,reduceexpr_funcall_lambda,reducename_id,shift8,branch0,branch0,reduceblock_empty,shift8,reduceinstr_assign_lambda,reduceblock_rec,reduceeoi_empty,shift8,reduceexpr_ne,shift8,reduceexpr_eq,shift8,reduceexpr_le,shift8,reduceexpr_div,branch0,reduceexpr_access,reduceargs_empty,shift8,branch0,branch0,reduceblock_empty,shift8,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,reduceargs_rec,shift8,reduceexpr_sub,shift8,reduceexpr_rem,shift8,reduceexpr_ge,shift8,reduceexpr_lt,shift8,reduceexpr_mul,shift8,reduceexpr_add,shift8,reduceexpr_gt,reduceeoi_semi,reduceinstr_expr,reduceeoi_empty,reduceinstr_assign,reduceexpr_funcall,shift8,shift8,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceblock_empty,shift8,reduceinstr_while,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] integerArray;
  @SuppressWarnings("unchecked")
  private void initintegerArray() {
    integerArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift13,shift13,reduceargs_empty,shift13,reducename_text,reduceargs_empty,shift13,branch0,branch0,shift13,reduceexpr_numeric,reduceblock_empty,shift13,branch0,shift13,branch0,shift13,reducename_id,reduceexpr_name,reduceargs_empty,shift13,branch0,branch0,reduceblock_empty,shift13,reduceexpr_funcall_lambda,reducename_id,shift13,branch0,branch0,reduceblock_empty,shift13,reduceinstr_assign_lambda,reduceblock_rec,reduceeoi_empty,shift13,reduceexpr_ne,shift13,reduceexpr_eq,shift13,reduceexpr_le,shift13,reduceexpr_div,branch0,reduceexpr_access,reduceargs_empty,shift13,branch0,branch0,reduceblock_empty,shift13,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,reduceargs_rec,shift13,reduceexpr_sub,shift13,reduceexpr_rem,shift13,reduceexpr_ge,shift13,reduceexpr_lt,shift13,reduceexpr_mul,shift13,reduceexpr_add,shift13,reduceexpr_gt,reduceeoi_semi,reduceinstr_expr,reduceeoi_empty,reduceinstr_assign,reduceexpr_funcall,shift13,shift13,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceblock_empty,shift13,reduceinstr_while,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] mulArray;
  @SuppressWarnings("unchecked")
  private void initmulArray() {
    mulArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift68,branch0,shift68,branch0,shift68,branch0,shift68,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,shift56,branch0,branch0,reduceexpr_mthcall,shift68,branch0,shift68,branch0,reduceexpr_rem,branch0,shift68,branch0,shift68,branch0,reduceexpr_mul,branch0,shift68,branch0,shift68,branch0,branch0,shift68,branch0,reduceexpr_funcall,shift68,shift68,reduceexpr_if_unbalanced,shift68,reduceexpr_if,shift68,branch0,branch0,reduceexpr_parens,shift68,reduceexpr_dict,reduceexpr_array,shift68,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eolArray;
  @SuppressWarnings("unchecked")
  private void initeolArray() {
    eolArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceparams_empty,shift26,branch0,branch0,branch0,branch0,branch0,reduceparams_empty,shift33,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceparams_empty,shift52,branch0,branch0,branch0,reduceparam_id,reduceparam_id_varargs,reduceparams_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] leArray;
  @SuppressWarnings("unchecked")
  private void initleArray() {
    leArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift42,branch0,reduceexpr_ne,branch0,reduceexpr_eq,branch0,reduceexpr_le,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,shift42,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,reduceexpr_ge,branch0,reduceexpr_lt,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,reduceexpr_gt,branch0,branch0,shift42,branch0,reduceexpr_funcall,shift42,shift42,reduceexpr_if_unbalanced,shift42,reduceexpr_if,shift42,branch0,branch0,reduceexpr_parens,shift42,reduceexpr_dict,reduceexpr_array,shift42,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] assignArray;
  @SuppressWarnings("unchecked")
  private void initassignArray() {
    assignArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift30,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] semicolonArray;
  @SuppressWarnings("unchecked")
  private void initsemicolonArray() {
    semicolonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift74,branch0,reduceexpr_ne,branch0,reduceexpr_eq,branch0,reduceexpr_le,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,reduceexpr_ge,branch0,reduceexpr_lt,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,reduceexpr_gt,branch0,branch0,shift74,branch0,reduceexpr_funcall,branch0,branch0,reduceexpr_if_unbalanced,branch0,reduceexpr_if,branch0,branch0,branch0,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,shift74,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] antislashArray;
  @SuppressWarnings("unchecked")
  private void initantislashArray() {
    antislashArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift10,shift10,reduceargs_empty,shift10,reducename_text,reduceargs_empty,shift10,branch0,branch0,shift10,reduceexpr_numeric,reduceblock_empty,shift10,branch0,shift10,branch0,shift10,reducename_id,reduceexpr_name,reduceargs_empty,shift24,branch0,branch0,reduceblock_empty,shift10,reduceexpr_funcall_lambda,reducename_id,shift31,branch0,branch0,reduceblock_empty,shift10,reduceinstr_assign_lambda,reduceblock_rec,reduceeoi_empty,shift10,reduceexpr_ne,shift10,reduceexpr_eq,shift10,reduceexpr_le,shift10,reduceexpr_div,branch0,reduceexpr_access,reduceargs_empty,shift50,branch0,branch0,reduceblock_empty,shift10,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,reduceargs_rec,shift10,reduceexpr_sub,shift10,reduceexpr_rem,shift10,reduceexpr_ge,shift10,reduceexpr_lt,shift10,reduceexpr_mul,shift10,reduceexpr_add,shift10,reduceexpr_gt,reduceeoi_semi,reduceinstr_expr,reduceeoi_empty,reduceinstr_assign,reduceexpr_funcall,shift10,shift10,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceblock_empty,shift10,reduceinstr_while,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] remArray;
  @SuppressWarnings("unchecked")
  private void initremArray() {
    remArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift62,branch0,shift62,branch0,shift62,branch0,shift62,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,shift62,branch0,shift62,branch0,reduceexpr_rem,branch0,shift62,branch0,shift62,branch0,reduceexpr_mul,branch0,shift62,branch0,shift62,branch0,branch0,shift62,branch0,reduceexpr_funcall,shift62,shift62,reduceexpr_if_unbalanced,shift62,reduceexpr_if,shift62,branch0,branch0,reduceexpr_parens,shift62,reduceexpr_dict,reduceexpr_array,shift62,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rcurlArray;
  @SuppressWarnings("unchecked")
  private void initrcurlArray() {
    rcurlArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,reduceargs_empty,shift89,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_ne,branch0,reduceexpr_eq,branch0,reduceexpr_le,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,reduceargs_rec,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,reduceexpr_ge,branch0,reduceexpr_lt,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,reduceexpr_gt,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,reduceexpr_if_unbalanced,branch0,reduceexpr_if,branch0,branch0,branch0,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] addArray;
  @SuppressWarnings("unchecked")
  private void initaddArray() {
    addArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift70,branch0,shift70,branch0,shift70,branch0,shift70,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,shift70,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,shift70,branch0,shift70,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,shift70,branch0,branch0,shift70,branch0,reduceexpr_funcall,shift70,shift70,reduceexpr_if_unbalanced,shift70,reduceexpr_if,shift70,branch0,branch0,reduceexpr_parens,shift70,reduceexpr_dict,reduceexpr_array,shift70,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _ifArray;
  @SuppressWarnings("unchecked")
  private void init_ifArray() {
    _ifArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift18,shift18,reduceargs_empty,shift18,reducename_text,reduceargs_empty,shift18,branch0,branch0,shift18,reduceexpr_numeric,reduceblock_empty,shift18,branch0,shift18,branch0,shift18,reducename_id,reduceexpr_name,reduceargs_empty,shift18,branch0,branch0,reduceblock_empty,shift18,reduceexpr_funcall_lambda,reducename_id,shift18,branch0,branch0,reduceblock_empty,shift18,reduceinstr_assign_lambda,reduceblock_rec,reduceeoi_empty,shift18,reduceexpr_ne,shift18,reduceexpr_eq,shift18,reduceexpr_le,shift18,reduceexpr_div,branch0,reduceexpr_access,reduceargs_empty,shift18,branch0,branch0,reduceblock_empty,shift18,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,reduceargs_rec,shift18,reduceexpr_sub,shift18,reduceexpr_rem,shift18,reduceexpr_ge,shift18,reduceexpr_lt,shift18,reduceexpr_mul,shift18,reduceexpr_add,shift18,reduceexpr_gt,reduceeoi_semi,reduceinstr_expr,reduceeoi_empty,reduceinstr_assign,reduceexpr_funcall,shift18,shift18,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceblock_empty,shift18,reduceinstr_while,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] gtArray;
  @SuppressWarnings("unchecked")
  private void initgtArray() {
    gtArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift72,branch0,reduceexpr_ne,branch0,reduceexpr_eq,branch0,reduceexpr_le,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,shift72,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,reduceexpr_ge,branch0,reduceexpr_lt,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,reduceexpr_gt,branch0,branch0,shift72,branch0,reduceexpr_funcall,shift72,shift72,reduceexpr_if_unbalanced,shift72,reduceexpr_if,shift72,branch0,branch0,reduceexpr_parens,shift72,reduceexpr_dict,reduceexpr_array,shift72,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] textArray;
  @SuppressWarnings("unchecked")
  private void inittextArray() {
    textArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift7,shift7,reduceargs_empty,shift7,reducename_text,reduceargs_empty,shift7,branch0,branch0,shift7,reduceexpr_numeric,reduceblock_empty,shift7,branch0,shift7,branch0,shift7,reducename_id,reduceexpr_name,reduceargs_empty,shift7,branch0,branch0,reduceblock_empty,shift7,reduceexpr_funcall_lambda,reducename_id,shift7,branch0,branch0,reduceblock_empty,shift7,reduceinstr_assign_lambda,reduceblock_rec,reduceeoi_empty,shift7,reduceexpr_ne,shift7,reduceexpr_eq,shift7,reduceexpr_le,shift7,reduceexpr_div,shift7,reduceexpr_access,reduceargs_empty,shift7,branch0,branch0,reduceblock_empty,shift7,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,reduceargs_rec,shift7,reduceexpr_sub,shift7,reduceexpr_rem,shift7,reduceexpr_ge,shift7,reduceexpr_lt,shift7,reduceexpr_mul,shift7,reduceexpr_add,shift7,reduceexpr_gt,reduceeoi_semi,reduceinstr_expr,reduceeoi_empty,reduceinstr_assign,reduceexpr_funcall,shift7,shift7,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceblock_empty,shift7,reduceinstr_while,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] _whileArray;
  @SuppressWarnings("unchecked")
  private void init_whileArray() {
    _whileArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift16,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,reduceblock_empty,shift16,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,reduceblock_empty,shift16,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,reduceblock_empty,shift16,reduceinstr_assign_lambda,reduceblock_rec,reduceeoi_empty,branch0,reduceexpr_ne,branch0,reduceexpr_eq,branch0,reduceexpr_le,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,reduceblock_empty,shift16,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,reduceexpr_ge,branch0,reduceexpr_lt,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,reduceexpr_gt,reduceeoi_semi,reduceinstr_expr,reduceeoi_empty,reduceinstr_assign,reduceexpr_funcall,branch0,branch0,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceblock_empty,shift16,reduceinstr_while,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] divArray;
  @SuppressWarnings("unchecked")
  private void initdivArray() {
    divArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift44,branch0,shift44,branch0,shift44,branch0,shift44,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,shift44,branch0,shift44,branch0,reduceexpr_rem,branch0,shift44,branch0,shift44,branch0,reduceexpr_mul,branch0,shift44,branch0,shift44,branch0,branch0,shift44,branch0,reduceexpr_funcall,shift44,shift44,reduceexpr_if_unbalanced,shift44,reduceexpr_if,shift44,branch0,branch0,reduceexpr_parens,shift44,reduceexpr_dict,reduceexpr_array,shift44,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] neArray;
  @SuppressWarnings("unchecked")
  private void initneArray() {
    neArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift38,branch0,reduceexpr_ne,branch0,reduceexpr_eq,branch0,reduceexpr_le,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,shift38,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,reduceexpr_ge,branch0,reduceexpr_lt,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,reduceexpr_gt,branch0,branch0,shift38,branch0,reduceexpr_funcall,shift38,shift38,reduceexpr_if_unbalanced,shift38,reduceexpr_if,shift38,branch0,branch0,reduceexpr_parens,shift38,reduceexpr_dict,reduceexpr_array,shift38,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dotArray;
  @SuppressWarnings("unchecked")
  private void initdotArray() {
    dotArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift46,branch0,shift46,branch0,shift46,branch0,shift46,branch0,shift46,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,shift46,branch0,shift46,branch0,shift46,branch0,shift46,branch0,shift46,branch0,shift46,branch0,shift46,branch0,shift46,branch0,branch0,shift46,branch0,reduceexpr_funcall,shift46,shift46,reduceexpr_if_unbalanced,shift46,reduceexpr_if,shift46,branch0,branch0,reduceexpr_parens,shift46,reduceexpr_dict,reduceexpr_array,shift46,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] subArray;
  @SuppressWarnings("unchecked")
  private void initsubArray() {
    subArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift60,branch0,shift60,branch0,shift60,branch0,shift60,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,shift60,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,shift60,branch0,shift60,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,shift60,branch0,branch0,shift60,branch0,reduceexpr_funcall,shift60,shift60,reduceexpr_if_unbalanced,shift60,reduceexpr_if,shift60,branch0,branch0,reduceexpr_parens,shift60,reduceexpr_dict,reduceexpr_array,shift60,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] roptArray;
  @SuppressWarnings("unchecked")
  private void initroptArray() {
    roptArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,reduceargs_empty,shift90,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_ne,branch0,reduceexpr_eq,branch0,reduceexpr_le,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,reduceargs_rec,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,reduceexpr_ge,branch0,reduceexpr_lt,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,reduceexpr_gt,branch0,branch0,branch0,branch0,reduceexpr_funcall,branch0,branch0,reduceexpr_if_unbalanced,branch0,reduceexpr_if,branch0,branch0,branch0,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] geArray;
  @SuppressWarnings("unchecked")
  private void initgeArray() {
    geArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift64,branch0,reduceexpr_ne,branch0,reduceexpr_eq,branch0,reduceexpr_le,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,shift64,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,reduceexpr_ge,branch0,reduceexpr_lt,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,reduceexpr_gt,branch0,branch0,shift64,branch0,reduceexpr_funcall,shift64,shift64,reduceexpr_if_unbalanced,shift64,reduceexpr_if,shift64,branch0,branch0,reduceexpr_parens,shift64,reduceexpr_dict,reduceexpr_array,shift64,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lparArray;
  @SuppressWarnings("unchecked")
  private void initlparArray() {
    lparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift14,shift14,reduceargs_empty,shift14,reducename_text,reduceargs_empty,shift14,branch0,branch0,shift14,reduceexpr_numeric,reduceblock_empty,shift14,shift17,shift14,shift19,shift14,reducename_id,shift22,reduceargs_empty,shift14,branch0,branch0,reduceblock_empty,shift14,reduceexpr_funcall_lambda,reducename_id,shift14,branch0,branch0,reduceblock_empty,shift14,reduceinstr_assign_lambda,reduceblock_rec,reduceeoi_empty,shift14,reduceexpr_ne,shift14,reduceexpr_eq,shift14,reduceexpr_le,shift14,reduceexpr_div,branch0,shift48,reduceargs_empty,shift14,branch0,branch0,reduceblock_empty,shift14,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,reduceargs_rec,shift14,reduceexpr_sub,shift14,reduceexpr_rem,shift14,reduceexpr_ge,shift14,reduceexpr_lt,shift14,reduceexpr_mul,shift14,reduceexpr_add,shift14,reduceexpr_gt,reduceeoi_semi,reduceinstr_expr,reduceeoi_empty,reduceinstr_assign,reduceexpr_funcall,shift14,shift14,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceblock_empty,shift14,reduceinstr_while,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] idArray;
  @SuppressWarnings("unchecked")
  private void initidArray() {
    idArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift29,shift20,reduceargs_empty,shift20,reducename_text,reduceargs_empty,shift20,reduceparams_empty,shift55,shift20,reduceexpr_numeric,reduceblock_empty,shift29,branch0,shift20,branch0,shift20,reducename_id,reduceexpr_name,reduceargs_empty,shift20,reduceparams_empty,shift55,reduceblock_empty,shift29,reduceexpr_funcall_lambda,reducename_id,shift20,reduceparams_empty,shift55,reduceblock_empty,shift29,reduceinstr_assign_lambda,reduceblock_rec,reduceeoi_empty,shift20,reduceexpr_ne,shift20,reduceexpr_eq,shift20,reduceexpr_le,shift20,reduceexpr_div,shift20,reduceexpr_access,reduceargs_empty,shift20,reduceparams_empty,shift55,reduceblock_empty,shift29,reduceexpr_mthcall_lambda,reduceparam_id,reduceparam_id_varargs,reduceparams_rec,reduceexpr_mthcall,reduceargs_rec,shift20,reduceexpr_sub,shift20,reduceexpr_rem,shift20,reduceexpr_ge,shift20,reduceexpr_lt,shift20,reduceexpr_mul,shift20,reduceexpr_add,shift20,reduceexpr_gt,reduceeoi_semi,reduceinstr_expr,reduceeoi_empty,reduceinstr_assign,reduceexpr_funcall,shift20,shift20,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceblock_empty,shift29,reduceinstr_while,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] __eof__Array;
  @SuppressWarnings("unchecked")
  private void init__eof__Array() {
    __eof__Array=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,accept,accept,reducescript,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,branch0,branch0,reduceinstr_assign_lambda,reduceblock_rec,reduceeoi_empty,branch0,reduceexpr_ne,branch0,reduceexpr_eq,branch0,reduceexpr_le,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,branch0,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,reduceexpr_ge,branch0,reduceexpr_lt,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,reduceexpr_gt,reduceeoi_semi,reduceinstr_expr,reduceeoi_empty,reduceinstr_assign,reduceexpr_funcall,branch0,branch0,reduceexpr_if_unbalanced,branch0,reduceexpr_if,branch0,branch0,reduceinstr_while,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] loptArray;
  @SuppressWarnings("unchecked")
  private void initloptArray() {
    loptArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,branch0,branch0,shift5,shift5,reduceargs_empty,shift5,reducename_text,reduceargs_empty,shift5,branch0,branch0,shift5,reduceexpr_numeric,reduceblock_empty,shift5,branch0,shift5,branch0,shift5,reducename_id,reduceexpr_name,reduceargs_empty,shift5,branch0,branch0,reduceblock_empty,shift5,reduceexpr_funcall_lambda,reducename_id,shift5,branch0,branch0,reduceblock_empty,shift5,reduceinstr_assign_lambda,reduceblock_rec,reduceeoi_empty,shift5,reduceexpr_ne,shift5,reduceexpr_eq,shift5,reduceexpr_le,shift5,reduceexpr_div,branch0,reduceexpr_access,reduceargs_empty,shift5,branch0,branch0,reduceblock_empty,shift5,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,reduceargs_rec,shift5,reduceexpr_sub,shift5,reduceexpr_rem,shift5,reduceexpr_ge,shift5,reduceexpr_lt,shift5,reduceexpr_mul,shift5,reduceexpr_add,shift5,reduceexpr_gt,reduceeoi_semi,reduceinstr_expr,reduceeoi_empty,reduceinstr_assign,reduceexpr_funcall,shift5,shift5,reduceexpr_if_unbalanced,branch0,reduceexpr_if,reduceblock_empty,shift5,reduceinstr_while,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,reduceeoi_empty,reduceinstr_return};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eqArray;
  @SuppressWarnings("unchecked")
  private void initeqArray() {
    eqArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift40,branch0,reduceexpr_ne,branch0,reduceexpr_eq,branch0,reduceexpr_le,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,shift40,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,reduceexpr_ge,branch0,reduceexpr_lt,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,reduceexpr_gt,branch0,branch0,shift40,branch0,reduceexpr_funcall,shift40,shift40,reduceexpr_if_unbalanced,shift40,reduceexpr_if,shift40,branch0,branch0,reduceexpr_parens,shift40,reduceexpr_dict,reduceexpr_array,shift40,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] arrowArray;
  @SuppressWarnings("unchecked")
  private void initarrowArray() {
    arrowArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceparams_empty,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceparams_empty,shift12,branch0,branch0,branch0,branch0,branch0,reduceparams_empty,shift12,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceparams_empty,shift12,branch0,branch0,branch0,reduceparam_id,reduceparam_id_varargs,reduceparams_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] ltArray;
  @SuppressWarnings("unchecked")
  private void initltArray() {
    ltArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,branch0,branch0,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift66,branch0,reduceexpr_ne,branch0,reduceexpr_eq,branch0,reduceexpr_le,branch0,reduceexpr_div,branch0,reduceexpr_access,branch0,branch0,branch0,branch0,branch0,branch0,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,shift66,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,reduceexpr_ge,branch0,reduceexpr_lt,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,reduceexpr_gt,branch0,branch0,shift66,branch0,reduceexpr_funcall,shift66,shift66,reduceexpr_if_unbalanced,shift66,reduceexpr_if,shift66,branch0,branch0,reduceexpr_parens,shift66,reduceexpr_dict,reduceexpr_array,shift66,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rparArray;
  @SuppressWarnings("unchecked")
  private void initrparArray() {
    rparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducename_text,branch0,branch0,branch0,branch0,branch0,reduceexpr_numeric,reduceblock_empty,shift87,branch0,branch0,branch0,branch0,reducename_id,reduceexpr_name,reduceargs_empty,shift78,branch0,branch0,reduceblock_empty,shift28,reduceexpr_funcall_lambda,reducename_id,branch0,branch0,branch0,reduceblock_empty,shift35,reduceinstr_assign_lambda,reduceblock_rec,reduceeoi_empty,branch0,reduceexpr_ne,branch0,reduceexpr_eq,branch0,reduceexpr_le,branch0,reduceexpr_div,branch0,reduceexpr_access,reduceargs_empty,shift58,branch0,branch0,reduceblock_empty,shift54,reduceexpr_mthcall_lambda,branch0,branch0,branch0,reduceexpr_mthcall,reduceargs_rec,branch0,reduceexpr_sub,branch0,reduceexpr_rem,branch0,reduceexpr_ge,branch0,reduceexpr_lt,branch0,reduceexpr_mul,branch0,reduceexpr_add,branch0,reduceexpr_gt,reduceeoi_semi,reduceinstr_expr,reduceeoi_empty,reduceinstr_assign,reduceexpr_funcall,branch0,shift81,reduceexpr_if_unbalanced,shift83,reduceexpr_if,reduceblock_empty,shift86,reduceinstr_while,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,reduceeoi_empty,reduceinstr_return};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] branchArrayTable;
  @SuppressWarnings("unchecked")
  private void initBranchArrayTable() {
    branchArrayTable=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reduceblock_empty,exit,exit,reducescript,error0,error0,error0,reducename_text,error0,error0,error0,error0,error0,reduceexpr_numeric,error0,error0,error0,error0,error0,error0,reducename_id,reduceexpr_name,error0,error0,error0,error0,error0,error0,reduceexpr_funcall_lambda,reducename_id,error0,error0,error0,error0,error0,reduceinstr_assign_lambda,reduceblock_rec,reduceeoi_empty,error0,reduceexpr_ne,error0,reduceexpr_eq,error0,reduceexpr_le,error0,reduceexpr_div,error0,reduceexpr_access,error0,error0,error0,error0,error0,error0,reduceexpr_mthcall_lambda,error0,error0,error0,reduceexpr_mthcall,error0,error0,reduceexpr_sub,error0,reduceexpr_rem,error0,reduceexpr_ge,error0,reduceexpr_lt,error0,reduceexpr_mul,error0,reduceexpr_add,error0,reduceexpr_gt,reduceeoi_semi,reduceinstr_expr,reduceeoi_empty,reduceinstr_assign,reduceexpr_funcall,error0,error0,reduceexpr_if_unbalanced,error0,reduceexpr_if,error0,error0,reduceinstr_while,reduceexpr_parens,reduceexpr_lambda_expr,reduceexpr_dict,reduceexpr_array,reduceeoi_empty,reduceinstr_return};
  }

  private final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> table;
  
  public static final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> createTable() {
    return new ParserDataTable().table;
  }

  private final AcceptAction<TerminalEnum,ProductionEnum,VersionEnum> accept;
  private final ExitAction<TerminalEnum,ProductionEnum,VersionEnum> exit;

  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducename_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_mthcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_array;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_return;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_parens;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_numeric;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparam_id_varargs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_while;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_funcall_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceargs_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_gt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_funcall;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_assign_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_sub;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_name;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if_unbalanced;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_assign;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparams_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceeoi_semi;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_mthcall_lambda;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducescript;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparams_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_rem;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_ne;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_lt;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_dict;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_le;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinstr_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_div;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_mul;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceargs_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparam_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_ge;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_if;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_lambda_expr;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceeoi_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_add;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducename_text;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_access;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblock_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceexpr_eq;

  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift38;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift12;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift56;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift35;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift90;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift64;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift48;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift14;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift87;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift70;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift81;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift22;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift68;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift50;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift86;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift20;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift13;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift24;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift60;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift72;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift30;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift17;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift83;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift33;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift8;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift18;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift46;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift89;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift4;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift42;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift66;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift55;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift31;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift26;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift16;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift40;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift74;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift58;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift10;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift7;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift54;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift78;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift44;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift28;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift29;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift5;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift19;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift62;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift52;


  private final ErrorAction<TerminalEnum,ProductionEnum,VersionEnum> error0;

  private final BranchAction<TerminalEnum,ProductionEnum,VersionEnum> branch0;


  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_if_unbalanced;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eoi_metadata0reduceinstr_assign;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lcurl_metadata0reduceargs_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0le_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_mthcall_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0text_metadata0reducename_text;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0arrow_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0script_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_funcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eol_metadata0reduceblock_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0mul_metadata0reduceparam_id_varargs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0reduceargs_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_funcall_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0instr_metadata0reduceblock_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0add_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0expr_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lopt_metadata0reduceargs_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0sub_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0__eof___metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ne_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_return_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_if_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0block_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0_while_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0name_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0assign_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0params_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0semicolon_metadata0reduceeoi_semi;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0mul_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0param_metadata0reduceparams_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0null_metadata0reduceblock_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eoi_metadata0reduceinstr_return;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0args_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceinstr_assign_lambda;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ge_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0ropt_metadata0reduceexpr_array;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eoi_metadata0reduceinstr_expr;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reducename_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_mthcall;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0antislash_metadata0reduceparams_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0integer_metadata0reduceexpr_numeric;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_if;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rem_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rcurl_metadata0reduceexpr_dict;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dot_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceinstr_while;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0reduceblock_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0div_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceexpr_parens;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0gt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eq_metadata0null;
}
