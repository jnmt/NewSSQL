// Generated from query.g4 by ANTLR 4.5

package supersql.parser;

import java.util.*;
import java.io.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class queryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, K_ABORT=21, K_ADD=22, K_ALL=23, K_AND=24, 
		K_AS=25, K_ASC=26, K_BETWEEN=27, K_BY=28, K_CASE=29, K_CAST=30, K_COLLATE=31, 
		K_CROSS=32, K_CURRENT_DATE=33, K_CURRENT_TIME=34, K_CURRENT_TIMESTAMP=35, 
		K_DESC=36, K_DISTINCT=37, K_ELSE=38, K_END=39, K_ESCAPE=40, K_EXCEPT=41, 
		K_EXISTS=42, K_FAIL=43, K_FULL=44, K_FROM=45, K_GLOB=46, K_GROUP=47, K_HAVING=48, 
		K_IF=49, K_IGNORE=50, K_IN=51, K_INDEXED=52, K_INNER=53, K_INTERSECT=54, 
		K_IS=55, K_ISNULL=56, K_JOIN=57, K_LEFT=58, K_LIKE=59, K_LIMIT=60, K_MATCH=61, 
		K_NATURAL=62, K_NO=63, K_NOT=64, K_NOTNULL=65, K_NULL=66, K_OFFSET=67, 
		K_ON=68, K_OR=69, K_ORDER=70, K_OUTER=71, K_RAISE=72, K_RECURSIVE=73, 
		K_REGEXP=74, K_RIGHT=75, K_ROLLBACK=76, K_SELECT=77, K_THEN=78, K_UNION=79, 
		K_USING=80, K_VALUES=81, K_WHEN=82, K_WHERE=83, K_WITH=84, K_GENERATE=85, 
		K_MAX=86, K_MIN=87, K_AVG=88, K_COUNT=89, K_SUM=90, C0=91, C1=92, C2=93, 
		C3=94, DOT=95, OPEN_PARENTHESE=96, CLOSE_PARENTHESE=97, OPEN_BRACKET=98, 
		CLOSE_BRACKET=99, OPEN_BRACE=100, CLOSE_BRACE=101, SEMICOLON=102, DECOLATOR=103, 
		NUMERIC_LITERAL=104, BLOB_LITERAL=105, BIND_PARAMETER=106, IDENTIFIER=107, 
		STRING_LITERAL=108, MULTI_LINE_COMMENT=109, SINGLE_LINE_COMMENT=110, WS=111, 
		UNEXPECTED_CHAR=112;
	public static final int
		RULE_query = 0, RULE_root = 1, RULE_media = 2, RULE_operand = 3, RULE_grouper = 4, 
		RULE_composite_iterator = 5, RULE_exp = 6, RULE_d_exp = 7, RULE_v_exp = 8, 
		RULE_h_exp = 9, RULE_n_exp = 10, RULE_sorting = 11, RULE_function = 12, 
		RULE_sqlfunc = 13, RULE_aggregate = 14, RULE_if_then_else = 15, RULE_arithmetics = 16, 
		RULE_from_where = 17, RULE_error = 18, RULE_sql_stmt_list = 19, RULE_sql_stmt = 20, 
		RULE_factored_select_stmt = 21, RULE_select_core = 22, RULE_where_clause = 23, 
		RULE_result_column = 24, RULE_table_or_subquery = 25, RULE_keyword = 26, 
		RULE_select_stmt = 27, RULE_select_or_values = 28, RULE_compound_operator = 29, 
		RULE_join_clause = 30, RULE_join_operator = 31, RULE_join_constraint = 32, 
		RULE_common_table_expression = 33, RULE_ordering_term = 34, RULE_expr = 35, 
		RULE_literal_value = 36, RULE_unary_operator = 37, RULE_name = 38, RULE_type_name = 39, 
		RULE_function_name = 40, RULE_ag_function_name = 41, RULE_ag_keyword = 42, 
		RULE_collation_name = 43, RULE_database_name = 44, RULE_table_name = 45, 
		RULE_column_alias = 46, RULE_column_name = 47, RULE_table_alias = 48, 
		RULE_index_name = 49, RULE_any_name = 50, RULE_sl = 51, RULE_signed_number = 52, 
		RULE_raise_function = 53, RULE_error_message = 54;
	public static final String[] ruleNames = {
		"query", "root", "media", "operand", "grouper", "composite_iterator", 
		"exp", "d_exp", "v_exp", "h_exp", "n_exp", "sorting", "function", "sqlfunc", 
		"aggregate", "if_then_else", "arithmetics", "from_where", "error", "sql_stmt_list", 
		"sql_stmt", "factored_select_stmt", "select_core", "where_clause", "result_column", 
		"table_or_subquery", "keyword", "select_stmt", "select_or_values", "compound_operator", 
		"join_clause", "join_operator", "join_constraint", "common_table_expression", 
		"ordering_term", "expr", "literal_value", "unary_operator", "name", "type_name", 
		"function_name", "ag_function_name", "ag_keyword", "collation_name", "database_name", 
		"table_name", "column_alias", "column_name", "table_alias", "index_name", 
		"any_name", "sl", "signed_number", "raise_function", "error_message"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'||'", "'$'", "'&'", "':'", "'*'", "'/'", "'+'", "'-'", "'<<'", 
		"'>>'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", 
		"'~'", null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'?'", 
		"','", "'!'", "'%'", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "K_ABORT", "K_ADD", 
		"K_ALL", "K_AND", "K_AS", "K_ASC", "K_BETWEEN", "K_BY", "K_CASE", "K_CAST", 
		"K_COLLATE", "K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
		"K_DESC", "K_DISTINCT", "K_ELSE", "K_END", "K_ESCAPE", "K_EXCEPT", "K_EXISTS", 
		"K_FAIL", "K_FULL", "K_FROM", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", 
		"K_IGNORE", "K_IN", "K_INDEXED", "K_INNER", "K_INTERSECT", "K_IS", "K_ISNULL", 
		"K_JOIN", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", "K_NO", 
		"K_NOT", "K_NOTNULL", "K_NULL", "K_OFFSET", "K_ON", "K_OR", "K_ORDER", 
		"K_OUTER", "K_RAISE", "K_RECURSIVE", "K_REGEXP", "K_RIGHT", "K_ROLLBACK", 
		"K_SELECT", "K_THEN", "K_UNION", "K_USING", "K_VALUES", "K_WHEN", "K_WHERE", 
		"K_WITH", "K_GENERATE", "K_MAX", "K_MIN", "K_AVG", "K_COUNT", "K_SUM", 
		"C0", "C1", "C2", "C3", "DOT", "OPEN_PARENTHESE", "CLOSE_PARENTHESE", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", "SEMICOLON", 
		"DECOLATOR", "NUMERIC_LITERAL", "BLOB_LITERAL", "BIND_PARAMETER", "IDENTIFIER", 
		"STRING_LITERAL", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT", "WS", "UNEXPECTED_CHAR"
	};
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
	public String getGrammarFileName() { return "query.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public queryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public MediaContext media() {
			return getRuleContext(MediaContext.class,0);
		}
		public RootContext root() {
			return getRuleContext(RootContext.class,0);
		}
		public From_whereContext from_where() {
			return getRuleContext(From_whereContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			media();
			setState(111);
			root();
			setState(113);
			_la = _input.LA(1);
			if (_la==K_FROM || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_SELECT - 77)) | (1L << (K_WITH - 77)) | (1L << (UNEXPECTED_CHAR - 77)))) != 0)) {
				{
				setState(112);
				from_where();
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

	public static class RootContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode DECOLATOR() { return getToken(queryParser.DECOLATOR, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(115);
				operand();
				}
				break;
			case 2:
				{
				setState(116);
				exp();
				}
				break;
			}
			setState(120);
			_la = _input.LA(1);
			if (_la==DECOLATOR) {
				{
				setState(119);
				match(DECOLATOR);
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

	public static class MediaContext extends ParserRuleContext {
		public TerminalNode K_GENERATE() { return getToken(queryParser.K_GENERATE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(queryParser.IDENTIFIER, 0); }
		public MediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterMedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitMedia(this);
		}
	}

	public final MediaContext media() throws RecognitionException {
		MediaContext _localctx = new MediaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_media);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(K_GENERATE);
			setState(123);
			match(IDENTIFIER);
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

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode DECOLATOR() { return getToken(queryParser.DECOLATOR, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SqlfuncContext sqlfunc() {
			return getRuleContext(SqlfuncContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(queryParser.OPEN_BRACE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(queryParser.CLOSE_BRACE, 0); }
		public GrouperContext grouper() {
			return getRuleContext(GrouperContext.class,0);
		}
		public Composite_iteratorContext composite_iterator() {
			return getRuleContext(Composite_iteratorContext.class,0);
		}
		public If_then_elseContext if_then_else() {
			return getRuleContext(If_then_elseContext.class,0);
		}
		public SlContext sl() {
			return getRuleContext(SlContext.class,0);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(queryParser.NUMERIC_LITERAL, 0); }
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public ArithmeticsContext arithmetics() {
			return getRuleContext(ArithmeticsContext.class,0);
		}
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public SortingContext sorting() {
			return getRuleContext(SortingContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operand);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(125);
				function();
				}
				break;
			case 2:
				{
				setState(126);
				sqlfunc();
				}
				break;
			case 3:
				{
				setState(127);
				match(OPEN_BRACE);
				setState(128);
				exp();
				setState(129);
				match(CLOSE_BRACE);
				}
				break;
			case 4:
				{
				setState(132);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESE) {
					{
					setState(131);
					sorting();
					}
				}

				{
				setState(137);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(134);
					table_alias();
					setState(135);
					match(DOT);
					}
					break;
				}
				setState(139);
				column_name();
				}
				}
				break;
			case 5:
				{
				setState(140);
				grouper();
				}
				break;
			case 6:
				{
				setState(141);
				composite_iterator();
				}
				break;
			case 7:
				{
				setState(142);
				if_then_else();
				}
				break;
			case 8:
				{
				setState(143);
				sl();
				}
				break;
			case 9:
				{
				setState(144);
				match(NUMERIC_LITERAL);
				}
				break;
			case 10:
				{
				setState(146);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESE) {
					{
					setState(145);
					sorting();
					}
				}

				setState(148);
				aggregate();
				}
				break;
			case 11:
				{
				setState(149);
				arithmetics(0);
				}
				break;
			}
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					match(T__0);
					setState(153);
					operand();
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(159);
				match(DECOLATOR);
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

	public static class GrouperContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(queryParser.OPEN_BRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(queryParser.CLOSE_BRACKET, 0); }
		public TerminalNode C1() { return getToken(queryParser.C1, 0); }
		public TerminalNode C2() { return getToken(queryParser.C2, 0); }
		public TerminalNode C3() { return getToken(queryParser.C3, 0); }
		public GrouperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterGrouper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitGrouper(this);
		}
	}

	public final GrouperContext grouper() throws RecognitionException {
		GrouperContext _localctx = new GrouperContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_grouper);
		try {
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(OPEN_BRACKET);
				setState(163);
				exp();
				setState(164);
				match(CLOSE_BRACKET);
				setState(165);
				match(C1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(OPEN_BRACKET);
				setState(168);
				exp();
				setState(169);
				match(CLOSE_BRACKET);
				setState(170);
				match(C2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(OPEN_BRACKET);
				setState(173);
				exp();
				setState(174);
				match(CLOSE_BRACKET);
				setState(175);
				match(C3);
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

	public static class Composite_iteratorContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(queryParser.OPEN_BRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(queryParser.CLOSE_BRACKET, 0); }
		public TerminalNode C1() { return getToken(queryParser.C1, 0); }
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(queryParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(queryParser.NUMERIC_LITERAL, i);
		}
		public TerminalNode C2() { return getToken(queryParser.C2, 0); }
		public TerminalNode C3() { return getToken(queryParser.C3, 0); }
		public Composite_iteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composite_iterator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterComposite_iterator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitComposite_iterator(this);
		}
	}

	public final Composite_iteratorContext composite_iterator() throws RecognitionException {
		Composite_iteratorContext _localctx = new Composite_iteratorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_composite_iterator);
		try {
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(OPEN_BRACKET);
				setState(180);
				exp();
				setState(181);
				match(CLOSE_BRACKET);
				setState(182);
				match(C1);
				setState(195);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(183);
					match(NUMERIC_LITERAL);
					setState(184);
					match(C2);
					setState(187);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(185);
						match(NUMERIC_LITERAL);
						setState(186);
						match(C3);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(189);
					match(NUMERIC_LITERAL);
					setState(190);
					match(C3);
					setState(193);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(191);
						match(NUMERIC_LITERAL);
						setState(192);
						match(C2);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(OPEN_BRACKET);
				setState(198);
				exp();
				setState(199);
				match(CLOSE_BRACKET);
				setState(200);
				match(C2);
				setState(213);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(201);
					match(NUMERIC_LITERAL);
					setState(202);
					match(C1);
					setState(205);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(203);
						match(NUMERIC_LITERAL);
						setState(204);
						match(C3);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(207);
					match(NUMERIC_LITERAL);
					setState(208);
					match(C3);
					setState(211);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(209);
						match(NUMERIC_LITERAL);
						setState(210);
						match(C1);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(OPEN_BRACKET);
				setState(216);
				exp();
				setState(217);
				match(CLOSE_BRACKET);
				setState(218);
				match(C3);
				setState(231);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(219);
					match(NUMERIC_LITERAL);
					setState(220);
					match(C1);
					setState(223);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(221);
						match(NUMERIC_LITERAL);
						setState(222);
						match(C2);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(225);
					match(NUMERIC_LITERAL);
					setState(226);
					match(C2);
					setState(229);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(227);
						match(NUMERIC_LITERAL);
						setState(228);
						match(C1);
						}
						break;
					}
					}
					break;
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

	public static class ExpContext extends ParserRuleContext {
		public D_expContext d_exp() {
			return getRuleContext(D_expContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			d_exp();
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

	public static class D_expContext extends ParserRuleContext {
		public List<V_expContext> v_exp() {
			return getRuleContexts(V_expContext.class);
		}
		public V_expContext v_exp(int i) {
			return getRuleContext(V_expContext.class,i);
		}
		public List<TerminalNode> C3() { return getTokens(queryParser.C3); }
		public TerminalNode C3(int i) {
			return getToken(queryParser.C3, i);
		}
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public D_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterD_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitD_exp(this);
		}
	}

	public final D_expContext d_exp() throws RecognitionException {
		D_expContext _localctx = new D_expContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_d_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			v_exp();
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					match(C3);
					setState(241);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(239);
						v_exp();
						}
						break;
					case 2:
						{
						setState(240);
						operand();
						}
						break;
					}
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class V_expContext extends ParserRuleContext {
		public List<H_expContext> h_exp() {
			return getRuleContexts(H_expContext.class);
		}
		public H_expContext h_exp(int i) {
			return getRuleContext(H_expContext.class,i);
		}
		public List<TerminalNode> C2() { return getTokens(queryParser.C2); }
		public TerminalNode C2(int i) {
			return getToken(queryParser.C2, i);
		}
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public V_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterV_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitV_exp(this);
		}
	}

	public final V_expContext v_exp() throws RecognitionException {
		V_expContext _localctx = new V_expContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_v_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			h_exp();
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					match(C2);
					setState(252);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(250);
						h_exp();
						}
						break;
					case 2:
						{
						setState(251);
						operand();
						}
						break;
					}
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class H_expContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<N_expContext> n_exp() {
			return getRuleContexts(N_expContext.class);
		}
		public N_expContext n_exp(int i) {
			return getRuleContext(N_expContext.class,i);
		}
		public List<TerminalNode> C1() { return getTokens(queryParser.C1); }
		public TerminalNode C1(int i) {
			return getToken(queryParser.C1, i);
		}
		public H_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterH_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitH_exp(this);
		}
	}

	public final H_expContext h_exp() throws RecognitionException {
		H_expContext _localctx = new H_expContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_h_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(259);
				operand();
				}
				break;
			case 2:
				{
				setState(260);
				n_exp();
				}
				break;
			}
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(263);
					match(C1);
					setState(266);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(264);
						operand();
						}
						break;
					case 2:
						{
						setState(265);
						n_exp();
						}
						break;
					}
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class N_expContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode C0() { return getToken(queryParser.C0, 0); }
		public N_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterN_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitN_exp(this);
		}
	}

	public final N_expContext n_exp() throws RecognitionException {
		N_expContext _localctx = new N_expContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_n_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			operand();
			setState(274);
			match(C0);
			setState(275);
			operand();
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

	public static class SortingContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESE() { return getToken(queryParser.OPEN_PARENTHESE, 0); }
		public TerminalNode K_ASC() { return getToken(queryParser.K_ASC, 0); }
		public TerminalNode CLOSE_PARENTHESE() { return getToken(queryParser.CLOSE_PARENTHESE, 0); }
		public TerminalNode K_DESC() { return getToken(queryParser.K_DESC, 0); }
		public SortingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sorting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterSorting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitSorting(this);
		}
	}

	public final SortingContext sorting() throws RecognitionException {
		SortingContext _localctx = new SortingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sorting);
		try {
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(OPEN_PARENTHESE);
				setState(278);
				match(K_ASC);
				setState(279);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(OPEN_PARENTHESE);
				setState(281);
				match(K_DESC);
				setState(282);
				match(CLOSE_PARENTHESE);
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

	public static class FunctionContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESE() { return getToken(queryParser.OPEN_PARENTHESE, 0); }
		public TerminalNode CLOSE_PARENTHESE() { return getToken(queryParser.CLOSE_PARENTHESE, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(286);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(285);
				match(T__1);
				}
			}

			setState(288);
			function_name();
			setState(289);
			match(OPEN_PARENTHESE);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__19) | (1L << K_ABORT) | (1L << K_ALL) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLLATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_ELSE) | (1L << K_END) | (1L << K_ESCAPE) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FAIL) | (1L << K_FULL) | (1L << K_FROM) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IGNORE) | (1L << K_IN) | (1L << K_INDEXED) | (1L << K_INNER) | (1L << K_INTERSECT) | (1L << K_IS) | (1L << K_ISNULL) | (1L << K_JOIN) | (1L << K_LEFT) | (1L << K_LIKE) | (1L << K_LIMIT) | (1L << K_MATCH) | (1L << K_NATURAL) | (1L << K_NO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_THEN - 64)) | (1L << (K_UNION - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (K_GENERATE - 64)) | (1L << (K_MAX - 64)) | (1L << (K_MIN - 64)) | (1L << (K_AVG - 64)) | (1L << (K_COUNT - 64)) | (1L << (K_SUM - 64)) | (1L << (OPEN_PARENTHESE - 64)) | (1L << (OPEN_BRACKET - 64)) | (1L << (OPEN_BRACE - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (BIND_PARAMETER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (STRING_LITERAL - 64)))) != 0)) {
				{
				{
				setState(293);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(290);
					operand();
					}
					break;
				case 2:
					{
					setState(291);
					exp();
					}
					break;
				case 3:
					{
					setState(292);
					expr(0);
					}
					break;
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(295);
					match(C1);
					setState(299);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(296);
						operand();
						}
						break;
					case 2:
						{
						setState(297);
						exp();
						}
						break;
					case 3:
						{
						setState(298);
						expr(0);
						}
						break;
					}
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(CLOSE_PARENTHESE);
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

	public static class SqlfuncContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENTHESE() { return getToken(queryParser.OPEN_PARENTHESE, 0); }
		public TerminalNode CLOSE_PARENTHESE() { return getToken(queryParser.CLOSE_PARENTHESE, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SqlfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterSqlfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitSqlfunc(this);
		}
	}

	public final SqlfuncContext sqlfunc() throws RecognitionException {
		SqlfuncContext _localctx = new SqlfuncContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sqlfunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(313);
			match(T__2);
			setState(314);
			function_name();
			setState(315);
			match(OPEN_PARENTHESE);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__19) | (1L << K_ABORT) | (1L << K_ALL) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLLATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_ELSE) | (1L << K_END) | (1L << K_ESCAPE) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FAIL) | (1L << K_FULL) | (1L << K_FROM) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IGNORE) | (1L << K_IN) | (1L << K_INDEXED) | (1L << K_INNER) | (1L << K_INTERSECT) | (1L << K_IS) | (1L << K_ISNULL) | (1L << K_JOIN) | (1L << K_LEFT) | (1L << K_LIKE) | (1L << K_LIMIT) | (1L << K_MATCH) | (1L << K_NATURAL) | (1L << K_NO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_THEN - 64)) | (1L << (K_UNION - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (K_GENERATE - 64)) | (1L << (K_MAX - 64)) | (1L << (K_MIN - 64)) | (1L << (K_AVG - 64)) | (1L << (K_COUNT - 64)) | (1L << (K_SUM - 64)) | (1L << (OPEN_PARENTHESE - 64)) | (1L << (OPEN_BRACKET - 64)) | (1L << (OPEN_BRACE - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (BIND_PARAMETER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (STRING_LITERAL - 64)))) != 0)) {
				{
				{
				setState(319);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(316);
					operand();
					}
					break;
				case 2:
					{
					setState(317);
					exp();
					}
					break;
				case 3:
					{
					setState(318);
					expr(0);
					}
					break;
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(321);
					match(C1);
					setState(325);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(322);
						operand();
						}
						break;
					case 2:
						{
						setState(323);
						exp();
						}
						break;
					case 3:
						{
						setState(324);
						expr(0);
						}
						break;
					}
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			match(CLOSE_PARENTHESE);
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

	public static class AggregateContext extends ParserRuleContext {
		public Ag_function_nameContext ag_function_name() {
			return getRuleContext(Ag_function_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(queryParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(queryParser.CLOSE_BRACKET, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitAggregate(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			ag_function_name();
			setState(340);
			match(OPEN_BRACKET);
			{
			setState(344);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(341);
				table_alias();
				setState(342);
				match(DOT);
				}
				break;
			}
			setState(346);
			column_name();
			}
			setState(348);
			match(CLOSE_BRACKET);
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

	public static class If_then_elseContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(queryParser.K_IF, 0); }
		public List<TerminalNode> OPEN_PARENTHESE() { return getTokens(queryParser.OPEN_PARENTHESE); }
		public TerminalNode OPEN_PARENTHESE(int i) {
			return getToken(queryParser.OPEN_PARENTHESE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> CLOSE_PARENTHESE() { return getTokens(queryParser.CLOSE_PARENTHESE); }
		public TerminalNode CLOSE_PARENTHESE(int i) {
			return getToken(queryParser.CLOSE_PARENTHESE, i);
		}
		public TerminalNode K_THEN() { return getToken(queryParser.K_THEN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode K_ELSE() { return getToken(queryParser.K_ELSE, 0); }
		public If_then_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterIf_then_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitIf_then_else(this);
		}
	}

	public final If_then_elseContext if_then_else() throws RecognitionException {
		If_then_elseContext _localctx = new If_then_elseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_then_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			switch (_input.LA(1)) {
			case K_IF:
				{
				{
				setState(350);
				match(K_IF);
				setState(351);
				match(OPEN_PARENTHESE);
				setState(352);
				expr(0);
				setState(353);
				match(CLOSE_PARENTHESE);
				setState(354);
				match(K_THEN);
				setState(355);
				match(OPEN_PARENTHESE);
				setState(356);
				exp();
				setState(357);
				match(CLOSE_PARENTHESE);
				setState(358);
				match(K_ELSE);
				setState(359);
				match(OPEN_PARENTHESE);
				setState(360);
				exp();
				setState(361);
				match(CLOSE_PARENTHESE);
				}
				}
				break;
			case OPEN_PARENTHESE:
				{
				{
				setState(363);
				match(OPEN_PARENTHESE);
				setState(364);
				expr(0);
				setState(365);
				match(CLOSE_PARENTHESE);
				setState(366);
				match(C0);
				setState(367);
				exp();
				setState(368);
				match(T__3);
				setState(369);
				exp();
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

	public static class ArithmeticsContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESE() { return getToken(queryParser.OPEN_PARENTHESE, 0); }
		public List<ArithmeticsContext> arithmetics() {
			return getRuleContexts(ArithmeticsContext.class);
		}
		public ArithmeticsContext arithmetics(int i) {
			return getRuleContext(ArithmeticsContext.class,i);
		}
		public TerminalNode CLOSE_PARENTHESE() { return getToken(queryParser.CLOSE_PARENTHESE, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(queryParser.NUMERIC_LITERAL, 0); }
		public ArithmeticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterArithmetics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitArithmetics(this);
		}
	}

	public final ArithmeticsContext arithmetics() throws RecognitionException {
		return arithmetics(0);
	}

	private ArithmeticsContext arithmetics(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticsContext _localctx = new ArithmeticsContext(_ctx, _parentState);
		ArithmeticsContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_arithmetics, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			switch (_input.LA(1)) {
			case OPEN_PARENTHESE:
				{
				setState(374);
				match(OPEN_PARENTHESE);
				setState(375);
				arithmetics(0);
				setState(376);
				match(CLOSE_PARENTHESE);
				}
				break;
			case K_ABORT:
			case K_ALL:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_BETWEEN:
			case K_BY:
			case K_CASE:
			case K_CAST:
			case K_COLLATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DESC:
			case K_DISTINCT:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXISTS:
			case K_FAIL:
			case K_FULL:
			case K_FROM:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IN:
			case K_INDEXED:
			case K_INNER:
			case K_INTERSECT:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REGEXP:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_SELECT:
			case K_THEN:
			case K_UNION:
			case K_USING:
			case K_VALUES:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_GENERATE:
			case K_MAX:
			case K_MIN:
			case K_AVG:
			case K_COUNT:
			case K_SUM:
			case IDENTIFIER:
				{
				setState(381);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(378);
					table_alias();
					setState(379);
					match(DOT);
					}
					break;
				}
				setState(383);
				column_name();
				}
				break;
			case NUMERIC_LITERAL:
				{
				setState(384);
				match(NUMERIC_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(393);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetics);
						setState(387);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(388);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5 || _la==C3) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(389);
						arithmetics(3);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetics);
						setState(390);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(391);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(392);
						arithmetics(2);
						}
						break;
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class From_whereContext extends ParserRuleContext {
		public Sql_stmt_listContext sql_stmt_list() {
			return getRuleContext(Sql_stmt_listContext.class,0);
		}
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public From_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterFrom_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitFrom_where(this);
		}
	}

	public final From_whereContext from_where() throws RecognitionException {
		From_whereContext _localctx = new From_whereContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_from_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			switch (_input.LA(1)) {
			case K_FROM:
			case K_SELECT:
			case K_WITH:
				{
				setState(398);
				sql_stmt_list();
				}
				break;
			case UNEXPECTED_CHAR:
				{
				setState(399);
				error();
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(queryParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitError(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);
			 
			  
			  throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null)); 
			  
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitSql_stmt_list(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			sql_stmt();
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(407); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(406);
						match(SEMICOLON);
						}
						}
						setState(409); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SEMICOLON );
					setState(411);
					sql_stmt();
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(417);
				match(SEMICOLON);
				}
				}
				setState(422);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitSql_stmt(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(423);
				factored_select_stmt();
				}
				break;
			case 2:
				{
				setState(424);
				select_stmt();
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

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(queryParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(queryParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(queryParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(queryParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(queryParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(queryParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitFactored_select_stmt(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(427);
				match(K_WITH);
				setState(429);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(428);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(431);
				common_table_expression();
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(432);
					match(C1);
					setState(433);
					common_table_expression();
					}
					}
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(441);
			select_core();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (K_EXCEPT - 41)) | (1L << (K_INTERSECT - 41)) | (1L << (K_UNION - 41)))) != 0)) {
				{
				{
				setState(442);
				compound_operator();
				setState(443);
				select_core();
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(450);
				match(K_ORDER);
				setState(451);
				match(K_BY);
				setState(452);
				ordering_term();
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(453);
					match(C1);
					setState(454);
					ordering_term();
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(468);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(462);
				match(K_LIMIT);
				setState(463);
				expr(0);
				setState(466);
				_la = _input.LA(1);
				if (_la==K_OFFSET || _la==C1) {
					{
					setState(464);
					_la = _input.LA(1);
					if ( !(_la==K_OFFSET || _la==C1) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(465);
					expr(0);
					}
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

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(queryParser.K_FROM, 0); }
		public TerminalNode K_SELECT() { return getToken(queryParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(queryParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(queryParser.K_ALL, 0); }
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitSelect_core(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_select_core);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_la = _input.LA(1);
			if (_la==K_SELECT) {
				{
				setState(470);
				match(K_SELECT);
				setState(472);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(471);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(474);
				result_column();
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(475);
					match(C1);
					setState(476);
					result_column();
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(484);
			match(K_FROM);
			setState(494);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(485);
				table_or_subquery();
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(486);
					match(C1);
					setState(487);
					table_or_subquery();
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(493);
				join_clause();
				}
				break;
			}
			}
			setState(497);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (K_GROUP - 47)) | (1L << (K_VALUES - 47)) | (1L << (K_WHERE - 47)))) != 0)) {
				{
				setState(496);
				where_clause();
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

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode K_VALUES() { return getToken(queryParser.K_VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_WHERE() { return getToken(queryParser.K_WHERE, 0); }
		public TerminalNode K_GROUP() { return getToken(queryParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(queryParser.K_BY, 0); }
		public TerminalNode K_HAVING() { return getToken(queryParser.K_HAVING, 0); }
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_where_clause);
		int _la;
		try {
			setState(596);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				switch (_input.LA(1)) {
				case K_WHERE:
					{
					{
					setState(499);
					match(K_WHERE);
					setState(500);
					expr(0);
					}
					setState(516);
					_la = _input.LA(1);
					if (_la==K_GROUP) {
						{
						setState(502);
						match(K_GROUP);
						setState(503);
						match(K_BY);
						setState(504);
						expr(0);
						setState(509);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==C1) {
							{
							{
							setState(505);
							match(C1);
							setState(506);
							expr(0);
							}
							}
							setState(511);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(514);
						_la = _input.LA(1);
						if (_la==K_HAVING) {
							{
							setState(512);
							match(K_HAVING);
							setState(513);
							expr(0);
							}
						}

						}
					}

					}
					break;
				case K_VALUES:
					{
					setState(518);
					match(K_VALUES);
					setState(519);
					match(OPEN_PARENTHESE);
					setState(520);
					expr(0);
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(521);
						match(C1);
						setState(522);
						expr(0);
						}
						}
						setState(527);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(528);
					match(CLOSE_PARENTHESE);
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(529);
						match(C1);
						setState(530);
						match(OPEN_PARENTHESE);
						setState(531);
						expr(0);
						setState(536);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==C1) {
							{
							{
							setState(532);
							match(C1);
							setState(533);
							expr(0);
							}
							}
							setState(538);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(539);
						match(CLOSE_PARENTHESE);
						}
						}
						setState(545);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				switch (_input.LA(1)) {
				case K_GROUP:
				case K_WHERE:
					{
					setState(550);
					_la = _input.LA(1);
					if (_la==K_WHERE) {
						{
						setState(548);
						match(K_WHERE);
						setState(549);
						expr(0);
						}
					}

					{
					setState(552);
					match(K_GROUP);
					setState(553);
					match(K_BY);
					setState(554);
					expr(0);
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(555);
						match(C1);
						setState(556);
						expr(0);
						}
						}
						setState(561);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(564);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(562);
						match(K_HAVING);
						setState(563);
						expr(0);
						}
					}

					}
					}
					break;
				case K_VALUES:
					{
					setState(566);
					match(K_VALUES);
					setState(567);
					match(OPEN_PARENTHESE);
					setState(568);
					expr(0);
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(569);
						match(C1);
						setState(570);
						expr(0);
						}
						}
						setState(575);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(576);
					match(CLOSE_PARENTHESE);
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(577);
						match(C1);
						setState(578);
						match(OPEN_PARENTHESE);
						setState(579);
						expr(0);
						setState(584);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==C1) {
							{
							{
							setState(580);
							match(C1);
							setState(581);
							expr(0);
							}
							}
							setState(586);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(587);
						match(CLOSE_PARENTHESE);
						}
						}
						setState(593);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class Result_columnContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(queryParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitResult_column(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_result_column);
		int _la;
		try {
			setState(610);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				table_name();
				setState(600);
				match(DOT);
				setState(601);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				expr(0);
				setState(608);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(605);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(604);
						match(K_AS);
						}
					}

					setState(607);
					column_alias();
					}
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(queryParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(queryParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(queryParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(queryParser.K_AS, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitTable_or_subquery(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_table_or_subquery);
		int _la;
		try {
			setState(659);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(612);
					database_name();
					setState(613);
					match(DOT);
					}
					break;
				}
				setState(617);
				table_name();
				setState(622);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(619);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(618);
						match(K_AS);
						}
						break;
					}
					setState(621);
					table_alias();
					}
					break;
				}
				setState(629);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(624);
					match(K_INDEXED);
					setState(625);
					match(K_BY);
					setState(626);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(627);
					match(K_NOT);
					setState(628);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case K_CROSS:
				case K_EXCEPT:
				case K_FULL:
				case K_GROUP:
				case K_INNER:
				case K_INTERSECT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NATURAL:
				case K_ON:
				case K_ORDER:
				case K_RIGHT:
				case K_UNION:
				case K_USING:
				case K_VALUES:
				case K_WHERE:
				case C1:
				case CLOSE_PARENTHESE:
				case SEMICOLON:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(OPEN_PARENTHESE);
				setState(641);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(632);
					table_or_subquery();
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(633);
						match(C1);
						setState(634);
						table_or_subquery();
						}
						}
						setState(639);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(640);
					join_clause();
					}
					break;
				}
				setState(643);
				match(CLOSE_PARENTHESE);
				setState(648);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(645);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(644);
						match(K_AS);
						}
						break;
					}
					setState(647);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				match(OPEN_PARENTHESE);
				setState(651);
				select_stmt();
				setState(652);
				match(CLOSE_PARENTHESE);
				setState(657);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(654);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						setState(653);
						match(K_AS);
						}
						break;
					}
					setState(656);
					table_alias();
					}
					break;
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(queryParser.K_ABORT, 0); }
		public TerminalNode K_ALL() { return getToken(queryParser.K_ALL, 0); }
		public TerminalNode K_AND() { return getToken(queryParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(queryParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(queryParser.K_ASC, 0); }
		public TerminalNode K_BETWEEN() { return getToken(queryParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(queryParser.K_BY, 0); }
		public TerminalNode K_CASE() { return getToken(queryParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(queryParser.K_CAST, 0); }
		public TerminalNode K_COLLATE() { return getToken(queryParser.K_COLLATE, 0); }
		public TerminalNode K_CROSS() { return getToken(queryParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(queryParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(queryParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(queryParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DESC() { return getToken(queryParser.K_DESC, 0); }
		public TerminalNode K_DISTINCT() { return getToken(queryParser.K_DISTINCT, 0); }
		public TerminalNode K_ELSE() { return getToken(queryParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(queryParser.K_END, 0); }
		public TerminalNode K_ESCAPE() { return getToken(queryParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(queryParser.K_EXCEPT, 0); }
		public TerminalNode K_EXISTS() { return getToken(queryParser.K_EXISTS, 0); }
		public TerminalNode K_FAIL() { return getToken(queryParser.K_FAIL, 0); }
		public TerminalNode K_FROM() { return getToken(queryParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(queryParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(queryParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(queryParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(queryParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(queryParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(queryParser.K_IGNORE, 0); }
		public TerminalNode K_IN() { return getToken(queryParser.K_IN, 0); }
		public TerminalNode K_INDEXED() { return getToken(queryParser.K_INDEXED, 0); }
		public TerminalNode K_INNER() { return getToken(queryParser.K_INNER, 0); }
		public TerminalNode K_INTERSECT() { return getToken(queryParser.K_INTERSECT, 0); }
		public TerminalNode K_IS() { return getToken(queryParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(queryParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(queryParser.K_JOIN, 0); }
		public TerminalNode K_LEFT() { return getToken(queryParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(queryParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(queryParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(queryParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(queryParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(queryParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(queryParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(queryParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(queryParser.K_NULL, 0); }
		public TerminalNode K_OFFSET() { return getToken(queryParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(queryParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(queryParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(queryParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(queryParser.K_OUTER, 0); }
		public TerminalNode K_RAISE() { return getToken(queryParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(queryParser.K_RECURSIVE, 0); }
		public TerminalNode K_REGEXP() { return getToken(queryParser.K_REGEXP, 0); }
		public TerminalNode K_RIGHT() { return getToken(queryParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(queryParser.K_ROLLBACK, 0); }
		public TerminalNode K_SELECT() { return getToken(queryParser.K_SELECT, 0); }
		public TerminalNode K_THEN() { return getToken(queryParser.K_THEN, 0); }
		public TerminalNode K_UNION() { return getToken(queryParser.K_UNION, 0); }
		public TerminalNode K_USING() { return getToken(queryParser.K_USING, 0); }
		public TerminalNode K_VALUES() { return getToken(queryParser.K_VALUES, 0); }
		public TerminalNode K_WHEN() { return getToken(queryParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(queryParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(queryParser.K_WITH, 0); }
		public TerminalNode K_GENERATE() { return getToken(queryParser.K_GENERATE, 0); }
		public TerminalNode K_MAX() { return getToken(queryParser.K_MAX, 0); }
		public TerminalNode K_MIN() { return getToken(queryParser.K_MIN, 0); }
		public TerminalNode K_AVG() { return getToken(queryParser.K_AVG, 0); }
		public TerminalNode K_SUM() { return getToken(queryParser.K_SUM, 0); }
		public TerminalNode K_COUNT() { return getToken(queryParser.K_COUNT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ALL) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLLATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_ELSE) | (1L << K_END) | (1L << K_ESCAPE) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FAIL) | (1L << K_FULL) | (1L << K_FROM) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IGNORE) | (1L << K_IN) | (1L << K_INDEXED) | (1L << K_INNER) | (1L << K_INTERSECT) | (1L << K_IS) | (1L << K_ISNULL) | (1L << K_JOIN) | (1L << K_LEFT) | (1L << K_LIKE) | (1L << K_LIMIT) | (1L << K_MATCH) | (1L << K_NATURAL) | (1L << K_NO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_THEN - 64)) | (1L << (K_UNION - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (K_GENERATE - 64)) | (1L << (K_MAX - 64)) | (1L << (K_MIN - 64)) | (1L << (K_AVG - 64)) | (1L << (K_COUNT - 64)) | (1L << (K_SUM - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(queryParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(queryParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(queryParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(queryParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(queryParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(queryParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitSelect_stmt(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(663);
				match(K_WITH);
				setState(665);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(664);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(667);
				common_table_expression();
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(668);
					match(C1);
					setState(669);
					common_table_expression();
					}
					}
					setState(674);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(677);
			select_or_values();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (K_EXCEPT - 41)) | (1L << (K_INTERSECT - 41)) | (1L << (K_UNION - 41)))) != 0)) {
				{
				{
				setState(678);
				compound_operator();
				setState(679);
				select_or_values();
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(686);
				match(K_ORDER);
				setState(687);
				match(K_BY);
				setState(688);
				ordering_term();
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(689);
					match(C1);
					setState(690);
					ordering_term();
					}
					}
					setState(695);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(704);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(698);
				match(K_LIMIT);
				setState(699);
				expr(0);
				setState(702);
				_la = _input.LA(1);
				if (_la==K_OFFSET || _la==C1) {
					{
					setState(700);
					_la = _input.LA(1);
					if ( !(_la==K_OFFSET || _la==C1) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(701);
					expr(0);
					}
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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(queryParser.K_FROM, 0); }
		public TerminalNode K_SELECT() { return getToken(queryParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(queryParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(queryParser.K_ALL, 0); }
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitSelect_or_values(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_select_or_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			_la = _input.LA(1);
			if (_la==K_SELECT) {
				{
				setState(706);
				match(K_SELECT);
				setState(708);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(707);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(710);
				result_column();
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(711);
					match(C1);
					setState(712);
					result_column();
					}
					}
					setState(717);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(720);
			match(K_FROM);
			setState(730);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(721);
				table_or_subquery();
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(722);
					match(C1);
					setState(723);
					table_or_subquery();
					}
					}
					setState(728);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(729);
				join_clause();
				}
				break;
			}
			}
			setState(733);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (K_GROUP - 47)) | (1L << (K_VALUES - 47)) | (1L << (K_WHERE - 47)))) != 0)) {
				{
				setState(732);
				where_clause();
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

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(queryParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(queryParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(queryParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(queryParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitCompound_operator(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_compound_operator);
		try {
			setState(740);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				match(K_UNION);
				setState(737);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(738);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(739);
				match(K_EXCEPT);
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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public List<Join_clauseContext> join_clause() {
			return getRuleContexts(Join_clauseContext.class);
		}
		public Join_clauseContext join_clause(int i) {
			return getRuleContext(Join_clauseContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitJoin_clause(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			table_or_subquery();
			setState(752);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(743);
					join_operator();
					setState(746);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						setState(744);
						join_clause();
						}
						break;
					case 2:
						{
						setState(745);
						table_or_subquery();
						}
						break;
					}
					setState(748);
					join_constraint();
					}
					} 
				}
				setState(754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode K_JOIN() { return getToken(queryParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(queryParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(queryParser.K_LEFT, 0); }
		public TerminalNode K_RIGHT() { return getToken(queryParser.K_RIGHT, 0); }
		public TerminalNode K_FULL() { return getToken(queryParser.K_FULL, 0); }
		public TerminalNode K_INNER() { return getToken(queryParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(queryParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(queryParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitJoin_operator(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_join_operator);
		int _la;
		try {
			setState(776);
			switch (_input.LA(1)) {
			case C1:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				match(C1);
				}
				break;
			case K_CROSS:
			case K_FULL:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
			case K_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(756);
					match(K_NATURAL);
					}
				}

				setState(773);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(759);
					match(K_LEFT);
					setState(761);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(760);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_RIGHT:
					{
					setState(763);
					match(K_RIGHT);
					setState(765);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(764);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_FULL:
					{
					setState(767);
					match(K_FULL);
					setState(769);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(768);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(771);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(772);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(775);
				match(K_JOIN);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(queryParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(queryParser.K_USING, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitJoin_constraint(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(778);
				match(K_ON);
				setState(779);
				expr(0);
				}
				break;
			case 2:
				{
				setState(780);
				match(K_USING);
				setState(781);
				match(OPEN_PARENTHESE);
				setState(782);
				column_name();
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(783);
					match(C1);
					setState(784);
					column_name();
					}
					}
					setState(789);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(790);
				match(CLOSE_PARENTHESE);
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(queryParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitCommon_table_expression(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			table_name();
			setState(806);
			_la = _input.LA(1);
			if (_la==OPEN_PARENTHESE) {
				{
				setState(795);
				match(OPEN_PARENTHESE);
				setState(796);
				column_name();
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(797);
					match(C1);
					setState(798);
					column_name();
					}
					}
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(804);
				match(CLOSE_PARENTHESE);
				}
			}

			setState(808);
			match(K_AS);
			setState(809);
			match(OPEN_PARENTHESE);
			setState(810);
			select_stmt();
			setState(811);
			match(CLOSE_PARENTHESE);
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(queryParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(queryParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(queryParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitOrdering_term(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			expr(0);
			setState(816);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(814);
				match(K_COLLATE);
				setState(815);
				collation_name();
				}
			}

			setState(819);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(818);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
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

	public static class ExprContext extends ParserRuleContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(queryParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_CAST() { return getToken(queryParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(queryParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(queryParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(queryParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(queryParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(queryParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(queryParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(queryParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(queryParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(queryParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(queryParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(queryParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(queryParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(queryParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(queryParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(queryParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(queryParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(queryParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(queryParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(queryParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(queryParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ESCAPE() { return getToken(queryParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(queryParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(queryParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(queryParser.K_NULL, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitExpr(this);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(822);
				unary_operator();
				setState(823);
				expr(20);
				}
				break;
			case 2:
				{
				setState(825);
				operand();
				}
				break;
			case 3:
				{
				setState(826);
				match(BIND_PARAMETER);
				}
				break;
			case 4:
				{
				setState(835);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(830);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						setState(827);
						database_name();
						setState(828);
						match(DOT);
						}
						break;
					}
					setState(832);
					table_alias();
					setState(833);
					match(DOT);
					}
					break;
				}
				setState(837);
				column_name();
				}
				break;
			case 5:
				{
				setState(838);
				match(OPEN_PARENTHESE);
				setState(839);
				expr(0);
				setState(840);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 6:
				{
				setState(842);
				match(K_CAST);
				setState(843);
				match(OPEN_PARENTHESE);
				setState(844);
				expr(0);
				setState(845);
				match(K_AS);
				setState(846);
				type_name();
				setState(847);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 7:
				{
				setState(853);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(850);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(849);
						match(K_NOT);
						}
					}

					setState(852);
					match(K_EXISTS);
					}
				}

				setState(855);
				match(OPEN_PARENTHESE);
				setState(856);
				select_stmt();
				setState(857);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 8:
				{
				setState(859);
				match(K_CASE);
				setState(861);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(860);
					expr(0);
					}
					break;
				}
				setState(868); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(863);
					match(K_WHEN);
					setState(864);
					expr(0);
					setState(865);
					match(K_THEN);
					setState(866);
					expr(0);
					}
					}
					setState(870); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(874);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(872);
					match(K_ELSE);
					setState(873);
					expr(0);
					}
				}

				setState(876);
				match(K_END);
				}
				break;
			case 9:
				{
				setState(878);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(981);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(979);
					switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(881);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(882);
						match(T__0);
						setState(883);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(884);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(885);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5 || _la==C3) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(886);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(887);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(888);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(889);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(890);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(891);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(892);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(893);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(894);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(895);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(896);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(909);
						switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
						case 1:
							{
							setState(897);
							match(T__15);
							}
							break;
						case 2:
							{
							setState(898);
							match(T__16);
							}
							break;
						case 3:
							{
							setState(899);
							match(T__17);
							}
							break;
						case 4:
							{
							setState(900);
							match(T__18);
							}
							break;
						case 5:
							{
							setState(901);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(902);
							match(K_IS);
							setState(903);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(904);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(905);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(906);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(907);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(908);
							match(K_REGEXP);
							}
							break;
						}
						setState(911);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(912);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(913);
						match(K_AND);
						setState(914);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(915);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(916);
						match(K_OR);
						setState(917);
						expr(13);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(918);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(919);
						match(K_IS);
						setState(921);
						switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
						case 1:
							{
							setState(920);
							match(K_NOT);
							}
							break;
						}
						setState(923);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(924);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(926);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(925);
							match(K_NOT);
							}
						}

						setState(928);
						match(K_BETWEEN);
						setState(929);
						expr(0);
						setState(930);
						match(K_AND);
						setState(931);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(933);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(934);
						match(K_COLLATE);
						setState(935);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(936);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(938);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(937);
							match(K_NOT);
							}
						}

						setState(940);
						_la = _input.LA(1);
						if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (K_GLOB - 46)) | (1L << (K_LIKE - 46)) | (1L << (K_MATCH - 46)) | (1L << (K_REGEXP - 46)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(941);
						expr(0);
						setState(944);
						switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
						case 1:
							{
							setState(942);
							match(K_ESCAPE);
							setState(943);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(946);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(951);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(947);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(948);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(949);
							match(K_NOT);
							setState(950);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(953);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(955);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(954);
							match(K_NOT);
							}
						}

						setState(957);
						match(K_IN);
						setState(977);
						switch (_input.LA(1)) {
						case OPEN_PARENTHESE:
							{
							setState(958);
							match(OPEN_PARENTHESE);
							setState(968);
							switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
							case 1:
								{
								setState(959);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(960);
								expr(0);
								setState(965);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==C1) {
									{
									{
									setState(961);
									match(C1);
									setState(962);
									expr(0);
									}
									}
									setState(967);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(970);
							match(CLOSE_PARENTHESE);
							}
							break;
						case K_ABORT:
						case K_ALL:
						case K_AND:
						case K_AS:
						case K_ASC:
						case K_BETWEEN:
						case K_BY:
						case K_CASE:
						case K_CAST:
						case K_COLLATE:
						case K_CROSS:
						case K_CURRENT_DATE:
						case K_CURRENT_TIME:
						case K_CURRENT_TIMESTAMP:
						case K_DESC:
						case K_DISTINCT:
						case K_ELSE:
						case K_END:
						case K_ESCAPE:
						case K_EXCEPT:
						case K_EXISTS:
						case K_FAIL:
						case K_FULL:
						case K_FROM:
						case K_GLOB:
						case K_GROUP:
						case K_HAVING:
						case K_IF:
						case K_IGNORE:
						case K_IN:
						case K_INDEXED:
						case K_INNER:
						case K_INTERSECT:
						case K_IS:
						case K_ISNULL:
						case K_JOIN:
						case K_LEFT:
						case K_LIKE:
						case K_LIMIT:
						case K_MATCH:
						case K_NATURAL:
						case K_NO:
						case K_NOT:
						case K_NOTNULL:
						case K_NULL:
						case K_OFFSET:
						case K_ON:
						case K_OR:
						case K_ORDER:
						case K_OUTER:
						case K_RAISE:
						case K_RECURSIVE:
						case K_REGEXP:
						case K_RIGHT:
						case K_ROLLBACK:
						case K_SELECT:
						case K_THEN:
						case K_UNION:
						case K_USING:
						case K_VALUES:
						case K_WHEN:
						case K_WHERE:
						case K_WITH:
						case K_GENERATE:
						case K_MAX:
						case K_MIN:
						case K_AVG:
						case K_COUNT:
						case K_SUM:
						case IDENTIFIER:
							{
							setState(974);
							switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
							case 1:
								{
								setState(971);
								database_name();
								setState(972);
								match(DOT);
								}
								break;
							}
							setState(976);
							table_name();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(983);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(queryParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(queryParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(queryParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(queryParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(queryParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(queryParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(queryParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (K_NULL - 66)) | (1L << (NUMERIC_LITERAL - 66)) | (1L << (BLOB_LITERAL - 66)) | (1L << (STRING_LITERAL - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(queryParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			_la = _input.LA(1);
			if ( !(((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__7 - 7)) | (1L << (T__19 - 7)) | (1L << (K_NOT - 7)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			any_name();
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

	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(990);
				name();
				}
				}
				setState(993); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ALL) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLLATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_ELSE) | (1L << K_END) | (1L << K_ESCAPE) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FAIL) | (1L << K_FULL) | (1L << K_FROM) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IGNORE) | (1L << K_IN) | (1L << K_INDEXED) | (1L << K_INNER) | (1L << K_INTERSECT) | (1L << K_IS) | (1L << K_ISNULL) | (1L << K_JOIN) | (1L << K_LEFT) | (1L << K_LIKE) | (1L << K_LIMIT) | (1L << K_MATCH) | (1L << K_NATURAL) | (1L << K_NO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_THEN - 64)) | (1L << (K_UNION - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (K_GENERATE - 64)) | (1L << (K_MAX - 64)) | (1L << (K_MIN - 64)) | (1L << (K_AVG - 64)) | (1L << (K_COUNT - 64)) | (1L << (K_SUM - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			setState(1005);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(995);
				match(OPEN_PARENTHESE);
				setState(996);
				signed_number();
				setState(997);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 2:
				{
				setState(999);
				match(OPEN_PARENTHESE);
				setState(1000);
				signed_number();
				setState(1001);
				match(C1);
				setState(1002);
				signed_number();
				setState(1003);
				match(CLOSE_PARENTHESE);
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			any_name();
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

	public static class Ag_function_nameContext extends ParserRuleContext {
		public Ag_keywordContext ag_keyword() {
			return getRuleContext(Ag_keywordContext.class,0);
		}
		public Ag_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ag_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterAg_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitAg_function_name(this);
		}
	}

	public final Ag_function_nameContext ag_function_name() throws RecognitionException {
		Ag_function_nameContext _localctx = new Ag_function_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ag_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			ag_keyword();
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

	public static class Ag_keywordContext extends ParserRuleContext {
		public TerminalNode K_MAX() { return getToken(queryParser.K_MAX, 0); }
		public TerminalNode K_MIN() { return getToken(queryParser.K_MIN, 0); }
		public TerminalNode K_SUM() { return getToken(queryParser.K_SUM, 0); }
		public TerminalNode K_AVG() { return getToken(queryParser.K_AVG, 0); }
		public TerminalNode K_COUNT() { return getToken(queryParser.K_COUNT, 0); }
		public Ag_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ag_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterAg_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitAg_keyword(this);
		}
	}

	public final Ag_keywordContext ag_keyword() throws RecognitionException {
		Ag_keywordContext _localctx = new Ag_keywordContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ag_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			_la = _input.LA(1);
			if ( !(((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (K_MAX - 86)) | (1L << (K_MIN - 86)) | (1L << (K_AVG - 86)) | (1L << (K_COUNT - 86)) | (1L << (K_SUM - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitCollation_name(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitDatabase_name(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			any_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			any_name();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(queryParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(queryParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitColumn_alias(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitTable_alias(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitIndex_name(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(queryParser.IDENTIFIER, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitAny_name(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_any_name);
		try {
			setState(1029);
			switch (_input.LA(1)) {
			case K_ABORT:
			case K_ALL:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_BETWEEN:
			case K_BY:
			case K_CASE:
			case K_CAST:
			case K_COLLATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DESC:
			case K_DISTINCT:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXISTS:
			case K_FAIL:
			case K_FULL:
			case K_FROM:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IN:
			case K_INDEXED:
			case K_INNER:
			case K_INTERSECT:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REGEXP:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_SELECT:
			case K_THEN:
			case K_UNION:
			case K_USING:
			case K_VALUES:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_GENERATE:
			case K_MAX:
			case K_MIN:
			case K_AVG:
			case K_COUNT:
			case K_SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				keyword();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1028);
				match(IDENTIFIER);
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

	public static class SlContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(queryParser.STRING_LITERAL, 0); }
		public SlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterSl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitSl(this);
		}
	}

	public final SlContext sl() throws RecognitionException {
		SlContext _localctx = new SlContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_sl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			match(STRING_LITERAL);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(queryParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitSigned_number(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			_la = _input.LA(1);
			if (_la==T__6 || _la==T__7) {
				{
				setState(1033);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1036);
			match(NUMERIC_LITERAL);
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

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(queryParser.K_RAISE, 0); }
		public TerminalNode K_IGNORE() { return getToken(queryParser.K_IGNORE, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(queryParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(queryParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(queryParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitRaise_function(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(K_RAISE);
			setState(1039);
			match(OPEN_PARENTHESE);
			setState(1044);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1040);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1041);
				_la = _input.LA(1);
				if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (K_ABORT - 21)) | (1L << (K_FAIL - 21)) | (1L << (K_ROLLBACK - 21)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1042);
				match(C1);
				setState(1043);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1046);
			match(CLOSE_PARENTHESE);
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(queryParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitError_message(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(STRING_LITERAL);
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
		case 16:
			return arithmetics_sempred((ArithmeticsContext)_localctx, predIndex);
		case 35:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetics_sempred(ArithmeticsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 8);
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3r\u041d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\5\2t\n\2\3\3\3\3\5"+
		"\3x\n\3\3\3\5\3{\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0087"+
		"\n\5\3\5\3\5\3\5\5\5\u008c\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0095\n"+
		"\5\3\5\3\5\5\5\u0099\n\5\3\5\3\5\7\5\u009d\n\5\f\5\16\5\u00a0\13\5\3\5"+
		"\5\5\u00a3\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u00b4\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00be\n\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00c4\n\7\5\7\u00c6\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00d0\n\7\3\7\3\7\3\7\3\7\5\7\u00d6\n\7\5\7\u00d8\n\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u00e2\n\7\3\7\3\7\3\7\3\7\5\7\u00e8\n\7\5\7\u00ea"+
		"\n\7\5\7\u00ec\n\7\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00f4\n\t\7\t\u00f6\n\t"+
		"\f\t\16\t\u00f9\13\t\3\n\3\n\3\n\3\n\5\n\u00ff\n\n\7\n\u0101\n\n\f\n\16"+
		"\n\u0104\13\n\3\13\3\13\5\13\u0108\n\13\3\13\3\13\3\13\5\13\u010d\n\13"+
		"\7\13\u010f\n\13\f\13\16\13\u0112\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u011e\n\r\3\16\5\16\u0121\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0128\n\16\3\16\3\16\3\16\3\16\5\16\u012e\n\16\7\16\u0130\n\16\f"+
		"\16\16\16\u0133\13\16\7\16\u0135\n\16\f\16\16\16\u0138\13\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0142\n\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0148\n\17\7\17\u014a\n\17\f\17\16\17\u014d\13\17\7\17\u014f\n\17\f\17"+
		"\16\17\u0152\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u015b\n\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0176\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0180\n\22\3\22\3\22\5\22"+
		"\u0184\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u018c\n\22\f\22\16\22\u018f"+
		"\13\22\3\23\3\23\5\23\u0193\n\23\3\24\3\24\3\24\3\25\3\25\6\25\u019a\n"+
		"\25\r\25\16\25\u019b\3\25\7\25\u019f\n\25\f\25\16\25\u01a2\13\25\3\25"+
		"\7\25\u01a5\n\25\f\25\16\25\u01a8\13\25\3\26\3\26\5\26\u01ac\n\26\3\27"+
		"\3\27\5\27\u01b0\n\27\3\27\3\27\3\27\7\27\u01b5\n\27\f\27\16\27\u01b8"+
		"\13\27\5\27\u01ba\n\27\3\27\3\27\3\27\3\27\7\27\u01c0\n\27\f\27\16\27"+
		"\u01c3\13\27\3\27\3\27\3\27\3\27\3\27\7\27\u01ca\n\27\f\27\16\27\u01cd"+
		"\13\27\5\27\u01cf\n\27\3\27\3\27\3\27\3\27\5\27\u01d5\n\27\5\27\u01d7"+
		"\n\27\3\30\3\30\5\30\u01db\n\30\3\30\3\30\3\30\7\30\u01e0\n\30\f\30\16"+
		"\30\u01e3\13\30\5\30\u01e5\n\30\3\30\3\30\3\30\3\30\7\30\u01eb\n\30\f"+
		"\30\16\30\u01ee\13\30\3\30\5\30\u01f1\n\30\3\30\5\30\u01f4\n\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01fe\n\31\f\31\16\31\u0201\13"+
		"\31\3\31\3\31\5\31\u0205\n\31\5\31\u0207\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u020e\n\31\f\31\16\31\u0211\13\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u0219\n\31\f\31\16\31\u021c\13\31\3\31\3\31\7\31\u0220\n\31\f\31"+
		"\16\31\u0223\13\31\5\31\u0225\n\31\3\31\3\31\5\31\u0229\n\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u0230\n\31\f\31\16\31\u0233\13\31\3\31\3\31\5\31"+
		"\u0237\n\31\3\31\3\31\3\31\3\31\3\31\7\31\u023e\n\31\f\31\16\31\u0241"+
		"\13\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0249\n\31\f\31\16\31\u024c"+
		"\13\31\3\31\3\31\7\31\u0250\n\31\f\31\16\31\u0253\13\31\5\31\u0255\n\31"+
		"\5\31\u0257\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0260\n\32\3"+
		"\32\5\32\u0263\n\32\5\32\u0265\n\32\3\33\3\33\3\33\5\33\u026a\n\33\3\33"+
		"\3\33\5\33\u026e\n\33\3\33\5\33\u0271\n\33\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u0278\n\33\3\33\3\33\3\33\3\33\7\33\u027e\n\33\f\33\16\33\u0281\13"+
		"\33\3\33\5\33\u0284\n\33\3\33\3\33\5\33\u0288\n\33\3\33\5\33\u028b\n\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0291\n\33\3\33\5\33\u0294\n\33\5\33\u0296\n"+
		"\33\3\34\3\34\3\35\3\35\5\35\u029c\n\35\3\35\3\35\3\35\7\35\u02a1\n\35"+
		"\f\35\16\35\u02a4\13\35\5\35\u02a6\n\35\3\35\3\35\3\35\3\35\7\35\u02ac"+
		"\n\35\f\35\16\35\u02af\13\35\3\35\3\35\3\35\3\35\3\35\7\35\u02b6\n\35"+
		"\f\35\16\35\u02b9\13\35\5\35\u02bb\n\35\3\35\3\35\3\35\3\35\5\35\u02c1"+
		"\n\35\5\35\u02c3\n\35\3\36\3\36\5\36\u02c7\n\36\3\36\3\36\3\36\7\36\u02cc"+
		"\n\36\f\36\16\36\u02cf\13\36\5\36\u02d1\n\36\3\36\3\36\3\36\3\36\7\36"+
		"\u02d7\n\36\f\36\16\36\u02da\13\36\3\36\5\36\u02dd\n\36\3\36\5\36\u02e0"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u02e7\n\37\3 \3 \3 \3 \5 \u02ed\n"+
		" \3 \3 \7 \u02f1\n \f \16 \u02f4\13 \3!\3!\5!\u02f8\n!\3!\3!\5!\u02fc"+
		"\n!\3!\3!\5!\u0300\n!\3!\3!\5!\u0304\n!\3!\3!\5!\u0308\n!\3!\5!\u030b"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0314\n\"\f\"\16\"\u0317\13\"\3\""+
		"\3\"\5\"\u031b\n\"\3#\3#\3#\3#\3#\7#\u0322\n#\f#\16#\u0325\13#\3#\3#\5"+
		"#\u0329\n#\3#\3#\3#\3#\3#\3$\3$\3$\5$\u0333\n$\3$\5$\u0336\n$\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\5%\u0341\n%\3%\3%\3%\5%\u0346\n%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\5%\u0355\n%\3%\5%\u0358\n%\3%\3%\3%\3%\3%\3%\5"+
		"%\u0360\n%\3%\3%\3%\3%\3%\6%\u0367\n%\r%\16%\u0368\3%\3%\5%\u036d\n%\3"+
		"%\3%\3%\5%\u0372\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0390\n%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\5%\u039c\n%\3%\3%\3%\5%\u03a1\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\5%\u03ad\n%\3%\3%\3%\3%\5%\u03b3\n%\3%\3%\3%\3%\3%\5%\u03ba\n%\3%\3"+
		"%\5%\u03be\n%\3%\3%\3%\3%\3%\3%\7%\u03c6\n%\f%\16%\u03c9\13%\5%\u03cb"+
		"\n%\3%\3%\3%\3%\5%\u03d1\n%\3%\5%\u03d4\n%\7%\u03d6\n%\f%\16%\u03d9\13"+
		"%\3&\3&\3\'\3\'\3(\3(\3)\6)\u03e2\n)\r)\16)\u03e3\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\5)\u03f0\n)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\5\64\u0408\n\64\3\65\3\65\3\66"+
		"\5\66\u040d\n\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0417\n"+
		"\67\3\67\3\67\38\38\38\2\4\"H9\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\20\4\2\7\b``\3\2"+
		"\t\n\4\2EE^^\4\2\31\31\'\'\4\2\27\27\31\\\4\2\34\34&&\4\2\5\5\13\r\3\2"+
		"\16\21\6\2\60\60==??LL\6\2#%DDjknn\5\2\t\n\26\26BB\3\2X\\\3\2mn\5\2\27"+
		"\27--NN\u04b0\2p\3\2\2\2\4w\3\2\2\2\6|\3\2\2\2\b\u0098\3\2\2\2\n\u00b3"+
		"\3\2\2\2\f\u00eb\3\2\2\2\16\u00ed\3\2\2\2\20\u00ef\3\2\2\2\22\u00fa\3"+
		"\2\2\2\24\u0107\3\2\2\2\26\u0113\3\2\2\2\30\u011d\3\2\2\2\32\u0120\3\2"+
		"\2\2\34\u013b\3\2\2\2\36\u0155\3\2\2\2 \u0175\3\2\2\2\"\u0183\3\2\2\2"+
		"$\u0192\3\2\2\2&\u0194\3\2\2\2(\u0197\3\2\2\2*\u01ab\3\2\2\2,\u01b9\3"+
		"\2\2\2.\u01e4\3\2\2\2\60\u0256\3\2\2\2\62\u0264\3\2\2\2\64\u0295\3\2\2"+
		"\2\66\u0297\3\2\2\28\u02a5\3\2\2\2:\u02d0\3\2\2\2<\u02e6\3\2\2\2>\u02e8"+
		"\3\2\2\2@\u030a\3\2\2\2B\u031a\3\2\2\2D\u031c\3\2\2\2F\u032f\3\2\2\2H"+
		"\u0371\3\2\2\2J\u03da\3\2\2\2L\u03dc\3\2\2\2N\u03de\3\2\2\2P\u03e1\3\2"+
		"\2\2R\u03f1\3\2\2\2T\u03f3\3\2\2\2V\u03f5\3\2\2\2X\u03f7\3\2\2\2Z\u03f9"+
		"\3\2\2\2\\\u03fb\3\2\2\2^\u03fd\3\2\2\2`\u03ff\3\2\2\2b\u0401\3\2\2\2"+
		"d\u0403\3\2\2\2f\u0407\3\2\2\2h\u0409\3\2\2\2j\u040c\3\2\2\2l\u0410\3"+
		"\2\2\2n\u041a\3\2\2\2pq\5\6\4\2qs\5\4\3\2rt\5$\23\2sr\3\2\2\2st\3\2\2"+
		"\2t\3\3\2\2\2ux\5\b\5\2vx\5\16\b\2wu\3\2\2\2wv\3\2\2\2xz\3\2\2\2y{\7i"+
		"\2\2zy\3\2\2\2z{\3\2\2\2{\5\3\2\2\2|}\7W\2\2}~\7m\2\2~\7\3\2\2\2\177\u0099"+
		"\5\32\16\2\u0080\u0099\5\34\17\2\u0081\u0082\7f\2\2\u0082\u0083\5\16\b"+
		"\2\u0083\u0084\7g\2\2\u0084\u0099\3\2\2\2\u0085\u0087\5\30\r\2\u0086\u0085"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b\3\2\2\2\u0088\u0089\5b\62\2\u0089"+
		"\u008a\7a\2\2\u008a\u008c\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u0099\5`\61\2\u008e\u0099\5\n\6\2\u008f"+
		"\u0099\5\f\7\2\u0090\u0099\5 \21\2\u0091\u0099\5h\65\2\u0092\u0099\7j"+
		"\2\2\u0093\u0095\5\30\r\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0099\5\36\20\2\u0097\u0099\5\"\22\2\u0098\177\3"+
		"\2\2\2\u0098\u0080\3\2\2\2\u0098\u0081\3\2\2\2\u0098\u0086\3\2\2\2\u0098"+
		"\u008e\3\2\2\2\u0098\u008f\3\2\2\2\u0098\u0090\3\2\2\2\u0098\u0091\3\2"+
		"\2\2\u0098\u0092\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009e\3\2\2\2\u009a\u009b\7\3\2\2\u009b\u009d\5\b\5\2\u009c\u009a\3\2"+
		"\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\7i\2\2\u00a2\u00a1\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\t\3\2\2\2\u00a4\u00a5\7d\2\2\u00a5\u00a6"+
		"\5\16\b\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7^\2\2\u00a8\u00b4\3\2\2\2\u00a9"+
		"\u00aa\7d\2\2\u00aa\u00ab\5\16\b\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7_\2"+
		"\2\u00ad\u00b4\3\2\2\2\u00ae\u00af\7d\2\2\u00af\u00b0\5\16\b\2\u00b0\u00b1"+
		"\7e\2\2\u00b1\u00b2\7`\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00a4\3\2\2\2\u00b3"+
		"\u00a9\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\13\3\2\2\2\u00b5\u00b6\7d\2\2"+
		"\u00b6\u00b7\5\16\b\2\u00b7\u00b8\7e\2\2\u00b8\u00c5\7^\2\2\u00b9\u00ba"+
		"\7j\2\2\u00ba\u00bd\7_\2\2\u00bb\u00bc\7j\2\2\u00bc\u00be\7`\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c6\3\2\2\2\u00bf\u00c0\7j"+
		"\2\2\u00c0\u00c3\7`\2\2\u00c1\u00c2\7j\2\2\u00c2\u00c4\7_\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5"+
		"\u00bf\3\2\2\2\u00c6\u00ec\3\2\2\2\u00c7\u00c8\7d\2\2\u00c8\u00c9\5\16"+
		"\b\2\u00c9\u00ca\7e\2\2\u00ca\u00d7\7_\2\2\u00cb\u00cc\7j\2\2\u00cc\u00cf"+
		"\7^\2\2\u00cd\u00ce\7j\2\2\u00ce\u00d0\7`\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d8\3\2\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d5\7`\2"+
		"\2\u00d3\u00d4\7j\2\2\u00d4\u00d6\7^\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00cb\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d8"+
		"\u00ec\3\2\2\2\u00d9\u00da\7d\2\2\u00da\u00db\5\16\b\2\u00db\u00dc\7e"+
		"\2\2\u00dc\u00e9\7`\2\2\u00dd\u00de\7j\2\2\u00de\u00e1\7^\2\2\u00df\u00e0"+
		"\7j\2\2\u00e0\u00e2\7_\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00ea\3\2\2\2\u00e3\u00e4\7j\2\2\u00e4\u00e7\7_\2\2\u00e5\u00e6\7j\2"+
		"\2\u00e6\u00e8\7^\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea"+
		"\3\2\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00e3\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00b5\3\2\2\2\u00eb\u00c7\3\2\2\2\u00eb\u00d9\3\2\2\2\u00ec\r\3\2\2\2"+
		"\u00ed\u00ee\5\20\t\2\u00ee\17\3\2\2\2\u00ef\u00f7\5\22\n\2\u00f0\u00f3"+
		"\7`\2\2\u00f1\u00f4\5\22\n\2\u00f2\u00f4\5\b\5\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6\u00f9\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\21\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00fa\u0102\5\24\13\2\u00fb\u00fe\7_\2\2\u00fc\u00ff\5\24\13"+
		"\2\u00fd\u00ff\5\b\5\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0101"+
		"\3\2\2\2\u0100\u00fb\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\23\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0108\5\b\5"+
		"\2\u0106\u0108\5\26\f\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\u0110\3\2\2\2\u0109\u010c\7^\2\2\u010a\u010d\5\b\5\2\u010b\u010d\5\26"+
		"\f\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u0109\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\25\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\5\b\5\2\u0114\u0115"+
		"\7]\2\2\u0115\u0116\5\b\5\2\u0116\27\3\2\2\2\u0117\u0118\7b\2\2\u0118"+
		"\u0119\7\34\2\2\u0119\u011e\7c\2\2\u011a\u011b\7b\2\2\u011b\u011c\7&\2"+
		"\2\u011c\u011e\7c\2\2\u011d\u0117\3\2\2\2\u011d\u011a\3\2\2\2\u011e\31"+
		"\3\2\2\2\u011f\u0121\7\4\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\5R*\2\u0123\u0136\7b\2\2\u0124\u0128\5\b\5"+
		"\2\u0125\u0128\5\16\b\2\u0126\u0128\5H%\2\u0127\u0124\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u0131\3\2\2\2\u0129\u012d\7^\2\2\u012a"+
		"\u012e\5\b\5\2\u012b\u012e\5\16\b\2\u012c\u012e\5H%\2\u012d\u012a\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u0130\3\2\2\2\u012f"+
		"\u0129\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0127\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7c\2\2\u013a\33\3\2\2\2\u013b\u013c"+
		"\7\5\2\2\u013c\u013d\5R*\2\u013d\u0150\7b\2\2\u013e\u0142\5\b\5\2\u013f"+
		"\u0142\5\16\b\2\u0140\u0142\5H%\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0140\3\2\2\2\u0142\u014b\3\2\2\2\u0143\u0147\7^\2\2\u0144"+
		"\u0148\5\b\5\2\u0145\u0148\5\16\b\2\u0146\u0148\5H%\2\u0147\u0144\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u014a\3\2\2\2\u0149"+
		"\u0143\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0141\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7c\2\2\u0154\35\3\2\2\2\u0155\u0156"+
		"\5T+\2\u0156\u015a\7d\2\2\u0157\u0158\5b\62\2\u0158\u0159\7a\2\2\u0159"+
		"\u015b\3\2\2\2\u015a\u0157\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015d\5`\61\2\u015d\u015e\3\2\2\2\u015e\u015f\7e\2\2\u015f"+
		"\37\3\2\2\2\u0160\u0161\7\63\2\2\u0161\u0162\7b\2\2\u0162\u0163\5H%\2"+
		"\u0163\u0164\7c\2\2\u0164\u0165\7P\2\2\u0165\u0166\7b\2\2\u0166\u0167"+
		"\5\16\b\2\u0167\u0168\7c\2\2\u0168\u0169\7(\2\2\u0169\u016a\7b\2\2\u016a"+
		"\u016b\5\16\b\2\u016b\u016c\7c\2\2\u016c\u0176\3\2\2\2\u016d\u016e\7b"+
		"\2\2\u016e\u016f\5H%\2\u016f\u0170\7c\2\2\u0170\u0171\7]\2\2\u0171\u0172"+
		"\5\16\b\2\u0172\u0173\7\6\2\2\u0173\u0174\5\16\b\2\u0174\u0176\3\2\2\2"+
		"\u0175\u0160\3\2\2\2\u0175\u016d\3\2\2\2\u0176!\3\2\2\2\u0177\u0178\b"+
		"\22\1\2\u0178\u0179\7b\2\2\u0179\u017a\5\"\22\2\u017a\u017b\7c\2\2\u017b"+
		"\u0184\3\2\2\2\u017c\u017d\5b\62\2\u017d\u017e\7a\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u017c\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0184\5`\61\2\u0182\u0184\7j\2\2\u0183\u0177\3\2\2\2\u0183\u017f\3\2"+
		"\2\2\u0183\u0182\3\2\2\2\u0184\u018d\3\2\2\2\u0185\u0186\f\4\2\2\u0186"+
		"\u0187\t\2\2\2\u0187\u018c\5\"\22\5\u0188\u0189\f\3\2\2\u0189\u018a\t"+
		"\3\2\2\u018a\u018c\5\"\22\4\u018b\u0185\3\2\2\2\u018b\u0188\3\2\2\2\u018c"+
		"\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e#\3\2\2\2"+
		"\u018f\u018d\3\2\2\2\u0190\u0193\5(\25\2\u0191\u0193\5&\24\2\u0192\u0190"+
		"\3\2\2\2\u0192\u0191\3\2\2\2\u0193%\3\2\2\2\u0194\u0195\7r\2\2\u0195\u0196"+
		"\b\24\1\2\u0196\'\3\2\2\2\u0197\u01a0\5*\26\2\u0198\u019a\7h\2\2\u0199"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u019f\5*\26\2\u019e\u0199\3\2\2\2\u019f"+
		"\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a6\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a5\7h\2\2\u01a4\u01a3\3\2\2\2\u01a5"+
		"\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7)\3\2\2\2"+
		"\u01a8\u01a6\3\2\2\2\u01a9\u01ac\5,\27\2\u01aa\u01ac\58\35\2\u01ab\u01a9"+
		"\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac+\3\2\2\2\u01ad\u01af\7V\2\2\u01ae\u01b0"+
		"\7K\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b6\5D#\2\u01b2\u01b3\7^\2\2\u01b3\u01b5\5D#\2\u01b4\u01b2\3\2\2\2"+
		"\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01ba"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ad\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01c1\5.\30\2\u01bc\u01bd\5<\37\2\u01bd\u01be\5."+
		"\30\2\u01be\u01c0\3\2\2\2\u01bf\u01bc\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01ce\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c4\u01c5\7H\2\2\u01c5\u01c6\7\36\2\2\u01c6\u01cb\5F$\2\u01c7\u01c8"+
		"\7^\2\2\u01c8\u01ca\5F$\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2"+
		"\2\2\u01ce\u01c4\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d6\3\2\2\2\u01d0"+
		"\u01d1\7>\2\2\u01d1\u01d4\5H%\2\u01d2\u01d3\t\4\2\2\u01d3\u01d5\5H%\2"+
		"\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d0"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7-\3\2\2\2\u01d8\u01da\7O\2\2\u01d9\u01db"+
		"\t\5\2\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01e1\5\62\32\2\u01dd\u01de\7^\2\2\u01de\u01e0\5\62\32\2\u01df\u01dd"+
		"\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01d8\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01f0\7/\2\2\u01e7\u01ec\5\64\33\2\u01e8"+
		"\u01e9\7^\2\2\u01e9\u01eb\5\64\33\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee\3"+
		"\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f1\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ef\u01f1\5> \2\u01f0\u01e7\3\2\2\2\u01f0\u01ef\3\2\2"+
		"\2\u01f1\u01f3\3\2\2\2\u01f2\u01f4\5\60\31\2\u01f3\u01f2\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4/\3\2\2\2\u01f5\u01f6\7U\2\2\u01f6\u01f7\5H%\2\u01f7"+
		"\u0206\3\2\2\2\u01f8\u01f9\7\61\2\2\u01f9\u01fa\7\36\2\2\u01fa\u01ff\5"+
		"H%\2\u01fb\u01fc\7^\2\2\u01fc\u01fe\5H%\2\u01fd\u01fb\3\2\2\2\u01fe\u0201"+
		"\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0204\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0202\u0203\7\62\2\2\u0203\u0205\5H%\2\u0204\u0202\3\2"+
		"\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u01f8\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0225\3\2\2\2\u0208\u0209\7S\2\2\u0209\u020a\7b\2"+
		"\2\u020a\u020f\5H%\2\u020b\u020c\7^\2\2\u020c\u020e\5H%\2\u020d\u020b"+
		"\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0221\7c\2\2\u0213\u0214\7^\2"+
		"\2\u0214\u0215\7b\2\2\u0215\u021a\5H%\2\u0216\u0217\7^\2\2\u0217\u0219"+
		"\5H%\2\u0218\u0216\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\7c"+
		"\2\2\u021e\u0220\3\2\2\2\u021f\u0213\3\2\2\2\u0220\u0223\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2"+
		"\2\2\u0224\u01f5\3\2\2\2\u0224\u0208\3\2\2\2\u0225\u0257\3\2\2\2\u0226"+
		"\u0227\7U\2\2\u0227\u0229\5H%\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2"+
		"\2\u0229\u022a\3\2\2\2\u022a\u022b\7\61\2\2\u022b\u022c\7\36\2\2\u022c"+
		"\u0231\5H%\2\u022d\u022e\7^\2\2\u022e\u0230\5H%\2\u022f\u022d\3\2\2\2"+
		"\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0236"+
		"\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0235\7\62\2\2\u0235\u0237\5H%\2\u0236"+
		"\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0255\3\2\2\2\u0238\u0239\7S"+
		"\2\2\u0239\u023a\7b\2\2\u023a\u023f\5H%\2\u023b\u023c\7^\2\2\u023c\u023e"+
		"\5H%\2\u023d\u023b\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0251\7c"+
		"\2\2\u0243\u0244\7^\2\2\u0244\u0245\7b\2\2\u0245\u024a\5H%\2\u0246\u0247"+
		"\7^\2\2\u0247\u0249\5H%\2\u0248\u0246\3\2\2\2\u0249\u024c\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u024a\3\2"+
		"\2\2\u024d\u024e\7c\2\2\u024e\u0250\3\2\2\2\u024f\u0243\3\2\2\2\u0250"+
		"\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0255\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0254\u0228\3\2\2\2\u0254\u0238\3\2\2\2\u0255"+
		"\u0257\3\2\2\2\u0256\u0224\3\2\2\2\u0256\u0254\3\2\2\2\u0257\61\3\2\2"+
		"\2\u0258\u0265\7\7\2\2\u0259\u025a\5\\/\2\u025a\u025b\7a\2\2\u025b\u025c"+
		"\7\7\2\2\u025c\u0265\3\2\2\2\u025d\u0262\5H%\2\u025e\u0260\7\33\2\2\u025f"+
		"\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\5^"+
		"\60\2\u0262\u025f\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264"+
		"\u0258\3\2\2\2\u0264\u0259\3\2\2\2\u0264\u025d\3\2\2\2\u0265\63\3\2\2"+
		"\2\u0266\u0267\5Z.\2\u0267\u0268\7a\2\2\u0268\u026a\3\2\2\2\u0269\u0266"+
		"\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u0270\5\\/\2\u026c"+
		"\u026e\7\33\2\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3"+
		"\2\2\2\u026f\u0271\5b\62\2\u0270\u026d\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0277\3\2\2\2\u0272\u0273\7\66\2\2\u0273\u0274\7\36\2\2\u0274\u0278\5"+
		"d\63\2\u0275\u0276\7B\2\2\u0276\u0278\7\66\2\2\u0277\u0272\3\2\2\2\u0277"+
		"\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0296\3\2\2\2\u0279\u0283\7b"+
		"\2\2\u027a\u027f\5\64\33\2\u027b\u027c\7^\2\2\u027c\u027e\5\64\33\2\u027d"+
		"\u027b\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2"+
		"\2\2\u0280\u0284\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0284\5> \2\u0283\u027a"+
		"\3\2\2\2\u0283\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u028a\7c\2\2\u0286"+
		"\u0288\7\33\2\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\3"+
		"\2\2\2\u0289\u028b\5b\62\2\u028a\u0287\3\2\2\2\u028a\u028b\3\2\2\2\u028b"+
		"\u0296\3\2\2\2\u028c\u028d\7b\2\2\u028d\u028e\58\35\2\u028e\u0293\7c\2"+
		"\2\u028f\u0291\7\33\2\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292\u0294\5b\62\2\u0293\u0290\3\2\2\2\u0293\u0294\3\2"+
		"\2\2\u0294\u0296\3\2\2\2\u0295\u0269\3\2\2\2\u0295\u0279\3\2\2\2\u0295"+
		"\u028c\3\2\2\2\u0296\65\3\2\2\2\u0297\u0298\t\6\2\2\u0298\67\3\2\2\2\u0299"+
		"\u029b\7V\2\2\u029a\u029c\7K\2\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2"+
		"\2\u029c\u029d\3\2\2\2\u029d\u02a2\5D#\2\u029e\u029f\7^\2\2\u029f\u02a1"+
		"\5D#\2\u02a0\u029e\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u0299\3\2"+
		"\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02ad\5:\36\2\u02a8"+
		"\u02a9\5<\37\2\u02a9\u02aa\5:\36\2\u02aa\u02ac\3\2\2\2\u02ab\u02a8\3\2"+
		"\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"+
		"\u02ba\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b1\7H\2\2\u02b1\u02b2\7\36"+
		"\2\2\u02b2\u02b7\5F$\2\u02b3\u02b4\7^\2\2\u02b4\u02b6\5F$\2\u02b5\u02b3"+
		"\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02b0\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb\u02c2\3\2\2\2\u02bc\u02bd\7>\2\2\u02bd\u02c0\5H%\2\u02be\u02bf"+
		"\t\4\2\2\u02bf\u02c1\5H%\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02c3\3\2\2\2\u02c2\u02bc\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c39\3\2\2\2"+
		"\u02c4\u02c6\7O\2\2\u02c5\u02c7\t\5\2\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7"+
		"\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02cd\5\62\32\2\u02c9\u02ca\7^\2\2"+
		"\u02ca\u02cc\5\62\32\2\u02cb\u02c9\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb"+
		"\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0"+
		"\u02c4\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02dc\7/"+
		"\2\2\u02d3\u02d8\5\64\33\2\u02d4\u02d5\7^\2\2\u02d5\u02d7\5\64\33\2\u02d6"+
		"\u02d4\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2"+
		"\2\2\u02d9\u02dd\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02dd\5> \2\u02dc\u02d3"+
		"\3\2\2\2\u02dc\u02db\3\2\2\2\u02dd\u02df\3\2\2\2\u02de\u02e0\5\60\31\2"+
		"\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0;\3\2\2\2\u02e1\u02e7\7"+
		"Q\2\2\u02e2\u02e3\7Q\2\2\u02e3\u02e7\7\31\2\2\u02e4\u02e7\78\2\2\u02e5"+
		"\u02e7\7+\2\2\u02e6\u02e1\3\2\2\2\u02e6\u02e2\3\2\2\2\u02e6\u02e4\3\2"+
		"\2\2\u02e6\u02e5\3\2\2\2\u02e7=\3\2\2\2\u02e8\u02f2\5\64\33\2\u02e9\u02ec"+
		"\5@!\2\u02ea\u02ed\5> \2\u02eb\u02ed\5\64\33\2\u02ec\u02ea\3\2\2\2\u02ec"+
		"\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\5B\"\2\u02ef\u02f1\3\2"+
		"\2\2\u02f0\u02e9\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2"+
		"\u02f3\3\2\2\2\u02f3?\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u030b\7^\2\2\u02f6"+
		"\u02f8\7@\2\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u0307\3\2"+
		"\2\2\u02f9\u02fb\7<\2\2\u02fa\u02fc\7I\2\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc"+
		"\3\2\2\2\u02fc\u0308\3\2\2\2\u02fd\u02ff\7M\2\2\u02fe\u0300\7I\2\2\u02ff"+
		"\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0308\3\2\2\2\u0301\u0303\7."+
		"\2\2\u0302\u0304\7I\2\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304"+
		"\u0308\3\2\2\2\u0305\u0308\7\67\2\2\u0306\u0308\7\"\2\2\u0307\u02f9\3"+
		"\2\2\2\u0307\u02fd\3\2\2\2\u0307\u0301\3\2\2\2\u0307\u0305\3\2\2\2\u0307"+
		"\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\7;"+
		"\2\2\u030a\u02f5\3\2\2\2\u030a\u02f7\3\2\2\2\u030bA\3\2\2\2\u030c\u030d"+
		"\7F\2\2\u030d\u031b\5H%\2\u030e\u030f\7R\2\2\u030f\u0310\7b\2\2\u0310"+
		"\u0315\5`\61\2\u0311\u0312\7^\2\2\u0312\u0314\5`\61\2\u0313\u0311\3\2"+
		"\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		"\u0318\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u0319\7c\2\2\u0319\u031b\3\2"+
		"\2\2\u031a\u030c\3\2\2\2\u031a\u030e\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"C\3\2\2\2\u031c\u0328\5\\/\2\u031d\u031e\7b\2\2\u031e\u0323\5`\61\2\u031f"+
		"\u0320\7^\2\2\u0320\u0322\5`\61\2\u0321\u031f\3\2\2\2\u0322\u0325\3\2"+
		"\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\3\2\2\2\u0325"+
		"\u0323\3\2\2\2\u0326\u0327\7c\2\2\u0327\u0329\3\2\2\2\u0328\u031d\3\2"+
		"\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b\7\33\2\2\u032b"+
		"\u032c\7b\2\2\u032c\u032d\58\35\2\u032d\u032e\7c\2\2\u032eE\3\2\2\2\u032f"+
		"\u0332\5H%\2\u0330\u0331\7!\2\2\u0331\u0333\5X-\2\u0332\u0330\3\2\2\2"+
		"\u0332\u0333\3\2\2\2\u0333\u0335\3\2\2\2\u0334\u0336\t\7\2\2\u0335\u0334"+
		"\3\2\2\2\u0335\u0336\3\2\2\2\u0336G\3\2\2\2\u0337\u0338\b%\1\2\u0338\u0339"+
		"\5L\'\2\u0339\u033a\5H%\26\u033a\u0372\3\2\2\2\u033b\u0372\5\b\5\2\u033c"+
		"\u0372\7l\2\2\u033d\u033e\5Z.\2\u033e\u033f\7a\2\2\u033f\u0341\3\2\2\2"+
		"\u0340\u033d\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343"+
		"\5b\62\2\u0343\u0344\7a\2\2\u0344\u0346\3\2\2\2\u0345\u0340\3\2\2\2\u0345"+
		"\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0372\5`\61\2\u0348\u0349\7b"+
		"\2\2\u0349\u034a\5H%\2\u034a\u034b\7c\2\2\u034b\u0372\3\2\2\2\u034c\u034d"+
		"\7 \2\2\u034d\u034e\7b\2\2\u034e\u034f\5H%\2\u034f\u0350\7\33\2\2\u0350"+
		"\u0351\5P)\2\u0351\u0352\7c\2\2\u0352\u0372\3\2\2\2\u0353\u0355\7B\2\2"+
		"\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0358"+
		"\7,\2\2\u0357\u0354\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u035a\7b\2\2\u035a\u035b\58\35\2\u035b\u035c\7c\2\2\u035c\u0372\3\2\2"+
		"\2\u035d\u035f\7\37\2\2\u035e\u0360\5H%\2\u035f\u035e\3\2\2\2\u035f\u0360"+
		"\3\2\2\2\u0360\u0366\3\2\2\2\u0361\u0362\7T\2\2\u0362\u0363\5H%\2\u0363"+
		"\u0364\7P\2\2\u0364\u0365\5H%\2\u0365\u0367\3\2\2\2\u0366\u0361\3\2\2"+
		"\2\u0367\u0368\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036c"+
		"\3\2\2\2\u036a\u036b\7(\2\2\u036b\u036d\5H%\2\u036c\u036a\3\2\2\2\u036c"+
		"\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f\7)\2\2\u036f\u0372\3\2"+
		"\2\2\u0370\u0372\5l\67\2\u0371\u0337\3\2\2\2\u0371\u033b\3\2\2\2\u0371"+
		"\u033c\3\2\2\2\u0371\u0345\3\2\2\2\u0371\u0348\3\2\2\2\u0371\u034c\3\2"+
		"\2\2\u0371\u0357\3\2\2\2\u0371\u035d\3\2\2\2\u0371\u0370\3\2\2\2\u0372"+
		"\u03d7\3\2\2\2\u0373\u0374\f\25\2\2\u0374\u0375\7\3\2\2\u0375\u03d6\5"+
		"H%\26\u0376\u0377\f\24\2\2\u0377\u0378\t\2\2\2\u0378\u03d6\5H%\25\u0379"+
		"\u037a\f\23\2\2\u037a\u037b\t\3\2\2\u037b\u03d6\5H%\24\u037c\u037d\f\22"+
		"\2\2\u037d\u037e\t\b\2\2\u037e\u03d6\5H%\23\u037f\u0380\f\21\2\2\u0380"+
		"\u0381\t\t\2\2\u0381\u03d6\5H%\22\u0382\u038f\f\20\2\2\u0383\u0390\7\22"+
		"\2\2\u0384\u0390\7\23\2\2\u0385\u0390\7\24\2\2\u0386\u0390\7\25\2\2\u0387"+
		"\u0390\79\2\2\u0388\u0389\79\2\2\u0389\u0390\7B\2\2\u038a\u0390\7\65\2"+
		"\2\u038b\u0390\7=\2\2\u038c\u0390\7\60\2\2\u038d\u0390\7?\2\2\u038e\u0390"+
		"\7L\2\2\u038f\u0383\3\2\2\2\u038f\u0384\3\2\2\2\u038f\u0385\3\2\2\2\u038f"+
		"\u0386\3\2\2\2\u038f\u0387\3\2\2\2\u038f\u0388\3\2\2\2\u038f\u038a\3\2"+
		"\2\2\u038f\u038b\3\2\2\2\u038f\u038c\3\2\2\2\u038f\u038d\3\2\2\2\u038f"+
		"\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u03d6\5H%\21\u0392\u0393\f\17"+
		"\2\2\u0393\u0394\7\32\2\2\u0394\u03d6\5H%\20\u0395\u0396\f\16\2\2\u0396"+
		"\u0397\7G\2\2\u0397\u03d6\5H%\17\u0398\u0399\f\b\2\2\u0399\u039b\79\2"+
		"\2\u039a\u039c\7B\2\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d"+
		"\3\2\2\2\u039d\u03d6\5H%\t\u039e\u03a0\f\7\2\2\u039f\u03a1\7B\2\2\u03a0"+
		"\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\7\35"+
		"\2\2\u03a3\u03a4\5H%\2\u03a4\u03a5\7\32\2\2\u03a5\u03a6\5H%\b\u03a6\u03d6"+
		"\3\2\2\2\u03a7\u03a8\f\13\2\2\u03a8\u03a9\7!\2\2\u03a9\u03d6\5X-\2\u03aa"+
		"\u03ac\f\n\2\2\u03ab\u03ad\7B\2\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2"+
		"\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\t\n\2\2\u03af\u03b2\5H%\2\u03b0\u03b1"+
		"\7*\2\2\u03b1\u03b3\5H%\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3"+
		"\u03d6\3\2\2\2\u03b4\u03b9\f\t\2\2\u03b5\u03ba\7:\2\2\u03b6\u03ba\7C\2"+
		"\2\u03b7\u03b8\7B\2\2\u03b8\u03ba\7D\2\2\u03b9\u03b5\3\2\2\2\u03b9\u03b6"+
		"\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba\u03d6\3\2\2\2\u03bb\u03bd\f\6\2\2\u03bc"+
		"\u03be\7B\2\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2"+
		"\2\2\u03bf\u03d3\7\65\2\2\u03c0\u03ca\7b\2\2\u03c1\u03cb\58\35\2\u03c2"+
		"\u03c7\5H%\2\u03c3\u03c4\7^\2\2\u03c4\u03c6\5H%\2\u03c5\u03c3\3\2\2\2"+
		"\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03cb"+
		"\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u03c1\3\2\2\2\u03ca\u03c2\3\2\2\2\u03ca"+
		"\u03cb\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03d4\7c\2\2\u03cd\u03ce\5Z."+
		"\2\u03ce\u03cf\7a\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03cd\3\2\2\2\u03d0\u03d1"+
		"\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d4\5\\/\2\u03d3\u03c0\3\2\2\2\u03d3"+
		"\u03d0\3\2\2\2\u03d4\u03d6\3\2\2\2\u03d5\u0373\3\2\2\2\u03d5\u0376\3\2"+
		"\2\2\u03d5\u0379\3\2\2\2\u03d5\u037c\3\2\2\2\u03d5\u037f\3\2\2\2\u03d5"+
		"\u0382\3\2\2\2\u03d5\u0392\3\2\2\2\u03d5\u0395\3\2\2\2\u03d5\u0398\3\2"+
		"\2\2\u03d5\u039e\3\2\2\2\u03d5\u03a7\3\2\2\2\u03d5\u03aa\3\2\2\2\u03d5"+
		"\u03b4\3\2\2\2\u03d5\u03bb\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d5\3\2"+
		"\2\2\u03d7\u03d8\3\2\2\2\u03d8I\3\2\2\2\u03d9\u03d7\3\2\2\2\u03da\u03db"+
		"\t\13\2\2\u03dbK\3\2\2\2\u03dc\u03dd\t\f\2\2\u03ddM\3\2\2\2\u03de\u03df"+
		"\5f\64\2\u03dfO\3\2\2\2\u03e0\u03e2\5N(\2\u03e1\u03e0\3\2\2\2\u03e2\u03e3"+
		"\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03ef\3\2\2\2\u03e5"+
		"\u03e6\7b\2\2\u03e6\u03e7\5j\66\2\u03e7\u03e8\7c\2\2\u03e8\u03f0\3\2\2"+
		"\2\u03e9\u03ea\7b\2\2\u03ea\u03eb\5j\66\2\u03eb\u03ec\7^\2\2\u03ec\u03ed"+
		"\5j\66\2\u03ed\u03ee\7c\2\2\u03ee\u03f0\3\2\2\2\u03ef\u03e5\3\2\2\2\u03ef"+
		"\u03e9\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0Q\3\2\2\2\u03f1\u03f2\5f\64\2"+
		"\u03f2S\3\2\2\2\u03f3\u03f4\5V,\2\u03f4U\3\2\2\2\u03f5\u03f6\t\r\2\2\u03f6"+
		"W\3\2\2\2\u03f7\u03f8\5f\64\2\u03f8Y\3\2\2\2\u03f9\u03fa\5f\64\2\u03fa"+
		"[\3\2\2\2\u03fb\u03fc\5f\64\2\u03fc]\3\2\2\2\u03fd\u03fe\t\16\2\2\u03fe"+
		"_\3\2\2\2\u03ff\u0400\5f\64\2\u0400a\3\2\2\2\u0401\u0402\5f\64\2\u0402"+
		"c\3\2\2\2\u0403\u0404\5f\64\2\u0404e\3\2\2\2\u0405\u0408\5\66\34\2\u0406"+
		"\u0408\7m\2\2\u0407\u0405\3\2\2\2\u0407\u0406\3\2\2\2\u0408g\3\2\2\2\u0409"+
		"\u040a\7n\2\2\u040ai\3\2\2\2\u040b\u040d\t\3\2\2\u040c\u040b\3\2\2\2\u040c"+
		"\u040d\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\7j\2\2\u040fk\3\2\2\2\u0410"+
		"\u0411\7J\2\2\u0411\u0416\7b\2\2\u0412\u0417\7\64\2\2\u0413\u0414\t\17"+
		"\2\2\u0414\u0415\7^\2\2\u0415\u0417\5n8\2\u0416\u0412\3\2\2\2\u0416\u0413"+
		"\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\7c\2\2\u0419m\3\2\2\2\u041a\u041b"+
		"\7n\2\2\u041bo\3\2\2\2\u0094swz\u0086\u008b\u0094\u0098\u009e\u00a2\u00b3"+
		"\u00bd\u00c3\u00c5\u00cf\u00d5\u00d7\u00e1\u00e7\u00e9\u00eb\u00f3\u00f7"+
		"\u00fe\u0102\u0107\u010c\u0110\u011d\u0120\u0127\u012d\u0131\u0136\u0141"+
		"\u0147\u014b\u0150\u015a\u0175\u017f\u0183\u018b\u018d\u0192\u019b\u01a0"+
		"\u01a6\u01ab\u01af\u01b6\u01b9\u01c1\u01cb\u01ce\u01d4\u01d6\u01da\u01e1"+
		"\u01e4\u01ec\u01f0\u01f3\u01ff\u0204\u0206\u020f\u021a\u0221\u0224\u0228"+
		"\u0231\u0236\u023f\u024a\u0251\u0254\u0256\u025f\u0262\u0264\u0269\u026d"+
		"\u0270\u0277\u027f\u0283\u0287\u028a\u0290\u0293\u0295\u029b\u02a2\u02a5"+
		"\u02ad\u02b7\u02ba\u02c0\u02c2\u02c6\u02cd\u02d0\u02d8\u02dc\u02df\u02e6"+
		"\u02ec\u02f2\u02f7\u02fb\u02ff\u0303\u0307\u030a\u0315\u031a\u0323\u0328"+
		"\u0332\u0335\u0340\u0345\u0354\u0357\u035f\u0368\u036c\u0371\u038f\u039b"+
		"\u03a0\u03ac\u03b2\u03b9\u03bd\u03c7\u03ca\u03d0\u03d3\u03d5\u03d7\u03e3"+
		"\u03ef\u0407\u040c\u0416";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}