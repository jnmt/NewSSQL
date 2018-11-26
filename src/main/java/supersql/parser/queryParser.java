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
		K_MAX=86, K_MIN=87, K_AVG=88, K_COUNT=89, K_SUM=90, K_GGPLOT=91, C0=92, 
		C1=93, C2=94, C3=95, DOT=96, OPEN_PARENTHESE=97, CLOSE_PARENTHESE=98, 
		OPEN_BRACKET=99, CLOSE_BRACKET=100, OPEN_BRACE=101, CLOSE_BRACE=102, SEMICOLON=103, 
		DECORATOR=104, NUMERIC_LITERAL=105, BLOB_LITERAL=106, BIND_PARAMETER=107, 
		IDENTIFIER=108, STRING_LITERAL=109, MULTI_LINE_COMMENT=110, SINGLE_LINE_COMMENT=111, 
		WS=112, UNEXPECTED_CHAR=113;
	public static final int
		RULE_query = 0, RULE_root = 1, RULE_media = 2, RULE_operand = 3, RULE_attribute = 4, 
		RULE_as_pair = 5, RULE_grouper = 6, RULE_composite_iterator = 7, RULE_exp = 8, 
		RULE_concat_exp = 9, RULE_d_exp = 10, RULE_v_exp = 11, RULE_h_exp = 12, 
		RULE_n_exp = 13, RULE_sorting = 14, RULE_function = 15, RULE_sqlfunc = 16, 
		RULE_aggregate = 17, RULE_ggplot = 18, RULE_if_then_else = 19, RULE_arithmetics = 20, 
		RULE_arith = 21, RULE_from_where = 22, RULE_error = 23, RULE_sql_stmt_list = 24, 
		RULE_sql_stmt = 25, RULE_factored_select_stmt = 26, RULE_select_core = 27, 
		RULE_where_clause = 28, RULE_result_column = 29, RULE_table_or_subquery = 30, 
		RULE_keyword = 31, RULE_select_stmt = 32, RULE_select_or_values = 33, 
		RULE_compound_operator = 34, RULE_join_clause = 35, RULE_join_operator = 36, 
		RULE_join_constraint = 37, RULE_common_table_expression = 38, RULE_ordering_term = 39, 
		RULE_expr = 40, RULE_literal_value = 41, RULE_unary_operator = 42, RULE_name = 43, 
		RULE_type_name = 44, RULE_function_name = 45, RULE_ag_function_name = 46, 
		RULE_ag_keyword = 47, RULE_gg_function_name = 48, RULE_gg_keyword = 49, 
		RULE_collation_name = 50, RULE_database_name = 51, RULE_table_name = 52, 
		RULE_column_alias = 53, RULE_column_name = 54, RULE_table_alias = 55, 
		RULE_index_name = 56, RULE_any_name = 57, RULE_sl = 58, RULE_signed_number = 59, 
		RULE_raise_function = 60, RULE_error_message = 61;
	public static final String[] ruleNames = {
		"query", "root", "media", "operand", "attribute", "as_pair", "grouper", 
		"composite_iterator", "exp", "concat_exp", "d_exp", "v_exp", "h_exp", 
		"n_exp", "sorting", "function", "sqlfunc", "aggregate", "ggplot", "if_then_else", 
		"arithmetics", "arith", "from_where", "error", "sql_stmt_list", "sql_stmt", 
		"factored_select_stmt", "select_core", "where_clause", "result_column", 
		"table_or_subquery", "keyword", "select_stmt", "select_or_values", "compound_operator", 
		"join_clause", "join_operator", "join_constraint", "common_table_expression", 
		"ordering_term", "expr", "literal_value", "unary_operator", "name", "type_name", 
		"function_name", "ag_function_name", "ag_keyword", "gg_function_name", 
		"gg_keyword", "collation_name", "database_name", "table_name", "column_alias", 
		"column_name", "table_alias", "index_name", "any_name", "sl", "signed_number", 
		"raise_function", "error_message"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'||'", "'$'", "'&'", "':'", "'*'", "'/'", "'+'", "'-'", "'<<'", 
		"'>>'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", 
		"'~'", null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'?'", "','", "'!'", "'%'", "'.'", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "';'"
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
		"K_GGPLOT", "C0", "C1", "C2", "C3", "DOT", "OPEN_PARENTHESE", "CLOSE_PARENTHESE", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_BRACE", "CLOSE_BRACE", "SEMICOLON", 
		"DECORATOR", "NUMERIC_LITERAL", "BLOB_LITERAL", "BIND_PARAMETER", "IDENTIFIER", 
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
			setState(124);
			media();
			setState(125);
			root();
			setState(127);
			_la = _input.LA(1);
			if (_la==K_FROM || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_SELECT - 77)) | (1L << (K_WITH - 77)) | (1L << (UNEXPECTED_CHAR - 77)))) != 0)) {
				{
				setState(126);
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
		public TerminalNode DECORATOR() { return getToken(queryParser.DECORATOR, 0); }
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
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(129);
				operand();
				}
				break;
			case 2:
				{
				setState(130);
				exp();
				}
				break;
			}
			setState(134);
			_la = _input.LA(1);
			if (_la==DECORATOR) {
				{
				setState(133);
				match(DECORATOR);
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
			setState(136);
			match(K_GENERATE);
			setState(137);
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
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public As_pairContext as_pair() {
			return getRuleContext(As_pairContext.class,0);
		}
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
		public TerminalNode NUMERIC_LITERAL() { return getToken(queryParser.NUMERIC_LITERAL, 0); }
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public ArithmeticsContext arithmetics() {
			return getRuleContext(ArithmeticsContext.class,0);
		}
		public SlContext sl() {
			return getRuleContext(SlContext.class,0);
		}
		public GgplotContext ggplot() {
			return getRuleContext(GgplotContext.class,0);
		}
		public TerminalNode DECORATOR() { return getToken(queryParser.DECORATOR, 0); }
		public SortingContext sorting() {
			return getRuleContext(SortingContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(140);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESE) {
					{
					setState(139);
					sorting();
					}
				}

				setState(142);
				attribute();
				}
				break;
			case 2:
				{
				setState(144);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESE) {
					{
					setState(143);
					sorting();
					}
				}

				setState(146);
				as_pair();
				}
				break;
			case 3:
				{
				setState(147);
				function();
				}
				break;
			case 4:
				{
				setState(148);
				sqlfunc();
				}
				break;
			case 5:
				{
				setState(149);
				match(OPEN_BRACE);
				setState(150);
				exp();
				setState(151);
				match(CLOSE_BRACE);
				}
				break;
			case 6:
				{
				setState(153);
				grouper();
				}
				break;
			case 7:
				{
				setState(154);
				composite_iterator();
				}
				break;
			case 8:
				{
				setState(155);
				if_then_else();
				}
				break;
			case 9:
				{
				setState(156);
				match(NUMERIC_LITERAL);
				}
				break;
			case 10:
				{
				setState(158);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESE) {
					{
					setState(157);
					sorting();
					}
				}

				setState(160);
				aggregate();
				}
				break;
			case 11:
				{
				setState(161);
				arithmetics(0);
				}
				break;
			case 12:
				{
				setState(162);
				sl();
				}
				break;
			case 13:
				{
				setState(164);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESE) {
					{
					setState(163);
					sorting();
					}
				}

				setState(166);
				ggplot();
				}
				break;
			}
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(169);
				match(DECORATOR);
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

	public static class AttributeContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(172);
				table_alias();
				setState(173);
				match(DOT);
				}
				break;
			}
			setState(177);
			column_name();
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

	public static class As_pairContext extends ParserRuleContext {
		public TerminalNode K_AS() { return getToken(queryParser.K_AS, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public SqlfuncContext sqlfunc() {
			return getRuleContext(SqlfuncContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public As_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterAs_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitAs_pair(this);
		}
	}

	public final As_pairContext as_pair() throws RecognitionException {
		As_pairContext _localctx = new As_pairContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_as_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(179);
				attribute();
				}
				break;
			case 2:
				{
				setState(180);
				aggregate();
				}
				break;
			case 3:
				{
				setState(181);
				sqlfunc();
				}
				break;
			}
			setState(184);
			match(K_AS);
			{
			setState(185);
			any_name();
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
		enterRule(_localctx, 12, RULE_grouper);
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(OPEN_BRACKET);
				setState(188);
				exp();
				setState(189);
				match(CLOSE_BRACKET);
				setState(190);
				match(C1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(OPEN_BRACKET);
				setState(193);
				exp();
				setState(194);
				match(CLOSE_BRACKET);
				setState(195);
				match(C2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(OPEN_BRACKET);
				setState(198);
				exp();
				setState(199);
				match(CLOSE_BRACKET);
				setState(200);
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
		enterRule(_localctx, 14, RULE_composite_iterator);
		try {
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(OPEN_BRACKET);
				setState(205);
				exp();
				setState(206);
				match(CLOSE_BRACKET);
				setState(207);
				match(C1);
				setState(220);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(208);
					match(NUMERIC_LITERAL);
					setState(209);
					match(C2);
					setState(212);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(210);
						match(NUMERIC_LITERAL);
						setState(211);
						match(C3);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(214);
					match(NUMERIC_LITERAL);
					setState(215);
					match(C3);
					setState(218);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(216);
						match(NUMERIC_LITERAL);
						setState(217);
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
				setState(222);
				match(OPEN_BRACKET);
				setState(223);
				exp();
				setState(224);
				match(CLOSE_BRACKET);
				setState(225);
				match(C2);
				setState(238);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(226);
					match(NUMERIC_LITERAL);
					setState(227);
					match(C1);
					setState(230);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(228);
						match(NUMERIC_LITERAL);
						setState(229);
						match(C3);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(232);
					match(NUMERIC_LITERAL);
					setState(233);
					match(C3);
					setState(236);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(234);
						match(NUMERIC_LITERAL);
						setState(235);
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
				setState(240);
				match(OPEN_BRACKET);
				setState(241);
				exp();
				setState(242);
				match(CLOSE_BRACKET);
				setState(243);
				match(C3);
				setState(256);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(244);
					match(NUMERIC_LITERAL);
					setState(245);
					match(C1);
					setState(248);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(246);
						match(NUMERIC_LITERAL);
						setState(247);
						match(C2);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(250);
					match(NUMERIC_LITERAL);
					setState(251);
					match(C2);
					setState(254);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(252);
						match(NUMERIC_LITERAL);
						setState(253);
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
		enterRule(_localctx, 16, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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

	public static class Concat_expContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public Concat_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterConcat_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitConcat_exp(this);
		}
	}

	public final Concat_expContext concat_exp() throws RecognitionException {
		Concat_expContext _localctx = new Concat_expContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_concat_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(262);
			operand();
			}
			setState(265); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(263);
					match(T__0);
					{
					setState(264);
					operand();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(267); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 20, RULE_d_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			v_exp();
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					match(C3);
					setState(273);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(271);
						v_exp();
						}
						break;
					case 2:
						{
						setState(272);
						operand();
						}
						break;
					}
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 22, RULE_v_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			h_exp();
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					match(C2);
					setState(284);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(282);
						h_exp();
						}
						break;
					case 2:
						{
						setState(283);
						operand();
						}
						break;
					}
					}
					} 
				}
				setState(290);
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
		enterRule(_localctx, 24, RULE_h_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(291);
				operand();
				}
				break;
			case 2:
				{
				setState(292);
				n_exp();
				}
				break;
			}
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295);
					match(C1);
					setState(298);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(296);
						operand();
						}
						break;
					case 2:
						{
						setState(297);
						n_exp();
						}
						break;
					}
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public List<Concat_expContext> concat_exp() {
			return getRuleContexts(Concat_expContext.class);
		}
		public Concat_expContext concat_exp(int i) {
			return getRuleContext(Concat_expContext.class,i);
		}
		public List<TerminalNode> C0() { return getTokens(queryParser.C0); }
		public TerminalNode C0(int i) {
			return getToken(queryParser.C0, i);
		}
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
		enterRule(_localctx, 26, RULE_n_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(305);
				operand();
				}
				break;
			case 2:
				{
				setState(306);
				concat_exp();
				}
				break;
			}
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
					match(C0);
					setState(312);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(310);
						operand();
						}
						break;
					case 2:
						{
						setState(311);
						concat_exp();
						}
						break;
					}
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 28, RULE_sorting);
		try {
			setState(325);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(OPEN_PARENTHESE);
				setState(320);
				match(K_ASC);
				setState(321);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(OPEN_PARENTHESE);
				setState(323);
				match(K_DESC);
				setState(324);
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
		enterRule(_localctx, 30, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(328);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(327);
				match(T__1);
				}
			}

			setState(330);
			function_name();
			setState(331);
			match(OPEN_PARENTHESE);
			{
			setState(334);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(332);
				operand();
				}
				break;
			case 2:
				{
				setState(333);
				exp();
				}
				break;
			}
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==C1) {
				{
				{
				setState(336);
				match(C1);
				setState(339);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(337);
					operand();
					}
					break;
				case 2:
					{
					setState(338);
					exp();
					}
					break;
				}
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(346);
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
		enterRule(_localctx, 32, RULE_sqlfunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(348);
			match(T__2);
			setState(349);
			function_name();
			setState(350);
			match(OPEN_PARENTHESE);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << K_ABORT) | (1L << K_ALL) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLLATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_ELSE) | (1L << K_END) | (1L << K_ESCAPE) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FAIL) | (1L << K_FULL) | (1L << K_FROM) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IGNORE) | (1L << K_IN) | (1L << K_INDEXED) | (1L << K_INNER) | (1L << K_INTERSECT) | (1L << K_IS) | (1L << K_ISNULL) | (1L << K_JOIN) | (1L << K_LEFT) | (1L << K_LIKE) | (1L << K_LIMIT) | (1L << K_MATCH) | (1L << K_NATURAL) | (1L << K_NO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_THEN - 64)) | (1L << (K_UNION - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (K_GENERATE - 64)) | (1L << (K_MAX - 64)) | (1L << (K_MIN - 64)) | (1L << (K_AVG - 64)) | (1L << (K_COUNT - 64)) | (1L << (K_SUM - 64)) | (1L << (K_GGPLOT - 64)) | (1L << (OPEN_PARENTHESE - 64)) | (1L << (OPEN_BRACKET - 64)) | (1L << (OPEN_BRACE - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (STRING_LITERAL - 64)))) != 0)) {
				{
				{
				setState(353);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(351);
					operand();
					}
					break;
				case 2:
					{
					setState(352);
					exp();
					}
					break;
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(355);
					match(C1);
					setState(358);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(356);
						operand();
						}
						break;
					case 2:
						{
						setState(357);
						exp();
						}
						break;
					}
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
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
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(queryParser.CLOSE_BRACKET, 0); }
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
		enterRule(_localctx, 34, RULE_aggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			ag_function_name();
			setState(373);
			match(OPEN_BRACKET);
			setState(374);
			attribute();
			setState(375);
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

	public static class GgplotContext extends ParserRuleContext {
		public Gg_function_nameContext gg_function_name() {
			return getRuleContext(Gg_function_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(queryParser.OPEN_BRACKET, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(queryParser.CLOSE_BRACKET, 0); }
		public TerminalNode C1() { return getToken(queryParser.C1, 0); }
		public GgplotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ggplot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterGgplot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitGgplot(this);
		}
	}

	public final GgplotContext ggplot() throws RecognitionException {
		GgplotContext _localctx = new GgplotContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ggplot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			gg_function_name();
			setState(378);
			match(OPEN_BRACKET);
			setState(379);
			attribute();
			setState(382);
			_la = _input.LA(1);
			if (_la==C1) {
				{
				setState(380);
				match(C1);
				setState(381);
				attribute();
				}
			}

			setState(384);
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
		enterRule(_localctx, 38, RULE_if_then_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			switch (_input.LA(1)) {
			case K_IF:
				{
				{
				setState(386);
				match(K_IF);
				setState(387);
				match(OPEN_PARENTHESE);
				setState(388);
				expr(0);
				setState(389);
				match(CLOSE_PARENTHESE);
				setState(390);
				match(K_THEN);
				setState(391);
				match(OPEN_PARENTHESE);
				setState(392);
				exp();
				setState(393);
				match(CLOSE_PARENTHESE);
				setState(394);
				match(K_ELSE);
				setState(395);
				match(OPEN_PARENTHESE);
				setState(396);
				exp();
				setState(397);
				match(CLOSE_PARENTHESE);
				}
				}
				break;
			case OPEN_PARENTHESE:
				{
				{
				setState(399);
				match(OPEN_PARENTHESE);
				setState(400);
				expr(0);
				setState(401);
				match(CLOSE_PARENTHESE);
				setState(402);
				match(C0);
				setState(403);
				exp();
				setState(404);
				match(T__3);
				setState(405);
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
		public ArithContext arith() {
			return getRuleContext(ArithContext.class,0);
		}
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_arithmetics, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			switch (_input.LA(1)) {
			case OPEN_PARENTHESE:
				{
				setState(410);
				match(OPEN_PARENTHESE);
				setState(411);
				arithmetics(0);
				setState(412);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==C3) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(413);
				arithmetics(0);
				setState(414);
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
			case K_GGPLOT:
			case NUMERIC_LITERAL:
			case IDENTIFIER:
				{
				setState(416);
				arith();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmetics);
					setState(419);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(420);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==C3) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(421);
					arithmetics(3);
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class ArithContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(queryParser.NUMERIC_LITERAL, 0); }
		public ArithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterArith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitArith(this);
		}
	}

	public final ArithContext arith() throws RecognitionException {
		ArithContext _localctx = new ArithContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arith);
		try {
			setState(429);
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
			case K_GGPLOT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				attribute();
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(NUMERIC_LITERAL);
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
		enterRule(_localctx, 44, RULE_from_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			switch (_input.LA(1)) {
			case K_FROM:
			case K_SELECT:
			case K_WITH:
				{
				setState(431);
				sql_stmt_list();
				}
				break;
			case UNEXPECTED_CHAR:
				{
				setState(432);
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
		enterRule(_localctx, 46, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		enterRule(_localctx, 48, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			sql_stmt();
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(440); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(439);
						match(SEMICOLON);
						}
						}
						setState(442); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SEMICOLON );
					setState(444);
					sql_stmt();
					}
					} 
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(450);
				match(SEMICOLON);
				}
				}
				setState(455);
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
		enterRule(_localctx, 50, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(456);
				factored_select_stmt();
				}
				break;
			case 2:
				{
				setState(457);
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
		enterRule(_localctx, 52, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(460);
				match(K_WITH);
				setState(462);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(461);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(464);
				common_table_expression();
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(465);
					match(C1);
					setState(466);
					common_table_expression();
					}
					}
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(474);
			select_core();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (K_EXCEPT - 41)) | (1L << (K_INTERSECT - 41)) | (1L << (K_UNION - 41)))) != 0)) {
				{
				{
				setState(475);
				compound_operator();
				setState(476);
				select_core();
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(483);
				match(K_ORDER);
				setState(484);
				match(K_BY);
				setState(485);
				ordering_term();
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(486);
					match(C1);
					setState(487);
					ordering_term();
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(501);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(495);
				match(K_LIMIT);
				setState(496);
				expr(0);
				setState(499);
				_la = _input.LA(1);
				if (_la==K_OFFSET || _la==C1) {
					{
					setState(497);
					_la = _input.LA(1);
					if ( !(_la==K_OFFSET || _la==C1) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(498);
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
		enterRule(_localctx, 54, RULE_select_core);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_la = _input.LA(1);
			if (_la==K_SELECT) {
				{
				setState(503);
				match(K_SELECT);
				setState(505);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(504);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(507);
				result_column();
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(508);
					match(C1);
					setState(509);
					result_column();
					}
					}
					setState(514);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(517);
			match(K_FROM);
			setState(527);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(518);
				table_or_subquery();
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(519);
					match(C1);
					setState(520);
					table_or_subquery();
					}
					}
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(526);
				join_clause();
				}
				break;
			}
			}
			setState(530);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (K_GROUP - 47)) | (1L << (K_VALUES - 47)) | (1L << (K_WHERE - 47)))) != 0)) {
				{
				setState(529);
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
		enterRule(_localctx, 56, RULE_where_clause);
		int _la;
		try {
			setState(629);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				switch (_input.LA(1)) {
				case K_WHERE:
					{
					{
					setState(532);
					match(K_WHERE);
					setState(533);
					expr(0);
					}
					setState(549);
					_la = _input.LA(1);
					if (_la==K_GROUP) {
						{
						setState(535);
						match(K_GROUP);
						setState(536);
						match(K_BY);
						setState(537);
						expr(0);
						setState(542);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==C1) {
							{
							{
							setState(538);
							match(C1);
							setState(539);
							expr(0);
							}
							}
							setState(544);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(547);
						_la = _input.LA(1);
						if (_la==K_HAVING) {
							{
							setState(545);
							match(K_HAVING);
							setState(546);
							expr(0);
							}
						}

						}
					}

					}
					break;
				case K_VALUES:
					{
					setState(551);
					match(K_VALUES);
					setState(552);
					match(OPEN_PARENTHESE);
					setState(553);
					expr(0);
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(554);
						match(C1);
						setState(555);
						expr(0);
						}
						}
						setState(560);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(561);
					match(CLOSE_PARENTHESE);
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(562);
						match(C1);
						setState(563);
						match(OPEN_PARENTHESE);
						setState(564);
						expr(0);
						setState(569);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==C1) {
							{
							{
							setState(565);
							match(C1);
							setState(566);
							expr(0);
							}
							}
							setState(571);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(572);
						match(CLOSE_PARENTHESE);
						}
						}
						setState(578);
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
				setState(627);
				switch (_input.LA(1)) {
				case K_GROUP:
				case K_WHERE:
					{
					setState(583);
					_la = _input.LA(1);
					if (_la==K_WHERE) {
						{
						setState(581);
						match(K_WHERE);
						setState(582);
						expr(0);
						}
					}

					{
					setState(585);
					match(K_GROUP);
					setState(586);
					match(K_BY);
					setState(587);
					expr(0);
					setState(592);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(588);
						match(C1);
						setState(589);
						expr(0);
						}
						}
						setState(594);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(597);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(595);
						match(K_HAVING);
						setState(596);
						expr(0);
						}
					}

					}
					}
					break;
				case K_VALUES:
					{
					setState(599);
					match(K_VALUES);
					setState(600);
					match(OPEN_PARENTHESE);
					setState(601);
					expr(0);
					setState(606);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(602);
						match(C1);
						setState(603);
						expr(0);
						}
						}
						setState(608);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(609);
					match(CLOSE_PARENTHESE);
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(610);
						match(C1);
						setState(611);
						match(OPEN_PARENTHESE);
						setState(612);
						expr(0);
						setState(617);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==C1) {
							{
							{
							setState(613);
							match(C1);
							setState(614);
							expr(0);
							}
							}
							setState(619);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(620);
						match(CLOSE_PARENTHESE);
						}
						}
						setState(626);
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
		enterRule(_localctx, 58, RULE_result_column);
		int _la;
		try {
			setState(643);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				table_name();
				setState(633);
				match(DOT);
				setState(634);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
				expr(0);
				setState(641);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(638);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(637);
						match(K_AS);
						}
					}

					setState(640);
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
		enterRule(_localctx, 60, RULE_table_or_subquery);
		int _la;
		try {
			setState(692);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(645);
					database_name();
					setState(646);
					match(DOT);
					}
					break;
				}
				setState(650);
				table_name();
				setState(655);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(652);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						setState(651);
						match(K_AS);
						}
						break;
					}
					setState(654);
					table_alias();
					}
					break;
				}
				setState(662);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(657);
					match(K_INDEXED);
					setState(658);
					match(K_BY);
					setState(659);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(660);
					match(K_NOT);
					setState(661);
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
				setState(664);
				match(OPEN_PARENTHESE);
				setState(674);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(665);
					table_or_subquery();
					setState(670);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(666);
						match(C1);
						setState(667);
						table_or_subquery();
						}
						}
						setState(672);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(673);
					join_clause();
					}
					break;
				}
				setState(676);
				match(CLOSE_PARENTHESE);
				setState(681);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(678);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(677);
						match(K_AS);
						}
						break;
					}
					setState(680);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(683);
				match(OPEN_PARENTHESE);
				setState(684);
				select_stmt();
				setState(685);
				match(CLOSE_PARENTHESE);
				setState(690);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(687);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						setState(686);
						match(K_AS);
						}
						break;
					}
					setState(689);
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
		public TerminalNode K_GGPLOT() { return getToken(queryParser.K_GGPLOT, 0); }
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
		enterRule(_localctx, 62, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ALL) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLLATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_ELSE) | (1L << K_END) | (1L << K_ESCAPE) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FAIL) | (1L << K_FULL) | (1L << K_FROM) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IGNORE) | (1L << K_IN) | (1L << K_INDEXED) | (1L << K_INNER) | (1L << K_INTERSECT) | (1L << K_IS) | (1L << K_ISNULL) | (1L << K_JOIN) | (1L << K_LEFT) | (1L << K_LIKE) | (1L << K_LIMIT) | (1L << K_MATCH) | (1L << K_NATURAL) | (1L << K_NO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_THEN - 64)) | (1L << (K_UNION - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (K_GENERATE - 64)) | (1L << (K_MAX - 64)) | (1L << (K_MIN - 64)) | (1L << (K_AVG - 64)) | (1L << (K_COUNT - 64)) | (1L << (K_SUM - 64)) | (1L << (K_GGPLOT - 64)))) != 0)) ) {
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
		enterRule(_localctx, 64, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(696);
				match(K_WITH);
				setState(698);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(697);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(700);
				common_table_expression();
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(701);
					match(C1);
					setState(702);
					common_table_expression();
					}
					}
					setState(707);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(710);
			select_or_values();
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (K_EXCEPT - 41)) | (1L << (K_INTERSECT - 41)) | (1L << (K_UNION - 41)))) != 0)) {
				{
				{
				setState(711);
				compound_operator();
				setState(712);
				select_or_values();
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(729);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(719);
				match(K_ORDER);
				setState(720);
				match(K_BY);
				setState(721);
				ordering_term();
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(722);
					match(C1);
					setState(723);
					ordering_term();
					}
					}
					setState(728);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(737);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(731);
				match(K_LIMIT);
				setState(732);
				expr(0);
				setState(735);
				_la = _input.LA(1);
				if (_la==K_OFFSET || _la==C1) {
					{
					setState(733);
					_la = _input.LA(1);
					if ( !(_la==K_OFFSET || _la==C1) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(734);
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
		enterRule(_localctx, 66, RULE_select_or_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_la = _input.LA(1);
			if (_la==K_SELECT) {
				{
				setState(739);
				match(K_SELECT);
				setState(741);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(740);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(743);
				result_column();
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(744);
					match(C1);
					setState(745);
					result_column();
					}
					}
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(753);
			match(K_FROM);
			setState(763);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(754);
				table_or_subquery();
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(755);
					match(C1);
					setState(756);
					table_or_subquery();
					}
					}
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(762);
				join_clause();
				}
				break;
			}
			}
			setState(766);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (K_GROUP - 47)) | (1L << (K_VALUES - 47)) | (1L << (K_WHERE - 47)))) != 0)) {
				{
				setState(765);
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
		enterRule(_localctx, 68, RULE_compound_operator);
		try {
			setState(773);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				match(K_UNION);
				setState(770);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(771);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(772);
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
		enterRule(_localctx, 70, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			table_or_subquery();
			setState(785);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(776);
					join_operator();
					setState(779);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						setState(777);
						join_clause();
						}
						break;
					case 2:
						{
						setState(778);
						table_or_subquery();
						}
						break;
					}
					setState(781);
					join_constraint();
					}
					} 
				}
				setState(787);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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
		enterRule(_localctx, 72, RULE_join_operator);
		int _la;
		try {
			setState(809);
			switch (_input.LA(1)) {
			case C1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
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
				setState(790);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(789);
					match(K_NATURAL);
					}
				}

				setState(806);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(792);
					match(K_LEFT);
					setState(794);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(793);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_RIGHT:
					{
					setState(796);
					match(K_RIGHT);
					setState(798);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(797);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_FULL:
					{
					setState(800);
					match(K_FULL);
					setState(802);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(801);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(804);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(805);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(808);
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
		enterRule(_localctx, 74, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(811);
				match(K_ON);
				setState(812);
				expr(0);
				}
				break;
			case 2:
				{
				setState(813);
				match(K_USING);
				setState(814);
				match(OPEN_PARENTHESE);
				setState(815);
				column_name();
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(816);
					match(C1);
					setState(817);
					column_name();
					}
					}
					setState(822);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(823);
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
		enterRule(_localctx, 76, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			table_name();
			setState(839);
			_la = _input.LA(1);
			if (_la==OPEN_PARENTHESE) {
				{
				setState(828);
				match(OPEN_PARENTHESE);
				setState(829);
				column_name();
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(830);
					match(C1);
					setState(831);
					column_name();
					}
					}
					setState(836);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(837);
				match(CLOSE_PARENTHESE);
				}
			}

			setState(841);
			match(K_AS);
			setState(842);
			match(OPEN_PARENTHESE);
			setState(843);
			select_stmt();
			setState(844);
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
		enterRule(_localctx, 78, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			expr(0);
			setState(849);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(847);
				match(K_COLLATE);
				setState(848);
				collation_name();
				}
			}

			setState(852);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(851);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(855);
				unary_operator();
				setState(856);
				expr(20);
				}
				break;
			case 2:
				{
				setState(858);
				operand();
				}
				break;
			case 3:
				{
				setState(859);
				match(BIND_PARAMETER);
				}
				break;
			case 4:
				{
				setState(868);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(863);
					switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1:
						{
						setState(860);
						database_name();
						setState(861);
						match(DOT);
						}
						break;
					}
					setState(865);
					table_alias();
					setState(866);
					match(DOT);
					}
					break;
				}
				setState(870);
				column_name();
				}
				break;
			case 5:
				{
				setState(871);
				match(OPEN_PARENTHESE);
				setState(872);
				expr(0);
				setState(873);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 6:
				{
				setState(875);
				match(K_CAST);
				setState(876);
				match(OPEN_PARENTHESE);
				setState(877);
				expr(0);
				setState(878);
				match(K_AS);
				setState(879);
				type_name();
				setState(880);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 7:
				{
				setState(886);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(883);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(882);
						match(K_NOT);
						}
					}

					setState(885);
					match(K_EXISTS);
					}
				}

				setState(888);
				match(OPEN_PARENTHESE);
				setState(889);
				select_stmt();
				setState(890);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 8:
				{
				setState(892);
				match(K_CASE);
				setState(894);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(893);
					expr(0);
					}
					break;
				}
				setState(901); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(896);
					match(K_WHEN);
					setState(897);
					expr(0);
					setState(898);
					match(K_THEN);
					setState(899);
					expr(0);
					}
					}
					setState(903); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(907);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(905);
					match(K_ELSE);
					setState(906);
					expr(0);
					}
				}

				setState(909);
				match(K_END);
				}
				break;
			case 9:
				{
				setState(911);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1014);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1012);
					switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(914);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(915);
						match(T__0);
						setState(916);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(917);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(918);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5 || _la==C3) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(919);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(920);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(921);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(922);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(923);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(924);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(925);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(926);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(927);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(928);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(929);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(942);
						switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
						case 1:
							{
							setState(930);
							match(T__15);
							}
							break;
						case 2:
							{
							setState(931);
							match(T__16);
							}
							break;
						case 3:
							{
							setState(932);
							match(T__17);
							}
							break;
						case 4:
							{
							setState(933);
							match(T__18);
							}
							break;
						case 5:
							{
							setState(934);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(935);
							match(K_IS);
							setState(936);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(937);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(938);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(939);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(940);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(941);
							match(K_REGEXP);
							}
							break;
						}
						setState(944);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(945);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(946);
						match(K_AND);
						setState(947);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(948);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(949);
						match(K_OR);
						setState(950);
						expr(13);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(951);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(952);
						match(K_IS);
						setState(954);
						switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
						case 1:
							{
							setState(953);
							match(K_NOT);
							}
							break;
						}
						setState(956);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(957);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(959);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(958);
							match(K_NOT);
							}
						}

						setState(961);
						match(K_BETWEEN);
						setState(962);
						expr(0);
						setState(963);
						match(K_AND);
						setState(964);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(966);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(967);
						match(K_COLLATE);
						setState(968);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(969);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(971);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(970);
							match(K_NOT);
							}
						}

						setState(973);
						_la = _input.LA(1);
						if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (K_GLOB - 46)) | (1L << (K_LIKE - 46)) | (1L << (K_MATCH - 46)) | (1L << (K_REGEXP - 46)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(974);
						expr(0);
						setState(977);
						switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
						case 1:
							{
							setState(975);
							match(K_ESCAPE);
							setState(976);
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
						setState(979);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(984);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(980);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(981);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(982);
							match(K_NOT);
							setState(983);
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
						setState(986);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(988);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(987);
							match(K_NOT);
							}
						}

						setState(990);
						match(K_IN);
						setState(1010);
						switch (_input.LA(1)) {
						case OPEN_PARENTHESE:
							{
							setState(991);
							match(OPEN_PARENTHESE);
							setState(1001);
							switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
							case 1:
								{
								setState(992);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(993);
								expr(0);
								setState(998);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==C1) {
									{
									{
									setState(994);
									match(C1);
									setState(995);
									expr(0);
									}
									}
									setState(1000);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1003);
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
						case K_GGPLOT:
						case IDENTIFIER:
							{
							setState(1007);
							switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
							case 1:
								{
								setState(1004);
								database_name();
								setState(1005);
								match(DOT);
								}
								break;
							}
							setState(1009);
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
				setState(1016);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
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
		enterRule(_localctx, 82, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
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
		enterRule(_localctx, 84, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
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
		enterRule(_localctx, 86, RULE_name);
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
		enterRule(_localctx, 88, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1023);
				name();
				}
				}
				setState(1026); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ALL) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLLATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_ELSE) | (1L << K_END) | (1L << K_ESCAPE) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FAIL) | (1L << K_FULL) | (1L << K_FROM) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IGNORE) | (1L << K_IN) | (1L << K_INDEXED) | (1L << K_INNER) | (1L << K_INTERSECT) | (1L << K_IS) | (1L << K_ISNULL) | (1L << K_JOIN) | (1L << K_LEFT) | (1L << K_LIKE) | (1L << K_LIMIT) | (1L << K_MATCH) | (1L << K_NATURAL) | (1L << K_NO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_THEN - 64)) | (1L << (K_UNION - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (K_GENERATE - 64)) | (1L << (K_MAX - 64)) | (1L << (K_MIN - 64)) | (1L << (K_AVG - 64)) | (1L << (K_COUNT - 64)) | (1L << (K_SUM - 64)) | (1L << (K_GGPLOT - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			setState(1038);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1028);
				match(OPEN_PARENTHESE);
				setState(1029);
				signed_number();
				setState(1030);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 2:
				{
				setState(1032);
				match(OPEN_PARENTHESE);
				setState(1033);
				signed_number();
				setState(1034);
				match(C1);
				setState(1035);
				signed_number();
				setState(1036);
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
		enterRule(_localctx, 90, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
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
		enterRule(_localctx, 92, RULE_ag_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
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
		enterRule(_localctx, 94, RULE_ag_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
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

	public static class Gg_function_nameContext extends ParserRuleContext {
		public Gg_keywordContext gg_keyword() {
			return getRuleContext(Gg_keywordContext.class,0);
		}
		public Gg_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gg_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterGg_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitGg_function_name(this);
		}
	}

	public final Gg_function_nameContext gg_function_name() throws RecognitionException {
		Gg_function_nameContext _localctx = new Gg_function_nameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_gg_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			gg_keyword();
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

	public static class Gg_keywordContext extends ParserRuleContext {
		public TerminalNode K_GGPLOT() { return getToken(queryParser.K_GGPLOT, 0); }
		public Gg_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gg_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterGg_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitGg_keyword(this);
		}
	}

	public final Gg_keywordContext gg_keyword() throws RecognitionException {
		Gg_keywordContext _localctx = new Gg_keywordContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_gg_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(K_GGPLOT);
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
		enterRule(_localctx, 100, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
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
		enterRule(_localctx, 102, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
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
		enterRule(_localctx, 104, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
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
		enterRule(_localctx, 106, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
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
		enterRule(_localctx, 108, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
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
		enterRule(_localctx, 110, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
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
		enterRule(_localctx, 112, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
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
		enterRule(_localctx, 114, RULE_any_name);
		try {
			setState(1066);
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
			case K_GGPLOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				keyword();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065);
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
		enterRule(_localctx, 116, RULE_sl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
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
		enterRule(_localctx, 118, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			_la = _input.LA(1);
			if (_la==T__6 || _la==T__7) {
				{
				setState(1070);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1073);
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
		enterRule(_localctx, 120, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(K_RAISE);
			setState(1076);
			match(OPEN_PARENTHESE);
			setState(1081);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1077);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1078);
				_la = _input.LA(1);
				if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (K_ABORT - 21)) | (1L << (K_FAIL - 21)) | (1L << (K_ROLLBACK - 21)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1079);
				match(C1);
				setState(1080);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1083);
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
		enterRule(_localctx, 122, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
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
		case 20:
			return arithmetics_sempred((ArithmeticsContext)_localctx, predIndex);
		case 40:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetics_sempred(ArithmeticsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 9);
		case 12:
			return precpred(_ctx, 8);
		case 13:
			return precpred(_ctx, 7);
		case 14:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3s\u0442\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\5\2\u0082\n\2\3\3\3\3\5\3\u0086\n\3\3\3\5\3\u0089"+
		"\n\3\3\4\3\4\3\4\3\5\5\5\u008f\n\5\3\5\3\5\5\5\u0093\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a1\n\5\3\5\3\5\3\5\3\5\5\5\u00a7"+
		"\n\5\3\5\5\5\u00aa\n\5\3\5\5\5\u00ad\n\5\3\6\3\6\3\6\5\6\u00b2\n\6\3\6"+
		"\3\6\3\7\3\7\3\7\5\7\u00b9\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00cd\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u00d7\n\t\3\t\3\t\3\t\3\t\5\t\u00dd\n\t\5\t\u00df\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e9\n\t\3\t\3\t\3\t\3\t\5\t\u00ef\n"+
		"\t\5\t\u00f1\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00fb\n\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0101\n\t\5\t\u0103\n\t\5\t\u0105\n\t\3\n\3\n\3\13\3\13\3"+
		"\13\6\13\u010c\n\13\r\13\16\13\u010d\3\f\3\f\3\f\3\f\5\f\u0114\n\f\7\f"+
		"\u0116\n\f\f\f\16\f\u0119\13\f\3\r\3\r\3\r\3\r\5\r\u011f\n\r\7\r\u0121"+
		"\n\r\f\r\16\r\u0124\13\r\3\16\3\16\5\16\u0128\n\16\3\16\3\16\3\16\5\16"+
		"\u012d\n\16\7\16\u012f\n\16\f\16\16\16\u0132\13\16\3\17\3\17\5\17\u0136"+
		"\n\17\3\17\3\17\3\17\5\17\u013b\n\17\7\17\u013d\n\17\f\17\16\17\u0140"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0148\n\20\3\21\5\21\u014b\n"+
		"\21\3\21\3\21\3\21\3\21\5\21\u0151\n\21\3\21\3\21\3\21\5\21\u0156\n\21"+
		"\7\21\u0158\n\21\f\21\16\21\u015b\13\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0164\n\22\3\22\3\22\3\22\5\22\u0169\n\22\7\22\u016b\n\22\f"+
		"\22\16\22\u016e\13\22\7\22\u0170\n\22\f\22\16\22\u0173\13\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u0181\n\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u019a\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u01a4\n\26\3\26\3\26\3\26\7\26\u01a9\n"+
		"\26\f\26\16\26\u01ac\13\26\3\27\3\27\5\27\u01b0\n\27\3\30\3\30\5\30\u01b4"+
		"\n\30\3\31\3\31\3\31\3\32\3\32\6\32\u01bb\n\32\r\32\16\32\u01bc\3\32\7"+
		"\32\u01c0\n\32\f\32\16\32\u01c3\13\32\3\32\7\32\u01c6\n\32\f\32\16\32"+
		"\u01c9\13\32\3\33\3\33\5\33\u01cd\n\33\3\34\3\34\5\34\u01d1\n\34\3\34"+
		"\3\34\3\34\7\34\u01d6\n\34\f\34\16\34\u01d9\13\34\5\34\u01db\n\34\3\34"+
		"\3\34\3\34\3\34\7\34\u01e1\n\34\f\34\16\34\u01e4\13\34\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u01eb\n\34\f\34\16\34\u01ee\13\34\5\34\u01f0\n\34\3\34"+
		"\3\34\3\34\3\34\5\34\u01f6\n\34\5\34\u01f8\n\34\3\35\3\35\5\35\u01fc\n"+
		"\35\3\35\3\35\3\35\7\35\u0201\n\35\f\35\16\35\u0204\13\35\5\35\u0206\n"+
		"\35\3\35\3\35\3\35\3\35\7\35\u020c\n\35\f\35\16\35\u020f\13\35\3\35\5"+
		"\35\u0212\n\35\3\35\5\35\u0215\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\7\36\u021f\n\36\f\36\16\36\u0222\13\36\3\36\3\36\5\36\u0226\n\36"+
		"\5\36\u0228\n\36\3\36\3\36\3\36\3\36\3\36\7\36\u022f\n\36\f\36\16\36\u0232"+
		"\13\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u023a\n\36\f\36\16\36\u023d"+
		"\13\36\3\36\3\36\7\36\u0241\n\36\f\36\16\36\u0244\13\36\5\36\u0246\n\36"+
		"\3\36\3\36\5\36\u024a\n\36\3\36\3\36\3\36\3\36\3\36\7\36\u0251\n\36\f"+
		"\36\16\36\u0254\13\36\3\36\3\36\5\36\u0258\n\36\3\36\3\36\3\36\3\36\3"+
		"\36\7\36\u025f\n\36\f\36\16\36\u0262\13\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\7\36\u026a\n\36\f\36\16\36\u026d\13\36\3\36\3\36\7\36\u0271\n\36\f"+
		"\36\16\36\u0274\13\36\5\36\u0276\n\36\5\36\u0278\n\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u0281\n\37\3\37\5\37\u0284\n\37\5\37\u0286\n\37"+
		"\3 \3 \3 \5 \u028b\n \3 \3 \5 \u028f\n \3 \5 \u0292\n \3 \3 \3 \3 \3 "+
		"\5 \u0299\n \3 \3 \3 \3 \7 \u029f\n \f \16 \u02a2\13 \3 \5 \u02a5\n \3"+
		" \3 \5 \u02a9\n \3 \5 \u02ac\n \3 \3 \3 \3 \5 \u02b2\n \3 \5 \u02b5\n"+
		" \5 \u02b7\n \3!\3!\3\"\3\"\5\"\u02bd\n\"\3\"\3\"\3\"\7\"\u02c2\n\"\f"+
		"\"\16\"\u02c5\13\"\5\"\u02c7\n\"\3\"\3\"\3\"\3\"\7\"\u02cd\n\"\f\"\16"+
		"\"\u02d0\13\"\3\"\3\"\3\"\3\"\3\"\7\"\u02d7\n\"\f\"\16\"\u02da\13\"\5"+
		"\"\u02dc\n\"\3\"\3\"\3\"\3\"\5\"\u02e2\n\"\5\"\u02e4\n\"\3#\3#\5#\u02e8"+
		"\n#\3#\3#\3#\7#\u02ed\n#\f#\16#\u02f0\13#\5#\u02f2\n#\3#\3#\3#\3#\7#\u02f8"+
		"\n#\f#\16#\u02fb\13#\3#\5#\u02fe\n#\3#\5#\u0301\n#\3$\3$\3$\3$\3$\5$\u0308"+
		"\n$\3%\3%\3%\3%\5%\u030e\n%\3%\3%\7%\u0312\n%\f%\16%\u0315\13%\3&\3&\5"+
		"&\u0319\n&\3&\3&\5&\u031d\n&\3&\3&\5&\u0321\n&\3&\3&\5&\u0325\n&\3&\3"+
		"&\5&\u0329\n&\3&\5&\u032c\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0335\n\'"+
		"\f\'\16\'\u0338\13\'\3\'\3\'\5\'\u033c\n\'\3(\3(\3(\3(\3(\7(\u0343\n("+
		"\f(\16(\u0346\13(\3(\3(\5(\u034a\n(\3(\3(\3(\3(\3(\3)\3)\3)\5)\u0354\n"+
		")\3)\5)\u0357\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0362\n*\3*\3*\3*\5*\u0367"+
		"\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0376\n*\3*\5*\u0379\n*"+
		"\3*\3*\3*\3*\3*\3*\5*\u0381\n*\3*\3*\3*\3*\3*\6*\u0388\n*\r*\16*\u0389"+
		"\3*\3*\5*\u038e\n*\3*\3*\3*\5*\u0393\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u03b1\n*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u03bd\n*\3*\3*\3*\5*\u03c2\n*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\5*\u03ce\n*\3*\3*\3*\3*\5*\u03d4\n*\3*\3*\3*\3*"+
		"\3*\5*\u03db\n*\3*\3*\5*\u03df\n*\3*\3*\3*\3*\3*\3*\7*\u03e7\n*\f*\16"+
		"*\u03ea\13*\5*\u03ec\n*\3*\3*\3*\3*\5*\u03f2\n*\3*\5*\u03f5\n*\7*\u03f7"+
		"\n*\f*\16*\u03fa\13*\3+\3+\3,\3,\3-\3-\3.\6.\u0403\n.\r.\16.\u0404\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0411\n.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\3;\3;\5;\u042d\n;\3<\3<\3=\5=\u0432\n=\3=\3=\3>\3>\3>\3>\3>\3>\5"+
		">\u043c\n>\3>\3>\3?\3?\3?\2\4*R@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\21\4\2\7\n"+
		"aa\4\2EE__\4\2\31\31\'\'\4\2\27\27\31]\4\2\34\34&&\4\2\7\baa\3\2\t\n\4"+
		"\2\5\5\13\r\3\2\16\21\6\2\60\60==??LL\6\2#%DDkloo\5\2\t\n\26\26BB\3\2"+
		"X\\\3\2no\5\2\27\27--NN\u04d0\2~\3\2\2\2\4\u0085\3\2\2\2\6\u008a\3\2\2"+
		"\2\b\u00a9\3\2\2\2\n\u00b1\3\2\2\2\f\u00b8\3\2\2\2\16\u00cc\3\2\2\2\20"+
		"\u0104\3\2\2\2\22\u0106\3\2\2\2\24\u0108\3\2\2\2\26\u010f\3\2\2\2\30\u011a"+
		"\3\2\2\2\32\u0127\3\2\2\2\34\u0135\3\2\2\2\36\u0147\3\2\2\2 \u014a\3\2"+
		"\2\2\"\u015e\3\2\2\2$\u0176\3\2\2\2&\u017b\3\2\2\2(\u0199\3\2\2\2*\u01a3"+
		"\3\2\2\2,\u01af\3\2\2\2.\u01b3\3\2\2\2\60\u01b5\3\2\2\2\62\u01b8\3\2\2"+
		"\2\64\u01cc\3\2\2\2\66\u01da\3\2\2\28\u0205\3\2\2\2:\u0277\3\2\2\2<\u0285"+
		"\3\2\2\2>\u02b6\3\2\2\2@\u02b8\3\2\2\2B\u02c6\3\2\2\2D\u02f1\3\2\2\2F"+
		"\u0307\3\2\2\2H\u0309\3\2\2\2J\u032b\3\2\2\2L\u033b\3\2\2\2N\u033d\3\2"+
		"\2\2P\u0350\3\2\2\2R\u0392\3\2\2\2T\u03fb\3\2\2\2V\u03fd\3\2\2\2X\u03ff"+
		"\3\2\2\2Z\u0402\3\2\2\2\\\u0412\3\2\2\2^\u0414\3\2\2\2`\u0416\3\2\2\2"+
		"b\u0418\3\2\2\2d\u041a\3\2\2\2f\u041c\3\2\2\2h\u041e\3\2\2\2j\u0420\3"+
		"\2\2\2l\u0422\3\2\2\2n\u0424\3\2\2\2p\u0426\3\2\2\2r\u0428\3\2\2\2t\u042c"+
		"\3\2\2\2v\u042e\3\2\2\2x\u0431\3\2\2\2z\u0435\3\2\2\2|\u043f\3\2\2\2~"+
		"\177\5\6\4\2\177\u0081\5\4\3\2\u0080\u0082\5.\30\2\u0081\u0080\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\3\3\2\2\2\u0083\u0086\5\b\5\2\u0084\u0086\5"+
		"\22\n\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0089\7j\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\5\3\2\2\2"+
		"\u008a\u008b\7W\2\2\u008b\u008c\7n\2\2\u008c\7\3\2\2\2\u008d\u008f\5\36"+
		"\20\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u00aa\5\n\6\2\u0091\u0093\5\36\20\2\u0092\u0091\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\u00aa\5\f\7\2\u0095\u00aa\5 \21\2\u0096"+
		"\u00aa\5\"\22\2\u0097\u0098\7g\2\2\u0098\u0099\5\22\n\2\u0099\u009a\7"+
		"h\2\2\u009a\u00aa\3\2\2\2\u009b\u00aa\5\16\b\2\u009c\u00aa\5\20\t\2\u009d"+
		"\u00aa\5(\25\2\u009e\u00aa\7k\2\2\u009f\u00a1\5\36\20\2\u00a0\u009f\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00aa\5$\23\2\u00a3"+
		"\u00aa\5*\26\2\u00a4\u00aa\5v<\2\u00a5\u00a7\5\36\20\2\u00a6\u00a5\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\5&\24\2\u00a9"+
		"\u008e\3\2\2\2\u00a9\u0092\3\2\2\2\u00a9\u0095\3\2\2\2\u00a9\u0096\3\2"+
		"\2\2\u00a9\u0097\3\2\2\2\u00a9\u009b\3\2\2\2\u00a9\u009c\3\2\2\2\u00a9"+
		"\u009d\3\2\2\2\u00a9\u009e\3\2\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a3\3\2"+
		"\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u00ad\7j\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\t\3\2\2\2"+
		"\u00ae\u00af\5p9\2\u00af\u00b0\7b\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00ae"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\5n8\2\u00b4"+
		"\13\3\2\2\2\u00b5\u00b9\5\n\6\2\u00b6\u00b9\5$\23\2\u00b7\u00b9\5\"\22"+
		"\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\7\33\2\2\u00bb\u00bc\5t;\2\u00bc\r\3\2\2\2\u00bd"+
		"\u00be\7e\2\2\u00be\u00bf\5\22\n\2\u00bf\u00c0\7f\2\2\u00c0\u00c1\7_\2"+
		"\2\u00c1\u00cd\3\2\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\5\22\n\2\u00c4\u00c5"+
		"\7f\2\2\u00c5\u00c6\7`\2\2\u00c6\u00cd\3\2\2\2\u00c7\u00c8\7e\2\2\u00c8"+
		"\u00c9\5\22\n\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7a\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00bd\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cd"+
		"\17\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\5\22\n\2\u00d0\u00d1\7f\2\2"+
		"\u00d1\u00de\7_\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d6\7`\2\2\u00d4\u00d5"+
		"\7k\2\2\u00d5\u00d7\7a\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00df\3\2\2\2\u00d8\u00d9\7k\2\2\u00d9\u00dc\7a\2\2\u00da\u00db\7k\2"+
		"\2\u00db\u00dd\7`\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df"+
		"\3\2\2\2\u00de\u00d2\3\2\2\2\u00de\u00d8\3\2\2\2\u00df\u0105\3\2\2\2\u00e0"+
		"\u00e1\7e\2\2\u00e1\u00e2\5\22\n\2\u00e2\u00e3\7f\2\2\u00e3\u00f0\7`\2"+
		"\2\u00e4\u00e5\7k\2\2\u00e5\u00e8\7_\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e9"+
		"\7a\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f1\3\2\2\2\u00ea"+
		"\u00eb\7k\2\2\u00eb\u00ee\7a\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ef\7_\2\2"+
		"\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00e4"+
		"\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f1\u0105\3\2\2\2\u00f2\u00f3\7e\2\2\u00f3"+
		"\u00f4\5\22\n\2\u00f4\u00f5\7f\2\2\u00f5\u0102\7a\2\2\u00f6\u00f7\7k\2"+
		"\2\u00f7\u00fa\7_\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fb\7`\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0103\3\2\2\2\u00fc\u00fd\7k\2\2\u00fd"+
		"\u0100\7`\2\2\u00fe\u00ff\7k\2\2\u00ff\u0101\7_\2\2\u0100\u00fe\3\2\2"+
		"\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u00f6\3\2\2\2\u0102\u00fc"+
		"\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u00ce\3\2\2\2\u0104\u00e0\3\2\2\2\u0104"+
		"\u00f2\3\2\2\2\u0105\21\3\2\2\2\u0106\u0107\5\26\f\2\u0107\23\3\2\2\2"+
		"\u0108\u010b\5\b\5\2\u0109\u010a\7\3\2\2\u010a\u010c\5\b\5\2\u010b\u0109"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\25\3\2\2\2\u010f\u0117\5\30\r\2\u0110\u0113\7a\2\2\u0111\u0114\5\30\r"+
		"\2\u0112\u0114\5\b\5\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0116"+
		"\3\2\2\2\u0115\u0110\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\27\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u0122\5\32\16"+
		"\2\u011b\u011e\7`\2\2\u011c\u011f\5\32\16\2\u011d\u011f\5\b\5\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011b\3\2"+
		"\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\31\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0128\5\b\5\2\u0126\u0128\5\34\17"+
		"\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u0130\3\2\2\2\u0129\u012c"+
		"\7_\2\2\u012a\u012d\5\b\5\2\u012b\u012d\5\34\17\2\u012c\u012a\3\2\2\2"+
		"\u012c\u012b\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0129\3\2\2\2\u012f\u0132"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\33\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0136\5\b\5\2\u0134\u0136\5\24\13\2\u0135\u0133\3"+
		"\2\2\2\u0135\u0134\3\2\2\2\u0136\u013e\3\2\2\2\u0137\u013a\7^\2\2\u0138"+
		"\u013b\5\b\5\2\u0139\u013b\5\24\13\2\u013a\u0138\3\2\2\2\u013a\u0139\3"+
		"\2\2\2\u013b\u013d\3\2\2\2\u013c\u0137\3\2\2\2\u013d\u0140\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\35\3\2\2\2\u0140\u013e\3\2\2"+
		"\2\u0141\u0142\7c\2\2\u0142\u0143\7\34\2\2\u0143\u0148\7d\2\2\u0144\u0145"+
		"\7c\2\2\u0145\u0146\7&\2\2\u0146\u0148\7d\2\2\u0147\u0141\3\2\2\2\u0147"+
		"\u0144\3\2\2\2\u0148\37\3\2\2\2\u0149\u014b\7\4\2\2\u014a\u0149\3\2\2"+
		"\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\5\\/\2\u014d\u0150"+
		"\7c\2\2\u014e\u0151\5\b\5\2\u014f\u0151\5\22\n\2\u0150\u014e\3\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0151\u0159\3\2\2\2\u0152\u0155\7_\2\2\u0153\u0156\5\b"+
		"\5\2\u0154\u0156\5\22\n\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0152\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u015d\7d\2\2\u015d!\3\2\2\2\u015e\u015f\7\5\2\2\u015f\u0160\5\\/\2\u0160"+
		"\u0171\7c\2\2\u0161\u0164\5\b\5\2\u0162\u0164\5\22\n\2\u0163\u0161\3\2"+
		"\2\2\u0163\u0162\3\2\2\2\u0164\u016c\3\2\2\2\u0165\u0168\7_\2\2\u0166"+
		"\u0169\5\b\5\2\u0167\u0169\5\22\n\2\u0168\u0166\3\2\2\2\u0168\u0167\3"+
		"\2\2\2\u0169\u016b\3\2\2\2\u016a\u0165\3\2\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016f\u0163\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\7d"+
		"\2\2\u0175#\3\2\2\2\u0176\u0177\5^\60\2\u0177\u0178\7e\2\2\u0178\u0179"+
		"\5\n\6\2\u0179\u017a\7f\2\2\u017a%\3\2\2\2\u017b\u017c\5b\62\2\u017c\u017d"+
		"\7e\2\2\u017d\u0180\5\n\6\2\u017e\u017f\7_\2\2\u017f\u0181\5\n\6\2\u0180"+
		"\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7f"+
		"\2\2\u0183\'\3\2\2\2\u0184\u0185\7\63\2\2\u0185\u0186\7c\2\2\u0186\u0187"+
		"\5R*\2\u0187\u0188\7d\2\2\u0188\u0189\7P\2\2\u0189\u018a\7c\2\2\u018a"+
		"\u018b\5\22\n\2\u018b\u018c\7d\2\2\u018c\u018d\7(\2\2\u018d\u018e\7c\2"+
		"\2\u018e\u018f\5\22\n\2\u018f\u0190\7d\2\2\u0190\u019a\3\2\2\2\u0191\u0192"+
		"\7c\2\2\u0192\u0193\5R*\2\u0193\u0194\7d\2\2\u0194\u0195\7^\2\2\u0195"+
		"\u0196\5\22\n\2\u0196\u0197\7\6\2\2\u0197\u0198\5\22\n\2\u0198\u019a\3"+
		"\2\2\2\u0199\u0184\3\2\2\2\u0199\u0191\3\2\2\2\u019a)\3\2\2\2\u019b\u019c"+
		"\b\26\1\2\u019c\u019d\7c\2\2\u019d\u019e\5*\26\2\u019e\u019f\t\2\2\2\u019f"+
		"\u01a0\5*\26\2\u01a0\u01a1\7d\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a4\5,\27"+
		"\2\u01a3\u019b\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01aa\3\2\2\2\u01a5\u01a6"+
		"\f\4\2\2\u01a6\u01a7\t\2\2\2\u01a7\u01a9\5*\26\5\u01a8\u01a5\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab+\3\2\2\2"+
		"\u01ac\u01aa\3\2\2\2\u01ad\u01b0\5\n\6\2\u01ae\u01b0\7k\2\2\u01af\u01ad"+
		"\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0-\3\2\2\2\u01b1\u01b4\5\62\32\2\u01b2"+
		"\u01b4\5\60\31\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4/\3\2\2"+
		"\2\u01b5\u01b6\7s\2\2\u01b6\u01b7\b\31\1\2\u01b7\61\3\2\2\2\u01b8\u01c1"+
		"\5\64\33\2\u01b9\u01bb\7i\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2"+
		"\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0"+
		"\5\64\33\2\u01bf\u01ba\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2"+
		"\u01c1\u01c2\3\2\2\2\u01c2\u01c7\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c6"+
		"\7i\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\63\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\5\66\34"+
		"\2\u01cb\u01cd\5B\"\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\65"+
		"\3\2\2\2\u01ce\u01d0\7V\2\2\u01cf\u01d1\7K\2\2\u01d0\u01cf\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d7\5N(\2\u01d3\u01d4\7_\2"+
		"\2\u01d4\u01d6\5N(\2\u01d5\u01d3\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da"+
		"\u01ce\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01e2\58"+
		"\35\2\u01dd\u01de\5F$\2\u01de\u01df\58\35\2\u01df\u01e1\3\2\2\2\u01e0"+
		"\u01dd\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2"+
		"\2\2\u01e3\u01ef\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\7H\2\2\u01e6"+
		"\u01e7\7\36\2\2\u01e7\u01ec\5P)\2\u01e8\u01e9\7_\2\2\u01e9\u01eb\5P)\2"+
		"\u01ea\u01e8\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed"+
		"\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01e5\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f7\3\2\2\2\u01f1\u01f2\7>\2\2\u01f2\u01f5\5R*"+
		"\2\u01f3\u01f4\t\3\2\2\u01f4\u01f6\5R*\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f1\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\67\3\2\2\2\u01f9\u01fb\7O\2\2\u01fa\u01fc\t\4\2\2\u01fb\u01fa\3\2\2\2"+
		"\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0202\5<\37\2\u01fe\u01ff"+
		"\7_\2\2\u01ff\u0201\5<\37\2\u0200\u01fe\3\2\2\2\u0201\u0204\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2"+
		"\2\2\u0205\u01f9\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0211\7/\2\2\u0208\u020d\5> \2\u0209\u020a\7_\2\2\u020a\u020c\5> \2\u020b"+
		"\u0209\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u0212\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0212\5H%\2\u0211\u0208"+
		"\3\2\2\2\u0211\u0210\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0215\5:\36\2\u0214"+
		"\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u02159\3\2\2\2\u0216\u0217\7U\2\2\u0217"+
		"\u0218\5R*\2\u0218\u0227\3\2\2\2\u0219\u021a\7\61\2\2\u021a\u021b\7\36"+
		"\2\2\u021b\u0220\5R*\2\u021c\u021d\7_\2\2\u021d\u021f\5R*\2\u021e\u021c"+
		"\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0225\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7\62\2\2\u0224\u0226\5"+
		"R*\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\3\2\2\2\u0227"+
		"\u0219\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0246\3\2\2\2\u0229\u022a\7S"+
		"\2\2\u022a\u022b\7c\2\2\u022b\u0230\5R*\2\u022c\u022d\7_\2\2\u022d\u022f"+
		"\5R*\2\u022e\u022c\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0242\7d"+
		"\2\2\u0234\u0235\7_\2\2\u0235\u0236\7c\2\2\u0236\u023b\5R*\2\u0237\u0238"+
		"\7_\2\2\u0238\u023a\5R*\2\u0239\u0237\3\2\2\2\u023a\u023d\3\2\2\2\u023b"+
		"\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d\u023b\3\2"+
		"\2\2\u023e\u023f\7d\2\2\u023f\u0241\3\2\2\2\u0240\u0234\3\2\2\2\u0241"+
		"\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0246\3\2"+
		"\2\2\u0244\u0242\3\2\2\2\u0245\u0216\3\2\2\2\u0245\u0229\3\2\2\2\u0246"+
		"\u0278\3\2\2\2\u0247\u0248\7U\2\2\u0248\u024a\5R*\2\u0249\u0247\3\2\2"+
		"\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\7\61\2\2\u024c"+
		"\u024d\7\36\2\2\u024d\u0252\5R*\2\u024e\u024f\7_\2\2\u024f\u0251\5R*\2"+
		"\u0250\u024e\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253"+
		"\3\2\2\2\u0253\u0257\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256\7\62\2\2"+
		"\u0256\u0258\5R*\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0276"+
		"\3\2\2\2\u0259\u025a\7S\2\2\u025a\u025b\7c\2\2\u025b\u0260\5R*\2\u025c"+
		"\u025d\7_\2\2\u025d\u025f\5R*\2\u025e\u025c\3\2\2\2\u025f\u0262\3\2\2"+
		"\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u0260"+
		"\3\2\2\2\u0263\u0272\7d\2\2\u0264\u0265\7_\2\2\u0265\u0266\7c\2\2\u0266"+
		"\u026b\5R*\2\u0267\u0268\7_\2\2\u0268\u026a\5R*\2\u0269\u0267\3\2\2\2"+
		"\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e"+
		"\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u026f\7d\2\2\u026f\u0271\3\2\2\2\u0270"+
		"\u0264\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2"+
		"\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0249\3\2\2\2\u0275"+
		"\u0259\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0245\3\2\2\2\u0277\u0275\3\2"+
		"\2\2\u0278;\3\2\2\2\u0279\u0286\7\7\2\2\u027a\u027b\5j\66\2\u027b\u027c"+
		"\7b\2\2\u027c\u027d\7\7\2\2\u027d\u0286\3\2\2\2\u027e\u0283\5R*\2\u027f"+
		"\u0281\7\33\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3"+
		"\2\2\2\u0282\u0284\5l\67\2\u0283\u0280\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0286\3\2\2\2\u0285\u0279\3\2\2\2\u0285\u027a\3\2\2\2\u0285\u027e\3\2"+
		"\2\2\u0286=\3\2\2\2\u0287\u0288\5h\65\2\u0288\u0289\7b\2\2\u0289\u028b"+
		"\3\2\2\2\u028a\u0287\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u0291\5j\66\2\u028d\u028f\7\33\2\2\u028e\u028d\3\2\2\2\u028e\u028f\3"+
		"\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\5p9\2\u0291\u028e\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292\u0298\3\2\2\2\u0293\u0294\7\66\2\2\u0294\u0295\7"+
		"\36\2\2\u0295\u0299\5r:\2\u0296\u0297\7B\2\2\u0297\u0299\7\66\2\2\u0298"+
		"\u0293\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u02b7\3\2"+
		"\2\2\u029a\u02a4\7c\2\2\u029b\u02a0\5> \2\u029c\u029d\7_\2\2\u029d\u029f"+
		"\5> \2\u029e\u029c\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u02a5\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a5\5H"+
		"%\2\u02a4\u029b\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02ab\7d\2\2\u02a7\u02a9\7\33\2\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2"+
		"\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\5p9\2\u02ab\u02a8\3\2\2\2\u02ab\u02ac"+
		"\3\2\2\2\u02ac\u02b7\3\2\2\2\u02ad\u02ae\7c\2\2\u02ae\u02af\5B\"\2\u02af"+
		"\u02b4\7d\2\2\u02b0\u02b2\7\33\2\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2"+
		"\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\5p9\2\u02b4\u02b1\3\2\2\2\u02b4\u02b5"+
		"\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6\u028a\3\2\2\2\u02b6\u029a\3\2\2\2\u02b6"+
		"\u02ad\3\2\2\2\u02b7?\3\2\2\2\u02b8\u02b9\t\5\2\2\u02b9A\3\2\2\2\u02ba"+
		"\u02bc\7V\2\2\u02bb\u02bd\7K\2\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2"+
		"\2\u02bd\u02be\3\2\2\2\u02be\u02c3\5N(\2\u02bf\u02c0\7_\2\2\u02c0\u02c2"+
		"\5N(\2\u02c1\u02bf\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02ba\3\2"+
		"\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02ce\5D#\2\u02c9\u02ca"+
		"\5F$\2\u02ca\u02cb\5D#\2\u02cb\u02cd\3\2\2\2\u02cc\u02c9\3\2\2\2\u02cd"+
		"\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02db\3\2"+
		"\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\7H\2\2\u02d2\u02d3\7\36\2\2\u02d3"+
		"\u02d8\5P)\2\u02d4\u02d5\7_\2\2\u02d5\u02d7\5P)\2\u02d6\u02d4\3\2\2\2"+
		"\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02dc"+
		"\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02d1\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02e3\3\2\2\2\u02dd\u02de\7>\2\2\u02de\u02e1\5R*\2\u02df\u02e0\t\3\2"+
		"\2\u02e0\u02e2\5R*\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4"+
		"\3\2\2\2\u02e3\u02dd\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4C\3\2\2\2\u02e5"+
		"\u02e7\7O\2\2\u02e6\u02e8\t\4\2\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ee\5<\37\2\u02ea\u02eb\7_\2\2\u02eb"+
		"\u02ed\5<\37\2\u02ec\u02ea\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2"+
		"\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1"+
		"\u02e5\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02fd\7/"+
		"\2\2\u02f4\u02f9\5> \2\u02f5\u02f6\7_\2\2\u02f6\u02f8\5> \2\u02f7\u02f5"+
		"\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02fe\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02fe\5H%\2\u02fd\u02f4\3\2\2"+
		"\2\u02fd\u02fc\3\2\2\2\u02fe\u0300\3\2\2\2\u02ff\u0301\5:\36\2\u0300\u02ff"+
		"\3\2\2\2\u0300\u0301\3\2\2\2\u0301E\3\2\2\2\u0302\u0308\7Q\2\2\u0303\u0304"+
		"\7Q\2\2\u0304\u0308\7\31\2\2\u0305\u0308\78\2\2\u0306\u0308\7+\2\2\u0307"+
		"\u0302\3\2\2\2\u0307\u0303\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0306\3\2"+
		"\2\2\u0308G\3\2\2\2\u0309\u0313\5> \2\u030a\u030d\5J&\2\u030b\u030e\5"+
		"H%\2\u030c\u030e\5> \2\u030d\u030b\3\2\2\2\u030d\u030c\3\2\2\2\u030e\u030f"+
		"\3\2\2\2\u030f\u0310\5L\'\2\u0310\u0312\3\2\2\2\u0311\u030a\3\2\2\2\u0312"+
		"\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314I\3\2\2\2"+
		"\u0315\u0313\3\2\2\2\u0316\u032c\7_\2\2\u0317\u0319\7@\2\2\u0318\u0317"+
		"\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u0328\3\2\2\2\u031a\u031c\7<\2\2\u031b"+
		"\u031d\7I\2\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0329\3\2"+
		"\2\2\u031e\u0320\7M\2\2\u031f\u0321\7I\2\2\u0320\u031f\3\2\2\2\u0320\u0321"+
		"\3\2\2\2\u0321\u0329\3\2\2\2\u0322\u0324\7.\2\2\u0323\u0325\7I\2\2\u0324"+
		"\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0329\3\2\2\2\u0326\u0329\7\67"+
		"\2\2\u0327\u0329\7\"\2\2\u0328\u031a\3\2\2\2\u0328\u031e\3\2\2\2\u0328"+
		"\u0322\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2"+
		"\2\2\u0329\u032a\3\2\2\2\u032a\u032c\7;\2\2\u032b\u0316\3\2\2\2\u032b"+
		"\u0318\3\2\2\2\u032cK\3\2\2\2\u032d\u032e\7F\2\2\u032e\u033c\5R*\2\u032f"+
		"\u0330\7R\2\2\u0330\u0331\7c\2\2\u0331\u0336\5n8\2\u0332\u0333\7_\2\2"+
		"\u0333\u0335\5n8\2\u0334\u0332\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334"+
		"\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u0336\3\2\2\2\u0339"+
		"\u033a\7d\2\2\u033a\u033c\3\2\2\2\u033b\u032d\3\2\2\2\u033b\u032f\3\2"+
		"\2\2\u033b\u033c\3\2\2\2\u033cM\3\2\2\2\u033d\u0349\5j\66\2\u033e\u033f"+
		"\7c\2\2\u033f\u0344\5n8\2\u0340\u0341\7_\2\2\u0341\u0343\5n8\2\u0342\u0340"+
		"\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345"+
		"\u0347\3\2\2\2\u0346\u0344\3\2\2\2\u0347\u0348\7d\2\2\u0348\u034a\3\2"+
		"\2\2\u0349\u033e\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"\u034c\7\33\2\2\u034c\u034d\7c\2\2\u034d\u034e\5B\"\2\u034e\u034f\7d\2"+
		"\2\u034fO\3\2\2\2\u0350\u0353\5R*\2\u0351\u0352\7!\2\2\u0352\u0354\5f"+
		"\64\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0356\3\2\2\2\u0355"+
		"\u0357\t\6\2\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357Q\3\2\2\2"+
		"\u0358\u0359\b*\1\2\u0359\u035a\5V,\2\u035a\u035b\5R*\26\u035b\u0393\3"+
		"\2\2\2\u035c\u0393\5\b\5\2\u035d\u0393\7m\2\2\u035e\u035f\5h\65\2\u035f"+
		"\u0360\7b\2\2\u0360\u0362\3\2\2\2\u0361\u035e\3\2\2\2\u0361\u0362\3\2"+
		"\2\2\u0362\u0363\3\2\2\2\u0363\u0364\5p9\2\u0364\u0365\7b\2\2\u0365\u0367"+
		"\3\2\2\2\u0366\u0361\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368"+
		"\u0393\5n8\2\u0369\u036a\7c\2\2\u036a\u036b\5R*\2\u036b\u036c\7d\2\2\u036c"+
		"\u0393\3\2\2\2\u036d\u036e\7 \2\2\u036e\u036f\7c\2\2\u036f\u0370\5R*\2"+
		"\u0370\u0371\7\33\2\2\u0371\u0372\5Z.\2\u0372\u0373\7d\2\2\u0373\u0393"+
		"\3\2\2\2\u0374\u0376\7B\2\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u0377\3\2\2\2\u0377\u0379\7,\2\2\u0378\u0375\3\2\2\2\u0378\u0379\3\2"+
		"\2\2\u0379\u037a\3\2\2\2\u037a\u037b\7c\2\2\u037b\u037c\5B\"\2\u037c\u037d"+
		"\7d\2\2\u037d\u0393\3\2\2\2\u037e\u0380\7\37\2\2\u037f\u0381\5R*\2\u0380"+
		"\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0387\3\2\2\2\u0382\u0383\7T"+
		"\2\2\u0383\u0384\5R*\2\u0384\u0385\7P\2\2\u0385\u0386\5R*\2\u0386\u0388"+
		"\3\2\2\2\u0387\u0382\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u0387\3\2\2\2\u0389"+
		"\u038a\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u038c\7(\2\2\u038c\u038e\5R*"+
		"\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390"+
		"\7)\2\2\u0390\u0393\3\2\2\2\u0391\u0393\5z>\2\u0392\u0358\3\2\2\2\u0392"+
		"\u035c\3\2\2\2\u0392\u035d\3\2\2\2\u0392\u0366\3\2\2\2\u0392\u0369\3\2"+
		"\2\2\u0392\u036d\3\2\2\2\u0392\u0378\3\2\2\2\u0392\u037e\3\2\2\2\u0392"+
		"\u0391\3\2\2\2\u0393\u03f8\3\2\2\2\u0394\u0395\f\25\2\2\u0395\u0396\7"+
		"\3\2\2\u0396\u03f7\5R*\26\u0397\u0398\f\24\2\2\u0398\u0399\t\7\2\2\u0399"+
		"\u03f7\5R*\25\u039a\u039b\f\23\2\2\u039b\u039c\t\b\2\2\u039c\u03f7\5R"+
		"*\24\u039d\u039e\f\22\2\2\u039e\u039f\t\t\2\2\u039f\u03f7\5R*\23\u03a0"+
		"\u03a1\f\21\2\2\u03a1\u03a2\t\n\2\2\u03a2\u03f7\5R*\22\u03a3\u03b0\f\20"+
		"\2\2\u03a4\u03b1\7\22\2\2\u03a5\u03b1\7\23\2\2\u03a6\u03b1\7\24\2\2\u03a7"+
		"\u03b1\7\25\2\2\u03a8\u03b1\79\2\2\u03a9\u03aa\79\2\2\u03aa\u03b1\7B\2"+
		"\2\u03ab\u03b1\7\65\2\2\u03ac\u03b1\7=\2\2\u03ad\u03b1\7\60\2\2\u03ae"+
		"\u03b1\7?\2\2\u03af\u03b1\7L\2\2\u03b0\u03a4\3\2\2\2\u03b0\u03a5\3\2\2"+
		"\2\u03b0\u03a6\3\2\2\2\u03b0\u03a7\3\2\2\2\u03b0\u03a8\3\2\2\2\u03b0\u03a9"+
		"\3\2\2\2\u03b0\u03ab\3\2\2\2\u03b0\u03ac\3\2\2\2\u03b0\u03ad\3\2\2\2\u03b0"+
		"\u03ae\3\2\2\2\u03b0\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03f7\5R"+
		"*\21\u03b3\u03b4\f\17\2\2\u03b4\u03b5\7\32\2\2\u03b5\u03f7\5R*\20\u03b6"+
		"\u03b7\f\16\2\2\u03b7\u03b8\7G\2\2\u03b8\u03f7\5R*\17\u03b9\u03ba\f\b"+
		"\2\2\u03ba\u03bc\79\2\2\u03bb\u03bd\7B\2\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd"+
		"\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03f7\5R*\t\u03bf\u03c1\f\7\2\2\u03c0"+
		"\u03c2\7B\2\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2"+
		"\2\2\u03c3\u03c4\7\35\2\2\u03c4\u03c5\5R*\2\u03c5\u03c6\7\32\2\2\u03c6"+
		"\u03c7\5R*\b\u03c7\u03f7\3\2\2\2\u03c8\u03c9\f\13\2\2\u03c9\u03ca\7!\2"+
		"\2\u03ca\u03f7\5f\64\2\u03cb\u03cd\f\n\2\2\u03cc\u03ce\7B\2\2\u03cd\u03cc"+
		"\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\t\13\2\2"+
		"\u03d0\u03d3\5R*\2\u03d1\u03d2\7*\2\2\u03d2\u03d4\5R*\2\u03d3\u03d1\3"+
		"\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03f7\3\2\2\2\u03d5\u03da\f\t\2\2\u03d6"+
		"\u03db\7:\2\2\u03d7\u03db\7C\2\2\u03d8\u03d9\7B\2\2\u03d9\u03db\7D\2\2"+
		"\u03da\u03d6\3\2\2\2\u03da\u03d7\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03f7"+
		"\3\2\2\2\u03dc\u03de\f\6\2\2\u03dd\u03df\7B\2\2\u03de\u03dd\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03f4\7\65\2\2\u03e1\u03eb\7"+
		"c\2\2\u03e2\u03ec\5B\"\2\u03e3\u03e8\5R*\2\u03e4\u03e5\7_\2\2\u03e5\u03e7"+
		"\5R*\2\u03e6\u03e4\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03eb\u03e2\3\2"+
		"\2\2\u03eb\u03e3\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u03f5\7d\2\2\u03ee\u03ef\5h\65\2\u03ef\u03f0\7b\2\2\u03f0\u03f2\3\2\2"+
		"\2\u03f1\u03ee\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f5"+
		"\5j\66\2\u03f4\u03e1\3\2\2\2\u03f4\u03f1\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6"+
		"\u0394\3\2\2\2\u03f6\u0397\3\2\2\2\u03f6\u039a\3\2\2\2\u03f6\u039d\3\2"+
		"\2\2\u03f6\u03a0\3\2\2\2\u03f6\u03a3\3\2\2\2\u03f6\u03b3\3\2\2\2\u03f6"+
		"\u03b6\3\2\2\2\u03f6\u03b9\3\2\2\2\u03f6\u03bf\3\2\2\2\u03f6\u03c8\3\2"+
		"\2\2\u03f6\u03cb\3\2\2\2\u03f6\u03d5\3\2\2\2\u03f6\u03dc\3\2\2\2\u03f7"+
		"\u03fa\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9S\3\2\2\2"+
		"\u03fa\u03f8\3\2\2\2\u03fb\u03fc\t\f\2\2\u03fcU\3\2\2\2\u03fd\u03fe\t"+
		"\r\2\2\u03feW\3\2\2\2\u03ff\u0400\5t;\2\u0400Y\3\2\2\2\u0401\u0403\5X"+
		"-\2\u0402\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0402\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0410\3\2\2\2\u0406\u0407\7c\2\2\u0407\u0408\5x="+
		"\2\u0408\u0409\7d\2\2\u0409\u0411\3\2\2\2\u040a\u040b\7c\2\2\u040b\u040c"+
		"\5x=\2\u040c\u040d\7_\2\2\u040d\u040e\5x=\2\u040e\u040f\7d\2\2\u040f\u0411"+
		"\3\2\2\2\u0410\u0406\3\2\2\2\u0410\u040a\3\2\2\2\u0410\u0411\3\2\2\2\u0411"+
		"[\3\2\2\2\u0412\u0413\5t;\2\u0413]\3\2\2\2\u0414\u0415\5`\61\2\u0415_"+
		"\3\2\2\2\u0416\u0417\t\16\2\2\u0417a\3\2\2\2\u0418\u0419\5d\63\2\u0419"+
		"c\3\2\2\2\u041a\u041b\7]\2\2\u041be\3\2\2\2\u041c\u041d\5t;\2\u041dg\3"+
		"\2\2\2\u041e\u041f\5t;\2\u041fi\3\2\2\2\u0420\u0421\5t;\2\u0421k\3\2\2"+
		"\2\u0422\u0423\t\17\2\2\u0423m\3\2\2\2\u0424\u0425\5t;\2\u0425o\3\2\2"+
		"\2\u0426\u0427\5t;\2\u0427q\3\2\2\2\u0428\u0429\5t;\2\u0429s\3\2\2\2\u042a"+
		"\u042d\5@!\2\u042b\u042d\7n\2\2\u042c\u042a\3\2\2\2\u042c\u042b\3\2\2"+
		"\2\u042du\3\2\2\2\u042e\u042f\7o\2\2\u042fw\3\2\2\2\u0430\u0432\t\b\2"+
		"\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0434"+
		"\7k\2\2\u0434y\3\2\2\2\u0435\u0436\7J\2\2\u0436\u043b\7c\2\2\u0437\u043c"+
		"\7\64\2\2\u0438\u0439\t\20\2\2\u0439\u043a\7_\2\2\u043a\u043c\5|?\2\u043b"+
		"\u0437\3\2\2\2\u043b\u0438\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043e\7d"+
		"\2\2\u043e{\3\2\2\2\u043f\u0440\7o\2\2\u0440}\3\2\2\2\u0098\u0081\u0085"+
		"\u0088\u008e\u0092\u00a0\u00a6\u00a9\u00ac\u00b1\u00b8\u00cc\u00d6\u00dc"+
		"\u00de\u00e8\u00ee\u00f0\u00fa\u0100\u0102\u0104\u010d\u0113\u0117\u011e"+
		"\u0122\u0127\u012c\u0130\u0135\u013a\u013e\u0147\u014a\u0150\u0155\u0159"+
		"\u0163\u0168\u016c\u0171\u0180\u0199\u01a3\u01aa\u01af\u01b3\u01bc\u01c1"+
		"\u01c7\u01cc\u01d0\u01d7\u01da\u01e2\u01ec\u01ef\u01f5\u01f7\u01fb\u0202"+
		"\u0205\u020d\u0211\u0214\u0220\u0225\u0227\u0230\u023b\u0242\u0245\u0249"+
		"\u0252\u0257\u0260\u026b\u0272\u0275\u0277\u0280\u0283\u0285\u028a\u028e"+
		"\u0291\u0298\u02a0\u02a4\u02a8\u02ab\u02b1\u02b4\u02b6\u02bc\u02c3\u02c6"+
		"\u02ce\u02d8\u02db\u02e1\u02e3\u02e7\u02ee\u02f1\u02f9\u02fd\u0300\u0307"+
		"\u030d\u0313\u0318\u031c\u0320\u0324\u0328\u032b\u0336\u033b\u0344\u0349"+
		"\u0353\u0356\u0361\u0366\u0375\u0378\u0380\u0389\u038d\u0392\u03b0\u03bc"+
		"\u03c1\u03cd\u03d3\u03da\u03de\u03e8\u03eb\u03f1\u03f4\u03f6\u03f8\u0404"+
		"\u0410\u042c\u0431\u043b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}