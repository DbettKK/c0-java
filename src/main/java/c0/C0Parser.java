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
		RULE_constDeclStmt = 8, RULE_ifStmt = 9, RULE_elseStmt = 10, RULE_whileStmt = 11, 
		RULE_blockStmt = 12, RULE_emptyStmt = 13, RULE_returnStmt = 14, RULE_expr = 15, 
		RULE_funcExpr = 16, RULE_callFunc = 17, RULE_callStdlib = 18, RULE_str = 19, 
		RULE_character = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "functionParamList", "functionParam", "stmt", 
			"exprStmt", "declStmt", "letDeclStmt", "constDeclStmt", "ifStmt", "elseStmt", 
			"whileStmt", "blockStmt", "emptyStmt", "returnStmt", "expr", "funcExpr", 
			"callFunc", "callStdlib", "str", "character"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fn'", "'('", "')'", "'->'", "'int'", "'void'", "'double'", "','", 
			"'const'", "':'", "';'", "'let'", "'if'", "'else'", "'while'", "'{'", 
			"'}'", "'return'", "'as'", "'+'", "'-'", "'*'", "'/'", "'\"'", "'\\'", 
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
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__11))) != 0)) {
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__11:
					{
					setState(42);
					declStmt();
					}
					break;
				case T__0:
					{
					setState(43);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(48);
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
			setState(49);
			match(T__0);
			setState(50);
			match(IDENT);
			setState(51);
			match(T__1);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==IDENT) {
				{
				setState(52);
				functionParamList();
				}
			}

			setState(55);
			match(T__2);
			setState(56);
			match(T__3);
			setState(57);
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
			setState(58);
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
			setState(60);
			functionParam();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(61);
				match(T__7);
				setState(62);
				functionParam();
				}
				}
				setState(67);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(68);
				((FunctionParamContext)_localctx).isConst = match(T__8);
				}
			}

			setState(71);
			match(IDENT);
			setState(72);
			match(T__9);
			setState(73);
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
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__20:
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
				setState(75);
				exprStmt();
				}
				break;
			case T__8:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				declStmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				ifStmt();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				whileStmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				returnStmt();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				blockStmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
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
			setState(84);
			expr(0);
			setState(85);
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				letDeclStmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
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
			setState(91);
			match(T__11);
			setState(92);
			match(IDENT);
			setState(93);
			match(T__9);
			setState(94);
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(95);
				match(ASSIGN);
				setState(96);
				expr(0);
				}
			}

			setState(99);
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
			setState(101);
			match(T__8);
			setState(102);
			match(IDENT);
			setState(103);
			match(T__9);
			setState(104);
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
			setState(105);
			match(ASSIGN);
			setState(106);
			expr(0);
			setState(107);
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
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
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
			setState(109);
			match(T__12);
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(110);
				match(T__1);
				}
				break;
			}
			setState(113);
			expr(0);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(114);
				match(T__2);
				}
			}

			setState(117);
			blockStmt();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(118);
				elseStmt();
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

	public static class ElseStmtContext extends ParserRuleContext {
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof C0Listener ) ((C0Listener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof C0Visitor ) return ((C0Visitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__13);
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				{
				setState(122);
				blockStmt();
				}
				break;
			case T__12:
				{
				setState(123);
				ifStmt();
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
		enterRule(_localctx, 22, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__14);
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(127);
				match(T__1);
				}
				break;
			}
			setState(130);
			expr(0);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(131);
				match(T__2);
				}
			}

			setState(134);
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
		enterRule(_localctx, 24, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__15);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__20) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(137);
				stmt();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
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
		enterRule(_localctx, 26, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		enterRule(_localctx, 28, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__17);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__20) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
				{
				setState(148);
				expr(0);
				}
			}

			setState(151);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new FuncLabelExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(154);
				funcExpr();
				}
				break;
			case 2:
				{
				_localctx = new NagExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(155);
						match(T__20);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(158); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(160);
				expr(6);
				}
				break;
			case 3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(T__1);
				setState(162);
				expr(0);
				setState(163);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(IDENT);
				setState(166);
				match(ASSIGN);
				setState(167);
				expr(4);
				}
				break;
			case 5:
				{
				_localctx = new IdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(IDENT);
				}
				break;
			case 6:
				{
				_localctx = new UintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(UINT);
				}
				break;
			case 7:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(DOUBLE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(174);
						((AddExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((AddExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
					case 2:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(177);
						((MultExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((MultExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new BoolExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(180);
						match(BOOL_OP);
						setState(181);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new AsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(183);
						match(T__18);
						setState(184);
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
				setState(189);
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
		enterRule(_localctx, 32, RULE_funcExpr);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
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
				setState(191);
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
		enterRule(_localctx, 34, RULE_callFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(IDENT);
			setState(195);
			match(T__1);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__20) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
				{
				setState(196);
				expr(0);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(197);
					match(T__7);
					setState(198);
					expr(0);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(206);
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
		enterRule(_localctx, 36, RULE_callStdlib);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GETINT:
				_localctx = new GetIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(GETINT);
				setState(209);
				match(T__1);
				setState(210);
				match(T__2);
				}
				break;
			case GETDOUBLE:
				_localctx = new GetDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(GETDOUBLE);
				setState(212);
				match(T__1);
				setState(213);
				match(T__2);
				}
				break;
			case GETCHAR:
				_localctx = new GetCharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(GETCHAR);
				setState(215);
				match(T__1);
				setState(216);
				match(T__2);
				}
				break;
			case PUTINT:
				_localctx = new PutIntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				match(PUTINT);
				setState(218);
				match(T__1);
				{
				setState(219);
				expr(0);
				}
				setState(220);
				match(T__2);
				}
				break;
			case PUTDOUBLE:
				_localctx = new PutDoubleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(PUTDOUBLE);
				setState(223);
				match(T__1);
				{
				setState(224);
				expr(0);
				}
				setState(225);
				match(T__2);
				}
				break;
			case PUTCHAR:
				_localctx = new PutCharContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(227);
				match(PUTCHAR);
				setState(228);
				match(T__1);
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(229);
					match(CharLiteral);
					}
					break;
				case 2:
					{
					setState(230);
					match(UINT);
					}
					break;
				case 3:
					{
					setState(231);
					expr(0);
					}
					break;
				}
				setState(234);
				match(T__2);
				}
				break;
			case PUTSTR:
				_localctx = new PutStrContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(235);
				match(PUTSTR);
				setState(236);
				match(T__1);
				{
				setState(237);
				str();
				}
				setState(238);
				match(T__2);
				}
				break;
			case PUTLN:
				_localctx = new PutLnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(240);
				match(PUTLN);
				setState(241);
				match(T__1);
				setState(242);
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
		enterRule(_localctx, 38, RULE_str);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(T__23);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << EscapeSequence) | (1L << BOOL_OP) | (1L << ASSIGN) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << CharLiteral) | (1L << DOUBLE) | (1L << IDENT) | (1L << NO_COMMET) | (1L << SL_COMMENT) | (1L << WS))) != 0)) {
					{
					{
					setState(246);
					character();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				match(T__23);
				}
				break;
			case NO_COMMET:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
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
		enterRule(_localctx, 40, RULE_character);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(EscapeSequence);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
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
				setState(258);
				match(T__25);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				match(T__26);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				match(T__27);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
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
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u010b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2\f\2\16\2\62"+
		"\13\2\3\3\3\3\3\3\3\3\5\38\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4B\n"+
		"\4\f\4\16\4E\13\4\3\5\5\5H\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6U\n\6\3\7\3\7\3\7\3\b\3\b\5\b\\\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\td\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13r\n\13\3"+
		"\13\3\13\5\13v\n\13\3\13\3\13\5\13z\n\13\3\f\3\f\3\f\5\f\177\n\f\3\r\3"+
		"\r\5\r\u0083\n\r\3\r\3\r\5\r\u0087\n\r\3\r\3\r\3\16\3\16\7\16\u008d\n"+
		"\16\f\16\16\16\u0090\13\16\3\16\3\16\3\17\3\17\3\20\3\20\5\20\u0098\n"+
		"\20\3\20\3\20\3\21\3\21\3\21\6\21\u009f\n\21\r\21\16\21\u00a0\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ae\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00bc\n\21\f\21"+
		"\16\21\u00bf\13\21\3\22\3\22\5\22\u00c3\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u00ca\n\23\f\23\16\23\u00cd\13\23\5\23\u00cf\n\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00eb\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f6\n\24\3\25\3\25\7\25\u00fa"+
		"\n\25\f\25\16\25\u00fd\13\25\3\25\3\25\5\25\u0101\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0109\n\26\3\26\2\3 \27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\7\3\2\7\t\4\2\7\7\t\t\3\2\26\27\3\2\30\31\3\2\32"+
		"\33\2\u0128\2\60\3\2\2\2\4\63\3\2\2\2\6>\3\2\2\2\bG\3\2\2\2\nT\3\2\2\2"+
		"\fV\3\2\2\2\16[\3\2\2\2\20]\3\2\2\2\22g\3\2\2\2\24o\3\2\2\2\26{\3\2\2"+
		"\2\30\u0080\3\2\2\2\32\u008a\3\2\2\2\34\u0093\3\2\2\2\36\u0095\3\2\2\2"+
		" \u00ad\3\2\2\2\"\u00c2\3\2\2\2$\u00c4\3\2\2\2&\u00f5\3\2\2\2(\u0100\3"+
		"\2\2\2*\u0108\3\2\2\2,/\5\16\b\2-/\5\4\3\2.,\3\2\2\2.-\3\2\2\2/\62\3\2"+
		"\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\3\3\2\2\2\62\60\3\2\2\2\63\64\7\3\2"+
		"\2\64\65\7.\2\2\65\67\7\4\2\2\668\5\6\4\2\67\66\3\2\2\2\678\3\2\2\289"+
		"\3\2\2\29:\7\5\2\2:;\7\6\2\2;<\t\2\2\2<=\5\32\16\2=\5\3\2\2\2>C\5\b\5"+
		"\2?@\7\n\2\2@B\5\b\5\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\7\3\2"+
		"\2\2EC\3\2\2\2FH\7\13\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7.\2\2JK\7\f"+
		"\2\2KL\t\3\2\2L\t\3\2\2\2MU\5\f\7\2NU\5\16\b\2OU\5\24\13\2PU\5\30\r\2"+
		"QU\5\36\20\2RU\5\32\16\2SU\5\34\17\2TM\3\2\2\2TN\3\2\2\2TO\3\2\2\2TP\3"+
		"\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\13\3\2\2\2VW\5 \21\2WX\7\r\2\2X"+
		"\r\3\2\2\2Y\\\5\20\t\2Z\\\5\22\n\2[Y\3\2\2\2[Z\3\2\2\2\\\17\3\2\2\2]^"+
		"\7\16\2\2^_\7.\2\2_`\7\f\2\2`c\t\3\2\2ab\7\"\2\2bd\5 \21\2ca\3\2\2\2c"+
		"d\3\2\2\2de\3\2\2\2ef\7\r\2\2f\21\3\2\2\2gh\7\13\2\2hi\7.\2\2ij\7\f\2"+
		"\2jk\t\3\2\2kl\7\"\2\2lm\5 \21\2mn\7\r\2\2n\23\3\2\2\2oq\7\17\2\2pr\7"+
		"\4\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\5 \21\2tv\7\5\2\2ut\3\2\2\2uv\3"+
		"\2\2\2vw\3\2\2\2wy\5\32\16\2xz\5\26\f\2yx\3\2\2\2yz\3\2\2\2z\25\3\2\2"+
		"\2{~\7\20\2\2|\177\5\32\16\2}\177\5\24\13\2~|\3\2\2\2~}\3\2\2\2\177\27"+
		"\3\2\2\2\u0080\u0082\7\21\2\2\u0081\u0083\7\4\2\2\u0082\u0081\3\2\2\2"+
		"\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\5 \21\2\u0085\u0087"+
		"\7\5\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\5\32\16\2\u0089\31\3\2\2\2\u008a\u008e\7\22\2\2\u008b\u008d\5\n"+
		"\6\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\23"+
		"\2\2\u0092\33\3\2\2\2\u0093\u0094\7\r\2\2\u0094\35\3\2\2\2\u0095\u0097"+
		"\7\24\2\2\u0096\u0098\5 \21\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u009a\7\r\2\2\u009a\37\3\2\2\2\u009b\u009c"+
		"\b\21\1\2\u009c\u00ae\5\"\22\2\u009d\u009f\7\27\2\2\u009e\u009d\3\2\2"+
		"\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00ae\5 \21\b\u00a3\u00a4\7\4\2\2\u00a4\u00a5\5 \21\2\u00a5"+
		"\u00a6\7\5\2\2\u00a6\u00ae\3\2\2\2\u00a7\u00a8\7.\2\2\u00a8\u00a9\7\""+
		"\2\2\u00a9\u00ae\5 \21\6\u00aa\u00ae\7.\2\2\u00ab\u00ae\7+\2\2\u00ac\u00ae"+
		"\7-\2\2\u00ad\u009b\3\2\2\2\u00ad\u009e\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad"+
		"\u00a7\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2"+
		"\2\2\u00ae\u00bd\3\2\2\2\u00af\u00b0\f\13\2\2\u00b0\u00b1\t\4\2\2\u00b1"+
		"\u00bc\5 \21\f\u00b2\u00b3\f\n\2\2\u00b3\u00b4\t\5\2\2\u00b4\u00bc\5 "+
		"\21\13\u00b5\u00b6\f\t\2\2\u00b6\u00b7\7!\2\2\u00b7\u00bc\5 \21\n\u00b8"+
		"\u00b9\f\f\2\2\u00b9\u00ba\7\25\2\2\u00ba\u00bc\t\3\2\2\u00bb\u00af\3"+
		"\2\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be!\3\2\2\2"+
		"\u00bf\u00bd\3\2\2\2\u00c0\u00c3\5$\23\2\u00c1\u00c3\5&\24\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3#\3\2\2\2\u00c4\u00c5\7.\2\2\u00c5\u00ce"+
		"\7\4\2\2\u00c6\u00cb\5 \21\2\u00c7\u00c8\7\n\2\2\u00c8\u00ca\5 \21\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\5\2\2\u00d1%\3\2\2\2"+
		"\u00d2\u00d3\7#\2\2\u00d3\u00d4\7\4\2\2\u00d4\u00f6\7\5\2\2\u00d5\u00d6"+
		"\7$\2\2\u00d6\u00d7\7\4\2\2\u00d7\u00f6\7\5\2\2\u00d8\u00d9\7%\2\2\u00d9"+
		"\u00da\7\4\2\2\u00da\u00f6\7\5\2\2\u00db\u00dc\7&\2\2\u00dc\u00dd\7\4"+
		"\2\2\u00dd\u00de\5 \21\2\u00de\u00df\7\5\2\2\u00df\u00f6\3\2\2\2\u00e0"+
		"\u00e1\7\'\2\2\u00e1\u00e2\7\4\2\2\u00e2\u00e3\5 \21\2\u00e3\u00e4\7\5"+
		"\2\2\u00e4\u00f6\3\2\2\2\u00e5\u00e6\7(\2\2\u00e6\u00ea\7\4\2\2\u00e7"+
		"\u00eb\7,\2\2\u00e8\u00eb\7+\2\2\u00e9\u00eb\5 \21\2\u00ea\u00e7\3\2\2"+
		"\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f6"+
		"\7\5\2\2\u00ed\u00ee\7)\2\2\u00ee\u00ef\7\4\2\2\u00ef\u00f0\5(\25\2\u00f0"+
		"\u00f1\7\5\2\2\u00f1\u00f6\3\2\2\2\u00f2\u00f3\7*\2\2\u00f3\u00f4\7\4"+
		"\2\2\u00f4\u00f6\7\5\2\2\u00f5\u00d2\3\2\2\2\u00f5\u00d5\3\2\2\2\u00f5"+
		"\u00d8\3\2\2\2\u00f5\u00db\3\2\2\2\u00f5\u00e0\3\2\2\2\u00f5\u00e5\3\2"+
		"\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\'\3\2\2\2\u00f7\u00fb"+
		"\7\32\2\2\u00f8\u00fa\5*\26\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2"+
		"\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u0101\7\32\2\2\u00ff\u0101\7/\2\2\u0100\u00f7\3\2\2\2\u0100"+
		"\u00ff\3\2\2\2\u0101)\3\2\2\2\u0102\u0109\7 \2\2\u0103\u0109\n\6\2\2\u0104"+
		"\u0109\7\34\2\2\u0105\u0109\7\35\2\2\u0106\u0109\7\36\2\2\u0107\u0109"+
		"\7\37\2\2\u0108\u0102\3\2\2\2\u0108\u0103\3\2\2\2\u0108\u0104\3\2\2\2"+
		"\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109+\3"+
		"\2\2\2\36.\60\67CGT[cquy~\u0082\u0086\u008e\u0097\u00a0\u00ad\u00bb\u00bd"+
		"\u00c2\u00cb\u00ce\u00ea\u00f5\u00fb\u0100\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}