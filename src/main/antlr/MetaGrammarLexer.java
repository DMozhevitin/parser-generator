// Generated from D:/study/labs/mt/parser-generator/src/main/antlr\MetaGrammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MetaGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAMMAR=1, IMPORT=2, HEADER=3, ATTRIBUTES=4, RETURNS=5, PACKAGE=6, SKIP_RULE=7, 
		OR=8, COLON=9, SEMICOLON=10, BRACKET_OPEN=11, BRACKET_CLOSE=12, OPEN=13, 
		CLOSE=14, DOT=15, ANGLE_OPEN=16, ANGLE_CLOSE=17, EQ=18, TOKEN_NAME=19, 
		IDENTIFIER=20, CODE=21, EXPR_IN_PARENTHESIS=22, REGEX=23, WHITESPACE=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GRAMMAR", "IMPORT", "HEADER", "ATTRIBUTES", "RETURNS", "PACKAGE", "SKIP_RULE", 
			"OR", "COLON", "SEMICOLON", "BRACKET_OPEN", "BRACKET_CLOSE", "OPEN", 
			"CLOSE", "DOT", "ANGLE_OPEN", "ANGLE_CLOSE", "EQ", "TOKEN_NAME", "IDENTIFIER", 
			"CODE", "EXPR_IN_PARENTHESIS", "REGEX", "WHITESPACE"
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


	public MetaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MetaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24\u0084"+
		"\n\24\r\24\16\24\u0085\3\25\6\25\u0089\n\25\r\25\16\25\u008a\3\26\3\26"+
		"\6\26\u008f\n\26\r\26\16\26\u0090\3\26\3\26\3\27\3\27\6\27\u0097\n\27"+
		"\r\27\16\27\u0098\3\27\3\27\3\30\3\30\7\30\u009f\n\30\f\30\16\30\u00a2"+
		"\13\30\3\30\3\30\3\31\3\31\3\31\3\31\5\u0090\u0098\u00a0\2\32\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\5\4\2C\\aa\4\2C\\c|\5\2\13\f\17"+
		"\17\"\"\2\u00ad\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5;\3\2\2\2\7B\3\2\2\2\tI\3\2"+
		"\2\2\13T\3\2\2\2\r\\\3\2\2\2\17d\3\2\2\2\21l\3\2\2\2\23n\3\2\2\2\25p\3"+
		"\2\2\2\27r\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2\35x\3\2\2\2\37z\3\2\2\2!|\3"+
		"\2\2\2#~\3\2\2\2%\u0080\3\2\2\2\'\u0083\3\2\2\2)\u0088\3\2\2\2+\u008c"+
		"\3\2\2\2-\u0094\3\2\2\2/\u009c\3\2\2\2\61\u00a5\3\2\2\2\63\64\7i\2\2\64"+
		"\65\7t\2\2\65\66\7c\2\2\66\67\7o\2\2\678\7o\2\289\7c\2\29:\7t\2\2:\4\3"+
		"\2\2\2;<\7k\2\2<=\7o\2\2=>\7r\2\2>?\7q\2\2?@\7t\2\2@A\7v\2\2A\6\3\2\2"+
		"\2BC\7j\2\2CD\7g\2\2DE\7c\2\2EF\7f\2\2FG\7g\2\2GH\7t\2\2H\b\3\2\2\2IJ"+
		"\7c\2\2JK\7v\2\2KL\7v\2\2LM\7t\2\2MN\7k\2\2NO\7d\2\2OP\7w\2\2PQ\7v\2\2"+
		"QR\7g\2\2RS\7u\2\2S\n\3\2\2\2TU\7t\2\2UV\7g\2\2VW\7v\2\2WX\7w\2\2XY\7"+
		"t\2\2YZ\7p\2\2Z[\7u\2\2[\f\3\2\2\2\\]\7r\2\2]^\7c\2\2^_\7e\2\2_`\7m\2"+
		"\2`a\7c\2\2ab\7i\2\2bc\7g\2\2c\16\3\2\2\2de\7/\2\2ef\7@\2\2fg\7\"\2\2"+
		"gh\7u\2\2hi\7m\2\2ij\7k\2\2jk\7r\2\2k\20\3\2\2\2lm\7~\2\2m\22\3\2\2\2"+
		"no\7<\2\2o\24\3\2\2\2pq\7=\2\2q\26\3\2\2\2rs\7}\2\2s\30\3\2\2\2tu\7\177"+
		"\2\2u\32\3\2\2\2vw\7*\2\2w\34\3\2\2\2xy\7+\2\2y\36\3\2\2\2z{\7\60\2\2"+
		"{ \3\2\2\2|}\7>\2\2}\"\3\2\2\2~\177\7@\2\2\177$\3\2\2\2\u0080\u0081\7"+
		"?\2\2\u0081&\3\2\2\2\u0082\u0084\t\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086(\3\2\2\2\u0087"+
		"\u0089\t\3\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b*\3\2\2\2\u008c\u008e\5\27\f\2\u008d\u008f"+
		"\13\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2"+
		"\u0090\u008e\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\5\31\r\2\u0093,\3"+
		"\2\2\2\u0094\u0096\5\33\16\2\u0095\u0097\13\2\2\2\u0096\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\5\35\17\2\u009b.\3\2\2\2\u009c\u00a0\7$\2\2\u009d"+
		"\u009f\13\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a4\7$\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\t\4\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a7\u00a8\b\31\2\2\u00a8\62\3\2\2\2\b\2\u0085\u008a\u0090\u0098\u00a0"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}