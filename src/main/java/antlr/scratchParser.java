// Generated from C:/Users/34879/AppData/Roaming/JetBrains/IntelliJIdea2020.2/scratches\scratch.g4 by ANTLR 4.8
        //�?种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类�?要包名，可以在这里统�?定义
    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scratchParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, Escape_sequence=26, BOOL_OP=27, ASSIGN=28, GETINT=29, GETDOUBLE=30, 
		GETCHAR=31, PUTINT=32, PUTDOUBLE=33, PUTCHAR=34, PUTSTR=35, PUTLN=36, 
		UINT=37, Char_literal=38, DOUBLE=39, IDENT=40, NO_COMMET=41, SL_COMMENT=42, 
		WS=43;
	public static final int
		RULE_program = 0, RULE_function_param = 1, RULE_function_param_list = 2, 
		RULE_function = 3, RULE_stmt = 4, RULE_expr_stmt = 5, RULE_decl_stmt = 6, 
		RULE_let_decl_stmt = 7, RULE_const_decl_stmt = 8, RULE_if_stmt = 9, RULE_while_stmt = 10, 
		RULE_block_stmt = 11, RULE_empty_stmt = 12, RULE_return_stmt = 13, RULE_expr = 14, 
		RULE_as_expr = 15, RULE_bool_expr = 16, RULE_ari_expr = 17, RULE_assign_expr = 18, 
		RULE_func_expr = 19, RULE_call_func = 20, RULE_call_stdlib = 21, RULE_str = 22, 
		RULE_character = 23, RULE_param = 24, RULE_item = 25, RULE_factor = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function_param", "function_param_list", "function", "stmt", 
			"expr_stmt", "decl_stmt", "let_decl_stmt", "const_decl_stmt", "if_stmt", 
			"while_stmt", "block_stmt", "empty_stmt", "return_stmt", "expr", "as_expr", 
			"bool_expr", "ari_expr", "assign_expr", "func_expr", "call_func", "call_stdlib", 
			"str", "character", "param", "item", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "':'", "'int'", "'double'", "','", "'fn'", "'('", "')'", 
			"'->'", "'void'", "';'", "'let'", "'if'", "'else'", "'while'", "'{'", 
			"'}'", "'return'", "'as'", "'+'", "'-'", "'\"'", "'\\'", "'*'", "'/'", 
			null, null, "'='", "'getint'", "'getdouble'", "'getchar'", "'putint'", 
			"'putdouble'", "'putchar'", "'putstr'", "'putln'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Escape_sequence", "BOOL_OP", "ASSIGN", "GETINT", "GETDOUBLE", 
			"GETCHAR", "PUTINT", "PUTDOUBLE", "PUTCHAR", "PUTSTR", "PUTLN", "UINT", 
			"Char_literal", "DOUBLE", "IDENT", "NO_COMMET", "SL_COMMENT", "WS"
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
	public String getGrammarFileName() { return "scratch.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public scratchParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Decl_stmtContext> decl_stmt() {
			return getRuleContexts(Decl_stmtContext.class);
		}
		public Decl_stmtContext decl_stmt(int i) {
			return getRuleContext(Decl_stmtContext.class,i);
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
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__11))) != 0)) {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__11:
					{
					setState(54);
					decl_stmt();
					}
					break;
				case T__5:
					{
					setState(55);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60);
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

	public static class Function_paramContext extends ParserRuleContext {
		public Token isConst;
		public Token ty;
		public TerminalNode IDENT() { return getToken(scratchParser.IDENT, 0); }
		public Function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterFunction_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitFunction_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitFunction_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_paramContext function_param() throws RecognitionException {
		Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(61);
				((Function_paramContext)_localctx).isConst = match(T__0);
				}
			}

			setState(64);
			match(IDENT);
			setState(65);
			match(T__1);
			setState(66);
			((Function_paramContext)_localctx).ty = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
				((Function_paramContext)_localctx).ty = (Token)_errHandler.recoverInline(this);
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

	public static class Function_param_listContext extends ParserRuleContext {
		public List<Function_paramContext> function_param() {
			return getRuleContexts(Function_paramContext.class);
		}
		public Function_paramContext function_param(int i) {
			return getRuleContext(Function_paramContext.class,i);
		}
		public Function_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterFunction_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitFunction_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitFunction_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_param_listContext function_param_list() throws RecognitionException {
		Function_param_listContext _localctx = new Function_param_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			function_param();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(69);
				match(T__4);
				setState(70);
				function_param();
				}
				}
				setState(75);
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
		public TerminalNode IDENT() { return getToken(scratchParser.IDENT, 0); }
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public Function_param_listContext function_param_list() {
			return getRuleContext(Function_param_listContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__5);
			setState(77);
			match(IDENT);
			setState(78);
			match(T__6);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==IDENT) {
				{
				setState(79);
				function_param_list();
				}
			}

			setState(82);
			match(T__7);
			setState(83);
			match(T__8);
			setState(84);
			((FunctionContext)_localctx).ty = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__9))) != 0)) ) {
				((FunctionContext)_localctx).ty = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(85);
			block_stmt();
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
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Decl_stmtContext decl_stmt() {
			return getRuleContext(Decl_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public Empty_stmtContext empty_stmt() {
			return getRuleContext(Empty_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
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
				setState(87);
				expr_stmt();
				}
				break;
			case T__0:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				decl_stmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				if_stmt();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				while_stmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				return_stmt();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				block_stmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				empty_stmt();
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

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			expr();
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

	public static class Decl_stmtContext extends ParserRuleContext {
		public Let_decl_stmtContext let_decl_stmt() {
			return getRuleContext(Let_decl_stmtContext.class,0);
		}
		public Const_decl_stmtContext const_decl_stmt() {
			return getRuleContext(Const_decl_stmtContext.class,0);
		}
		public Decl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterDecl_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitDecl_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitDecl_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_stmtContext decl_stmt() throws RecognitionException {
		Decl_stmtContext _localctx = new Decl_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl_stmt);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				let_decl_stmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				const_decl_stmt();
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

	public static class Let_decl_stmtContext extends ParserRuleContext {
		public Token ty;
		public TerminalNode IDENT() { return getToken(scratchParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(scratchParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Let_decl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_decl_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterLet_decl_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitLet_decl_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitLet_decl_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_decl_stmtContext let_decl_stmt() throws RecognitionException {
		Let_decl_stmtContext _localctx = new Let_decl_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_let_decl_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__11);
			setState(104);
			match(IDENT);
			setState(105);
			match(T__1);
			setState(106);
			((Let_decl_stmtContext)_localctx).ty = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
				((Let_decl_stmtContext)_localctx).ty = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(107);
				match(ASSIGN);
				setState(108);
				expr();
				}
			}

			setState(111);
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

	public static class Const_decl_stmtContext extends ParserRuleContext {
		public Token ty;
		public TerminalNode IDENT() { return getToken(scratchParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(scratchParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Const_decl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterConst_decl_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitConst_decl_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitConst_decl_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_decl_stmtContext const_decl_stmt() throws RecognitionException {
		Const_decl_stmtContext _localctx = new Const_decl_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_const_decl_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__0);
			setState(114);
			match(IDENT);
			setState(115);
			match(T__1);
			setState(116);
			((Const_decl_stmtContext)_localctx).ty = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
				((Const_decl_stmtContext)_localctx).ty = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(117);
			match(ASSIGN);
			setState(118);
			expr();
			setState(119);
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

	public static class If_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Block_stmtContext> block_stmt() {
			return getRuleContexts(Block_stmtContext.class);
		}
		public Block_stmtContext block_stmt(int i) {
			return getRuleContext(Block_stmtContext.class,i);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__12);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(122);
				match(T__6);
				}
				break;
			}
			setState(125);
			expr();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(126);
				match(T__7);
				}
			}

			setState(129);
			block_stmt();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(130);
				match(T__13);
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(131);
					block_stmt();
					}
					break;
				case T__12:
					{
					setState(132);
					if_stmt();
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

	public static class While_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__14);
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(138);
				match(T__6);
				}
				break;
			}
			setState(141);
			expr();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(142);
				match(T__7);
				}
			}

			setState(145);
			block_stmt();
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

	public static class Block_stmtContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterBlock_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitBlock_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitBlock_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_stmtContext block_stmt() throws RecognitionException {
		Block_stmtContext _localctx = new Block_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__15);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__20) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(148);
				stmt();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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

	public static class Empty_stmtContext extends ParserRuleContext {
		public Empty_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterEmpty_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitEmpty_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitEmpty_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_stmtContext empty_stmt() throws RecognitionException {
		Empty_stmtContext _localctx = new Empty_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_empty_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__17);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__20) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
				{
				setState(159);
				expr();
				}
			}

			setState(162);
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
		public Func_exprContext func_expr() {
			return getRuleContext(Func_exprContext.class,0);
		}
		public Ari_exprContext ari_expr() {
			return getRuleContext(Ari_exprContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				func_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				ari_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				assign_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				bool_expr();
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

	public static class As_exprContext extends ParserRuleContext {
		public Token ty;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public As_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterAs_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitAs_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitAs_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final As_exprContext as_expr() throws RecognitionException {
		As_exprContext _localctx = new As_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_as_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			expr();
			setState(171);
			match(T__18);
			setState(172);
			((As_exprContext)_localctx).ty = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
				((As_exprContext)_localctx).ty = (Token)_errHandler.recoverInline(this);
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

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode BOOL_OP() { return getToken(scratchParser.BOOL_OP, 0); }
		public List<Ari_exprContext> ari_expr() {
			return getRuleContexts(Ari_exprContext.class);
		}
		public Ari_exprContext ari_expr(int i) {
			return getRuleContext(Ari_exprContext.class,i);
		}
		public List<Func_exprContext> func_expr() {
			return getRuleContexts(Func_exprContext.class);
		}
		public Func_exprContext func_expr(int i) {
			return getRuleContext(Func_exprContext.class,i);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(174);
				ari_expr();
				}
				break;
			case 2:
				{
				setState(175);
				func_expr();
				}
				break;
			}
			setState(178);
			match(BOOL_OP);
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(179);
				ari_expr();
				}
				break;
			case 2:
				{
				setState(180);
				func_expr();
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

	public static class Ari_exprContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public Ari_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ari_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterAri_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitAri_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitAri_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ari_exprContext ari_expr() throws RecognitionException {
		Ari_exprContext _localctx = new Ari_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ari_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			item();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19 || _la==T__20) {
				{
				{
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				item();
				}
				}
				setState(190);
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

	public static class Assign_exprContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(scratchParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(scratchParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitAssign_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitAssign_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IDENT);
			setState(192);
			match(ASSIGN);
			setState(193);
			expr();
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

	public static class Func_exprContext extends ParserRuleContext {
		public Call_funcContext call_func() {
			return getRuleContext(Call_funcContext.class,0);
		}
		public Call_stdlibContext call_stdlib() {
			return getRuleContext(Call_stdlibContext.class,0);
		}
		public Func_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterFunc_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitFunc_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitFunc_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_exprContext func_expr() throws RecognitionException {
		Func_exprContext _localctx = new Func_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_func_expr);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				call_func();
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
				setState(196);
				call_stdlib();
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

	public static class Call_funcContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(scratchParser.IDENT, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Call_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterCall_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitCall_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitCall_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_funcContext call_func() throws RecognitionException {
		Call_funcContext _localctx = new Call_funcContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_call_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IDENT);
			setState(200);
			match(T__6);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__20) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
				{
				setState(201);
				param();
				}
			}

			setState(204);
			match(T__7);
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

	public static class Call_stdlibContext extends ParserRuleContext {
		public TerminalNode GETINT() { return getToken(scratchParser.GETINT, 0); }
		public TerminalNode GETDOUBLE() { return getToken(scratchParser.GETDOUBLE, 0); }
		public TerminalNode GETCHAR() { return getToken(scratchParser.GETCHAR, 0); }
		public TerminalNode PUTINT() { return getToken(scratchParser.PUTINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PUTDOUBLE() { return getToken(scratchParser.PUTDOUBLE, 0); }
		public TerminalNode PUTCHAR() { return getToken(scratchParser.PUTCHAR, 0); }
		public TerminalNode Char_literal() { return getToken(scratchParser.Char_literal, 0); }
		public TerminalNode UINT() { return getToken(scratchParser.UINT, 0); }
		public TerminalNode PUTSTR() { return getToken(scratchParser.PUTSTR, 0); }
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public TerminalNode PUTLN() { return getToken(scratchParser.PUTLN, 0); }
		public Call_stdlibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stdlib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterCall_stdlib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitCall_stdlib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitCall_stdlib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_stdlibContext call_stdlib() throws RecognitionException {
		Call_stdlibContext _localctx = new Call_stdlibContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_call_stdlib);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GETINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(GETINT);
				setState(207);
				match(T__6);
				setState(208);
				match(T__7);
				}
				break;
			case GETDOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(GETDOUBLE);
				setState(210);
				match(T__6);
				setState(211);
				match(T__7);
				}
				break;
			case GETCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(GETCHAR);
				setState(213);
				match(T__6);
				setState(214);
				match(T__7);
				}
				break;
			case PUTINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(PUTINT);
				setState(216);
				match(T__6);
				{
				setState(217);
				expr();
				}
				setState(218);
				match(T__7);
				}
				break;
			case PUTDOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				match(PUTDOUBLE);
				setState(221);
				match(T__6);
				{
				setState(222);
				expr();
				}
				setState(223);
				match(T__7);
				}
				break;
			case PUTCHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				match(PUTCHAR);
				setState(226);
				match(T__6);
				setState(227);
				_la = _input.LA(1);
				if ( !(_la==UINT || _la==Char_literal) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(228);
				match(T__7);
				}
				break;
			case PUTSTR:
				enterOuterAlt(_localctx, 7);
				{
				setState(229);
				match(PUTSTR);
				setState(230);
				match(T__6);
				{
				setState(231);
				str();
				}
				setState(232);
				match(T__7);
				}
				break;
			case PUTLN:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				match(PUTLN);
				setState(235);
				match(T__6);
				setState(236);
				match(T__7);
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
		public TerminalNode NO_COMMET() { return getToken(scratchParser.NO_COMMET, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_str);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(T__21);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << Escape_sequence) | (1L << BOOL_OP) | (1L << ASSIGN) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << Char_literal) | (1L << DOUBLE) | (1L << IDENT) | (1L << NO_COMMET) | (1L << SL_COMMENT) | (1L << WS))) != 0)) {
					{
					{
					setState(240);
					character();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(T__21);
				}
				break;
			case NO_COMMET:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
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
		public TerminalNode Escape_sequence() { return getToken(scratchParser.Escape_sequence, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_character);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(Escape_sequence);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				((CharacterContext)_localctx).cl = _input.LT(1);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__21 || _la==T__22) ) {
					((CharacterContext)_localctx).cl = (Token)_errHandler.recoverInline(this);
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

	public static class ParamContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			expr();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(255);
				match(T__4);
				setState(256);
				expr();
				}
				}
				setState(261);
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

	public static class ItemContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			factor();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23 || _la==T__24) {
				{
				{
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==T__24) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(264);
				factor();
				}
				}
				setState(269);
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

	public static class FactorContext extends ParserRuleContext {
		public Token nag;
		public TerminalNode IDENT() { return getToken(scratchParser.IDENT, 0); }
		public TerminalNode UINT() { return getToken(scratchParser.UINT, 0); }
		public TerminalNode DOUBLE() { return getToken(scratchParser.DOUBLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Func_exprContext func_expr() {
			return getRuleContext(Func_exprContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factor);
		int _la;
		try {
			int _alt;
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(270);
					((FactorContext)_localctx).nag = match(T__20);
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(276);
					match(IDENT);
					}
					break;
				case 2:
					{
					setState(277);
					match(UINT);
					}
					break;
				case 3:
					{
					setState(278);
					match(DOUBLE);
					}
					break;
				case 4:
					{
					setState(279);
					match(T__6);
					setState(280);
					expr();
					setState(281);
					match(T__7);
					}
					break;
				case 5:
					{
					setState(283);
					func_expr();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(286);
					((FactorContext)_localctx).nag = match(T__20);
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(292);
					match(IDENT);
					}
					break;
				case 2:
					{
					setState(293);
					match(UINT);
					}
					break;
				case 3:
					{
					setState(294);
					match(DOUBLE);
					}
					break;
				case 4:
					{
					setState(295);
					match(T__6);
					setState(296);
					expr();
					setState(297);
					match(T__7);
					}
					break;
				case 5:
					{
					setState(299);
					func_expr();
					}
					break;
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(302);
						match(T__18);
						setState(303);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u013a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\3\5\3"+
		"A\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\5\3\5\3\5"+
		"\3\5\5\5S\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6a\n\6"+
		"\3\7\3\7\3\7\3\b\3\b\5\bh\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13~\n\13\3\13\3\13\5\13\u0082"+
		"\n\13\3\13\3\13\3\13\3\13\5\13\u0088\n\13\5\13\u008a\n\13\3\f\3\f\5\f"+
		"\u008e\n\f\3\f\3\f\5\f\u0092\n\f\3\f\3\f\3\r\3\r\7\r\u0098\n\r\f\r\16"+
		"\r\u009b\13\r\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u00a3\n\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\5\20\u00ab\n\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22"+
		"\u00b3\n\22\3\22\3\22\3\22\5\22\u00b8\n\22\3\23\3\23\3\23\7\23\u00bd\n"+
		"\23\f\23\16\23\u00c0\13\23\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00c8\n"+
		"\25\3\26\3\26\3\26\5\26\u00cd\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f0"+
		"\n\27\3\30\3\30\7\30\u00f4\n\30\f\30\16\30\u00f7\13\30\3\30\3\30\5\30"+
		"\u00fb\n\30\3\31\3\31\5\31\u00ff\n\31\3\32\3\32\3\32\7\32\u0104\n\32\f"+
		"\32\16\32\u0107\13\32\3\33\3\33\3\33\7\33\u010c\n\33\f\33\16\33\u010f"+
		"\13\33\3\34\7\34\u0112\n\34\f\34\16\34\u0115\13\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u011f\n\34\3\34\7\34\u0122\n\34\f\34\16\34\u0125"+
		"\13\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u012f\n\34\3\34\3"+
		"\34\7\34\u0133\n\34\f\34\16\34\u0136\13\34\5\34\u0138\n\34\3\34\2\2\35"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\b\3\2\5"+
		"\6\4\2\5\6\f\f\3\2\26\27\3\2\'(\3\2\30\31\3\2\32\33\2\u0153\2<\3\2\2\2"+
		"\4@\3\2\2\2\6F\3\2\2\2\bN\3\2\2\2\n`\3\2\2\2\fb\3\2\2\2\16g\3\2\2\2\20"+
		"i\3\2\2\2\22s\3\2\2\2\24{\3\2\2\2\26\u008b\3\2\2\2\30\u0095\3\2\2\2\32"+
		"\u009e\3\2\2\2\34\u00a0\3\2\2\2\36\u00aa\3\2\2\2 \u00ac\3\2\2\2\"\u00b2"+
		"\3\2\2\2$\u00b9\3\2\2\2&\u00c1\3\2\2\2(\u00c7\3\2\2\2*\u00c9\3\2\2\2,"+
		"\u00ef\3\2\2\2.\u00fa\3\2\2\2\60\u00fe\3\2\2\2\62\u0100\3\2\2\2\64\u0108"+
		"\3\2\2\2\66\u0137\3\2\2\28;\5\16\b\29;\5\b\5\2:8\3\2\2\2:9\3\2\2\2;>\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=\3\3\2\2\2><\3\2\2\2?A\7\3\2\2@?\3\2\2\2@A"+
		"\3\2\2\2AB\3\2\2\2BC\7*\2\2CD\7\4\2\2DE\t\2\2\2E\5\3\2\2\2FK\5\4\3\2G"+
		"H\7\7\2\2HJ\5\4\3\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\7\3\2\2\2"+
		"MK\3\2\2\2NO\7\b\2\2OP\7*\2\2PR\7\t\2\2QS\5\6\4\2RQ\3\2\2\2RS\3\2\2\2"+
		"ST\3\2\2\2TU\7\n\2\2UV\7\13\2\2VW\t\3\2\2WX\5\30\r\2X\t\3\2\2\2Ya\5\f"+
		"\7\2Za\5\16\b\2[a\5\24\13\2\\a\5\26\f\2]a\5\34\17\2^a\5\30\r\2_a\5\32"+
		"\16\2`Y\3\2\2\2`Z\3\2\2\2`[\3\2\2\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3"+
		"\2\2\2a\13\3\2\2\2bc\5\36\20\2cd\7\r\2\2d\r\3\2\2\2eh\5\20\t\2fh\5\22"+
		"\n\2ge\3\2\2\2gf\3\2\2\2h\17\3\2\2\2ij\7\16\2\2jk\7*\2\2kl\7\4\2\2lo\t"+
		"\2\2\2mn\7\36\2\2np\5\36\20\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\r\2\2"+
		"r\21\3\2\2\2st\7\3\2\2tu\7*\2\2uv\7\4\2\2vw\t\2\2\2wx\7\36\2\2xy\5\36"+
		"\20\2yz\7\r\2\2z\23\3\2\2\2{}\7\17\2\2|~\7\t\2\2}|\3\2\2\2}~\3\2\2\2~"+
		"\177\3\2\2\2\177\u0081\5\36\20\2\u0080\u0082\7\n\2\2\u0081\u0080\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0089\5\30\r\2\u0084"+
		"\u0087\7\20\2\2\u0085\u0088\5\30\r\2\u0086\u0088\5\24\13\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0084\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\25\3\2\2\2\u008b\u008d\7\21\2\2\u008c\u008e\7\t\2"+
		"\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091"+
		"\5\36\20\2\u0090\u0092\7\n\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0094\5\30\r\2\u0094\27\3\2\2\2\u0095\u0099"+
		"\7\22\2\2\u0096\u0098\5\n\6\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009d\7\23\2\2\u009d\31\3\2\2\2\u009e\u009f\7\r\2\2\u009f"+
		"\33\3\2\2\2\u00a0\u00a2\7\24\2\2\u00a1\u00a3\5\36\20\2\u00a2\u00a1\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\r\2\2\u00a5"+
		"\35\3\2\2\2\u00a6\u00ab\5(\25\2\u00a7\u00ab\5$\23\2\u00a8\u00ab\5&\24"+
		"\2\u00a9\u00ab\5\"\22\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\37\3\2\2\2\u00ac\u00ad\5\36\20"+
		"\2\u00ad\u00ae\7\25\2\2\u00ae\u00af\t\2\2\2\u00af!\3\2\2\2\u00b0\u00b3"+
		"\5$\23\2\u00b1\u00b3\5(\25\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b7\7\35\2\2\u00b5\u00b8\5$\23\2\u00b6\u00b8\5"+
		"(\25\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8#\3\2\2\2\u00b9\u00be"+
		"\5\64\33\2\u00ba\u00bb\t\4\2\2\u00bb\u00bd\5\64\33\2\u00bc\u00ba\3\2\2"+
		"\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf%"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7*\2\2\u00c2\u00c3\7\36\2\2\u00c3"+
		"\u00c4\5\36\20\2\u00c4\'\3\2\2\2\u00c5\u00c8\5*\26\2\u00c6\u00c8\5,\27"+
		"\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8)\3\2\2\2\u00c9\u00ca"+
		"\7*\2\2\u00ca\u00cc\7\t\2\2\u00cb\u00cd\5\62\32\2\u00cc\u00cb\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\n\2\2\u00cf+\3"+
		"\2\2\2\u00d0\u00d1\7\37\2\2\u00d1\u00d2\7\t\2\2\u00d2\u00f0\7\n\2\2\u00d3"+
		"\u00d4\7 \2\2\u00d4\u00d5\7\t\2\2\u00d5\u00f0\7\n\2\2\u00d6\u00d7\7!\2"+
		"\2\u00d7\u00d8\7\t\2\2\u00d8\u00f0\7\n\2\2\u00d9\u00da\7\"\2\2\u00da\u00db"+
		"\7\t\2\2\u00db\u00dc\5\36\20\2\u00dc\u00dd\7\n\2\2\u00dd\u00f0\3\2\2\2"+
		"\u00de\u00df\7#\2\2\u00df\u00e0\7\t\2\2\u00e0\u00e1\5\36\20\2\u00e1\u00e2"+
		"\7\n\2\2\u00e2\u00f0\3\2\2\2\u00e3\u00e4\7$\2\2\u00e4\u00e5\7\t\2\2\u00e5"+
		"\u00e6\t\5\2\2\u00e6\u00f0\7\n\2\2\u00e7\u00e8\7%\2\2\u00e8\u00e9\7\t"+
		"\2\2\u00e9\u00ea\5.\30\2\u00ea\u00eb\7\n\2\2\u00eb\u00f0\3\2\2\2\u00ec"+
		"\u00ed\7&\2\2\u00ed\u00ee\7\t\2\2\u00ee\u00f0\7\n\2\2\u00ef\u00d0\3\2"+
		"\2\2\u00ef\u00d3\3\2\2\2\u00ef\u00d6\3\2\2\2\u00ef\u00d9\3\2\2\2\u00ef"+
		"\u00de\3\2\2\2\u00ef\u00e3\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00ec\3\2"+
		"\2\2\u00f0-\3\2\2\2\u00f1\u00f5\7\30\2\2\u00f2\u00f4\5\60\31\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\7\30\2\2\u00f9\u00fb\7"+
		"+\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb/\3\2\2\2\u00fc\u00ff"+
		"\7\34\2\2\u00fd\u00ff\n\6\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2"+
		"\u00ff\61\3\2\2\2\u0100\u0105\5\36\20\2\u0101\u0102\7\7\2\2\u0102\u0104"+
		"\5\36\20\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2"+
		"\u0105\u0106\3\2\2\2\u0106\63\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010d"+
		"\5\66\34\2\u0109\u010a\t\7\2\2\u010a\u010c\5\66\34\2\u010b\u0109\3\2\2"+
		"\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\65"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\7\27\2\2\u0111\u0110\3\2\2\2"+
		"\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u011e"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011f\7*\2\2\u0117\u011f\7\'\2\2\u0118"+
		"\u011f\7)\2\2\u0119\u011a\7\t\2\2\u011a\u011b\5\36\20\2\u011b\u011c\7"+
		"\n\2\2\u011c\u011f\3\2\2\2\u011d\u011f\5(\25\2\u011e\u0116\3\2\2\2\u011e"+
		"\u0117\3\2\2\2\u011e\u0118\3\2\2\2\u011e\u0119\3\2\2\2\u011e\u011d\3\2"+
		"\2\2\u011f\u0138\3\2\2\2\u0120\u0122\7\27\2\2\u0121\u0120\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u012e\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0126\u012f\7*\2\2\u0127\u012f\7\'\2\2\u0128"+
		"\u012f\7)\2\2\u0129\u012a\7\t\2\2\u012a\u012b\5\36\20\2\u012b\u012c\7"+
		"\n\2\2\u012c\u012f\3\2\2\2\u012d\u012f\5(\25\2\u012e\u0126\3\2\2\2\u012e"+
		"\u0127\3\2\2\2\u012e\u0128\3\2\2\2\u012e\u0129\3\2\2\2\u012e\u012d\3\2"+
		"\2\2\u012f\u0134\3\2\2\2\u0130\u0131\7\25\2\2\u0131\u0133\t\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0113\3\2\2\2\u0137"+
		"\u0123\3\2\2\2\u0138\67\3\2\2\2$:<@KR`go}\u0081\u0087\u0089\u008d\u0091"+
		"\u0099\u00a2\u00aa\u00b2\u00b7\u00be\u00c7\u00cc\u00ef\u00f5\u00fa\u00fe"+
		"\u0105\u010d\u0113\u011e\u0123\u012e\u0134\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}