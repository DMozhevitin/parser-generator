// Generated from D:/study/labs/mt/parser-generator/src/main/antlr\MetaGrammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MetaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAMMAR=1, IMPORT=2, HEADER=3, ATTRIBUTES=4, RETURNS=5, PACKAGE=6, SKIP_RULE=7, 
		OR=8, COLON=9, SEMICOLON=10, BRACKET_OPEN=11, BRACKET_CLOSE=12, OPEN=13, 
		CLOSE=14, DOT=15, ANGLE_OPEN=16, ANGLE_CLOSE=17, EQ=18, TOKEN_NAME=19, 
		IDENTIFIER=20, CODE=21, EXPR_IN_PARENTHESIS=22, REGEX=23, WHITESPACE=24;
	public static final int
		RULE_metaGrammar = 0, RULE_grammarName = 1, RULE_header = 2, RULE_attrs = 3, 
		RULE_attr = 4, RULE_rules = 5, RULE_grammarRule = 6, RULE_terminalRule = 7, 
		RULE_nonTerminalRule = 8, RULE_alternative = 9, RULE_production = 10, 
		RULE_code = 11, RULE_inheritedAttr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"metaGrammar", "grammarName", "header", "attrs", "attr", "rules", "grammarRule", 
			"terminalRule", "nonTerminalRule", "alternative", "production", "code", 
			"inheritedAttr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "'import'", "'header'", "'attributes'", "'returns'", 
			"'package'", "'-> skip'", "'|'", "':'", "';'", "'{'", "'}'", "'('", "')'", 
			"'.'", "'<'", "'>'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GRAMMAR", "IMPORT", "HEADER", "ATTRIBUTES", "RETURNS", "PACKAGE", 
			"SKIP_RULE", "OR", "COLON", "SEMICOLON", "BRACKET_OPEN", "BRACKET_CLOSE", 
			"OPEN", "CLOSE", "DOT", "ANGLE_OPEN", "ANGLE_CLOSE", "EQ", "TOKEN_NAME", 
			"IDENTIFIER", "CODE", "EXPR_IN_PARENTHESIS", "REGEX", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MetaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MetaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MetaGrammarContext extends ParserRuleContext {
		public GrammarNameContext grammarName() {
			return getRuleContext(GrammarNameContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public AttrsContext attrs() {
			return getRuleContext(AttrsContext.class,0);
		}
		public MetaGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterMetaGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitMetaGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGrammarVisitor ) return ((MetaGrammarVisitor<? extends T>)visitor).visitMetaGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetaGrammarContext metaGrammar() throws RecognitionException {
		MetaGrammarContext _localctx = new MetaGrammarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_metaGrammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			grammarName();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEADER) {
				{
				setState(27);
				header();
				}
			}

			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTES) {
				{
				setState(30);
				attrs();
				}
			}

			setState(33);
			rules();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarNameContext extends ParserRuleContext {
		public TerminalNode GRAMMAR() { return getToken(MetaGrammarParser.GRAMMAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MetaGrammarParser.IDENTIFIER, 0); }
		public GrammarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterGrammarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitGrammarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGrammarVisitor ) return ((MetaGrammarVisitor<? extends T>)visitor).visitGrammarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarNameContext grammarName() throws RecognitionException {
		GrammarNameContext _localctx = new GrammarNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(GRAMMAR);
			setState(36);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(MetaGrammarParser.HEADER, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGrammarVisitor ) return ((MetaGrammarVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(HEADER);
			setState(39);
			code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrsContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTES() { return getToken(MetaGrammarParser.ATTRIBUTES, 0); }
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public AttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitAttrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGrammarVisitor ) return ((MetaGrammarVisitor<? extends T>)visitor).visitAttrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrsContext attrs() throws RecognitionException {
		AttrsContext _localctx = new AttrsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(ATTRIBUTES);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				attr();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANGLE_OPEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrContext extends ParserRuleContext {
		public TerminalNode ANGLE_OPEN() { return getToken(MetaGrammarParser.ANGLE_OPEN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MetaGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MetaGrammarParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(MetaGrammarParser.COLON, 0); }
		public TerminalNode ANGLE_CLOSE() { return getToken(MetaGrammarParser.ANGLE_CLOSE, 0); }
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGrammarVisitor ) return ((MetaGrammarVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(ANGLE_OPEN);
			setState(48);
			match(IDENTIFIER);
			setState(49);
			match(COLON);
			setState(50);
			match(IDENTIFIER);
			setState(51);
			match(ANGLE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesContext extends ParserRuleContext {
		public List<GrammarRuleContext> grammarRule() {
			return getRuleContexts(GrammarRuleContext.class);
		}
		public GrammarRuleContext grammarRule(int i) {
			return getRuleContext(GrammarRuleContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGrammarVisitor ) return ((MetaGrammarVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				grammarRule();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN_NAME || _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarRuleContext extends ParserRuleContext {
		public TerminalRuleContext terminalRule() {
			return getRuleContext(TerminalRuleContext.class,0);
		}
		public NonTerminalRuleContext nonTerminalRule() {
			return getRuleContext(NonTerminalRuleContext.class,0);
		}
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterGrammarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitGrammarRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGrammarVisitor ) return ((MetaGrammarVisitor<? extends T>)visitor).visitGrammarRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarRuleContext grammarRule() throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_grammarRule);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				terminalRule();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				nonTerminalRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalRuleContext extends ParserRuleContext {
		public TerminalNode TOKEN_NAME() { return getToken(MetaGrammarParser.TOKEN_NAME, 0); }
		public TerminalNode COLON() { return getToken(MetaGrammarParser.COLON, 0); }
		public TerminalNode REGEX() { return getToken(MetaGrammarParser.REGEX, 0); }
		public TerminalNode SEMICOLON() { return getToken(MetaGrammarParser.SEMICOLON, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode SKIP_RULE() { return getToken(MetaGrammarParser.SKIP_RULE, 0); }
		public TerminalRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterTerminalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitTerminalRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGrammarVisitor ) return ((MetaGrammarVisitor<? extends T>)visitor).visitTerminalRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalRuleContext terminalRule() throws RecognitionException {
		TerminalRuleContext _localctx = new TerminalRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_terminalRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(TOKEN_NAME);
			setState(63);
			match(COLON);
			setState(64);
			match(REGEX);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE) {
				{
				setState(65);
				code();
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SKIP_RULE) {
				{
				setState(68);
				match(SKIP_RULE);
				}
			}

			setState(71);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonTerminalRuleContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MetaGrammarParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MetaGrammarParser.COLON, 0); }
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}
		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(MetaGrammarParser.SEMICOLON, 0); }
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public List<TerminalNode> OR() { return getTokens(MetaGrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MetaGrammarParser.OR, i);
		}
		public NonTerminalRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerminalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterNonTerminalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitNonTerminalRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGrammarVisitor ) return ((MetaGrammarVisitor<? extends T>)visitor).visitNonTerminalRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalRuleContext nonTerminalRule() throws RecognitionException {
		NonTerminalRuleContext _localctx = new NonTerminalRuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nonTerminalRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(IDENTIFIER);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANGLE_OPEN) {
				{
				setState(74);
				attr();
				}
			}

			setState(77);
			match(COLON);
			setState(78);
			alternative();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(79);
				match(OR);
				setState(80);
				alternative();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlternativeContext extends ParserRuleContext {
		public List<ProductionContext> production() {
			return getRuleContexts(ProductionContext.class);
		}
		public ProductionContext production(int i) {
			return getRuleContext(ProductionContext.class,i);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGrammarVisitor ) return ((MetaGrammarVisitor<? extends T>)visitor).visitAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				production();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN_NAME || _la==IDENTIFIER );
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CODE) {
				{
				setState(93);
				code();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductionContext extends ParserRuleContext {
		public TerminalNode TOKEN_NAME() { return getToken(MetaGrammarParser.TOKEN_NAME, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MetaGrammarParser.IDENTIFIER, 0); }
		public InheritedAttrContext inheritedAttr() {
			return getRuleContext(InheritedAttrContext.class,0);
		}
		public ProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_production; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGrammarVisitor ) return ((MetaGrammarVisitor<? extends T>)visitor).visitProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductionContext production() throws RecognitionException {
		ProductionContext _localctx = new ProductionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_production);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(TOKEN_NAME);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(IDENTIFIER);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXPR_IN_PARENTHESIS) {
					{
					setState(98);
					inheritedAttr();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(MetaGrammarParser.CODE, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGrammarVisitor ) return ((MetaGrammarVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(CODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritedAttrContext extends ParserRuleContext {
		public TerminalNode EXPR_IN_PARENTHESIS() { return getToken(MetaGrammarParser.EXPR_IN_PARENTHESIS, 0); }
		public InheritedAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritedAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).enterInheritedAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MetaGrammarListener ) ((MetaGrammarListener)listener).exitInheritedAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MetaGrammarVisitor ) return ((MetaGrammarVisitor<? extends T>)visitor).visitInheritedAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritedAttrContext inheritedAttr() throws RecognitionException {
		InheritedAttrContext _localctx = new InheritedAttrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inheritedAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(EXPR_IN_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32n\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\5\2\37\n\2\3\2\5\2\"\n\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\6\5.\n\5\r\5\16\5/\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\6\79\n\7\r\7\16\7:\3\b\3\b\5\b?\n\b\3\t\3\t\3\t\3\t\5\tE\n\t\3"+
		"\t\5\tH\n\t\3\t\3\t\3\n\3\n\5\nN\n\n\3\n\3\n\3\n\3\n\7\nT\n\n\f\n\16\n"+
		"W\13\n\3\n\3\n\3\13\6\13\\\n\13\r\13\16\13]\3\13\5\13a\n\13\3\f\3\f\3"+
		"\f\5\ff\n\f\5\fh\n\f\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\2\2\2m\2\34\3\2\2\2\4%\3\2\2\2\6(\3\2\2\2\b+\3\2\2\2\n\61"+
		"\3\2\2\2\f8\3\2\2\2\16>\3\2\2\2\20@\3\2\2\2\22K\3\2\2\2\24[\3\2\2\2\26"+
		"g\3\2\2\2\30i\3\2\2\2\32k\3\2\2\2\34\36\5\4\3\2\35\37\5\6\4\2\36\35\3"+
		"\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \"\5\b\5\2! \3\2\2\2!\"\3\2\2\2\"#\3"+
		"\2\2\2#$\5\f\7\2$\3\3\2\2\2%&\7\3\2\2&\'\7\26\2\2\'\5\3\2\2\2()\7\5\2"+
		"\2)*\5\30\r\2*\7\3\2\2\2+-\7\6\2\2,.\5\n\6\2-,\3\2\2\2./\3\2\2\2/-\3\2"+
		"\2\2/\60\3\2\2\2\60\t\3\2\2\2\61\62\7\22\2\2\62\63\7\26\2\2\63\64\7\13"+
		"\2\2\64\65\7\26\2\2\65\66\7\23\2\2\66\13\3\2\2\2\679\5\16\b\28\67\3\2"+
		"\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\r\3\2\2\2<?\5\20\t\2=?\5\22\n\2><"+
		"\3\2\2\2>=\3\2\2\2?\17\3\2\2\2@A\7\25\2\2AB\7\13\2\2BD\7\31\2\2CE\5\30"+
		"\r\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\7\t\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2"+
		"\2\2IJ\7\f\2\2J\21\3\2\2\2KM\7\26\2\2LN\5\n\6\2ML\3\2\2\2MN\3\2\2\2NO"+
		"\3\2\2\2OP\7\13\2\2PU\5\24\13\2QR\7\n\2\2RT\5\24\13\2SQ\3\2\2\2TW\3\2"+
		"\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\f\2\2Y\23\3\2\2\2Z\\"+
		"\5\26\f\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_a\5\30\r"+
		"\2`_\3\2\2\2`a\3\2\2\2a\25\3\2\2\2bh\7\25\2\2ce\7\26\2\2df\5\32\16\2e"+
		"d\3\2\2\2ef\3\2\2\2fh\3\2\2\2gb\3\2\2\2gc\3\2\2\2h\27\3\2\2\2ij\7\27\2"+
		"\2j\31\3\2\2\2kl\7\30\2\2l\33\3\2\2\2\17\36!/:>DGMU]`eg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}