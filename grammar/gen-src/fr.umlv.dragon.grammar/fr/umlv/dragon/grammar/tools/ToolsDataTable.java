package fr.umlv.dragon.grammar.tools;

import fr.umlv.tatoo.runtime.tools.ToolsTable;

import java.util.EnumMap;
import java.util.EnumSet;

import fr.umlv.dragon.grammar.lexer.RuleEnum;
import fr.umlv.dragon.grammar.parser.TerminalEnum;

public class ToolsDataTable {
  public static ToolsTable<RuleEnum,TerminalEnum> createToolsTable() {
      EnumSet<RuleEnum> spawns = EnumSet.of(RuleEnum.rpar,RuleEnum.ne,RuleEnum.gt,RuleEnum._while,RuleEnum.integer,RuleEnum.rcurl,RuleEnum.lcurl,RuleEnum.eq,RuleEnum.dot,RuleEnum.sub,RuleEnum.assign,RuleEnum.id,RuleEnum.lpar,RuleEnum.add,RuleEnum.lopt,RuleEnum.ropt,RuleEnum.rem,RuleEnum.le,RuleEnum.ge,RuleEnum.text,RuleEnum.antislash,RuleEnum.mul,RuleEnum.arrow,RuleEnum.div,RuleEnum.semicolon,RuleEnum._if,RuleEnum._return,RuleEnum.lt,RuleEnum.eol);
      EnumSet<RuleEnum> discards = EnumSet.allOf(RuleEnum.class);
      EnumMap<RuleEnum,TerminalEnum> terminal = new EnumMap<RuleEnum,TerminalEnum>(RuleEnum.class);
              terminal.put(RuleEnum.rpar,TerminalEnum.rpar);
              terminal.put(RuleEnum.ne,TerminalEnum.ne);
              terminal.put(RuleEnum.gt,TerminalEnum.gt);
              terminal.put(RuleEnum._while,TerminalEnum._while);
              terminal.put(RuleEnum.integer,TerminalEnum.integer);
              terminal.put(RuleEnum.rcurl,TerminalEnum.rcurl);
              terminal.put(RuleEnum.lcurl,TerminalEnum.lcurl);
              terminal.put(RuleEnum.eq,TerminalEnum.eq);
              terminal.put(RuleEnum.dot,TerminalEnum.dot);
              terminal.put(RuleEnum.sub,TerminalEnum.sub);
              terminal.put(RuleEnum.assign,TerminalEnum.assign);
              terminal.put(RuleEnum.id,TerminalEnum.id);
              terminal.put(RuleEnum.lpar,TerminalEnum.lpar);
              terminal.put(RuleEnum.add,TerminalEnum.add);
              terminal.put(RuleEnum.lopt,TerminalEnum.lopt);
              terminal.put(RuleEnum.ropt,TerminalEnum.ropt);
              terminal.put(RuleEnum.rem,TerminalEnum.rem);
              terminal.put(RuleEnum.le,TerminalEnum.le);
              terminal.put(RuleEnum.ge,TerminalEnum.ge);
              terminal.put(RuleEnum.text,TerminalEnum.text);
              terminal.put(RuleEnum.antislash,TerminalEnum.antislash);
              terminal.put(RuleEnum.mul,TerminalEnum.mul);
              terminal.put(RuleEnum.arrow,TerminalEnum.arrow);
              terminal.put(RuleEnum.div,TerminalEnum.div);
              terminal.put(RuleEnum.semicolon,TerminalEnum.semicolon);
              terminal.put(RuleEnum._if,TerminalEnum._if);
              terminal.put(RuleEnum._return,TerminalEnum._return);
              terminal.put(RuleEnum.lt,TerminalEnum.lt);
              terminal.put(RuleEnum.eol,TerminalEnum.eol);
            EnumSet<RuleEnum> unconditionals = EnumSet.of(RuleEnum.space);
      return new ToolsTable<RuleEnum,TerminalEnum>(spawns,discards,unconditionals,terminal);
  }
}