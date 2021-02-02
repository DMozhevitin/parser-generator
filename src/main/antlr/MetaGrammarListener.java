// Generated from D:/study/labs/mt/parser-generator/src/main/antlr\MetaGrammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MetaGrammarParser}.
 */
public interface MetaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#metaGrammar}.
	 * @param ctx the parse tree
	 */
	void enterMetaGrammar(MetaGrammarParser.MetaGrammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#metaGrammar}.
	 * @param ctx the parse tree
	 */
	void exitMetaGrammar(MetaGrammarParser.MetaGrammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void enterGrammarName(MetaGrammarParser.GrammarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void exitGrammarName(MetaGrammarParser.GrammarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(MetaGrammarParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(MetaGrammarParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#attrs}.
	 * @param ctx the parse tree
	 */
	void enterAttrs(MetaGrammarParser.AttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#attrs}.
	 * @param ctx the parse tree
	 */
	void exitAttrs(MetaGrammarParser.AttrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(MetaGrammarParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(MetaGrammarParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(MetaGrammarParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(MetaGrammarParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRule(MetaGrammarParser.GrammarRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRule(MetaGrammarParser.GrammarRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 */
	void enterTerminalRule(MetaGrammarParser.TerminalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 */
	void exitTerminalRule(MetaGrammarParser.TerminalRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminalRule(MetaGrammarParser.NonTerminalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminalRule(MetaGrammarParser.NonTerminalRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(MetaGrammarParser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(MetaGrammarParser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#production}.
	 * @param ctx the parse tree
	 */
	void enterProduction(MetaGrammarParser.ProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#production}.
	 * @param ctx the parse tree
	 */
	void exitProduction(MetaGrammarParser.ProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(MetaGrammarParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(MetaGrammarParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MetaGrammarParser#inheritedAttr}.
	 * @param ctx the parse tree
	 */
	void enterInheritedAttr(MetaGrammarParser.InheritedAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MetaGrammarParser#inheritedAttr}.
	 * @param ctx the parse tree
	 */
	void exitInheritedAttr(MetaGrammarParser.InheritedAttrContext ctx);
}