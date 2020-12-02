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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		EscapeSequence=32, BOOL_OP=33, ASSIGN=34, GETINT=35, GETDOUBLE=36, GETCHAR=37, 
		PUTINT=38, PUTDOUBLE=39, PUTCHAR=40, PUTSTR=41, PUTLN=42, UINT=43, CharLiteral=44, 
		DOUBLE=45, IDENT=46, NO_COMMET=47, SL_COMMENT=48, WS=49;
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
			"'const'", "':'", "'break'", "';'", "'continue'", "'let'", "'if'", "'else'", 
			"'while'", "'{'", "'}'", "'return'", "'-'", "'as'", "'*'", "'/'", "'+'", 
			"'\"'", "'\\'", "'|'", "'#'", "'^'", "'?'", null, null, "'='", "'getint'", 
			"'getdouble'", "'getchar'", "'putint'", "'putdouble'", "'putchar'", "'putstr'", 
			"'putln'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "EscapeSequence", "BOOL_OP", 
			"ASSIGN", "GETINT", "GETDOUBLE", "GETCHAR", "PUTINT", "PUTDOUBLE", "PUTCHAR", 
			"PUTSTR", "PUTLN", "UINT", "CharLiteral", "DOUBLE", "IDENT", "NO_COMMET", 
			"SL_COMMENT", "WS"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__13))) != 0)) {
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__13:
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
		public Token br;
		public Token cont;
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
			setState(86);
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
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				declStmt();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				ifStmt();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				whileStmt();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				returnStmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				blockStmt();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				emptyStmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				((StmtContext)_localctx).br = match(T__10);
				setState(83);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 9);
				{
				setState(84);
				((StmtContext)_localctx).cont = match(T__12);
				setState(85);
				match(T__11);
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
			setState(88);
			expr(0);
			setState(89);
			match(T__11);
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
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				letDeclStmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
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
			setState(95);
			match(T__13);
			setState(96);
			match(IDENT);
			setState(97);
			match(T__9);
			setState(98);
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
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(99);
				match(ASSIGN);
				setState(100);
				expr(0);
				}
			}

			setState(103);
			match(T__11);
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
			setState(105);
			match(T__8);
			setState(106);
			match(IDENT);
			setState(107);
			match(T__9);
			setState(108);
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
			setState(109);
			match(ASSIGN);
			setState(110);
			expr(0);
			setState(111);
			match(T__11);
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
			setState(113);
			match(T__14);
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(114);
				match(T__1);
				}
				break;
			}
			setState(117);
			expr(0);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(118);
				match(T__2);
				}
			}

			setState(121);
			blockStmt();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(122);
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
			setState(125);
			match(T__15);
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(126);
				blockStmt();
				}
				break;
			case T__14:
				{
				setState(127);
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
			setState(130);
			match(T__16);
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(131);
				match(T__1);
				}
				break;
			}
			setState(134);
			expr(0);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(135);
				match(T__2);
				}
			}

			setState(138);
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
			setState(140);
			match(T__17);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(141);
				stmt();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(T__18);
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
			setState(149);
			match(T__11);
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
			setState(151);
			match(T__19);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__20) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
				{
				setState(152);
				expr(0);
				}
			}

			setState(155);
			match(T__11);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new FuncLabelExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(158);
				funcExpr();
				}
				break;
			case 2:
				{
				_localctx = new NagExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(159);
						match(T__20);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(162); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(164);
				expr(10);
				}
				break;
			case 3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(T__1);
				setState(166);
				expr(0);
				setState(167);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(IDENT);
				setState(170);
				match(ASSIGN);
				setState(171);
				expr(4);
				}
				break;
			case 5:
				{
				_localctx = new IdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(IDENT);
				}
				break;
			case 6:
				{
				_localctx = new UintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(UINT);
				}
				break;
			case 7:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(DOUBLE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(178);
						((MultExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
							((MultExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(179);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(181);
						((AddExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__24) ) {
							((AddExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(182);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new BoolExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(184);
						match(BOOL_OP);
						setState(185);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new AsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(187);
						match(T__21);
						setState(188);
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
				setState(193);
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
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
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
				setState(195);
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
			setState(198);
			match(IDENT);
			setState(199);
			match(T__1);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__20) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
				{
				setState(200);
				expr(0);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(201);
					match(T__7);
					setState(202);
					expr(0);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(210);
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
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GETINT:
				_localctx = new GetIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(GETINT);
				setState(213);
				match(T__1);
				setState(214);
				match(T__2);
				}
				break;
			case GETDOUBLE:
				_localctx = new GetDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(GETDOUBLE);
				setState(216);
				match(T__1);
				setState(217);
				match(T__2);
				}
				break;
			case GETCHAR:
				_localctx = new GetCharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(GETCHAR);
				setState(219);
				match(T__1);
				setState(220);
				match(T__2);
				}
				break;
			case PUTINT:
				_localctx = new PutIntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(PUTINT);
				setState(222);
				match(T__1);
				{
				setState(223);
				expr(0);
				}
				setState(224);
				match(T__2);
				}
				break;
			case PUTDOUBLE:
				_localctx = new PutDoubleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				match(PUTDOUBLE);
				setState(227);
				match(T__1);
				{
				setState(228);
				expr(0);
				}
				setState(229);
				match(T__2);
				}
				break;
			case PUTCHAR:
				_localctx = new PutCharContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				match(PUTCHAR);
				setState(232);
				match(T__1);
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(233);
					match(CharLiteral);
					}
					break;
				case 2:
					{
					setState(234);
					match(UINT);
					}
					break;
				case 3:
					{
					setState(235);
					expr(0);
					}
					break;
				}
				setState(238);
				match(T__2);
				}
				break;
			case PUTSTR:
				_localctx = new PutStrContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(239);
				match(PUTSTR);
				setState(240);
				match(T__1);
				{
				setState(241);
				str();
				}
				setState(242);
				match(T__2);
				}
				break;
			case PUTLN:
				_localctx = new PutLnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				match(PUTLN);
				setState(245);
				match(T__1);
				setState(246);
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
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(T__25);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << EscapeSequence) | (1L << BOOL_OP) | (1L << ASSIGN) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << CharLiteral) | (1L << DOUBLE) | (1L << IDENT) | (1L << NO_COMMET) | (1L << SL_COMMENT) | (1L << WS))) != 0)) {
					{
					{
					setState(250);
					character();
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				match(T__25);
				}
				break;
			case NO_COMMET:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(EscapeSequence);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				((CharacterContext)_localctx).cl = _input.LT(1);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__25 || _la==T__26) ) {
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
				setState(262);
				match(T__27);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				match(T__28);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				match(T__29);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(265);
				match(T__30);
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
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u010f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2\f\2\16\2\62"+
		"\13\2\3\3\3\3\3\3\3\3\5\38\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4B\n"+
		"\4\f\4\16\4E\13\4\3\5\5\5H\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6Y\n\6\3\7\3\7\3\7\3\b\3\b\5\b`\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\th\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\5\13v\n\13\3\13\3\13\5\13z\n\13\3\13\3\13\5\13~\n\13\3\f\3\f\3\f\5\f"+
		"\u0083\n\f\3\r\3\r\5\r\u0087\n\r\3\r\3\r\5\r\u008b\n\r\3\r\3\r\3\16\3"+
		"\16\7\16\u0091\n\16\f\16\16\16\u0094\13\16\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\5\20\u009c\n\20\3\20\3\20\3\21\3\21\3\21\6\21\u00a3\n\21\r\21\16\21"+
		"\u00a4\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b2"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u00c0\n\21\f\21\16\21\u00c3\13\21\3\22\3\22\5\22\u00c7\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u00ce\n\23\f\23\16\23\u00d1\13\23\5\23\u00d3\n\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ef"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00fa\n\24\3\25"+
		"\3\25\7\25\u00fe\n\25\f\25\16\25\u0101\13\25\3\25\3\25\5\25\u0105\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u010d\n\26\3\26\2\3 \27\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\7\3\2\7\t\4\2\7\7\t\t\3\2\31\32"+
		"\4\2\27\27\33\33\3\2\34\35\2\u012e\2\60\3\2\2\2\4\63\3\2\2\2\6>\3\2\2"+
		"\2\bG\3\2\2\2\nX\3\2\2\2\fZ\3\2\2\2\16_\3\2\2\2\20a\3\2\2\2\22k\3\2\2"+
		"\2\24s\3\2\2\2\26\177\3\2\2\2\30\u0084\3\2\2\2\32\u008e\3\2\2\2\34\u0097"+
		"\3\2\2\2\36\u0099\3\2\2\2 \u00b1\3\2\2\2\"\u00c6\3\2\2\2$\u00c8\3\2\2"+
		"\2&\u00f9\3\2\2\2(\u0104\3\2\2\2*\u010c\3\2\2\2,/\5\16\b\2-/\5\4\3\2."+
		",\3\2\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\3\3\2\2\2"+
		"\62\60\3\2\2\2\63\64\7\3\2\2\64\65\7\60\2\2\65\67\7\4\2\2\668\5\6\4\2"+
		"\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\5\2\2:;\7\6\2\2;<\t\2\2\2<=\5"+
		"\32\16\2=\5\3\2\2\2>C\5\b\5\2?@\7\n\2\2@B\5\b\5\2A?\3\2\2\2BE\3\2\2\2"+
		"CA\3\2\2\2CD\3\2\2\2D\7\3\2\2\2EC\3\2\2\2FH\7\13\2\2GF\3\2\2\2GH\3\2\2"+
		"\2HI\3\2\2\2IJ\7\60\2\2JK\7\f\2\2KL\t\3\2\2L\t\3\2\2\2MY\5\f\7\2NY\5\16"+
		"\b\2OY\5\24\13\2PY\5\30\r\2QY\5\36\20\2RY\5\32\16\2SY\5\34\17\2TU\7\r"+
		"\2\2UY\7\16\2\2VW\7\17\2\2WY\7\16\2\2XM\3\2\2\2XN\3\2\2\2XO\3\2\2\2XP"+
		"\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XV\3\2\2\2Y\13\3\2\2\2"+
		"Z[\5 \21\2[\\\7\16\2\2\\\r\3\2\2\2]`\5\20\t\2^`\5\22\n\2_]\3\2\2\2_^\3"+
		"\2\2\2`\17\3\2\2\2ab\7\20\2\2bc\7\60\2\2cd\7\f\2\2dg\t\3\2\2ef\7$\2\2"+
		"fh\5 \21\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\16\2\2j\21\3\2\2\2kl\7\13"+
		"\2\2lm\7\60\2\2mn\7\f\2\2no\t\3\2\2op\7$\2\2pq\5 \21\2qr\7\16\2\2r\23"+
		"\3\2\2\2su\7\21\2\2tv\7\4\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\5 \21\2"+
		"xz\7\5\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{}\5\32\16\2|~\5\26\f\2}|\3\2"+
		"\2\2}~\3\2\2\2~\25\3\2\2\2\177\u0082\7\22\2\2\u0080\u0083\5\32\16\2\u0081"+
		"\u0083\5\24\13\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\27\3\2"+
		"\2\2\u0084\u0086\7\23\2\2\u0085\u0087\7\4\2\2\u0086\u0085\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\5 \21\2\u0089\u008b\7\5"+
		"\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\5\32\16\2\u008d\31\3\2\2\2\u008e\u0092\7\24\2\2\u008f\u0091\5\n"+
		"\6\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\25"+
		"\2\2\u0096\33\3\2\2\2\u0097\u0098\7\16\2\2\u0098\35\3\2\2\2\u0099\u009b"+
		"\7\26\2\2\u009a\u009c\5 \21\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009e\7\16\2\2\u009e\37\3\2\2\2\u009f\u00a0"+
		"\b\21\1\2\u00a0\u00b2\5\"\22\2\u00a1\u00a3\7\27\2\2\u00a2\u00a1\3\2\2"+
		"\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00b2\5 \21\f\u00a7\u00a8\7\4\2\2\u00a8\u00a9\5 \21\2\u00a9"+
		"\u00aa\7\5\2\2\u00aa\u00b2\3\2\2\2\u00ab\u00ac\7\60\2\2\u00ac\u00ad\7"+
		"$\2\2\u00ad\u00b2\5 \21\6\u00ae\u00b2\7\60\2\2\u00af\u00b2\7-\2\2\u00b0"+
		"\u00b2\7/\2\2\u00b1\u009f\3\2\2\2\u00b1\u00a2\3\2\2\2\u00b1\u00a7\3\2"+
		"\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00c1\3\2\2\2\u00b3\u00b4\f\n\2\2\u00b4\u00b5\t\4"+
		"\2\2\u00b5\u00c0\5 \21\13\u00b6\u00b7\f\t\2\2\u00b7\u00b8\t\5\2\2\u00b8"+
		"\u00c0\5 \21\n\u00b9\u00ba\f\7\2\2\u00ba\u00bb\7#\2\2\u00bb\u00c0\5 \21"+
		"\b\u00bc\u00bd\f\13\2\2\u00bd\u00be\7\30\2\2\u00be\u00c0\t\3\2\2\u00bf"+
		"\u00b3\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00bc\3\2"+
		"\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"!\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\5$\23\2\u00c5\u00c7\5&\24\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00c9\7"+
		"\60\2\2\u00c9\u00d2\7\4\2\2\u00ca\u00cf\5 \21\2\u00cb\u00cc\7\n\2\2\u00cc"+
		"\u00ce\5 \21\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00ca\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\5"+
		"\2\2\u00d5%\3\2\2\2\u00d6\u00d7\7%\2\2\u00d7\u00d8\7\4\2\2\u00d8\u00fa"+
		"\7\5\2\2\u00d9\u00da\7&\2\2\u00da\u00db\7\4\2\2\u00db\u00fa\7\5\2\2\u00dc"+
		"\u00dd\7\'\2\2\u00dd\u00de\7\4\2\2\u00de\u00fa\7\5\2\2\u00df\u00e0\7("+
		"\2\2\u00e0\u00e1\7\4\2\2\u00e1\u00e2\5 \21\2\u00e2\u00e3\7\5\2\2\u00e3"+
		"\u00fa\3\2\2\2\u00e4\u00e5\7)\2\2\u00e5\u00e6\7\4\2\2\u00e6\u00e7\5 \21"+
		"\2\u00e7\u00e8\7\5\2\2\u00e8\u00fa\3\2\2\2\u00e9\u00ea\7*\2\2\u00ea\u00ee"+
		"\7\4\2\2\u00eb\u00ef\7.\2\2\u00ec\u00ef\7-\2\2\u00ed\u00ef\5 \21\2\u00ee"+
		"\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00fa\7\5\2\2\u00f1\u00f2\7+\2\2\u00f2\u00f3\7\4\2\2\u00f3"+
		"\u00f4\5(\25\2\u00f4\u00f5\7\5\2\2\u00f5\u00fa\3\2\2\2\u00f6\u00f7\7,"+
		"\2\2\u00f7\u00f8\7\4\2\2\u00f8\u00fa\7\5\2\2\u00f9\u00d6\3\2\2\2\u00f9"+
		"\u00d9\3\2\2\2\u00f9\u00dc\3\2\2\2\u00f9\u00df\3\2\2\2\u00f9\u00e4\3\2"+
		"\2\2\u00f9\u00e9\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa"+
		"\'\3\2\2\2\u00fb\u00ff\7\34\2\2\u00fc\u00fe\5*\26\2\u00fd\u00fc\3\2\2"+
		"\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0105\7\34\2\2\u0103\u0105\7\61\2\2"+
		"\u0104\u00fb\3\2\2\2\u0104\u0103\3\2\2\2\u0105)\3\2\2\2\u0106\u010d\7"+
		"\"\2\2\u0107\u010d\n\6\2\2\u0108\u010d\7\36\2\2\u0109\u010d\7\37\2\2\u010a"+
		"\u010d\7 \2\2\u010b\u010d\7!\2\2\u010c\u0106\3\2\2\2\u010c\u0107\3\2\2"+
		"\2\u010c\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b"+
		"\3\2\2\2\u010d+\3\2\2\2\36.\60\67CGX_guy}\u0082\u0086\u008a\u0092\u009b"+
		"\u00a4\u00b1\u00bf\u00c1\u00c6\u00cf\u00d2\u00ee\u00f9\u00ff\u0104\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}