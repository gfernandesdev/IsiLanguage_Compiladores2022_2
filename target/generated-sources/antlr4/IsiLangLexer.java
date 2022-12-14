// Generated from IsiLang.g4 by ANTLR 4.4

	import br.com.compiladores.isilanguage.datastructures.IsiSymbol;
	import br.com.compiladores.isilanguage.datastructures.IsiVariable;
	import br.com.compiladores.isilanguage.datastructures.IsiSymbolTable;
	import br.com.compiladores.isilanguage.exceptions.IsiSemanticException;
	import br.com.compiladores.isilanguage.exceptions.IsiWarning;
	import br.com.compiladores.isilanguage.ast.IsiProgram;
	import br.com.compiladores.isilanguage.ast.AbstractCommand;
	import br.com.compiladores.isilanguage.ast.CommandLeitura;
	import br.com.compiladores.isilanguage.ast.CommandEscrita;
	import br.com.compiladores.isilanguage.ast.CommandAtribuicao;
	import br.com.compiladores.isilanguage.ast.CommandDecisao;
	import br.com.compiladores.isilanguage.ast.CommandLaco;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		AP=10, FP=11, SC=12, OP=13, ATTR=14, VIR=15, ACH=16, FCH=17, OPREL=18, 
		ID=19, NUMBER=20, TEXTO=21, WS=22, INTEGER=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", "ID", "NUMBER", 
		"TEXTO", "WS", "INTEGER"
	};


		private int _tipo;
		private String _varName;
		private String _varValue;
		private IsiSymbolTable symbolTable = new IsiSymbolTable();
		private IsiSymbolTable symbolTableWar = new IsiSymbolTable();
		private IsiSymbol symbol;
		private IsiProgram program = new IsiProgram();
		private ArrayList<AbstractCommand> curThread;
		private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
		private String _readID;
		private String _writeID;
		private String _exprID;
		private String _exprContent;
		private String _exprDecision;
		private ArrayList<AbstractCommand> listaTrue;
		private ArrayList<AbstractCommand> listaFalse;
		
		public void verificaID(String id){
			if (!symbolTable.exists(id)){
				throw new IsiSemanticException("Symbol "+id+" not declared");
			}
			else{
				symbolTableWar.drop(id);
			}
		}
		
		public void exibeComandos(){
			for (AbstractCommand c: program.getComandos()){
				System.out.println(c);
			}
		}
		
		public void generateCode(){
			program.generateTarget();
		}
		
		public void exibeWarnings() {
			for (IsiSymbol is: symbolTableWar.getMap()) {
				System.out.println("Simbolo " + is.getName() + "declarado mas nao utilizado");
			}
		}


	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0089\n\23\3\24\3\24\7\24\u008d\n\24\f\24\16\24\u0090"+
		"\13\24\3\25\6\25\u0093\n\25\r\25\16\25\u0094\3\25\3\25\6\25\u0099\n\25"+
		"\r\25\16\25\u009a\5\25\u009d\n\25\3\26\3\26\7\26\u00a1\n\26\f\26\16\26"+
		"\u00a4\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\6\30\u00ad\n\30\r\30\16"+
		"\30\u00ae\3\u00a2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\b\5\2"+
		",-//\61\61\4\2>>@@\3\2c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\u00b9"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\3\61\3\2\2\2\5\64\3\2\2\2\7<\3\2\2\2\tE\3\2\2\2\13N\3\2\2\2\rT\3\2"+
		"\2\2\17[\3\2\2\2\21d\3\2\2\2\23i\3\2\2\2\25o\3\2\2\2\27q\3\2\2\2\31s\3"+
		"\2\2\2\33u\3\2\2\2\35w\3\2\2\2\37y\3\2\2\2!{\3\2\2\2#}\3\2\2\2%\u0088"+
		"\3\2\2\2\'\u008a\3\2\2\2)\u0092\3\2\2\2+\u009e\3\2\2\2-\u00a7\3\2\2\2"+
		"/\u00ac\3\2\2\2\61\62\7u\2\2\62\63\7g\2\2\63\4\3\2\2\2\64\65\7g\2\2\65"+
		"\66\7u\2\2\66\67\7e\2\2\678\7t\2\289\7g\2\29:\7x\2\2:;\7c\2\2;\6\3\2\2"+
		"\2<=\7h\2\2=>\7k\2\2>?\7o\2\2?@\7r\2\2@A\7t\2\2AB\7q\2\2BC\7i\2\2CD\7"+
		"=\2\2D\b\3\2\2\2EF\7g\2\2FG\7p\2\2GH\7s\2\2HI\7w\2\2IJ\7c\2\2JK\7p\2\2"+
		"KL\7v\2\2LM\7q\2\2M\n\3\2\2\2NO\7u\2\2OP\7g\2\2PQ\7p\2\2QR\7c\2\2RS\7"+
		"q\2\2S\f\3\2\2\2TU\7p\2\2UV\7w\2\2VW\7o\2\2WX\7g\2\2XY\7t\2\2YZ\7q\2\2"+
		"Z\16\3\2\2\2[\\\7r\2\2\\]\7t\2\2]^\7q\2\2^_\7i\2\2_`\7t\2\2`a\7c\2\2a"+
		"b\7o\2\2bc\7c\2\2c\20\3\2\2\2de\7n\2\2ef\7g\2\2fg\7k\2\2gh\7c\2\2h\22"+
		"\3\2\2\2ij\7v\2\2jk\7g\2\2kl\7z\2\2lm\7v\2\2mn\7q\2\2n\24\3\2\2\2op\7"+
		"*\2\2p\26\3\2\2\2qr\7+\2\2r\30\3\2\2\2st\7=\2\2t\32\3\2\2\2uv\t\2\2\2"+
		"v\34\3\2\2\2wx\7?\2\2x\36\3\2\2\2yz\7.\2\2z \3\2\2\2{|\7}\2\2|\"\3\2\2"+
		"\2}~\7\177\2\2~$\3\2\2\2\177\u0089\t\3\2\2\u0080\u0081\7@\2\2\u0081\u0089"+
		"\7?\2\2\u0082\u0083\7>\2\2\u0083\u0089\7?\2\2\u0084\u0085\7?\2\2\u0085"+
		"\u0089\7?\2\2\u0086\u0087\7#\2\2\u0087\u0089\7?\2\2\u0088\177\3\2\2\2"+
		"\u0088\u0080\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089&\3\2\2\2\u008a\u008e\t\4\2\2\u008b\u008d\t\5\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f(\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\t\6\2\2\u0092\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u009c\3\2\2\2\u0096\u0098\7\60\2\2\u0097\u0099\t\6\2\2\u0098\u0097\3"+
		"\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u009d\3\2\2\2\u009d*\3\2\2\2"+
		"\u009e\u00a2\7)\2\2\u009f\u00a1\13\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\7)\2\2\u00a6,\3\2\2\2\u00a7\u00a8\t\7\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\b\27\2\2\u00aa.\3\2\2\2\u00ab\u00ad\t\6\2\2"+
		"\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\60\3\2\2\2\13\2\u0088\u008c\u008e\u0094\u009a\u009c\u00a2"+
		"\u00ae\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}