// Generated from C:/GitHub/Limbaje-formale/Tema 7\g.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Number=2, IF=3, ELSE=4, FOR=5, WHILE=6, KeyWord=7, Identifier=8, 
		ArithmeticOperator=9, RelationalOperator=10, P1=11, P2=12, P3=13, P4=14, 
		Paranthesys=15, AssignmentOperator=16, Semicolon=17, WS=18, COMMENT=19, 
		LINE_COMMENT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "Digit", "Number", "Letter", "IF", "ELSE", "FOR", "WHILE", "KeyWord", 
			"Identifier", "ArithmeticOperator", "RelationalOperator", "P1", "P2", 
			"P3", "P4", "Paranthesys", "AssignmentOperator", "Semicolon", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", null, "'if'", "'else'", "'for'", "'while'", null, null, 
			null, null, "'('", "')'", "'{'", "'}'", null, "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Number", "IF", "ELSE", "FOR", "WHILE", "KeyWord", "Identifier", 
			"ArithmeticOperator", "RelationalOperator", "P1", "P2", "P3", "P4", "Paranthesys", 
			"AssignmentOperator", "Semicolon", "WS", "COMMENT", "LINE_COMMENT"
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


	public gLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\6\4\65\n\4\r\4\16\4\66\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nQ\n\n\3\13"+
		"\3\13\3\13\3\13\7\13W\n\13\f\13\16\13Z\13\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\rg\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\5\22u\n\22\3\23\3\23\3\24\3\24\3\25\6\25|\n\25\r\25"+
		"\16\25}\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0086\n\26\f\26\16\26\u0089"+
		"\13\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0094\n\27\f"+
		"\27\16\27\u0097\13\27\3\27\3\27\3\u0087\2\30\3\3\5\2\7\4\t\2\13\5\r\6"+
		"\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24"+
		"+\25-\26\3\2\b\3\2\62;\4\2C\\c|\5\2,-//\61\61\4\2>>@@\5\2\13\f\17\17\""+
		"\"\4\2\f\f\17\17\2\u00a8\2\3\3\2\2\2\2\7\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2"+
		"\2\5\61\3\2\2\2\7\64\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r=\3\2\2\2\17B\3\2"+
		"\2\2\21F\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27[\3\2\2\2\31f\3\2\2\2\33h\3"+
		"\2\2\2\35j\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#t\3\2\2\2%v\3\2\2\2\'x\3\2\2"+
		"\2){\3\2\2\2+\u0081\3\2\2\2-\u008f\3\2\2\2/\60\7$\2\2\60\4\3\2\2\2\61"+
		"\62\t\2\2\2\62\6\3\2\2\2\63\65\5\5\3\2\64\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\64\3\2\2\2\66\67\3\2\2\2\67\b\3\2\2\289\t\3\2\29\n\3\2\2\2:;\7k\2\2;"+
		"<\7h\2\2<\f\3\2\2\2=>\7g\2\2>?\7n\2\2?@\7u\2\2@A\7g\2\2A\16\3\2\2\2BC"+
		"\7h\2\2CD\7q\2\2DE\7t\2\2E\20\3\2\2\2FG\7y\2\2GH\7j\2\2HI\7k\2\2IJ\7n"+
		"\2\2JK\7g\2\2K\22\3\2\2\2LQ\5\17\b\2MQ\5\21\t\2NQ\5\13\6\2OQ\5\r\7\2P"+
		"L\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\24\3\2\2\2RX\5\t\5\2SW\5\t\5"+
		"\2TW\5\5\3\2UW\7a\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2"+
		"\2XY\3\2\2\2Y\26\3\2\2\2ZX\3\2\2\2[\\\t\4\2\2\\\30\3\2\2\2]g\t\5\2\2^"+
		"_\7>\2\2_g\7?\2\2`a\7@\2\2ag\7?\2\2bc\7?\2\2cg\7?\2\2de\7#\2\2eg\7?\2"+
		"\2f]\3\2\2\2f^\3\2\2\2f`\3\2\2\2fb\3\2\2\2fd\3\2\2\2g\32\3\2\2\2hi\7*"+
		"\2\2i\34\3\2\2\2jk\7+\2\2k\36\3\2\2\2lm\7}\2\2m \3\2\2\2no\7\177\2\2o"+
		"\"\3\2\2\2pu\5\33\16\2qu\5\35\17\2ru\5\37\20\2su\5!\21\2tp\3\2\2\2tq\3"+
		"\2\2\2tr\3\2\2\2ts\3\2\2\2u$\3\2\2\2vw\7?\2\2w&\3\2\2\2xy\7=\2\2y(\3\2"+
		"\2\2z|\t\6\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\b\25\2\2\u0080*\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\7,\2\2"+
		"\u0083\u0087\3\2\2\2\u0084\u0086\13\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7,\2\2\u008b\u008c\7\61\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\b\26\3\2\u008e,\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091"+
		"\7\61\2\2\u0091\u0095\3\2\2\2\u0092\u0094\n\7\2\2\u0093\u0092\3\2\2\2"+
		"\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\b\27\3\2\u0099.\3\2\2\2\f\2\66"+
		"PVXft}\u0087\u0095\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}