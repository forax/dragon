package fr.umlv.dragon.grammar.tools;

import fr.umlv.tatoo.runtime.tools.ToolsTable;

import java.util.EnumMap;
import java.util.EnumSet;

import fr.umlv.dragon.grammar.lexer.RuleEnum;
import fr.umlv.dragon.grammar.parser.TerminalEnum;

public class ToolsDataTable {
  public static ToolsTable<RuleEnum,TerminalEnum> createToolsTable() {
      EnumSet<RuleEnum> spawns = EnumSet.of(RuleEnum.ropt,RuleEnum.integer,RuleEnum.rem,RuleEnum.lcurl,RuleEnum.sub,RuleEnum.eol,RuleEnum.mul,RuleEnum.div,RuleEnum.lpar,RuleEnum.arrow,RuleEnum._if,RuleEnum.antislash,RuleEnum.le,RuleEnum.text,RuleEnum.rcurl,RuleEnum.dot,RuleEnum._return,RuleEnum.lt,RuleEnum.eq,RuleEnum.add,RuleEnum.lopt,RuleEnum.ge,RuleEnum._while,RuleEnum.semicolon,RuleEnum.id,RuleEnum.assign,RuleEnum.ne,RuleEnum.rpar,RuleEnum.gt);
      EnumSet<RuleEnum> discards = EnumSet.allOf(RuleEnum.class);
      EnumMap<RuleEnum,TerminalEnum> terminal = new EnumMap<RuleEnum,TerminalEnum>(RuleEnum.class);
              terminal.put(RuleEnum.ropt,TerminalEnum.ropt);
              terminal.put(RuleEnum.integer,TerminalEnum.integer);
              terminal.put(RuleEnum.rem,TerminalEnum.rem);
              terminal.put(RuleEnum.lcurl,TerminalEnum.lcurl);
              terminal.put(RuleEnum.sub,TerminalEnum.sub);
              terminal.put(RuleEnum.eol,TerminalEnum.eol);
              terminal.put(RuleEnum.mul,TerminalEnum.mul);
              terminal.put(RuleEnum.div,TerminalEnum.div);
              terminal.put(RuleEnum.lpar,TerminalEnum.lpar);
              terminal.put(RuleEnum.arrow,TerminalEnum.arrow);
              terminal.put(RuleEnum._if,TerminalEnum._if);
              terminal.put(RuleEnum.antislash,TerminalEnum.antislash);
              terminal.put(RuleEnum.le,TerminalEnum.le);
              terminal.put(RuleEnum.text,TerminalEnum.text);
              terminal.put(RuleEnum.rcurl,TerminalEnum.rcurl);
              terminal.put(RuleEnum.dot,TerminalEnum.dot);
              terminal.put(RuleEnum._return,TerminalEnum._return);
              terminal.put(RuleEnum.lt,TerminalEnum.lt);
              terminal.put(RuleEnum.eq,TerminalEnum.eq);
              terminal.put(RuleEnum.add,TerminalEnum.add);
              terminal.put(RuleEnum.lopt,TerminalEnum.lopt);
              terminal.put(RuleEnum.ge,TerminalEnum.ge);
              terminal.put(RuleEnum._while,TerminalEnum._while);
              terminal.put(RuleEnum.semicolon,TerminalEnum.semicolon);
              terminal.put(RuleEnum.id,TerminalEnum.id);
              terminal.put(RuleEnum.assign,TerminalEnum.assign);
              terminal.put(RuleEnum.ne,TerminalEnum.ne);
              terminal.put(RuleEnum.rpar,TerminalEnum.rpar);
              terminal.put(RuleEnum.gt,TerminalEnum.gt);
            EnumSet<RuleEnum> unconditionals = EnumSet.of(RuleEnum.space);
      return new ToolsTable<RuleEnum,TerminalEnum>(spawns,discards,unconditionals,terminal);
  }
}