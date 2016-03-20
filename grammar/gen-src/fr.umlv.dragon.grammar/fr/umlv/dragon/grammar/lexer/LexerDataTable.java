package fr.umlv.dragon.grammar.lexer;

import fr.umlv.dragon.grammar.lexer.RuleEnum;
import fr.umlv.tatoo.runtime.lexer.LexerTable;
import fr.umlv.tatoo.runtime.lexer.rules.RuleData;
import fr.umlv.tatoo.runtime.regex.CharRegexTable;
import java.util.EnumMap;
/** 
 *  This class is generated - please do not edit it 
 */
public class LexerDataTable {

  public static LexerTable<RuleEnum> createTable() {
    return new LexerDataTable().table;
  }

  private LexerDataTable() {
    initassignMainAccepts();
    initassignMainTransitions();
    CharRegexTable assignMain = new CharRegexTable(1, assignMainTransitions, assignMainAccepts);
    RuleData assign = new RuleData(assignMain, null, 0, false);
    initdotMainAccepts();
    initdotMainTransitions();
    CharRegexTable dotMain = new CharRegexTable(1, dotMainTransitions, dotMainAccepts);
    RuleData dot = new RuleData(dotMain, null, 1, false);
    initsemicolonMainAccepts();
    initsemicolonMainTransitions();
    CharRegexTable semicolonMain = new CharRegexTable(1, semicolonMainTransitions, semicolonMainAccepts);
    RuleData semicolon = new RuleData(semicolonMain, null, 2, false);
    initantislashMainAccepts();
    initantislashMainTransitions();
    CharRegexTable antislashMain = new CharRegexTable(1, antislashMainTransitions, antislashMainAccepts);
    RuleData antislash = new RuleData(antislashMain, null, 3, false);
    initarrowMainAccepts();
    initarrowMainTransitions();
    CharRegexTable arrowMain = new CharRegexTable(1, arrowMainTransitions, arrowMainAccepts);
    RuleData arrow = new RuleData(arrowMain, null, 4, false);
    initeolMainAccepts();
    initeolMainTransitions();
    CharRegexTable eolMain = new CharRegexTable(1, eolMainTransitions, eolMainAccepts);
    RuleData eol = new RuleData(eolMain, null, 5, false);
    initlparMainAccepts();
    initlparMainTransitions();
    CharRegexTable lparMain = new CharRegexTable(1, lparMainTransitions, lparMainAccepts);
    RuleData lpar = new RuleData(lparMain, null, 6, false);
    initrparMainAccepts();
    initrparMainTransitions();
    CharRegexTable rparMain = new CharRegexTable(1, rparMainTransitions, rparMainAccepts);
    RuleData rpar = new RuleData(rparMain, null, 7, false);
    initloptMainAccepts();
    initloptMainTransitions();
    CharRegexTable loptMain = new CharRegexTable(1, loptMainTransitions, loptMainAccepts);
    RuleData lopt = new RuleData(loptMain, null, 8, false);
    initroptMainAccepts();
    initroptMainTransitions();
    CharRegexTable roptMain = new CharRegexTable(1, roptMainTransitions, roptMainAccepts);
    RuleData ropt = new RuleData(roptMain, null, 9, false);
    initlcurlMainAccepts();
    initlcurlMainTransitions();
    CharRegexTable lcurlMain = new CharRegexTable(1, lcurlMainTransitions, lcurlMainAccepts);
    RuleData lcurl = new RuleData(lcurlMain, null, 10, false);
    initrcurlMainAccepts();
    initrcurlMainTransitions();
    CharRegexTable rcurlMain = new CharRegexTable(1, rcurlMainTransitions, rcurlMainAccepts);
    RuleData rcurl = new RuleData(rcurlMain, null, 11, false);
    initaddMainAccepts();
    initaddMainTransitions();
    CharRegexTable addMain = new CharRegexTable(1, addMainTransitions, addMainAccepts);
    RuleData add = new RuleData(addMain, null, 12, false);
    initsubMainAccepts();
    initsubMainTransitions();
    CharRegexTable subMain = new CharRegexTable(1, subMainTransitions, subMainAccepts);
    RuleData sub = new RuleData(subMain, null, 13, false);
    initmulMainAccepts();
    initmulMainTransitions();
    CharRegexTable mulMain = new CharRegexTable(1, mulMainTransitions, mulMainAccepts);
    RuleData mul = new RuleData(mulMain, null, 14, false);
    initdivMainAccepts();
    initdivMainTransitions();
    CharRegexTable divMain = new CharRegexTable(1, divMainTransitions, divMainAccepts);
    RuleData div = new RuleData(divMain, null, 15, false);
    initremMainAccepts();
    initremMainTransitions();
    CharRegexTable remMain = new CharRegexTable(1, remMainTransitions, remMainAccepts);
    RuleData rem = new RuleData(remMain, null, 16, false);
    initeqMainAccepts();
    initeqMainTransitions();
    CharRegexTable eqMain = new CharRegexTable(1, eqMainTransitions, eqMainAccepts);
    RuleData eq = new RuleData(eqMain, null, 17, false);
    initneMainAccepts();
    initneMainTransitions();
    CharRegexTable neMain = new CharRegexTable(1, neMainTransitions, neMainAccepts);
    RuleData ne = new RuleData(neMain, null, 18, false);
    initltMainAccepts();
    initltMainTransitions();
    CharRegexTable ltMain = new CharRegexTable(1, ltMainTransitions, ltMainAccepts);
    RuleData lt = new RuleData(ltMain, null, 19, false);
    initleMainAccepts();
    initleMainTransitions();
    CharRegexTable leMain = new CharRegexTable(2, leMainTransitions, leMainAccepts);
    RuleData le = new RuleData(leMain, null, 20, false);
    initgtMainAccepts();
    initgtMainTransitions();
    CharRegexTable gtMain = new CharRegexTable(1, gtMainTransitions, gtMainAccepts);
    RuleData gt = new RuleData(gtMain, null, 21, false);
    initgeMainAccepts();
    initgeMainTransitions();
    CharRegexTable geMain = new CharRegexTable(2, geMainTransitions, geMainAccepts);
    RuleData ge = new RuleData(geMain, null, 22, false);
    init_ifMainAccepts();
    init_ifMainTransitions();
    CharRegexTable _ifMain = new CharRegexTable(1, _ifMainTransitions, _ifMainAccepts);
    RuleData _if = new RuleData(_ifMain, null, 23, false);
    init_whileMainAccepts();
    init_whileMainTransitions();
    CharRegexTable _whileMain = new CharRegexTable(2, _whileMainTransitions, _whileMainAccepts);
    RuleData _while = new RuleData(_whileMain, null, 24, false);
    init_returnMainAccepts();
    init_returnMainTransitions();
    CharRegexTable _returnMain = new CharRegexTable(3, _returnMainTransitions, _returnMainAccepts);
    RuleData _return = new RuleData(_returnMain, null, 25, false);
    inittextMainAccepts();
    inittextMainTransitions();
    CharRegexTable textMain = new CharRegexTable(7, textMainTransitions, textMainAccepts);
    RuleData text = new RuleData(textMain, null, 26, false);
    initintegerMainAccepts();
    initintegerMainTransitions();
    CharRegexTable integerMain = new CharRegexTable(1, integerMainTransitions, integerMainAccepts);
    RuleData integer = new RuleData(integerMain, null, 27, false);
    initidMainAccepts();
    initidMainTransitions();
    CharRegexTable idMain = new CharRegexTable(1, idMainTransitions, idMainAccepts);
    RuleData id = new RuleData(idMain, null, 28, false);
    initspaceMainAccepts();
    initspaceMainTransitions();
    CharRegexTable spaceMain = new CharRegexTable(1, spaceMainTransitions, spaceMainAccepts);
    RuleData space = new RuleData(spaceMain, null, 29, false);

    EnumMap<RuleEnum,RuleData> datas = new EnumMap<RuleEnum,RuleData>(RuleEnum.class);
    datas.put(RuleEnum.assign, assign);
    datas.put(RuleEnum.dot, dot);
    datas.put(RuleEnum.semicolon, semicolon);
    datas.put(RuleEnum.antislash, antislash);
    datas.put(RuleEnum.arrow, arrow);
    datas.put(RuleEnum.eol, eol);
    datas.put(RuleEnum.lpar, lpar);
    datas.put(RuleEnum.rpar, rpar);
    datas.put(RuleEnum.lopt, lopt);
    datas.put(RuleEnum.ropt, ropt);
    datas.put(RuleEnum.lcurl, lcurl);
    datas.put(RuleEnum.rcurl, rcurl);
    datas.put(RuleEnum.add, add);
    datas.put(RuleEnum.sub, sub);
    datas.put(RuleEnum.mul, mul);
    datas.put(RuleEnum.div, div);
    datas.put(RuleEnum.rem, rem);
    datas.put(RuleEnum.eq, eq);
    datas.put(RuleEnum.ne, ne);
    datas.put(RuleEnum.lt, lt);
    datas.put(RuleEnum.le, le);
    datas.put(RuleEnum.gt, gt);
    datas.put(RuleEnum.ge, ge);
    datas.put(RuleEnum._if, _if);
    datas.put(RuleEnum._while, _while);
    datas.put(RuleEnum._return, _return);
    datas.put(RuleEnum.text, text);
    datas.put(RuleEnum.integer, integer);
    datas.put(RuleEnum.id, id);
    datas.put(RuleEnum.space, space);
    table = new LexerTable<RuleEnum>(datas);
  }

  
  private boolean[] assignMainAccepts;
  private void initassignMainAccepts() {
    assignMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] assignMainTransitions;
  private void initassignMainTransitions() {
    assignMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1}};
  }
  
  private boolean[] dotMainAccepts;
  private void initdotMainAccepts() {
    dotMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] dotMainTransitions;
  private void initdotMainTransitions() {
    dotMainTransitions = new int[][] {{0,-1},{0,-1,46,0,47,-1}};
  }
  
  private boolean[] semicolonMainAccepts;
  private void initsemicolonMainAccepts() {
    semicolonMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] semicolonMainTransitions;
  private void initsemicolonMainTransitions() {
    semicolonMainTransitions = new int[][] {{0,-1},{0,-1,59,0,60,-1}};
  }
  
  private boolean[] antislashMainAccepts;
  private void initantislashMainAccepts() {
    antislashMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] antislashMainTransitions;
  private void initantislashMainTransitions() {
    antislashMainTransitions = new int[][] {{0,-1},{0,-1,92,0,93,-1}};
  }
  
  private boolean[] arrowMainAccepts;
  private void initarrowMainAccepts() {
    arrowMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] arrowMainTransitions;
  private void initarrowMainTransitions() {
    arrowMainTransitions = new int[][] {{0,-1},{0,-1,45,2,46,-1},{0,-1,62,0,63,-1}};
  }
  
  private boolean[] eolMainAccepts;
  private void initeolMainAccepts() {
    eolMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] eolMainTransitions;
  private void initeolMainTransitions() {
    eolMainTransitions = new int[][] {{0,-1},{0,-1,10,0,11,-1}};
  }
  
  private boolean[] lparMainAccepts;
  private void initlparMainAccepts() {
    lparMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lparMainTransitions;
  private void initlparMainTransitions() {
    lparMainTransitions = new int[][] {{0,-1},{0,-1,40,0,41,-1}};
  }
  
  private boolean[] rparMainAccepts;
  private void initrparMainAccepts() {
    rparMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rparMainTransitions;
  private void initrparMainTransitions() {
    rparMainTransitions = new int[][] {{0,-1},{0,-1,41,0,42,-1}};
  }
  
  private boolean[] loptMainAccepts;
  private void initloptMainAccepts() {
    loptMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] loptMainTransitions;
  private void initloptMainTransitions() {
    loptMainTransitions = new int[][] {{0,-1},{0,-1,91,0,92,-1}};
  }
  
  private boolean[] roptMainAccepts;
  private void initroptMainAccepts() {
    roptMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] roptMainTransitions;
  private void initroptMainTransitions() {
    roptMainTransitions = new int[][] {{0,-1},{0,-1,93,0,94,-1}};
  }
  
  private boolean[] lcurlMainAccepts;
  private void initlcurlMainAccepts() {
    lcurlMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lcurlMainTransitions;
  private void initlcurlMainTransitions() {
    lcurlMainTransitions = new int[][] {{0,-1},{0,-1,123,0,124,-1}};
  }
  
  private boolean[] rcurlMainAccepts;
  private void initrcurlMainAccepts() {
    rcurlMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rcurlMainTransitions;
  private void initrcurlMainTransitions() {
    rcurlMainTransitions = new int[][] {{0,-1},{0,-1,125,0,126,-1}};
  }
  
  private boolean[] addMainAccepts;
  private void initaddMainAccepts() {
    addMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] addMainTransitions;
  private void initaddMainTransitions() {
    addMainTransitions = new int[][] {{0,-1},{0,-1,43,0,44,-1}};
  }
  
  private boolean[] subMainAccepts;
  private void initsubMainAccepts() {
    subMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] subMainTransitions;
  private void initsubMainTransitions() {
    subMainTransitions = new int[][] {{0,-1},{0,-1,45,0,46,-1}};
  }
  
  private boolean[] mulMainAccepts;
  private void initmulMainAccepts() {
    mulMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] mulMainTransitions;
  private void initmulMainTransitions() {
    mulMainTransitions = new int[][] {{0,-1},{0,-1,42,0,43,-1}};
  }
  
  private boolean[] divMainAccepts;
  private void initdivMainAccepts() {
    divMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] divMainTransitions;
  private void initdivMainTransitions() {
    divMainTransitions = new int[][] {{0,-1},{0,-1,47,0,48,-1}};
  }
  
  private boolean[] remMainAccepts;
  private void initremMainAccepts() {
    remMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] remMainTransitions;
  private void initremMainTransitions() {
    remMainTransitions = new int[][] {{0,-1},{0,-1,37,0,38,-1}};
  }
  
  private boolean[] eqMainAccepts;
  private void initeqMainAccepts() {
    eqMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] eqMainTransitions;
  private void initeqMainTransitions() {
    eqMainTransitions = new int[][] {{0,-1},{0,-1,61,2,62,-1},{0,-1,61,0,62,-1}};
  }
  
  private boolean[] neMainAccepts;
  private void initneMainAccepts() {
    neMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] neMainTransitions;
  private void initneMainTransitions() {
    neMainTransitions = new int[][] {{0,-1},{0,-1,33,2,34,-1},{0,-1,61,0,62,-1}};
  }
  
  private boolean[] ltMainAccepts;
  private void initltMainAccepts() {
    ltMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] ltMainTransitions;
  private void initltMainTransitions() {
    ltMainTransitions = new int[][] {{0,-1},{0,-1,60,0,61,-1}};
  }
  
  private boolean[] leMainAccepts;
  private void initleMainAccepts() {
    leMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] leMainTransitions;
  private void initleMainTransitions() {
    leMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1},{0,-1,60,1,61,-1}};
  }
  
  private boolean[] gtMainAccepts;
  private void initgtMainAccepts() {
    gtMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] gtMainTransitions;
  private void initgtMainTransitions() {
    gtMainTransitions = new int[][] {{0,-1},{0,-1,62,0,63,-1}};
  }
  
  private boolean[] geMainAccepts;
  private void initgeMainAccepts() {
    geMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] geMainTransitions;
  private void initgeMainTransitions() {
    geMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1},{0,-1,62,1,63,-1}};
  }
  
  private boolean[] _ifMainAccepts;
  private void init_ifMainAccepts() {
    _ifMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] _ifMainTransitions;
  private void init_ifMainTransitions() {
    _ifMainTransitions = new int[][] {{0,-1},{0,-1,105,2,106,-1},{0,-1,102,0,103,-1}};
  }
  
  private boolean[] _whileMainAccepts;
  private void init_whileMainAccepts() {
    _whileMainAccepts = new boolean[] {true,false,false,false,false,false};
  }
    
  private int[][] _whileMainTransitions;
  private void init_whileMainTransitions() {
    _whileMainTransitions = new int[][] {{0,-1},{0,-1,105,4,106,-1},{0,-1,119,5,120,-1},{0,-1,101,0,102,-1},{0,-1,108,3,109,-1},{0,-1,104,1,105,-1}};
  }
  
  private boolean[] _returnMainAccepts;
  private void init_returnMainAccepts() {
    _returnMainAccepts = new boolean[] {true,false,false,false,false,false,false};
  }
    
  private int[][] _returnMainTransitions;
  private void init_returnMainTransitions() {
    _returnMainTransitions = new int[][] {{0,-1},{0,-1,117,4,118,-1},{0,-1,101,6,102,-1},{0,-1,114,2,115,-1},{0,-1,114,5,115,-1},{0,-1,110,0,111,-1},{0,-1,116,1,117,-1}};
  }
  
  private boolean[] textMainAccepts;
  private void inittextMainAccepts() {
    textMainAccepts = new boolean[] {true,true,true,true,false,false,false,false,false,false};
  }
    
  private int[][] textMainTransitions;
  private void inittextMainTransitions() {
    textMainTransitions = new int[][] {{0,-1},{0,4,9,-1,11,4,13,-1,14,4,32,-1,33,4,40,-1,42,4,44,-1,45,4,46,-1,47,4,58,0,59,-1,60,4,61,-1,62,4,91,-1,94,4,123,-1,124,4,125,-1,126,4},{0,5,39,0,40,5},{0,9,34,0,35,9},{0,4,9,-1,11,4,13,-1,14,4,32,-1,33,4,40,-1,42,4,44,-1,45,4,46,-1,47,4,58,0,59,-1,60,4,61,-1,62,4,91,-1,94,4,123,-1,124,4,125,-1,126,4},{0,5,39,0,40,5},{0,6,9,9,11,6,13,9,14,6,32,9,33,6,34,1,35,6,40,9,42,6,44,9,45,6,46,9,47,6,58,3,59,9,60,6,61,9,62,6,91,9,94,6,123,9,124,6,125,9,126,6},{0,4,9,-1,11,4,13,-1,14,4,32,-1,33,4,34,6,35,4,39,8,40,-1,42,4,44,-1,45,4,46,-1,47,4,58,-1,60,4,61,-1,62,4,91,-1,94,4,123,-1,124,4,125,-1,126,4},{0,8,9,5,11,8,13,5,14,8,32,5,33,8,39,1,40,5,42,8,44,5,45,8,46,5,47,8,58,2,59,5,60,8,61,5,62,8,91,5,94,8,123,5,124,8,125,5,126,8},{0,9,34,0,35,9}};
  }
  
  private boolean[] integerMainAccepts;
  private void initintegerMainAccepts() {
    integerMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] integerMainTransitions;
  private void initintegerMainTransitions() {
    integerMainTransitions = new int[][] {{0,-1,48,0,58,-1},{0,-1,48,0,58,-1}};
  }
  
  private boolean[] idMainAccepts;
  private void initidMainAccepts() {
    idMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] idMainTransitions;
  private void initidMainTransitions() {
    idMainTransitions = new int[][] {{0,0,9,-1,11,0,13,-1,14,0,32,-1,33,0,40,-1,42,0,44,-1,45,0,46,-1,47,0,58,-1,60,0,61,-1,62,0,91,-1,94,0,123,-1,124,0,125,-1,126,0},{0,0,9,-1,11,0,13,-1,14,0,32,-1,33,0,40,-1,42,0,44,-1,45,0,46,-1,47,0,58,-1,60,0,61,-1,62,0,91,-1,94,0,123,-1,124,0,125,-1,126,0}};
  }
  
  private boolean[] spaceMainAccepts;
  private void initspaceMainAccepts() {
    spaceMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] spaceMainTransitions;
  private void initspaceMainTransitions() {
    spaceMainTransitions = new int[][] {{0,-1},{0,-1,9,0,11,-1,13,0,14,-1,32,0,33,-1,44,0,45,-1}};
  }
  
  private final LexerTable<RuleEnum> table;
}
