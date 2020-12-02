// Generated from C:/Users/34879/AppData/Roaming/JetBrains/IntelliJIdea2020.2/scratches\C0.g4 by ANTLR 4.8
        //�?种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类�?要包名，可以在这里统�?定义
    package c0;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class C0Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, EscapeSequence=30, BOOL_OP=31, 
		ASSIGN=32, GETINT=33, GETDOUBLE=34, GETCHAR=35, PUTINT=36, PUTDOUBLE=37, 
		PUTCHAR=38, PUTSTR=39, PUTLN=40, UINT=41, CharLiteral=42, DOUBLE=43, IDENT=44, 
		NO_COMMET=45, SL_COMMENT=46, WS=47;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_functionParamList = 2, RULE_functionParam = 3, 
		RULE_stmt = 4, RULE_exprStmt = 5, RULE_declStmt = 6, RULE_letDeclStmt = 7, 
		RULE_constDeclStmt = 8, RULE_ifStmt = 9, RULE_whileStmt = 10, RULE_blockStmt = 11, 
		RULE_emptyStmt = 12, RULE_returnStmt = 13, RULE_expr = 14, RULE_funcExpr = 15, 
		RULE_callFunc = 16, RULE_callStdlib = 17, RULE_str = 18, RULE_character = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "functionParamList", "functionParam", "stmt", 
			"exprStmt", "declStmt", "letDeclStmt", "constDeclStmt", "ifStmt", "whileStmt", 
			"blockStmt", "emptyStmt", "returnStmt", "expr", "funcExpr", "callFunc", 
			"callStdlib", "str", "character"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fn'", "'('", "')'", "'->'", "'int'", "'void'", "'double'", "','", 
			"'const'", "':'", "';'", "'let'", "'if'", "'else'", "'while'", "'{'", 
			"'}'", "'return'", "'+'", "'-'", "'*'", "'/'", "'as'", "'\"'", "'\\'", 
			"'|'", "'#'", "'^'", "'?'", null, null, "'='", "'getint'", "'getdouble'", 
			"'getchar'", "'putint'", "'putdouble'", "'putchar'", "'putstr'", "'putln'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "EscapeSequence", "BOOL_OP", "ASSIGN", 
			"GETINT", "GETDOUBLE", "GETCHAR", "PUTINT", "PUTDOUBLE", "PUTCHAR", "PUTSTR", 
			"PUTLN", "UINT", "CharLiteral", "DOUBLE", "IDENT", "NO_COMMET", "SL_COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "C0.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public C0Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DeclStmtContext> declStmt() {
			return getRuleContexts(DeclStmtContext.class);
		}
		public DeclStmtContext declStmt(int i) {
			return getRuleContext(DeclStmtContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__11))) != 0)) {
				{
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__11:
					{
					setState(40);
					declStmt();
					}
					break;
				case T__0:
					{
					setState(41);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FunctionContext extends ParserRuleContext {
		public Token ty;
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public FunctionParamListContext functionParamList() {
			return getRuleContext(FunctionParamListContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(48);
			match(IDENT);
			setState(49);
			match(T__1);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==IDENT) {
				{
				setState(50);
				functionParamList();
				}
			}

			setState(53);
			match(T__2);
			setState(54);
			match(T__3);
			setState(55);
			((FunctionContext)_localctx).ty = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
				((FunctionContext)_localctx).ty = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(56);
			blockStmt();
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

	public static class FunctionParamListContext extends ParserRuleContext {
		public List<FunctionParamContext> functionParam() {
			return getRuleContexts(FunctionParamContext.class);
		}
		public FunctionParamContext functionParam(int i) {
			return getRuleContext(FunctionParamContext.class,i);
		}
		public FunctionParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterFunctionParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitFunctionParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitFunctionParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParamListContext functionParamList() throws RecognitionException {
		FunctionParamListContext _localctx = new FunctionParamListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			functionParam();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(59);
				match(T__7);
				setState(60);
				functionParam();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FunctionParamContext extends ParserRuleContext {
		public Token isConst;
		public Token ty;
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public FunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterFunctionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitFunctionParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitFunctionParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParamContext functionParam() throws RecognitionException {
		FunctionParamContext _localctx = new FunctionParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(66);
				((FunctionParamContext)_localctx).isConst = match(T__8);
				}
			}

			setState(69);
			match(IDENT);
			setState(70);
			match(T__9);
			setState(71);
			((FunctionParamContext)_localctx).ty = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__6) ) {
				((FunctionParamContext)_localctx).ty = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StmtContext extends ParserRuleContext {
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public DeclStmtContext declStmt() {
			return getRuleContext(DeclStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public EmptyStmtContext emptyStmt() {
			return getRuleContext(EmptyStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__19:
			case GETINT:
			case GETDOUBLE:
			case GETCHAR:
			case PUTINT:
			case PUTDOUBLE:
			case PUTCHAR:
			case PUTSTR:
			case PUTLN:
			case UINT:
			case DOUBLE:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				exprStmt();
				}
				break;
			case T__8:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				declStmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				ifStmt();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				whileStmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				returnStmt();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				blockStmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				emptyStmt();
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

	public static class ExprStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			expr(0);
			setState(83);
			match(T__10);
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

	public static class DeclStmtContext extends ParserRuleContext {
		public LetDeclStmtContext letDeclStmt() {
			return getRuleContext(LetDeclStmtContext.class,0);
		}
		public ConstDeclStmtContext constDeclStmt() {
			return getRuleContext(ConstDeclStmtContext.class,0);
		}
		public DeclStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitDeclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclStmtContext declStmt() throws RecognitionException {
		DeclStmtContext _localctx = new DeclStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declStmt);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				letDeclStmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				constDeclStmt();
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

	public static class LetDeclStmtContext extends ParserRuleContext {
		public Token ty;
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(C0Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetDeclStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDeclStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterLetDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitLetDeclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitLetDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclStmtContext letDeclStmt() throws RecognitionException {
		LetDeclStmtContext _localctx = new LetDeclStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_letDeclStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__11);
			setState(90);
			match(IDENT);
			setState(91);
			match(T__9);
			setState(92);
			((LetDeclStmtContext)_localctx).ty = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__6) ) {
				((LetDeclStmtContext)_localctx).ty = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(93);
				match(ASSIGN);
				setState(94);
				expr(0);
				}
			}

			setState(97);
			match(T__10);
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

	public static class ConstDeclStmtContext extends ParserRuleContext {
		public Token ty;
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(C0Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConstDeclStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterConstDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitConstDeclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitConstDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclStmtContext constDeclStmt() throws RecognitionException {
		ConstDeclStmtContext _localctx = new ConstDeclStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constDeclStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__8);
			setState(100);
			match(IDENT);
			setState(101);
			match(T__9);
			setState(102);
			((ConstDeclStmtContext)_localctx).ty = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__6) ) {
				((ConstDeclStmtContext)_localctx).ty = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(103);
			match(ASSIGN);
			setState(104);
			expr(0);
			setState(105);
			match(T__10);
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

	public static class IfStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockStmtContext> blockStmt() {
			return getRuleContexts(BlockStmtContext.class);
		}
		public BlockStmtContext blockStmt(int i) {
			return getRuleContext(BlockStmtContext.class,i);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__12);
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(108);
				match(T__1);
				}
				break;
			}
			setState(111);
			expr(0);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(112);
				match(T__2);
				}
			}

			setState(115);
			blockStmt();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(116);
				match(T__13);
				setState(119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(117);
					blockStmt();
					}
					break;
				case T__12:
					{
					setState(118);
					ifStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class WhileStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__14);
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(124);
				match(T__1);
				}
				break;
			}
			setState(127);
			expr(0);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(128);
				match(T__2);
				}
			}

			setState(131);
			blockStmt();
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

	public static class BlockStmtContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__15);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(134);
				stmt();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(T__16);
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

	public static class EmptyStmtContext extends ParserRuleContext {
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitEmptyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__10);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__17);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
				{
				setState(145);
				expr(0);
				}
			}

			setState(148);
			match(T__10);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentContext extends ExprContext {
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public IdentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(C0Parser.DOUBLE, 0); }
		public DoubleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncLabelExprContext extends ExprContext {
		public FuncExprContext funcExpr() {
			return getRuleContext(FuncExprContext.class,0);
		}
		public FuncLabelExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterFuncLabelExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitFuncLabelExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitFuncLabelExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NagExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NagExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterNagExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitNagExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitNagExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UintContext extends ExprContext {
		public TerminalNode UINT() { return getToken(C0Parser.UINT, 0); }
		public UintContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterUint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitUint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitUint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BOOL_OP() { return getToken(C0Parser.BOOL_OP, 0); }
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsExprContext extends ExprContext {
		public Token ty;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterAsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitAsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitAsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(C0Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new FuncLabelExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(151);
				funcExpr();
				}
				break;
			case 2:
				{
				_localctx = new NagExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(152);
						match(T__19);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(155); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(157);
				expr(6);
				}
				break;
			case 3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(T__1);
				setState(159);
				expr(0);
				setState(160);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(IDENT);
				setState(163);
				match(ASSIGN);
				setState(164);
				expr(4);
				}
				break;
			case 5:
				{
				_localctx = new IdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(IDENT);
				}
				break;
			case 6:
				{
				_localctx = new UintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(UINT);
				}
				break;
			case 7:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(DOUBLE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(171);
						((AddExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((AddExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(172);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(174);
						((MultExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
							((MultExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new BoolExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(177);
						match(BOOL_OP);
						setState(178);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new AsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(180);
						match(T__22);
						setState(181);
						((AsExprContext)_localctx).ty = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__6) ) {
							((AsExprContext)_localctx).ty = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FuncExprContext extends ParserRuleContext {
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
		}
		public CallStdlibContext callStdlib() {
			return getRuleContext(CallStdlibContext.class,0);
		}
		public FuncExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncExprContext funcExpr() throws RecognitionException {
		FuncExprContext _localctx = new FuncExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcExpr);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				callFunc();
				}
				break;
			case GETINT:
			case GETDOUBLE:
			case GETCHAR:
			case PUTINT:
			case PUTDOUBLE:
			case PUTCHAR:
			case PUTSTR:
			case PUTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				callStdlib();
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

	public static class CallFuncContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(C0Parser.IDENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterCallFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitCallFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitCallFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFuncContext callFunc() throws RecognitionException {
		CallFuncContext _localctx = new CallFuncContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_callFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IDENT);
			setState(192);
			match(T__1);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__19) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
				{
				setState(193);
				expr(0);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(194);
					match(T__7);
					setState(195);
					expr(0);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(203);
			match(T__2);
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

	public static class CallStdlibContext extends ParserRuleContext {
		public CallStdlibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStdlib; }
	 
		public CallStdlibContext() { }
		public void copyFrom(CallStdlibContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PutLnContext extends CallStdlibContext {
		public TerminalNode PUTLN() { return getToken(C0Parser.PUTLN, 0); }
		public PutLnContext(CallStdlibContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterPutLn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitPutLn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitPutLn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetIntContext extends CallStdlibContext {
		public TerminalNode GETINT() { return getToken(C0Parser.GETINT, 0); }
		public GetIntContext(CallStdlibContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterGetInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitGetInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitGetInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetCharContext extends CallStdlibContext {
		public TerminalNode GETCHAR() { return getToken(C0Parser.GETCHAR, 0); }
		public GetCharContext(CallStdlibContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterGetChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitGetChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitGetChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PutIntContext extends CallStdlibContext {
		public TerminalNode PUTINT() { return getToken(C0Parser.PUTINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PutIntContext(CallStdlibContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterPutInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitPutInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitPutInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PutCharContext extends CallStdlibContext {
		public TerminalNode PUTCHAR() { return getToken(C0Parser.PUTCHAR, 0); }
		public TerminalNode CharLiteral() { return getToken(C0Parser.CharLiteral, 0); }
		public TerminalNode UINT() { return getToken(C0Parser.UINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PutCharContext(CallStdlibContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterPutChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitPutChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitPutChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PutStrContext extends CallStdlibContext {
		public TerminalNode PUTSTR() { return getToken(C0Parser.PUTSTR, 0); }
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public PutStrContext(CallStdlibContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterPutStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitPutStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitPutStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetDoubleContext extends CallStdlibContext {
		public TerminalNode GETDOUBLE() { return getToken(C0Parser.GETDOUBLE, 0); }
		public GetDoubleContext(CallStdlibContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterGetDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitGetDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitGetDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PutDoubleContext extends CallStdlibContext {
		public TerminalNode PUTDOUBLE() { return getToken(C0Parser.PUTDOUBLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PutDoubleContext(CallStdlibContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterPutDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitPutDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitPutDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStdlibContext callStdlib() throws RecognitionException {
		CallStdlibContext _localctx = new CallStdlibContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_callStdlib);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GETINT:
				_localctx = new GetIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(GETINT);
				setState(206);
				match(T__1);
				setState(207);
				match(T__2);
				}
				break;
			case GETDOUBLE:
				_localctx = new GetDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(GETDOUBLE);
				setState(209);
				match(T__1);
				setState(210);
				match(T__2);
				}
				break;
			case GETCHAR:
				_localctx = new GetCharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(GETCHAR);
				setState(212);
				match(T__1);
				setState(213);
				match(T__2);
				}
				break;
			case PUTINT:
				_localctx = new PutIntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(PUTINT);
				setState(215);
				match(T__1);
				{
				setState(216);
				expr(0);
				}
				setState(217);
				match(T__2);
				}
				break;
			case PUTDOUBLE:
				_localctx = new PutDoubleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				match(PUTDOUBLE);
				setState(220);
				match(T__1);
				{
				setState(221);
				expr(0);
				}
				setState(222);
				match(T__2);
				}
				break;
			case PUTCHAR:
				_localctx = new PutCharContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				match(PUTCHAR);
				setState(225);
				match(T__1);
				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(226);
					match(CharLiteral);
					}
					break;
				case 2:
					{
					setState(227);
					match(UINT);
					}
					break;
				case 3:
					{
					setState(228);
					expr(0);
					}
					break;
				}
				setState(231);
				match(T__2);
				}
				break;
			case PUTSTR:
				_localctx = new PutStrContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(232);
				match(PUTSTR);
				setState(233);
				match(T__1);
				{
				setState(234);
				str();
				}
				setState(235);
				match(T__2);
				}
				break;
			case PUTLN:
				_localctx = new PutLnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				match(PUTLN);
				setState(238);
				match(T__1);
				setState(239);
				match(T__2);
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

	public static class StrContext extends ParserRuleContext {
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public TerminalNode NO_COMMET() { return getToken(C0Parser.NO_COMMET, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_str);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__23);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << EscapeSequence) | (1L << BOOL_OP) | (1L << ASSIGN) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << CharLiteral) | (1L << DOUBLE) | (1L << IDENT) | (1L << NO_COMMET) | (1L << SL_COMMENT) | (1L << WS))) != 0)) {
					{
					{
					setState(243);
					character();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(T__23);
				}
				break;
			case NO_COMMET:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(NO_COMMET);
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

	public static class CharacterContext extends ParserRuleContext {
		public Token cl;
		public TerminalNode EscapeSequence() { return getToken(C0Parser.EscapeSequence, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_character);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(EscapeSequence);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				((CharacterContext)_localctx).cl = _input.LT(1);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__23 || _la==T__24) ) {
					((CharacterContext)_localctx).cl = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(T__25);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				match(T__26);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				match(T__27);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(258);
				match(T__28);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0108\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\3\3"+
		"\3\3\3\3\3\5\3\66\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4@\n\4\f\4\16"+
		"\4C\13\4\3\5\5\5F\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"S\n\6\3\7\3\7\3\7\3\b\3\b\5\bZ\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tb\n\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13p\n\13\3\13\3\13"+
		"\5\13t\n\13\3\13\3\13\3\13\3\13\5\13z\n\13\5\13|\n\13\3\f\3\f\5\f\u0080"+
		"\n\f\3\f\3\f\5\f\u0084\n\f\3\f\3\f\3\r\3\r\7\r\u008a\n\r\f\r\16\r\u008d"+
		"\13\r\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u0095\n\17\3\17\3\17\3\20\3\20"+
		"\3\20\6\20\u009c\n\20\r\20\16\20\u009d\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00ab\n\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00b9\n\20\f\20\16\20\u00bc\13\20"+
		"\3\21\3\21\5\21\u00c0\n\21\3\22\3\22\3\22\3\22\3\22\7\22\u00c7\n\22\f"+
		"\22\16\22\u00ca\13\22\5\22\u00cc\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e8\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00f3\n\23\3\24\3\24\7\24\u00f7\n\24\f\24\16"+
		"\24\u00fa\13\24\3\24\3\24\5\24\u00fe\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0106\n\25\3\25\2\3\36\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(\2\7\3\2\7\t\4\2\7\7\t\t\3\2\25\26\3\2\27\30\3\2\32\33\2\u0126\2"+
		".\3\2\2\2\4\61\3\2\2\2\6<\3\2\2\2\bE\3\2\2\2\nR\3\2\2\2\fT\3\2\2\2\16"+
		"Y\3\2\2\2\20[\3\2\2\2\22e\3\2\2\2\24m\3\2\2\2\26}\3\2\2\2\30\u0087\3\2"+
		"\2\2\32\u0090\3\2\2\2\34\u0092\3\2\2\2\36\u00aa\3\2\2\2 \u00bf\3\2\2\2"+
		"\"\u00c1\3\2\2\2$\u00f2\3\2\2\2&\u00fd\3\2\2\2(\u0105\3\2\2\2*-\5\16\b"+
		"\2+-\5\4\3\2,*\3\2\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\3\3"+
		"\2\2\2\60.\3\2\2\2\61\62\7\3\2\2\62\63\7.\2\2\63\65\7\4\2\2\64\66\5\6"+
		"\4\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\5\2\289\7\6\2\29"+
		":\t\2\2\2:;\5\30\r\2;\5\3\2\2\2<A\5\b\5\2=>\7\n\2\2>@\5\b\5\2?=\3\2\2"+
		"\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\7\3\2\2\2CA\3\2\2\2DF\7\13\2\2ED\3\2"+
		"\2\2EF\3\2\2\2FG\3\2\2\2GH\7.\2\2HI\7\f\2\2IJ\t\3\2\2J\t\3\2\2\2KS\5\f"+
		"\7\2LS\5\16\b\2MS\5\24\13\2NS\5\26\f\2OS\5\34\17\2PS\5\30\r\2QS\5\32\16"+
		"\2RK\3\2\2\2RL\3\2\2\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2"+
		"\2S\13\3\2\2\2TU\5\36\20\2UV\7\r\2\2V\r\3\2\2\2WZ\5\20\t\2XZ\5\22\n\2"+
		"YW\3\2\2\2YX\3\2\2\2Z\17\3\2\2\2[\\\7\16\2\2\\]\7.\2\2]^\7\f\2\2^a\t\3"+
		"\2\2_`\7\"\2\2`b\5\36\20\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\r\2\2d\21"+
		"\3\2\2\2ef\7\13\2\2fg\7.\2\2gh\7\f\2\2hi\t\3\2\2ij\7\"\2\2jk\5\36\20\2"+
		"kl\7\r\2\2l\23\3\2\2\2mo\7\17\2\2np\7\4\2\2on\3\2\2\2op\3\2\2\2pq\3\2"+
		"\2\2qs\5\36\20\2rt\7\5\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2u{\5\30\r\2vy"+
		"\7\20\2\2wz\5\30\r\2xz\5\24\13\2yw\3\2\2\2yx\3\2\2\2z|\3\2\2\2{v\3\2\2"+
		"\2{|\3\2\2\2|\25\3\2\2\2}\177\7\21\2\2~\u0080\7\4\2\2\177~\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\5\36\20\2\u0082\u0084\7"+
		"\5\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\5\30\r\2\u0086\27\3\2\2\2\u0087\u008b\7\22\2\2\u0088\u008a\5\n"+
		"\6\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\23"+
		"\2\2\u008f\31\3\2\2\2\u0090\u0091\7\r\2\2\u0091\33\3\2\2\2\u0092\u0094"+
		"\7\24\2\2\u0093\u0095\5\36\20\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2"+
		"\2\u0095\u0096\3\2\2\2\u0096\u0097\7\r\2\2\u0097\35\3\2\2\2\u0098\u0099"+
		"\b\20\1\2\u0099\u00ab\5 \21\2\u009a\u009c\7\26\2\2\u009b\u009a\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00ab\5\36\20\b\u00a0\u00a1\7\4\2\2\u00a1\u00a2\5\36\20"+
		"\2\u00a2\u00a3\7\5\2\2\u00a3\u00ab\3\2\2\2\u00a4\u00a5\7.\2\2\u00a5\u00a6"+
		"\7\"\2\2\u00a6\u00ab\5\36\20\6\u00a7\u00ab\7.\2\2\u00a8\u00ab\7+\2\2\u00a9"+
		"\u00ab\7-\2\2\u00aa\u0098\3\2\2\2\u00aa\u009b\3\2\2\2\u00aa\u00a0\3\2"+
		"\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ba\3\2\2\2\u00ac\u00ad\f\f\2\2\u00ad\u00ae\t\4"+
		"\2\2\u00ae\u00b9\5\36\20\r\u00af\u00b0\f\13\2\2\u00b0\u00b1\t\5\2\2\u00b1"+
		"\u00b9\5\36\20\f\u00b2\u00b3\f\n\2\2\u00b3\u00b4\7!\2\2\u00b4\u00b9\5"+
		"\36\20\13\u00b5\u00b6\f\t\2\2\u00b6\u00b7\7\31\2\2\u00b7\u00b9\t\3\2\2"+
		"\u00b8\u00ac\3\2\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b5"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\37\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\5\"\22\2\u00be\u00c0\5$\23"+
		"\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0!\3\2\2\2\u00c1\u00c2"+
		"\7.\2\2\u00c2\u00cb\7\4\2\2\u00c3\u00c8\5\36\20\2\u00c4\u00c5\7\n\2\2"+
		"\u00c5\u00c7\5\36\20\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00c3\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\5"+
		"\2\2\u00ce#\3\2\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d1\7\4\2\2\u00d1\u00f3"+
		"\7\5\2\2\u00d2\u00d3\7$\2\2\u00d3\u00d4\7\4\2\2\u00d4\u00f3\7\5\2\2\u00d5"+
		"\u00d6\7%\2\2\u00d6\u00d7\7\4\2\2\u00d7\u00f3\7\5\2\2\u00d8\u00d9\7&\2"+
		"\2\u00d9\u00da\7\4\2\2\u00da\u00db\5\36\20\2\u00db\u00dc\7\5\2\2\u00dc"+
		"\u00f3\3\2\2\2\u00dd\u00de\7\'\2\2\u00de\u00df\7\4\2\2\u00df\u00e0\5\36"+
		"\20\2\u00e0\u00e1\7\5\2\2\u00e1\u00f3\3\2\2\2\u00e2\u00e3\7(\2\2\u00e3"+
		"\u00e7\7\4\2\2\u00e4\u00e8\7,\2\2\u00e5\u00e8\7+\2\2\u00e6\u00e8\5\36"+
		"\20\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00f3\7\5\2\2\u00ea\u00eb\7)\2\2\u00eb\u00ec\7\4"+
		"\2\2\u00ec\u00ed\5&\24\2\u00ed\u00ee\7\5\2\2\u00ee\u00f3\3\2\2\2\u00ef"+
		"\u00f0\7*\2\2\u00f0\u00f1\7\4\2\2\u00f1\u00f3\7\5\2\2\u00f2\u00cf\3\2"+
		"\2\2\u00f2\u00d2\3\2\2\2\u00f2\u00d5\3\2\2\2\u00f2\u00d8\3\2\2\2\u00f2"+
		"\u00dd\3\2\2\2\u00f2\u00e2\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f2\u00ef\3\2"+
		"\2\2\u00f3%\3\2\2\2\u00f4\u00f8\7\32\2\2\u00f5\u00f7\5(\25\2\u00f6\u00f5"+
		"\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\7\32\2\2\u00fc\u00fe\7"+
		"/\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\'\3\2\2\2\u00ff\u0106"+
		"\7 \2\2\u0100\u0106\n\6\2\2\u0101\u0106\7\34\2\2\u0102\u0106\7\35\2\2"+
		"\u0103\u0106\7\36\2\2\u0104\u0106\7\37\2\2\u0105\u00ff\3\2\2\2\u0105\u0100"+
		"\3\2\2\2\u0105\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0104\3\2\2\2\u0106)\3\2\2\2\36,.\65AERYaosy{\177\u0083\u008b\u0094\u009d"+
		"\u00aa\u00b8\u00ba\u00bf\u00c8\u00cb\u00e7\u00f2\u00f8\u00fd\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}