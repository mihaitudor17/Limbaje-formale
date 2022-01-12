// Generated from C:/GitHub/Limbaje-formale/Tema 7\g.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Number=2, IF=3, ELSE=4, FOR=5, WHILE=6, KeyWord=7, Identifier=8, 
		ArithmeticOperator=9, RelationalOperator=10, P1=11, P2=12, P3=13, P4=14, 
		Paranthesys=15, AssignmentOperator=16, Semicolon=17, WS=18, COMMENT=19, 
		LINE_COMMENT=20;
	public static final int
		RULE_loopstatement = 0, RULE_selectionstatement = 1, RULE_declaration = 2, 
		RULE_compare = 3, RULE_operation = 4, RULE_content = 5, RULE_main = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"loopstatement", "selectionstatement", "declaration", "compare", "operation", 
			"content", "main"
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

	@Override
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LoopstatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(gParser.FOR, 0); }
		public TerminalNode P1() { return getToken(gParser.P1, 0); }
		public List<TerminalNode> Semicolon() { return getTokens(gParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(gParser.Semicolon, i);
		}
		public TerminalNode P2() { return getToken(gParser.P2, 0); }
		public TerminalNode WHILE() { return getToken(gParser.WHILE, 0); }
		public List<TerminalNode> Identifier() { return getTokens(gParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(gParser.Identifier, i);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode P3() { return getToken(gParser.P3, 0); }
		public TerminalNode P4() { return getToken(gParser.P4, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(gParser.ArithmeticOperator, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public LoopstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLoopstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLoopstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLoopstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopstatementContext loopstatement() throws RecognitionException {
		LoopstatementContext _localctx = new LoopstatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_loopstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				{
				{
				setState(14);
				match(FOR);
				setState(15);
				match(P1);
				setState(20);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(17);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(16);
						declaration();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(19);
					match(Semicolon);
					}
					break;
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(22);
					compare();
					}
				}

				setState(25);
				match(Semicolon);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(26);
					operation();
					}
				}

				setState(29);
				match(P2);
				setState(39);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case P3:
					{
					{
					setState(30);
					match(P3);
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << Identifier))) != 0)) {
						{
						{
						setState(31);
						content();
						}
						}
						setState(36);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(37);
					match(P4);
					}
					}
					break;
				case Semicolon:
					{
					setState(38);
					match(Semicolon);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case WHILE:
				{
				{
				setState(41);
				match(WHILE);
				setState(42);
				match(P1);
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(43);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(44);
					compare();
					}
					break;
				case 3:
					{
					{
					setState(45);
					match(Identifier);
					setState(46);
					match(ArithmeticOperator);
					setState(47);
					match(Identifier);
					}
					}
					break;
				}
				setState(50);
				match(P2);
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Semicolon:
					{
					setState(51);
					match(Semicolon);
					}
					break;
				case P3:
					{
					{
					setState(52);
					match(P3);
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << Identifier))) != 0)) {
						{
						{
						setState(53);
						content();
						}
						}
						setState(58);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(59);
					match(P4);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SelectionstatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(gParser.IF, 0); }
		public TerminalNode P1() { return getToken(gParser.P1, 0); }
		public TerminalNode P2() { return getToken(gParser.P2, 0); }
		public List<TerminalNode> Identifier() { return getTokens(gParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(gParser.Identifier, i);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(gParser.Semicolon, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(gParser.ArithmeticOperator, 0); }
		public List<TerminalNode> P3() { return getTokens(gParser.P3); }
		public TerminalNode P3(int i) {
			return getToken(gParser.P3, i);
		}
		public List<TerminalNode> P4() { return getTokens(gParser.P4); }
		public TerminalNode P4(int i) {
			return getToken(gParser.P4, i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(gParser.ELSE, 0); }
		public SelectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSelectionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSelectionstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSelectionstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionstatementContext selectionstatement() throws RecognitionException {
		SelectionstatementContext _localctx = new SelectionstatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IF);
			setState(65);
			match(P1);
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(66);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(67);
				compare();
				}
				break;
			case 3:
				{
				{
				setState(68);
				match(Identifier);
				setState(69);
				match(ArithmeticOperator);
				setState(70);
				match(Identifier);
				}
				}
				break;
			}
			setState(73);
			match(P2);
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(74);
				match(Semicolon);
				}
				break;
			case P3:
				{
				{
				setState(75);
				match(P3);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << Identifier))) != 0)) {
					{
					{
					setState(76);
					content();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(82);
					match(P4);
					}
					break;
				case 2:
					{
					{
					setState(83);
					match(P4);
					setState(84);
					match(ELSE);
					setState(85);
					match(P3);
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << Identifier))) != 0)) {
						{
						{
						setState(86);
						content();
						}
						}
						setState(91);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(92);
					match(P4);
					}
					}
					break;
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(gParser.Semicolon, 0); }
		public List<TerminalNode> Identifier() { return getTokens(gParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(gParser.Identifier, i);
		}
		public TerminalNode AssignmentOperator() { return getToken(gParser.AssignmentOperator, 0); }
		public TerminalNode Number() { return getToken(gParser.Number, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				setState(97);
				match(Identifier);
				setState(98);
				match(Identifier);
				}
				}
				break;
			case 2:
				{
				{
				setState(99);
				match(Identifier);
				setState(100);
				match(Identifier);
				setState(101);
				match(AssignmentOperator);
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==Number || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 3:
				{
				{
				setState(103);
				match(Identifier);
				setState(104);
				match(Identifier);
				setState(105);
				match(AssignmentOperator);
				setState(106);
				match(T__0);
				setState(107);
				match(Identifier);
				setState(108);
				match(T__0);
				}
				}
				break;
			}
			setState(111);
			match(Semicolon);
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

	public static class CompareContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(gParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(gParser.Identifier, i);
		}
		public TerminalNode RelationalOperator() { return getToken(gParser.RelationalOperator, 0); }
		public TerminalNode Number() { return getToken(gParser.Number, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(gParser.ArithmeticOperator, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(Identifier);
			setState(114);
			match(RelationalOperator);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(115);
				match(Identifier);
				}
				break;
			case 2:
				{
				{
				setState(116);
				match(Identifier);
				setState(117);
				match(ArithmeticOperator);
				setState(118);
				match(Identifier);
				}
				}
				break;
			case 3:
				{
				setState(119);
				match(Number);
				}
				break;
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

	public static class OperationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(gParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(gParser.Identifier, i);
		}
		public TerminalNode AssignmentOperator() { return getToken(gParser.AssignmentOperator, 0); }
		public List<TerminalNode> Number() { return getTokens(gParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(gParser.Number, i);
		}
		public TerminalNode ArithmeticOperator() { return getToken(gParser.ArithmeticOperator, 0); }
		public TerminalNode Semicolon() { return getToken(gParser.Semicolon, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(122);
			match(Identifier);
			setState(123);
			match(AssignmentOperator);
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArithmeticOperator) {
				{
				setState(125);
				match(ArithmeticOperator);
				setState(126);
				_la = _input.LA(1);
				if ( !(_la==Number || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semicolon) {
				{
				setState(129);
				match(Semicolon);
				}
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

	public static class ContentContext extends ParserRuleContext {
		public LoopstatementContext loopstatement() {
			return getRuleContext(LoopstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(132);
				loopstatement();
				}
				break;
			case 2:
				{
				setState(133);
				selectionstatement();
				}
				break;
			case 3:
				{
				setState(134);
				operation();
				}
				break;
			case 4:
				{
				setState(135);
				declaration();
				}
				break;
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

	public static class MainContext extends ParserRuleContext {
		public List<LoopstatementContext> loopstatement() {
			return getRuleContexts(LoopstatementContext.class);
		}
		public LoopstatementContext loopstatement(int i) {
			return getRuleContext(LoopstatementContext.class,i);
		}
		public List<SelectionstatementContext> selectionstatement() {
			return getRuleContexts(SelectionstatementContext.class);
		}
		public SelectionstatementContext selectionstatement(int i) {
			return getRuleContext(SelectionstatementContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(138);
					loopstatement();
					}
					break;
				case 2:
					{
					setState(139);
					selectionstatement();
					}
					break;
				case 3:
					{
					setState(140);
					operation();
					}
					break;
				case 4:
					{
					setState(141);
					declaration();
					}
					break;
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << Identifier))) != 0) );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0095\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\5\2\24\n"+
		"\2\3\2\5\2\27\n\2\3\2\5\2\32\n\2\3\2\3\2\5\2\36\n\2\3\2\3\2\3\2\7\2#\n"+
		"\2\f\2\16\2&\13\2\3\2\3\2\5\2*\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\63"+
		"\n\2\3\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\5\2?\n\2\5\2A\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\3\3\3\3\3\3\3\7\3P\n\3\f\3\16\3S\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\5\3`\n\3\5\3b\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5{\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u0082\n\6\3\6"+
		"\5\6\u0085\n\6\3\7\3\7\3\7\3\7\5\7\u008b\n\7\3\b\3\b\3\b\3\b\6\b\u0091"+
		"\n\b\r\b\16\b\u0092\3\b\2\2\t\2\4\6\b\n\f\16\2\3\4\2\4\4\n\n\2\u00ab\2"+
		"@\3\2\2\2\4B\3\2\2\2\6o\3\2\2\2\bs\3\2\2\2\n|\3\2\2\2\f\u008a\3\2\2\2"+
		"\16\u0090\3\2\2\2\20\21\7\7\2\2\21\26\7\r\2\2\22\24\5\6\4\2\23\22\3\2"+
		"\2\2\23\24\3\2\2\2\24\27\3\2\2\2\25\27\7\23\2\2\26\23\3\2\2\2\26\25\3"+
		"\2\2\2\27\31\3\2\2\2\30\32\5\b\5\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3"+
		"\2\2\2\33\35\7\23\2\2\34\36\5\n\6\2\35\34\3\2\2\2\35\36\3\2\2\2\36\37"+
		"\3\2\2\2\37)\7\16\2\2 $\7\17\2\2!#\5\f\7\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2"+
		"\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'*\7\20\2\2(*\7\23\2\2) \3\2\2\2)"+
		"(\3\2\2\2*A\3\2\2\2+,\7\b\2\2,\62\7\r\2\2-\63\7\n\2\2.\63\5\b\5\2/\60"+
		"\7\n\2\2\60\61\7\13\2\2\61\63\7\n\2\2\62-\3\2\2\2\62.\3\2\2\2\62/\3\2"+
		"\2\2\63\64\3\2\2\2\64>\7\16\2\2\65?\7\23\2\2\66:\7\17\2\2\679\5\f\7\2"+
		"8\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=?\7\20"+
		"\2\2>\65\3\2\2\2>\66\3\2\2\2?A\3\2\2\2@\20\3\2\2\2@+\3\2\2\2A\3\3\2\2"+
		"\2BC\7\5\2\2CI\7\r\2\2DJ\7\n\2\2EJ\5\b\5\2FG\7\n\2\2GH\7\13\2\2HJ\7\n"+
		"\2\2ID\3\2\2\2IE\3\2\2\2IF\3\2\2\2JK\3\2\2\2Ka\7\16\2\2Lb\7\23\2\2MQ\7"+
		"\17\2\2NP\5\f\7\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R_\3\2\2\2SQ"+
		"\3\2\2\2T`\7\20\2\2UV\7\20\2\2VW\7\6\2\2W[\7\17\2\2XZ\5\f\7\2YX\3\2\2"+
		"\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^`\7\20\2\2_T\3"+
		"\2\2\2_U\3\2\2\2`b\3\2\2\2aL\3\2\2\2aM\3\2\2\2b\5\3\2\2\2cd\7\n\2\2dp"+
		"\7\n\2\2ef\7\n\2\2fg\7\n\2\2gh\7\22\2\2hp\t\2\2\2ij\7\n\2\2jk\7\n\2\2"+
		"kl\7\22\2\2lm\7\3\2\2mn\7\n\2\2np\7\3\2\2oc\3\2\2\2oe\3\2\2\2oi\3\2\2"+
		"\2pq\3\2\2\2qr\7\23\2\2r\7\3\2\2\2st\7\n\2\2tz\7\f\2\2u{\7\n\2\2vw\7\n"+
		"\2\2wx\7\13\2\2x{\7\n\2\2y{\7\4\2\2zu\3\2\2\2zv\3\2\2\2zy\3\2\2\2{\t\3"+
		"\2\2\2|}\7\n\2\2}~\7\22\2\2~\u0081\t\2\2\2\177\u0080\7\13\2\2\u0080\u0082"+
		"\t\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0085\7\23\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\13\3\2\2"+
		"\2\u0086\u008b\5\2\2\2\u0087\u008b\5\4\3\2\u0088\u008b\5\n\6\2\u0089\u008b"+
		"\5\6\4\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\r\3\2\2\2\u008c\u0091\5\2\2\2\u008d\u0091\5\4\3\2"+
		"\u008e\u0091\5\n\6\2\u008f\u0091\5\6\4\2\u0090\u008c\3\2\2\2\u0090\u008d"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\17\3\2\2\2\30\23\26\31\35$)\62"+
		":>@IQ[_aoz\u0081\u0084\u008a\u0090\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}