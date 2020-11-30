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
		T__24=25, Escape_sequence=26, BOOL_OP=27, ASSIGN=28, VARTYPE=29, GETINT=30, 
		GETDOUBLE=31, GETCHAR=32, PUTINT=33, PUTDOUBLE=34, PUTCHAR=35, PUTSTR=36, 
		PUTLN=37, UINT=38, DOUBLE=39, IDENT=40, SL_COMMENT=41, WS=42;
	public static final int
		RULE_program = 0, RULE_function_param = 1, RULE_function_param_list = 2, 
		RULE_function = 3, RULE_stmt = 4, RULE_expr_stmt = 5, RULE_let_decl_stmt = 6, 
		RULE_const_decl_stmt = 7, RULE_decl_stmt = 8, RULE_if_stmt = 9, RULE_while_stmt = 10, 
		RULE_block_stmt = 11, RULE_empty_stmt = 12, RULE_return_stmt = 13, RULE_expr = 14, 
		RULE_ari_expr = 15, RULE_assign_expr = 16, RULE_func_expr = 17, RULE_call_func = 18, 
		RULE_call_stdlib = 19, RULE_str = 20, RULE_character = 21, RULE_char_literal = 22, 
		RULE_param = 23, RULE_item = 24, RULE_factor = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function_param", "function_param_list", "function", "stmt", 
			"expr_stmt", "let_decl_stmt", "const_decl_stmt", "decl_stmt", "if_stmt", 
			"while_stmt", "block_stmt", "empty_stmt", "return_stmt", "expr", "ari_expr", 
			"assign_expr", "func_expr", "call_func", "call_stdlib", "str", "character", 
			"char_literal", "param", "item", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "':'", "','", "'fn'", "'('", "')'", "'->'", "'int'", 
			"'void'", "'double'", "';'", "'let'", "'if'", "'else'", "'while'", "'{'", 
			"'}'", "'return'", "'+'", "'-'", "'\"'", "'\\'", "'''", "'*'", "'/'", 
			null, null, "'='", null, "'getint'", "'getdouble'", "'getchar'", "'putint'", 
			"'putdouble'", "'putchar'", "'putstr'", "'putln'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Escape_sequence", "BOOL_OP", "ASSIGN", "VARTYPE", "GETINT", 
			"GETDOUBLE", "GETCHAR", "PUTINT", "PUTDOUBLE", "PUTCHAR", "PUTSTR", "PUTLN", 
			"UINT", "DOUBLE", "IDENT", "SL_COMMENT", "WS"
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
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11))) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__11:
					{
					setState(52);
					decl_stmt();
					}
					break;
				case T__3:
					{
					setState(53);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58);
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
		public TerminalNode IDENT() { return getToken(scratchParser.IDENT, 0); }
		public TerminalNode VARTYPE() { return getToken(scratchParser.VARTYPE, 0); }
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
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(59);
				match(T__0);
				}
			}

			setState(62);
			match(IDENT);
			setState(63);
			match(T__1);
			setState(64);
			match(VARTYPE);
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
			setState(66);
			function_param();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(67);
				match(T__2);
				setState(68);
				function_param();
				}
				}
				setState(73);
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
			setState(74);
			match(T__3);
			setState(75);
			match(IDENT);
			setState(76);
			match(T__4);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==IDENT) {
				{
				setState(77);
				function_param_list();
				}
			}

			setState(80);
			match(T__5);
			setState(81);
			match(T__6);
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(83);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__18:
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
				setState(85);
				expr_stmt();
				}
				break;
			case T__0:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				decl_stmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				if_stmt();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				while_stmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				return_stmt();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				block_stmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
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
			setState(94);
			expr();
			setState(95);
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

	public static class Let_decl_stmtContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(scratchParser.IDENT, 0); }
		public TerminalNode VARTYPE() { return getToken(scratchParser.VARTYPE, 0); }
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
		enterRule(_localctx, 12, RULE_let_decl_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__11);
			setState(98);
			match(IDENT);
			setState(99);
			match(T__1);
			setState(100);
			match(VARTYPE);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(101);
				match(ASSIGN);
				setState(102);
				expr();
				}
			}

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

	public static class Const_decl_stmtContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(scratchParser.IDENT, 0); }
		public TerminalNode VARTYPE() { return getToken(scratchParser.VARTYPE, 0); }
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
		enterRule(_localctx, 14, RULE_const_decl_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__0);
			setState(108);
			match(IDENT);
			setState(109);
			match(T__1);
			setState(110);
			match(VARTYPE);
			setState(111);
			match(ASSIGN);
			setState(112);
			expr();
			setState(113);
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
		enterRule(_localctx, 16, RULE_decl_stmt);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				let_decl_stmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
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
			setState(119);
			match(T__12);
			setState(120);
			expr();
			setState(121);
			block_stmt();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(122);
				match(T__13);
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(123);
					block_stmt();
					}
					break;
				case T__12:
					{
					setState(124);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__14);
			setState(130);
			expr();
			setState(131);
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
			setState(133);
			match(T__15);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
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
			setState(144);
			match(T__17);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
				{
				setState(145);
				expr();
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
		public List<TerminalNode> BOOL_OP() { return getTokens(scratchParser.BOOL_OP); }
		public TerminalNode BOOL_OP(int i) {
			return getToken(scratchParser.BOOL_OP, i);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
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
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(150);
					ari_expr();
					}
					break;
				case 2:
					{
					setState(151);
					func_expr();
					}
					break;
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOL_OP) {
					{
					{
					setState(154);
					match(BOOL_OP);
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(155);
						ari_expr();
						}
						break;
					case 2:
						{
						setState(156);
						func_expr();
						}
						break;
					}
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				assign_expr();
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
		enterRule(_localctx, 30, RULE_ari_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			item();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18 || _la==T__19) {
				{
				{
				setState(168);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(169);
				item();
				}
				}
				setState(174);
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
		enterRule(_localctx, 32, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(IDENT);
			setState(176);
			match(ASSIGN);
			setState(177);
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
		enterRule(_localctx, 34, RULE_func_expr);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
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
				setState(180);
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
		enterRule(_localctx, 36, RULE_call_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(IDENT);
			setState(184);
			match(T__4);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT))) != 0)) {
				{
				setState(185);
				param();
				}
			}

			setState(188);
			match(T__5);
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
		enterRule(_localctx, 38, RULE_call_stdlib);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GETINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(GETINT);
				setState(191);
				match(T__4);
				setState(192);
				match(T__5);
				}
				break;
			case GETDOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(GETDOUBLE);
				setState(194);
				match(T__4);
				setState(195);
				match(T__5);
				}
				break;
			case GETCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(GETCHAR);
				setState(197);
				match(T__4);
				setState(198);
				match(T__5);
				}
				break;
			case PUTINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				match(PUTINT);
				setState(200);
				match(T__4);
				{
				setState(201);
				expr();
				}
				setState(202);
				match(T__5);
				}
				break;
			case PUTDOUBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				match(PUTDOUBLE);
				setState(205);
				match(T__4);
				{
				setState(206);
				expr();
				}
				setState(207);
				match(T__5);
				}
				break;
			case PUTCHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				match(PUTCHAR);
				setState(210);
				match(T__4);
				{
				setState(211);
				expr();
				}
				setState(212);
				match(T__5);
				}
				break;
			case PUTSTR:
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				match(PUTSTR);
				setState(215);
				match(T__4);
				{
				setState(216);
				str();
				}
				setState(217);
				match(T__5);
				}
				break;
			case PUTLN:
				enterOuterAlt(_localctx, 8);
				{
				setState(219);
				match(PUTLN);
				setState(220);
				match(T__4);
				setState(221);
				match(T__5);
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
		enterRule(_localctx, 40, RULE_str);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__20);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << Escape_sequence) | (1L << BOOL_OP) | (1L << ASSIGN) | (1L << VARTYPE) | (1L << GETINT) | (1L << GETDOUBLE) | (1L << GETCHAR) | (1L << PUTINT) | (1L << PUTDOUBLE) | (1L << PUTCHAR) | (1L << PUTSTR) | (1L << PUTLN) | (1L << UINT) | (1L << DOUBLE) | (1L << IDENT) | (1L << SL_COMMENT) | (1L << WS))) != 0)) {
				{
				{
				setState(225);
				character();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(T__20);
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
		enterRule(_localctx, 42, RULE_character);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(Escape_sequence);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
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

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode Escape_sequence() { return getToken(scratchParser.Escape_sequence, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scratchListener ) ((scratchListener)listener).exitChar_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scratchVisitor ) return ((scratchVisitor<? extends T>)visitor).visitChar_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_char_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__22);
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(238);
				match(Escape_sequence);
				}
				break;
			case 2:
				{
				setState(239);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__21 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(242);
			match(T__22);
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
		enterRule(_localctx, 46, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			expr();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(245);
				match(T__2);
				setState(246);
				expr();
				}
				}
				setState(251);
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
		enterRule(_localctx, 48, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			factor();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23 || _la==T__24) {
				{
				{
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==T__24) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(254);
				factor();
				}
				}
				setState(259);
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
		enterRule(_localctx, 50, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18 || _la==T__19) {
				{
				setState(260);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(263);
				match(IDENT);
				}
				break;
			case 2:
				{
				setState(264);
				match(UINT);
				}
				break;
			case 3:
				{
				setState(265);
				match(DOUBLE);
				}
				break;
			case 4:
				{
				setState(266);
				match(T__4);
				setState(267);
				expr();
				setState(268);
				match(T__5);
				}
				break;
			case 5:
				{
				setState(270);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0114\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\3\5\3?\n\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\5\3\5\3\5\3\5\5\5Q"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bj\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\5\nx\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0080\n\13"+
		"\5\13\u0082\n\13\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u008a\n\r\f\r\16\r\u008d"+
		"\13\r\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u0095\n\17\3\17\3\17\3\20\3\20"+
		"\5\20\u009b\n\20\3\20\3\20\3\20\5\20\u00a0\n\20\7\20\u00a2\n\20\f\20\16"+
		"\20\u00a5\13\20\3\20\5\20\u00a8\n\20\3\21\3\21\3\21\7\21\u00ad\n\21\f"+
		"\21\16\21\u00b0\13\21\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00b8\n\23\3"+
		"\24\3\24\3\24\5\24\u00bd\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e1"+
		"\n\25\3\26\3\26\7\26\u00e5\n\26\f\26\16\26\u00e8\13\26\3\26\3\26\3\27"+
		"\3\27\5\27\u00ee\n\27\3\30\3\30\3\30\5\30\u00f3\n\30\3\30\3\30\3\31\3"+
		"\31\3\31\7\31\u00fa\n\31\f\31\16\31\u00fd\13\31\3\32\3\32\3\32\7\32\u0102"+
		"\n\32\f\32\16\32\u0105\13\32\3\33\5\33\u0108\n\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0112\n\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\7\3\2\n\f\3\2\25\26\3\2\27\30\3"+
		"\2\30\31\3\2\32\33\2\u0123\2:\3\2\2\2\4>\3\2\2\2\6D\3\2\2\2\bL\3\2\2\2"+
		"\n^\3\2\2\2\f`\3\2\2\2\16c\3\2\2\2\20m\3\2\2\2\22w\3\2\2\2\24y\3\2\2\2"+
		"\26\u0083\3\2\2\2\30\u0087\3\2\2\2\32\u0090\3\2\2\2\34\u0092\3\2\2\2\36"+
		"\u00a7\3\2\2\2 \u00a9\3\2\2\2\"\u00b1\3\2\2\2$\u00b7\3\2\2\2&\u00b9\3"+
		"\2\2\2(\u00e0\3\2\2\2*\u00e2\3\2\2\2,\u00ed\3\2\2\2.\u00ef\3\2\2\2\60"+
		"\u00f6\3\2\2\2\62\u00fe\3\2\2\2\64\u0107\3\2\2\2\669\5\22\n\2\679\5\b"+
		"\5\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\3\3\2\2\2"+
		"<:\3\2\2\2=?\7\3\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7*\2\2AB\7\4\2\2"+
		"BC\7\37\2\2C\5\3\2\2\2DI\5\4\3\2EF\7\5\2\2FH\5\4\3\2GE\3\2\2\2HK\3\2\2"+
		"\2IG\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2KI\3\2\2\2LM\7\6\2\2MN\7*\2\2NP\7\7\2"+
		"\2OQ\5\6\4\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\b\2\2ST\7\t\2\2TU\t\2\2"+
		"\2UV\5\30\r\2V\t\3\2\2\2W_\5\f\7\2X_\5\22\n\2Y_\5\24\13\2Z_\5\26\f\2["+
		"_\5\34\17\2\\_\5\30\r\2]_\5\32\16\2^W\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3"+
		"\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\13\3\2\2\2`a\5\36\20\2ab\7\r\2"+
		"\2b\r\3\2\2\2cd\7\16\2\2de\7*\2\2ef\7\4\2\2fi\7\37\2\2gh\7\36\2\2hj\5"+
		"\36\20\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\r\2\2l\17\3\2\2\2mn\7\3\2\2"+
		"no\7*\2\2op\7\4\2\2pq\7\37\2\2qr\7\36\2\2rs\5\36\20\2st\7\r\2\2t\21\3"+
		"\2\2\2ux\5\16\b\2vx\5\20\t\2wu\3\2\2\2wv\3\2\2\2x\23\3\2\2\2yz\7\17\2"+
		"\2z{\5\36\20\2{\u0081\5\30\r\2|\177\7\20\2\2}\u0080\5\30\r\2~\u0080\5"+
		"\24\13\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0082\3\2\2\2\u0081|\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\25\3\2\2\2\u0083\u0084\7\21\2\2\u0084\u0085"+
		"\5\36\20\2\u0085\u0086\5\30\r\2\u0086\27\3\2\2\2\u0087\u008b\7\22\2\2"+
		"\u0088\u008a\5\n\6\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\7\23\2\2\u008f\31\3\2\2\2\u0090\u0091\7\r\2\2\u0091\33\3\2\2\2"+
		"\u0092\u0094\7\24\2\2\u0093\u0095\5\36\20\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\r\2\2\u0097\35\3\2\2"+
		"\2\u0098\u009b\5 \21\2\u0099\u009b\5$\23\2\u009a\u0098\3\2\2\2\u009a\u0099"+
		"\3\2\2\2\u009b\u00a3\3\2\2\2\u009c\u009f\7\35\2\2\u009d\u00a0\5 \21\2"+
		"\u009e\u00a0\5$\23\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a2"+
		"\3\2\2\2\u00a1\u009c\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\5\""+
		"\22\2\u00a7\u009a\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\37\3\2\2\2\u00a9\u00ae"+
		"\5\62\32\2\u00aa\u00ab\t\3\2\2\u00ab\u00ad\5\62\32\2\u00ac\u00aa\3\2\2"+
		"\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af!"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7*\2\2\u00b2\u00b3\7\36\2\2\u00b3"+
		"\u00b4\5\36\20\2\u00b4#\3\2\2\2\u00b5\u00b8\5&\24\2\u00b6\u00b8\5(\25"+
		"\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8%\3\2\2\2\u00b9\u00ba"+
		"\7*\2\2\u00ba\u00bc\7\7\2\2\u00bb\u00bd\5\60\31\2\u00bc\u00bb\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\b\2\2\u00bf\'\3"+
		"\2\2\2\u00c0\u00c1\7 \2\2\u00c1\u00c2\7\7\2\2\u00c2\u00e1\7\b\2\2\u00c3"+
		"\u00c4\7!\2\2\u00c4\u00c5\7\7\2\2\u00c5\u00e1\7\b\2\2\u00c6\u00c7\7\""+
		"\2\2\u00c7\u00c8\7\7\2\2\u00c8\u00e1\7\b\2\2\u00c9\u00ca\7#\2\2\u00ca"+
		"\u00cb\7\7\2\2\u00cb\u00cc\5\36\20\2\u00cc\u00cd\7\b\2\2\u00cd\u00e1\3"+
		"\2\2\2\u00ce\u00cf\7$\2\2\u00cf\u00d0\7\7\2\2\u00d0\u00d1\5\36\20\2\u00d1"+
		"\u00d2\7\b\2\2\u00d2\u00e1\3\2\2\2\u00d3\u00d4\7%\2\2\u00d4\u00d5\7\7"+
		"\2\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\7\b\2\2\u00d7\u00e1\3\2\2\2\u00d8"+
		"\u00d9\7&\2\2\u00d9\u00da\7\7\2\2\u00da\u00db\5*\26\2\u00db\u00dc\7\b"+
		"\2\2\u00dc\u00e1\3\2\2\2\u00dd\u00de\7\'\2\2\u00de\u00df\7\7\2\2\u00df"+
		"\u00e1\7\b\2\2\u00e0\u00c0\3\2\2\2\u00e0\u00c3\3\2\2\2\u00e0\u00c6\3\2"+
		"\2\2\u00e0\u00c9\3\2\2\2\u00e0\u00ce\3\2\2\2\u00e0\u00d3\3\2\2\2\u00e0"+
		"\u00d8\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e1)\3\2\2\2\u00e2\u00e6\7\27\2\2"+
		"\u00e3\u00e5\5,\27\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ea\7\27\2\2\u00ea+\3\2\2\2\u00eb\u00ee\7\34\2\2\u00ec\u00ee\n\4\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee-\3\2\2\2\u00ef\u00f2"+
		"\7\31\2\2\u00f0\u00f3\7\34\2\2\u00f1\u00f3\n\5\2\2\u00f2\u00f0\3\2\2\2"+
		"\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5"+
		"\7\31\2\2\u00f5/\3\2\2\2\u00f6\u00fb\5\36\20\2\u00f7\u00f8\7\5\2\2\u00f8"+
		"\u00fa\5\36\20\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\61\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u0103\5\64\33\2\u00ff\u0100\t\6\2\2\u0100\u0102\5\64\33\2\u0101\u00ff"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\63\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\t\3\2\2\u0107\u0106\3\2\2"+
		"\2\u0107\u0108\3\2\2\2\u0108\u0111\3\2\2\2\u0109\u0112\7*\2\2\u010a\u0112"+
		"\7(\2\2\u010b\u0112\7)\2\2\u010c\u010d\7\7\2\2\u010d\u010e\5\36\20\2\u010e"+
		"\u010f\7\b\2\2\u010f\u0112\3\2\2\2\u0110\u0112\5$\23\2\u0111\u0109\3\2"+
		"\2\2\u0111\u010a\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010c\3\2\2\2\u0111"+
		"\u0110\3\2\2\2\u0112\65\3\2\2\2\358:>IP^iw\177\u0081\u008b\u0094\u009a"+
		"\u009f\u00a3\u00a7\u00ae\u00b7\u00bc\u00e0\u00e6\u00ed\u00f2\u00fb\u0103"+
		"\u0107\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}