// Generated from C:/Users/34879/AppData/Roaming/JetBrains/IntelliJIdea2020.2/scratches\scratch.g4 by ANTLR 4.8
        //�?种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类�?要包名，可以在这里统�?定义
    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scratchLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"Escape_sequence", "BOOL_OP", "ASSIGN", "GETINT", "GETDOUBLE", "GETCHAR", 
			"PUTINT", "PUTDOUBLE", "PUTCHAR", "PUTSTR", "PUTLN", "UINT", "Char_literal", 
			"DOUBLE", "IDENT", "NO_COMMET", "SL_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "':'", "'int'", "'double'", "','", "'fn'", "'('", "')'", 
			"'->'", "'void'", "';'", "'let'", "'if'", "'else'", "'while'", "'{'", 
			"'}'", "'return'", "'+'", "'-'", "'\"'", "'\\'", "'*'", "'/'", "'as'", 
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


	public scratchLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "scratch.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0158\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u00b9\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u00c4\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\6"+
		"&\u0108\n&\r&\16&\u0109\3&\5&\u010d\n&\3\'\3\'\3\'\5\'\u0112\n\'\3\'\3"+
		"\'\3(\6(\u0117\n(\r(\16(\u0118\3(\3(\6(\u011d\n(\r(\16(\u011e\3(\3(\5"+
		"(\u0123\n(\3(\6(\u0126\n(\r(\16(\u0127\5(\u012a\n(\3)\3)\7)\u012e\n)\f"+
		")\16)\u0131\13)\3*\3*\7*\u0135\n*\f*\16*\u0138\13*\3*\3*\3*\3*\7*\u013e"+
		"\n*\f*\16*\u0141\13*\3*\3*\3+\3+\3+\3+\7+\u0149\n+\f+\16+\u014c\13+\3"+
		"+\3+\3+\3+\3,\6,\u0153\n,\r,\16,\u0154\3,\3,\5\u0136\u013f\u014a\2-\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\n\4\2>>@@\3\2\62;\4\2))^^\4\2GGgg\4"+
		"\2--//\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u016f\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\3Y\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2\te\3\2\2\2\13l\3\2\2\2\rn\3"+
		"\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25x\3\2\2\2\27}\3\2\2\2\31"+
		"\177\3\2\2\2\33\u0083\3\2\2\2\35\u0086\3\2\2\2\37\u008b\3\2\2\2!\u0091"+
		"\3\2\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u009c\3\2\2\2)\u009e\3\2\2\2"+
		"+\u00a0\3\2\2\2-\u00a2\3\2\2\2/\u00a4\3\2\2\2\61\u00a6\3\2\2\2\63\u00a8"+
		"\3\2\2\2\65\u00b8\3\2\2\2\67\u00c3\3\2\2\29\u00c5\3\2\2\2;\u00c7\3\2\2"+
		"\2=\u00ce\3\2\2\2?\u00d8\3\2\2\2A\u00e0\3\2\2\2C\u00e7\3\2\2\2E\u00f1"+
		"\3\2\2\2G\u00f9\3\2\2\2I\u0100\3\2\2\2K\u010c\3\2\2\2M\u010e\3\2\2\2O"+
		"\u0116\3\2\2\2Q\u012b\3\2\2\2S\u0132\3\2\2\2U\u0144\3\2\2\2W\u0152\3\2"+
		"\2\2YZ\7e\2\2Z[\7q\2\2[\\\7p\2\2\\]\7u\2\2]^\7v\2\2^\4\3\2\2\2_`\7<\2"+
		"\2`\6\3\2\2\2ab\7k\2\2bc\7p\2\2cd\7v\2\2d\b\3\2\2\2ef\7f\2\2fg\7q\2\2"+
		"gh\7w\2\2hi\7d\2\2ij\7n\2\2jk\7g\2\2k\n\3\2\2\2lm\7.\2\2m\f\3\2\2\2no"+
		"\7h\2\2op\7p\2\2p\16\3\2\2\2qr\7*\2\2r\20\3\2\2\2st\7+\2\2t\22\3\2\2\2"+
		"uv\7/\2\2vw\7@\2\2w\24\3\2\2\2xy\7x\2\2yz\7q\2\2z{\7k\2\2{|\7f\2\2|\26"+
		"\3\2\2\2}~\7=\2\2~\30\3\2\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081"+
		"\u0082\7v\2\2\u0082\32\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7h\2\2\u0085"+
		"\34\3\2\2\2\u0086\u0087\7g\2\2\u0087\u0088\7n\2\2\u0088\u0089\7u\2\2\u0089"+
		"\u008a\7g\2\2\u008a\36\3\2\2\2\u008b\u008c\7y\2\2\u008c\u008d\7j\2\2\u008d"+
		"\u008e\7k\2\2\u008e\u008f\7n\2\2\u008f\u0090\7g\2\2\u0090 \3\2\2\2\u0091"+
		"\u0092\7}\2\2\u0092\"\3\2\2\2\u0093\u0094\7\177\2\2\u0094$\3\2\2\2\u0095"+
		"\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098\7v\2\2\u0098\u0099\7w\2\2"+
		"\u0099\u009a\7t\2\2\u009a\u009b\7p\2\2\u009b&\3\2\2\2\u009c\u009d\7-\2"+
		"\2\u009d(\3\2\2\2\u009e\u009f\7/\2\2\u009f*\3\2\2\2\u00a0\u00a1\7$\2\2"+
		"\u00a1,\3\2\2\2\u00a2\u00a3\7^\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7,\2\2\u00a5"+
		"\60\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\7c\2\2\u00a9"+
		"\u00aa\7u\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\7^\2\2\u00ac\u00b9\7p\2\2\u00ad"+
		"\u00ae\7^\2\2\u00ae\u00b9\7t\2\2\u00af\u00b0\7^\2\2\u00b0\u00b9\7v\2\2"+
		"\u00b1\u00b2\7^\2\2\u00b2\u00b9\7^\2\2\u00b3\u00b4\7^\2\2\u00b4\u00b9"+
		"\7$\2\2\u00b5\u00b6\7^\2\2\u00b6\u00b9\7)\2\2\u00b7\u00b9\7#\2\2\u00b8"+
		"\u00ab\3\2\2\2\u00b8\u00ad\3\2\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b1\3\2"+
		"\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\66\3\2\2\2\u00ba\u00c4\t\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00c4\7?\2\2"+
		"\u00bd\u00be\7>\2\2\u00be\u00c4\7?\2\2\u00bf\u00c0\7?\2\2\u00c0\u00c4"+
		"\7?\2\2\u00c1\u00c2\7#\2\2\u00c2\u00c4\7?\2\2\u00c3\u00ba\3\2\2\2\u00c3"+
		"\u00bb\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c48\3\2\2\2\u00c5\u00c6\7?\2\2\u00c6:\3\2\2\2\u00c7\u00c8\7i\2"+
		"\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc"+
		"\7p\2\2\u00cc\u00cd\7v\2\2\u00cd<\3\2\2\2\u00ce\u00cf\7i\2\2\u00cf\u00d0"+
		"\7g\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7w\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7>\3\2\2\2\u00d8\u00d9\7i\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7v\2"+
		"\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7c\2\2\u00de\u00df"+
		"\7t\2\2\u00df@\3\2\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3"+
		"\7v\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7v\2\2\u00e6"+
		"B\3\2\2\2\u00e7\u00e8\7r\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7v\2\2\u00ea"+
		"\u00eb\7f\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7d\2\2"+
		"\u00ee\u00ef\7n\2\2\u00ef\u00f0\7g\2\2\u00f0D\3\2\2\2\u00f1\u00f2\7r\2"+
		"\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6"+
		"\7j\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7t\2\2\u00f8F\3\2\2\2\u00f9\u00fa"+
		"\7r\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7u\2\2\u00fd"+
		"\u00fe\7v\2\2\u00fe\u00ff\7t\2\2\u00ffH\3\2\2\2\u0100\u0101\7r\2\2\u0101"+
		"\u0102\7w\2\2\u0102\u0103\7v\2\2\u0103\u0104\7n\2\2\u0104\u0105\7p\2\2"+
		"\u0105J\3\2\2\2\u0106\u0108\t\3\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u010d\5M\'\2\u010c\u0107\3\2\2\2\u010c\u010b\3\2\2\2\u010dL\3\2\2\2\u010e"+
		"\u0111\7)\2\2\u010f\u0112\5\65\33\2\u0110\u0112\n\4\2\2\u0111\u010f\3"+
		"\2\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\7)\2\2\u0114N\3\2\2\2\u0115\u0117\t\3\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011c\7\60\2\2\u011b\u011d\t\3\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0129\3\2"+
		"\2\2\u0120\u0122\t\5\2\2\u0121\u0123\t\6\2\2\u0122\u0121\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0126\t\3\2\2\u0125\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012a\3\2\2\2\u0129\u0120\3\2\2\2\u0129\u012a\3\2\2\2\u012aP\3\2\2\2"+
		"\u012b\u012f\t\7\2\2\u012c\u012e\t\b\2\2\u012d\u012c\3\2\2\2\u012e\u0131"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130R\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0136\7$\2\2\u0133\u0135\13\2\2\2\u0134\u0133\3\2"+
		"\2\2\u0135\u0138\3\2\2\2\u0136\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\61\2\2\u013a\u013b\7"+
		"\61\2\2\u013b\u013f\3\2\2\2\u013c\u013e\13\2\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7$\2\2\u0143T\3\2\2\2\u0144\u0145"+
		"\7\61\2\2\u0145\u0146\7\61\2\2\u0146\u014a\3\2\2\2\u0147\u0149\13\2\2"+
		"\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u014b\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\f\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\b+\2\2\u0150V\3\2\2\2\u0151\u0153\t\t\2\2\u0152"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0157\b,\2\2\u0157X\3\2\2\2\22\2\u00b8"+
		"\u00c3\u0109\u010c\u0111\u0118\u011e\u0122\u0127\u0129\u012f\u0136\u013f"+
		"\u014a\u0154\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}