// Generated from D:/study/labs/mt/parser-generator/src/main/antlr\MetaGrammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MetaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MetaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MetaGrammarParser#metaGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaGrammar(MetaGrammarParser.MetaGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGrammarParser#grammarName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarName(MetaGrammarParser.GrammarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGrammarParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(MetaGrammarParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGrammarParser#attrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrs(MetaGrammarParser.AttrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGrammarParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(MetaGrammarParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGrammarParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(MetaGrammarParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarRule(MetaGrammarParser.GrammarRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGrammarParser#terminalRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalRule(MetaGrammarParser.TerminalRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGrammarParser#nonTerminalRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminalRule(MetaGrammarParser.NonTerminalRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGrammarParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(MetaGrammarParser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGrammarParser#production}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduction(MetaGrammarParser.ProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGrammarParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(MetaGrammarParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MetaGrammarParser#inheritedAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritedAttr(MetaGrammarParser.InheritedAttrContext ctx);
}