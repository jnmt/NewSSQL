// Generated from query.g4 by ANTLR 4.5.3

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
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

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
		CLOSE_BRACKET=99, OPEN_BRACE=100, CLOSE_BRACE=101, SEMICOLON=102, DECORATOR=103, 
		NUMERIC_LITERAL=104, BLOB_LITERAL=105, BIND_PARAMETER=106, IDENTIFIER=107, 
		STRING_LITERAL=108, MULTI_LINE_COMMENT=109, SINGLE_LINE_COMMENT=110, WS=111, 
		UNEXPECTED_CHAR=112;
	public static final int
		RULE_query = 0, RULE_root = 1, RULE_media = 2, RULE_operand = 3, RULE_attribute = 4, 
		RULE_join_string = 5, RULE_grouper = 6, RULE_composite_iterator = 7, RULE_exp = 8, 
		RULE_d_exp = 9, RULE_v_exp = 10, RULE_h_exp = 11, RULE_n_exp = 12, RULE_sorting = 13, 
		RULE_function = 14, RULE_sqlfunc = 15, RULE_aggregate = 16, RULE_if_then_else = 17, 
		RULE_arithmetics = 18, RULE_from_where = 19, RULE_error = 20, RULE_sql_stmt_list = 21, 
		RULE_sql_stmt = 22, RULE_factored_select_stmt = 23, RULE_select_core = 24, 
		RULE_where_clause = 25, RULE_result_column = 26, RULE_table_or_subquery = 27, 
		RULE_keyword = 28, RULE_select_stmt = 29, RULE_select_or_values = 30, 
		RULE_compound_operator = 31, RULE_join_clause = 32, RULE_join_operator = 33, 
		RULE_join_constraint = 34, RULE_common_table_expression = 35, RULE_ordering_term = 36, 
		RULE_expr = 37, RULE_literal_value = 38, RULE_unary_operator = 39, RULE_name = 40, 
		RULE_type_name = 41, RULE_function_name = 42, RULE_ag_function_name = 43, 
		RULE_ag_keyword = 44, RULE_collation_name = 45, RULE_database_name = 46, 
		RULE_table_name = 47, RULE_column_alias = 48, RULE_column_name = 49, RULE_table_alias = 50, 
		RULE_index_name = 51, RULE_any_name = 52, RULE_sl = 53, RULE_signed_number = 54, 
		RULE_raise_function = 55, RULE_error_message = 56;
	public static final String[] ruleNames = {
		"query", "root", "media", "operand", "attribute", "join_string", "grouper", 
		"composite_iterator", "exp", "d_exp", "v_exp", "h_exp", "n_exp", "sorting", 
		"function", "sqlfunc", "aggregate", "if_then_else", "arithmetics", "from_where", 
		"error", "sql_stmt_list", "sql_stmt", "factored_select_stmt", "select_core", 
		"where_clause", "result_column", "table_or_subquery", "keyword", "select_stmt", 
		"select_or_values", "compound_operator", "join_clause", "join_operator", 
		"join_constraint", "common_table_expression", "ordering_term", "expr", 
		"literal_value", "unary_operator", "name", "type_name", "function_name", 
		"ag_function_name", "ag_keyword", "collation_name", "database_name", "table_name", 
		"column_alias", "column_name", "table_alias", "index_name", "any_name", 
		"sl", "signed_number", "raise_function", "error_message"
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
			setState(114);
			media();
			setState(115);
			root();
			setState(117);
			_la = _input.LA(1);
			if (_la==K_FROM || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_SELECT - 77)) | (1L << (K_WITH - 77)) | (1L << (UNEXPECTED_CHAR - 77)))) != 0)) {
				{
				setState(116);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(119);
				operand();
				}
				break;
			case 2:
				{
				setState(120);
				exp();
				}
				break;
			}
			setState(124);
			_la = _input.LA(1);
			if (_la==DECORATOR) {
				{
				setState(123);
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
			setState(126);
			match(K_GENERATE);
			setState(127);
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
		public Join_stringContext join_string() {
			return getRuleContext(Join_stringContext.class,0);
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
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(130);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESE) {
					{
					setState(129);
					sorting();
					}
				}

				setState(132);
				attribute();
				}
				break;
			case 2:
				{
				setState(133);
				join_string();
				}
				break;
			case 3:
				{
				setState(134);
				function();
				}
				break;
			case 4:
				{
				setState(135);
				sqlfunc();
				}
				break;
			case 5:
				{
				setState(136);
				match(OPEN_BRACE);
				setState(137);
				exp();
				setState(138);
				match(CLOSE_BRACE);
				}
				break;
			case 6:
				{
				setState(140);
				grouper();
				}
				break;
			case 7:
				{
				setState(141);
				composite_iterator();
				}
				break;
			case 8:
				{
				setState(142);
				if_then_else();
				}
				break;
			case 9:
				{
				setState(143);
				match(NUMERIC_LITERAL);
				}
				break;
			case 10:
				{
				setState(145);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESE) {
					{
					setState(144);
					sorting();
					}
				}

				setState(147);
				aggregate();
				}
				break;
			case 11:
				{
				setState(148);
				arithmetics(0);
				}
				break;
			case 12:
				{
				setState(149);
				sl();
				}
				break;
			}
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(152);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(155);
				table_alias();
				setState(156);
				match(DOT);
				}
				break;
			}
			setState(160);
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

	public static class Join_stringContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(queryParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(queryParser.NUMERIC_LITERAL, i);
		}
		public List<ArithmeticsContext> arithmetics() {
			return getRuleContexts(ArithmeticsContext.class);
		}
		public ArithmeticsContext arithmetics(int i) {
			return getRuleContext(ArithmeticsContext.class,i);
		}
		public List<SlContext> sl() {
			return getRuleContexts(SlContext.class);
		}
		public SlContext sl(int i) {
			return getRuleContext(SlContext.class,i);
		}
		public Join_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).enterJoin_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof queryListener ) ((queryListener)listener).exitJoin_string(this);
		}
	}

	public final Join_stringContext join_string() throws RecognitionException {
		Join_stringContext _localctx = new Join_stringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_join_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(162);
				attribute();
				}
				break;
			case 2:
				{
				setState(163);
				match(NUMERIC_LITERAL);
				}
				break;
			case 3:
				{
				setState(164);
				arithmetics(0);
				}
				break;
			case 4:
				{
				setState(165);
				sl();
				}
				break;
			}
			setState(175); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(168);
					match(T__0);
					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(169);
						attribute();
						}
						break;
					case 2:
						{
						setState(170);
						match(NUMERIC_LITERAL);
						}
						break;
					case 3:
						{
						setState(171);
						arithmetics(0);
						}
						break;
					case 4:
						{
						setState(172);
						sl();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(177); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
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
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(OPEN_BRACKET);
				setState(185);
				exp();
				setState(186);
				match(CLOSE_BRACKET);
				setState(187);
				match(C2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(OPEN_BRACKET);
				setState(190);
				exp();
				setState(191);
				match(CLOSE_BRACKET);
				setState(192);
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
		public List<TerminalNode> C1() { return getTokens(queryParser.C1); }
		public TerminalNode C1(int i) {
			return getToken(queryParser.C1, i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(queryParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(queryParser.NUMERIC_LITERAL, i);
		}
		public TerminalNode C3() { return getToken(queryParser.C3, 0); }
		public List<TerminalNode> C2() { return getTokens(queryParser.C2); }
		public TerminalNode C2(int i) {
			return getToken(queryParser.C2, i);
		}
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
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(196);
				match(OPEN_BRACKET);
				setState(197);
				exp();
				setState(198);
				match(CLOSE_BRACKET);
				setState(199);
				match(C1);
				{
				setState(200);
				match(NUMERIC_LITERAL);
				setState(207);
				switch (_input.LA(1)) {
				case C1:
				case C3:
					{
					setState(201);
					_la = _input.LA(1);
					if ( !(_la==C1 || _la==C3) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case C2:
					{
					{
					setState(202);
					match(C2);
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
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
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(209);
				match(OPEN_BRACKET);
				setState(210);
				exp();
				setState(211);
				match(CLOSE_BRACKET);
				setState(212);
				match(C2);
				{
				setState(213);
				match(NUMERIC_LITERAL);
				setState(220);
				switch (_input.LA(1)) {
				case C2:
				case C3:
					{
					setState(214);
					_la = _input.LA(1);
					if ( !(_la==C2 || _la==C3) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case C1:
					{
					{
					setState(215);
					match(C1);
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(216);
						match(NUMERIC_LITERAL);
						setState(217);
						match(C3);
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
			setState(224);
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
		enterRule(_localctx, 18, RULE_d_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			v_exp();
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					match(C3);
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(228);
						v_exp();
						}
						break;
					case 2:
						{
						setState(229);
						operand();
						}
						break;
					}
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 20, RULE_v_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			h_exp();
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					match(C2);
					setState(241);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(239);
						h_exp();
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
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 22, RULE_h_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(248);
				operand();
				}
				break;
			case 2:
				{
				setState(249);
				n_exp();
				}
				break;
			}
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(252);
					match(C1);
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(253);
						operand();
						}
						break;
					case 2:
						{
						setState(254);
						n_exp();
						}
						break;
					}
					}
					} 
				}
				setState(261);
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
		enterRule(_localctx, 24, RULE_n_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			operand();
			setState(263);
			match(C0);
			setState(264);
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
		enterRule(_localctx, 26, RULE_sorting);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(OPEN_PARENTHESE);
				setState(267);
				match(K_ASC);
				setState(268);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(OPEN_PARENTHESE);
				setState(270);
				match(K_DESC);
				setState(271);
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
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(275);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(274);
				match(T__1);
				}
			}

			setState(277);
			function_name();
			setState(278);
			match(OPEN_PARENTHESE);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__19) | (1L << K_ABORT) | (1L << K_ALL) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLLATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_ELSE) | (1L << K_END) | (1L << K_ESCAPE) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FAIL) | (1L << K_FULL) | (1L << K_FROM) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IGNORE) | (1L << K_IN) | (1L << K_INDEXED) | (1L << K_INNER) | (1L << K_INTERSECT) | (1L << K_IS) | (1L << K_ISNULL) | (1L << K_JOIN) | (1L << K_LEFT) | (1L << K_LIKE) | (1L << K_LIMIT) | (1L << K_MATCH) | (1L << K_NATURAL) | (1L << K_NO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_THEN - 64)) | (1L << (K_UNION - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (K_GENERATE - 64)) | (1L << (K_MAX - 64)) | (1L << (K_MIN - 64)) | (1L << (K_AVG - 64)) | (1L << (K_COUNT - 64)) | (1L << (K_SUM - 64)) | (1L << (OPEN_PARENTHESE - 64)) | (1L << (OPEN_BRACKET - 64)) | (1L << (OPEN_BRACE - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (BIND_PARAMETER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (STRING_LITERAL - 64)))) != 0)) {
				{
				{
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(279);
					operand();
					}
					break;
				case 2:
					{
					setState(280);
					exp();
					}
					break;
				case 3:
					{
					setState(281);
					expr(0);
					}
					break;
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(284);
					match(C1);
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(285);
						operand();
						}
						break;
					case 2:
						{
						setState(286);
						exp();
						}
						break;
					case 3:
						{
						setState(287);
						expr(0);
						}
						break;
					}
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
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
		enterRule(_localctx, 30, RULE_sqlfunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(302);
			match(T__2);
			setState(303);
			function_name();
			setState(304);
			match(OPEN_PARENTHESE);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__19) | (1L << K_ABORT) | (1L << K_ALL) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLLATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_ELSE) | (1L << K_END) | (1L << K_ESCAPE) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FAIL) | (1L << K_FULL) | (1L << K_FROM) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IGNORE) | (1L << K_IN) | (1L << K_INDEXED) | (1L << K_INNER) | (1L << K_INTERSECT) | (1L << K_IS) | (1L << K_ISNULL) | (1L << K_JOIN) | (1L << K_LEFT) | (1L << K_LIKE) | (1L << K_LIMIT) | (1L << K_MATCH) | (1L << K_NATURAL) | (1L << K_NO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_THEN - 64)) | (1L << (K_UNION - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (K_GENERATE - 64)) | (1L << (K_MAX - 64)) | (1L << (K_MIN - 64)) | (1L << (K_AVG - 64)) | (1L << (K_COUNT - 64)) | (1L << (K_SUM - 64)) | (1L << (OPEN_PARENTHESE - 64)) | (1L << (OPEN_BRACKET - 64)) | (1L << (OPEN_BRACE - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (BIND_PARAMETER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (STRING_LITERAL - 64)))) != 0)) {
				{
				{
				setState(308);
				_errHandler.sync(this);
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
					exp();
					}
					break;
				case 3:
					{
					setState(307);
					expr(0);
					}
					break;
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(310);
					match(C1);
					setState(314);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(311);
						operand();
						}
						break;
					case 2:
						{
						setState(312);
						exp();
						}
						break;
					case 3:
						{
						setState(313);
						expr(0);
						}
						break;
					}
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
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
		enterRule(_localctx, 32, RULE_aggregate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			ag_function_name();
			setState(329);
			match(OPEN_BRACKET);
			setState(330);
			attribute();
			setState(331);
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
		enterRule(_localctx, 34, RULE_if_then_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			switch (_input.LA(1)) {
			case K_IF:
				{
				{
				setState(333);
				match(K_IF);
				setState(334);
				match(OPEN_PARENTHESE);
				setState(335);
				expr(0);
				setState(336);
				match(CLOSE_PARENTHESE);
				setState(337);
				match(K_THEN);
				setState(338);
				match(OPEN_PARENTHESE);
				setState(339);
				exp();
				setState(340);
				match(CLOSE_PARENTHESE);
				setState(341);
				match(K_ELSE);
				setState(342);
				match(OPEN_PARENTHESE);
				setState(343);
				exp();
				setState(344);
				match(CLOSE_PARENTHESE);
				}
				}
				break;
			case OPEN_PARENTHESE:
				{
				{
				setState(346);
				match(OPEN_PARENTHESE);
				setState(347);
				expr(0);
				setState(348);
				match(CLOSE_PARENTHESE);
				setState(349);
				match(C0);
				setState(350);
				exp();
				setState(351);
				match(T__3);
				setState(352);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_arithmetics, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			switch (_input.LA(1)) {
			case OPEN_PARENTHESE:
				{
				setState(357);
				match(OPEN_PARENTHESE);
				setState(358);
				arithmetics(0);
				setState(359);
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
				setState(364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(361);
					table_alias();
					setState(362);
					match(DOT);
					}
					break;
				}
				setState(366);
				column_name();
				}
				break;
			case NUMERIC_LITERAL:
				{
				setState(367);
				match(NUMERIC_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(376);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetics);
						setState(370);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(371);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5 || _la==C3) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(372);
						arithmetics(3);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetics);
						setState(373);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(374);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(375);
						arithmetics(2);
						}
						break;
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 38, RULE_from_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			switch (_input.LA(1)) {
			case K_FROM:
			case K_SELECT:
			case K_WITH:
				{
				setState(381);
				sql_stmt_list();
				}
				break;
			case UNEXPECTED_CHAR:
				{
				setState(382);
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
		enterRule(_localctx, 40, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
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
		enterRule(_localctx, 42, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			sql_stmt();
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(390); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(389);
						match(SEMICOLON);
						}
						}
						setState(392); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SEMICOLON );
					setState(394);
					sql_stmt();
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(400);
				match(SEMICOLON);
				}
				}
				setState(405);
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
		enterRule(_localctx, 44, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(406);
				factored_select_stmt();
				}
				break;
			case 2:
				{
				setState(407);
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
		enterRule(_localctx, 46, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(410);
				match(K_WITH);
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(411);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(414);
				common_table_expression();
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(415);
					match(C1);
					setState(416);
					common_table_expression();
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(424);
			select_core();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (K_EXCEPT - 41)) | (1L << (K_INTERSECT - 41)) | (1L << (K_UNION - 41)))) != 0)) {
				{
				{
				setState(425);
				compound_operator();
				setState(426);
				select_core();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(433);
				match(K_ORDER);
				setState(434);
				match(K_BY);
				setState(435);
				ordering_term();
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(436);
					match(C1);
					setState(437);
					ordering_term();
					}
					}
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(451);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(445);
				match(K_LIMIT);
				setState(446);
				expr(0);
				setState(449);
				_la = _input.LA(1);
				if (_la==K_OFFSET || _la==C1) {
					{
					setState(447);
					_la = _input.LA(1);
					if ( !(_la==K_OFFSET || _la==C1) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(448);
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
		enterRule(_localctx, 48, RULE_select_core);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if (_la==K_SELECT) {
				{
				setState(453);
				match(K_SELECT);
				setState(455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(454);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(457);
				result_column();
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(458);
					match(C1);
					setState(459);
					result_column();
					}
					}
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(467);
			match(K_FROM);
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(468);
				table_or_subquery();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(469);
					match(C1);
					setState(470);
					table_or_subquery();
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(476);
				join_clause();
				}
				break;
			}
			}
			setState(480);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (K_GROUP - 47)) | (1L << (K_VALUES - 47)) | (1L << (K_WHERE - 47)))) != 0)) {
				{
				setState(479);
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
		enterRule(_localctx, 50, RULE_where_clause);
		int _la;
		try {
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				switch (_input.LA(1)) {
				case K_WHERE:
					{
					{
					setState(482);
					match(K_WHERE);
					setState(483);
					expr(0);
					}
					setState(499);
					_la = _input.LA(1);
					if (_la==K_GROUP) {
						{
						setState(485);
						match(K_GROUP);
						setState(486);
						match(K_BY);
						setState(487);
						expr(0);
						setState(492);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==C1) {
							{
							{
							setState(488);
							match(C1);
							setState(489);
							expr(0);
							}
							}
							setState(494);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(497);
						_la = _input.LA(1);
						if (_la==K_HAVING) {
							{
							setState(495);
							match(K_HAVING);
							setState(496);
							expr(0);
							}
						}

						}
					}

					}
					break;
				case K_VALUES:
					{
					setState(501);
					match(K_VALUES);
					setState(502);
					match(OPEN_PARENTHESE);
					setState(503);
					expr(0);
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(504);
						match(C1);
						setState(505);
						expr(0);
						}
						}
						setState(510);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(511);
					match(CLOSE_PARENTHESE);
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(512);
						match(C1);
						setState(513);
						match(OPEN_PARENTHESE);
						setState(514);
						expr(0);
						setState(519);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==C1) {
							{
							{
							setState(515);
							match(C1);
							setState(516);
							expr(0);
							}
							}
							setState(521);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(522);
						match(CLOSE_PARENTHESE);
						}
						}
						setState(528);
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
				setState(577);
				switch (_input.LA(1)) {
				case K_GROUP:
				case K_WHERE:
					{
					setState(533);
					_la = _input.LA(1);
					if (_la==K_WHERE) {
						{
						setState(531);
						match(K_WHERE);
						setState(532);
						expr(0);
						}
					}

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
					break;
				case K_VALUES:
					{
					setState(549);
					match(K_VALUES);
					setState(550);
					match(OPEN_PARENTHESE);
					setState(551);
					expr(0);
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(552);
						match(C1);
						setState(553);
						expr(0);
						}
						}
						setState(558);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(559);
					match(CLOSE_PARENTHESE);
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(560);
						match(C1);
						setState(561);
						match(OPEN_PARENTHESE);
						setState(562);
						expr(0);
						setState(567);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==C1) {
							{
							{
							setState(563);
							match(C1);
							setState(564);
							expr(0);
							}
							}
							setState(569);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(570);
						match(CLOSE_PARENTHESE);
						}
						}
						setState(576);
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
		enterRule(_localctx, 52, RULE_result_column);
		int _la;
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				table_name();
				setState(583);
				match(DOT);
				setState(584);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(586);
				expr(0);
				setState(591);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(588);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(587);
						match(K_AS);
						}
					}

					setState(590);
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
		enterRule(_localctx, 54, RULE_table_or_subquery);
		int _la;
		try {
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(595);
					database_name();
					setState(596);
					match(DOT);
					}
					break;
				}
				setState(600);
				table_name();
				setState(605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(602);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(601);
						match(K_AS);
						}
						break;
					}
					setState(604);
					table_alias();
					}
					break;
				}
				setState(612);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(607);
					match(K_INDEXED);
					setState(608);
					match(K_BY);
					setState(609);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(610);
					match(K_NOT);
					setState(611);
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
				setState(614);
				match(OPEN_PARENTHESE);
				setState(624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(615);
					table_or_subquery();
					setState(620);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(616);
						match(C1);
						setState(617);
						table_or_subquery();
						}
						}
						setState(622);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(623);
					join_clause();
					}
					break;
				}
				setState(626);
				match(CLOSE_PARENTHESE);
				setState(631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(628);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(627);
						match(K_AS);
						}
						break;
					}
					setState(630);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
				match(OPEN_PARENTHESE);
				setState(634);
				select_stmt();
				setState(635);
				match(CLOSE_PARENTHESE);
				setState(640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(637);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(636);
						match(K_AS);
						}
						break;
					}
					setState(639);
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
		enterRule(_localctx, 56, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
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
		enterRule(_localctx, 58, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(646);
				match(K_WITH);
				setState(648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(647);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(650);
				common_table_expression();
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(651);
					match(C1);
					setState(652);
					common_table_expression();
					}
					}
					setState(657);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(660);
			select_or_values();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (K_EXCEPT - 41)) | (1L << (K_INTERSECT - 41)) | (1L << (K_UNION - 41)))) != 0)) {
				{
				{
				setState(661);
				compound_operator();
				setState(662);
				select_or_values();
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(669);
				match(K_ORDER);
				setState(670);
				match(K_BY);
				setState(671);
				ordering_term();
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(672);
					match(C1);
					setState(673);
					ordering_term();
					}
					}
					setState(678);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(687);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(681);
				match(K_LIMIT);
				setState(682);
				expr(0);
				setState(685);
				_la = _input.LA(1);
				if (_la==K_OFFSET || _la==C1) {
					{
					setState(683);
					_la = _input.LA(1);
					if ( !(_la==K_OFFSET || _la==C1) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(684);
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
		enterRule(_localctx, 60, RULE_select_or_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_la = _input.LA(1);
			if (_la==K_SELECT) {
				{
				setState(689);
				match(K_SELECT);
				setState(691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(690);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(693);
				result_column();
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(694);
					match(C1);
					setState(695);
					result_column();
					}
					}
					setState(700);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(703);
			match(K_FROM);
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(704);
				table_or_subquery();
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(705);
					match(C1);
					setState(706);
					table_or_subquery();
					}
					}
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(712);
				join_clause();
				}
				break;
			}
			}
			setState(716);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (K_GROUP - 47)) | (1L << (K_VALUES - 47)) | (1L << (K_WHERE - 47)))) != 0)) {
				{
				setState(715);
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
		enterRule(_localctx, 62, RULE_compound_operator);
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				match(K_UNION);
				setState(720);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(721);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(722);
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
		enterRule(_localctx, 64, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			table_or_subquery();
			setState(735);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(726);
					join_operator();
					setState(729);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						setState(727);
						join_clause();
						}
						break;
					case 2:
						{
						setState(728);
						table_or_subquery();
						}
						break;
					}
					setState(731);
					join_constraint();
					}
					} 
				}
				setState(737);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
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
		enterRule(_localctx, 66, RULE_join_operator);
		int _la;
		try {
			setState(759);
			switch (_input.LA(1)) {
			case C1:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
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
				setState(740);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(739);
					match(K_NATURAL);
					}
				}

				setState(756);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(742);
					match(K_LEFT);
					setState(744);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(743);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_RIGHT:
					{
					setState(746);
					match(K_RIGHT);
					setState(748);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(747);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_FULL:
					{
					setState(750);
					match(K_FULL);
					setState(752);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(751);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(754);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(755);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(758);
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
		enterRule(_localctx, 68, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(761);
				match(K_ON);
				setState(762);
				expr(0);
				}
				break;
			case 2:
				{
				setState(763);
				match(K_USING);
				setState(764);
				match(OPEN_PARENTHESE);
				setState(765);
				column_name();
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(766);
					match(C1);
					setState(767);
					column_name();
					}
					}
					setState(772);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(773);
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
		enterRule(_localctx, 70, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			table_name();
			setState(789);
			_la = _input.LA(1);
			if (_la==OPEN_PARENTHESE) {
				{
				setState(778);
				match(OPEN_PARENTHESE);
				setState(779);
				column_name();
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(780);
					match(C1);
					setState(781);
					column_name();
					}
					}
					setState(786);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(787);
				match(CLOSE_PARENTHESE);
				}
			}

			setState(791);
			match(K_AS);
			setState(792);
			match(OPEN_PARENTHESE);
			setState(793);
			select_stmt();
			setState(794);
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
		enterRule(_localctx, 72, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			expr(0);
			setState(799);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(797);
				match(K_COLLATE);
				setState(798);
				collation_name();
				}
			}

			setState(802);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(801);
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
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(805);
				operand();
				}
				break;
			case 2:
				{
				setState(806);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(815);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(810);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						setState(807);
						database_name();
						setState(808);
						match(DOT);
						}
						break;
					}
					setState(812);
					table_alias();
					setState(813);
					match(DOT);
					}
					break;
				}
				setState(817);
				column_name();
				}
				break;
			case 4:
				{
				setState(818);
				unary_operator();
				setState(819);
				expr(20);
				}
				break;
			case 5:
				{
				setState(821);
				match(OPEN_PARENTHESE);
				setState(822);
				expr(0);
				setState(823);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 6:
				{
				setState(825);
				match(K_CAST);
				setState(826);
				match(OPEN_PARENTHESE);
				setState(827);
				expr(0);
				setState(828);
				match(K_AS);
				setState(829);
				type_name();
				setState(830);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 7:
				{
				setState(836);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(833);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(832);
						match(K_NOT);
						}
					}

					setState(835);
					match(K_EXISTS);
					}
				}

				setState(838);
				match(OPEN_PARENTHESE);
				setState(839);
				select_stmt();
				setState(840);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 8:
				{
				setState(842);
				match(K_CASE);
				setState(844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(843);
					expr(0);
					}
					break;
				}
				setState(851); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(846);
					match(K_WHEN);
					setState(847);
					expr(0);
					setState(848);
					match(K_THEN);
					setState(849);
					expr(0);
					}
					}
					setState(853); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(857);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(855);
					match(K_ELSE);
					setState(856);
					expr(0);
					}
				}

				setState(859);
				match(K_END);
				}
				break;
			case 9:
				{
				setState(861);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(964);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(962);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(864);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(865);
						match(T__0);
						setState(866);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(867);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(868);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5 || _la==C3) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(869);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(870);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(871);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(872);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(873);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(874);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(875);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(876);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(877);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(878);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(879);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(892);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
						case 1:
							{
							setState(880);
							match(T__15);
							}
							break;
						case 2:
							{
							setState(881);
							match(T__16);
							}
							break;
						case 3:
							{
							setState(882);
							match(T__17);
							}
							break;
						case 4:
							{
							setState(883);
							match(T__18);
							}
							break;
						case 5:
							{
							setState(884);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(885);
							match(K_IS);
							setState(886);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(887);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(888);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(889);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(890);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(891);
							match(K_REGEXP);
							}
							break;
						}
						setState(894);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(895);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(896);
						match(K_AND);
						setState(897);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(898);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(899);
						match(K_OR);
						setState(900);
						expr(13);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(901);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(902);
						match(K_IS);
						setState(904);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
						case 1:
							{
							setState(903);
							match(K_NOT);
							}
							break;
						}
						setState(906);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(907);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(909);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(908);
							match(K_NOT);
							}
						}

						setState(911);
						match(K_BETWEEN);
						setState(912);
						expr(0);
						setState(913);
						match(K_AND);
						setState(914);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(916);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(917);
						match(K_COLLATE);
						setState(918);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(919);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(921);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(920);
							match(K_NOT);
							}
						}

						setState(923);
						_la = _input.LA(1);
						if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (K_GLOB - 46)) | (1L << (K_LIKE - 46)) | (1L << (K_MATCH - 46)) | (1L << (K_REGEXP - 46)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(924);
						expr(0);
						setState(927);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
						case 1:
							{
							setState(925);
							match(K_ESCAPE);
							setState(926);
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
						setState(929);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(934);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(930);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(931);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(932);
							match(K_NOT);
							setState(933);
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
						setState(936);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(938);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(937);
							match(K_NOT);
							}
						}

						setState(940);
						match(K_IN);
						setState(960);
						switch (_input.LA(1)) {
						case OPEN_PARENTHESE:
							{
							setState(941);
							match(OPEN_PARENTHESE);
							setState(951);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
							case 1:
								{
								setState(942);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(943);
								expr(0);
								setState(948);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==C1) {
									{
									{
									setState(944);
									match(C1);
									setState(945);
									expr(0);
									}
									}
									setState(950);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(953);
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
							setState(957);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
							case 1:
								{
								setState(954);
								database_name();
								setState(955);
								match(DOT);
								}
								break;
							}
							setState(959);
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
				setState(966);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
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
		enterRule(_localctx, 76, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
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
		enterRule(_localctx, 78, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
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
		enterRule(_localctx, 80, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
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
		enterRule(_localctx, 82, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(973);
				name();
				}
				}
				setState(976); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ALL) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLLATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_ELSE) | (1L << K_END) | (1L << K_ESCAPE) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FAIL) | (1L << K_FULL) | (1L << K_FROM) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IGNORE) | (1L << K_IN) | (1L << K_INDEXED) | (1L << K_INNER) | (1L << K_INTERSECT) | (1L << K_IS) | (1L << K_ISNULL) | (1L << K_JOIN) | (1L << K_LEFT) | (1L << K_LIKE) | (1L << K_LIMIT) | (1L << K_MATCH) | (1L << K_NATURAL) | (1L << K_NO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_THEN - 64)) | (1L << (K_UNION - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (K_GENERATE - 64)) | (1L << (K_MAX - 64)) | (1L << (K_MIN - 64)) | (1L << (K_AVG - 64)) | (1L << (K_COUNT - 64)) | (1L << (K_SUM - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(978);
				match(OPEN_PARENTHESE);
				setState(979);
				signed_number();
				setState(980);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 2:
				{
				setState(982);
				match(OPEN_PARENTHESE);
				setState(983);
				signed_number();
				setState(984);
				match(C1);
				setState(985);
				signed_number();
				setState(986);
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
		enterRule(_localctx, 84, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
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
		enterRule(_localctx, 86, RULE_ag_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
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
		enterRule(_localctx, 88, RULE_ag_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
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
		enterRule(_localctx, 90, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
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
		enterRule(_localctx, 92, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
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
		enterRule(_localctx, 94, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
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
		enterRule(_localctx, 96, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
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
		enterRule(_localctx, 98, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
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
		enterRule(_localctx, 100, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
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
		enterRule(_localctx, 102, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
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
		enterRule(_localctx, 104, RULE_any_name);
		try {
			setState(1012);
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
				setState(1010);
				keyword();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
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
		enterRule(_localctx, 106, RULE_sl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
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
		enterRule(_localctx, 108, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			_la = _input.LA(1);
			if (_la==T__6 || _la==T__7) {
				{
				setState(1016);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1019);
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
		enterRule(_localctx, 110, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			match(K_RAISE);
			setState(1022);
			match(OPEN_PARENTHESE);
			setState(1027);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1023);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1024);
				_la = _input.LA(1);
				if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (K_ABORT - 21)) | (1L << (K_FAIL - 21)) | (1L << (K_ROLLBACK - 21)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1025);
				match(C1);
				setState(1026);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1029);
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
		enterRule(_localctx, 112, RULE_error_message);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return arithmetics_sempred((ArithmeticsContext)_localctx, predIndex);
		case 37:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3r\u040c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\5\2x\n"+
		"\2\3\3\3\3\5\3|\n\3\3\3\5\3\177\n\3\3\4\3\4\3\4\3\5\5\5\u0085\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0094\n\5\3\5\3\5"+
		"\3\5\5\5\u0099\n\5\3\5\5\5\u009c\n\5\3\6\3\6\3\6\5\6\u00a1\n\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\5\7\u00a9\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b0\n\7\6\7\u00b2"+
		"\n\7\r\7\16\7\u00b3\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00c5\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d0"+
		"\n\t\5\t\u00d2\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00dd\n\t\5"+
		"\t\u00df\n\t\5\t\u00e1\n\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00e9\n\13"+
		"\7\13\u00eb\n\13\f\13\16\13\u00ee\13\13\3\f\3\f\3\f\3\f\5\f\u00f4\n\f"+
		"\7\f\u00f6\n\f\f\f\16\f\u00f9\13\f\3\r\3\r\5\r\u00fd\n\r\3\r\3\r\3\r\5"+
		"\r\u0102\n\r\7\r\u0104\n\r\f\r\16\r\u0107\13\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0113\n\17\3\20\5\20\u0116\n\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u011d\n\20\3\20\3\20\3\20\3\20\5\20\u0123\n\20"+
		"\7\20\u0125\n\20\f\20\16\20\u0128\13\20\7\20\u012a\n\20\f\20\16\20\u012d"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0137\n\21\3\21\3"+
		"\21\3\21\3\21\5\21\u013d\n\21\7\21\u013f\n\21\f\21\16\21\u0142\13\21\7"+
		"\21\u0144\n\21\f\21\16\21\u0147\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0165\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u016f\n\24\3\24\3\24\5\24\u0173\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\7\24\u017b\n\24\f\24\16\24\u017e\13\24\3"+
		"\25\3\25\5\25\u0182\n\25\3\26\3\26\3\26\3\27\3\27\6\27\u0189\n\27\r\27"+
		"\16\27\u018a\3\27\7\27\u018e\n\27\f\27\16\27\u0191\13\27\3\27\7\27\u0194"+
		"\n\27\f\27\16\27\u0197\13\27\3\30\3\30\5\30\u019b\n\30\3\31\3\31\5\31"+
		"\u019f\n\31\3\31\3\31\3\31\7\31\u01a4\n\31\f\31\16\31\u01a7\13\31\5\31"+
		"\u01a9\n\31\3\31\3\31\3\31\3\31\7\31\u01af\n\31\f\31\16\31\u01b2\13\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u01b9\n\31\f\31\16\31\u01bc\13\31\5\31"+
		"\u01be\n\31\3\31\3\31\3\31\3\31\5\31\u01c4\n\31\5\31\u01c6\n\31\3\32\3"+
		"\32\5\32\u01ca\n\32\3\32\3\32\3\32\7\32\u01cf\n\32\f\32\16\32\u01d2\13"+
		"\32\5\32\u01d4\n\32\3\32\3\32\3\32\3\32\7\32\u01da\n\32\f\32\16\32\u01dd"+
		"\13\32\3\32\5\32\u01e0\n\32\3\32\5\32\u01e3\n\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\7\33\u01ed\n\33\f\33\16\33\u01f0\13\33\3\33\3\33\5"+
		"\33\u01f4\n\33\5\33\u01f6\n\33\3\33\3\33\3\33\3\33\3\33\7\33\u01fd\n\33"+
		"\f\33\16\33\u0200\13\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0208\n\33"+
		"\f\33\16\33\u020b\13\33\3\33\3\33\7\33\u020f\n\33\f\33\16\33\u0212\13"+
		"\33\5\33\u0214\n\33\3\33\3\33\5\33\u0218\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u021f\n\33\f\33\16\33\u0222\13\33\3\33\3\33\5\33\u0226\n\33\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u022d\n\33\f\33\16\33\u0230\13\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u0238\n\33\f\33\16\33\u023b\13\33\3\33\3\33"+
		"\7\33\u023f\n\33\f\33\16\33\u0242\13\33\5\33\u0244\n\33\5\33\u0246\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u024f\n\34\3\34\5\34\u0252\n"+
		"\34\5\34\u0254\n\34\3\35\3\35\3\35\5\35\u0259\n\35\3\35\3\35\5\35\u025d"+
		"\n\35\3\35\5\35\u0260\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u0267\n\35\3"+
		"\35\3\35\3\35\3\35\7\35\u026d\n\35\f\35\16\35\u0270\13\35\3\35\5\35\u0273"+
		"\n\35\3\35\3\35\5\35\u0277\n\35\3\35\5\35\u027a\n\35\3\35\3\35\3\35\3"+
		"\35\5\35\u0280\n\35\3\35\5\35\u0283\n\35\5\35\u0285\n\35\3\36\3\36\3\37"+
		"\3\37\5\37\u028b\n\37\3\37\3\37\3\37\7\37\u0290\n\37\f\37\16\37\u0293"+
		"\13\37\5\37\u0295\n\37\3\37\3\37\3\37\3\37\7\37\u029b\n\37\f\37\16\37"+
		"\u029e\13\37\3\37\3\37\3\37\3\37\3\37\7\37\u02a5\n\37\f\37\16\37\u02a8"+
		"\13\37\5\37\u02aa\n\37\3\37\3\37\3\37\3\37\5\37\u02b0\n\37\5\37\u02b2"+
		"\n\37\3 \3 \5 \u02b6\n \3 \3 \3 \7 \u02bb\n \f \16 \u02be\13 \5 \u02c0"+
		"\n \3 \3 \3 \3 \7 \u02c6\n \f \16 \u02c9\13 \3 \5 \u02cc\n \3 \5 \u02cf"+
		"\n \3!\3!\3!\3!\3!\5!\u02d6\n!\3\"\3\"\3\"\3\"\5\"\u02dc\n\"\3\"\3\"\7"+
		"\"\u02e0\n\"\f\"\16\"\u02e3\13\"\3#\3#\5#\u02e7\n#\3#\3#\5#\u02eb\n#\3"+
		"#\3#\5#\u02ef\n#\3#\3#\5#\u02f3\n#\3#\3#\5#\u02f7\n#\3#\5#\u02fa\n#\3"+
		"$\3$\3$\3$\3$\3$\3$\7$\u0303\n$\f$\16$\u0306\13$\3$\3$\5$\u030a\n$\3%"+
		"\3%\3%\3%\3%\7%\u0311\n%\f%\16%\u0314\13%\3%\3%\5%\u0318\n%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\5&\u0322\n&\3&\5&\u0325\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u032d"+
		"\n\'\3\'\3\'\3\'\5\'\u0332\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0344\n\'\3\'\5\'\u0347\n\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u034f\n\'\3\'\3\'\3\'\3\'\3\'\6\'\u0356\n\'\r\'\16\'\u0357"+
		"\3\'\3\'\5\'\u035c\n\'\3\'\3\'\3\'\5\'\u0361\n\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u037f\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u038b\n\'\3\'\3\'\3\'\5\'\u0390\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u039c\n\'\3\'\3\'\3\'\3\'\5\'\u03a2\n\'\3\'\3\'\3\'"+
		"\3\'\3\'\5\'\u03a9\n\'\3\'\3\'\5\'\u03ad\n\'\3\'\3\'\3\'\3\'\3\'\3\'\7"+
		"\'\u03b5\n\'\f\'\16\'\u03b8\13\'\5\'\u03ba\n\'\3\'\3\'\3\'\3\'\5\'\u03c0"+
		"\n\'\3\'\5\'\u03c3\n\'\7\'\u03c5\n\'\f\'\16\'\u03c8\13\'\3(\3(\3)\3)\3"+
		"*\3*\3+\6+\u03d1\n+\r+\16+\u03d2\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u03df"+
		"\n+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\5\66\u03f7\n\66\3\67\3\67\38\58\u03fc\n8"+
		"\38\38\39\39\39\39\39\39\59\u0406\n9\39\39\3:\3:\3:\2\4&L;\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnpr\2\22\4\2^^``\3\2_`\4\2\7\b``\3\2\t\n\4\2EE^^\4\2\31\31\'\'"+
		"\4\2\27\27\31\\\4\2\34\34&&\4\2\5\5\13\r\3\2\16\21\6\2\60\60==??LL\6\2"+
		"#%DDjknn\5\2\t\n\26\26BB\3\2X\\\3\2mn\5\2\27\27--NN\u049d\2t\3\2\2\2\4"+
		"{\3\2\2\2\6\u0080\3\2\2\2\b\u0098\3\2\2\2\n\u00a0\3\2\2\2\f\u00a8\3\2"+
		"\2\2\16\u00c4\3\2\2\2\20\u00e0\3\2\2\2\22\u00e2\3\2\2\2\24\u00e4\3\2\2"+
		"\2\26\u00ef\3\2\2\2\30\u00fc\3\2\2\2\32\u0108\3\2\2\2\34\u0112\3\2\2\2"+
		"\36\u0115\3\2\2\2 \u0130\3\2\2\2\"\u014a\3\2\2\2$\u0164\3\2\2\2&\u0172"+
		"\3\2\2\2(\u0181\3\2\2\2*\u0183\3\2\2\2,\u0186\3\2\2\2.\u019a\3\2\2\2\60"+
		"\u01a8\3\2\2\2\62\u01d3\3\2\2\2\64\u0245\3\2\2\2\66\u0253\3\2\2\28\u0284"+
		"\3\2\2\2:\u0286\3\2\2\2<\u0294\3\2\2\2>\u02bf\3\2\2\2@\u02d5\3\2\2\2B"+
		"\u02d7\3\2\2\2D\u02f9\3\2\2\2F\u0309\3\2\2\2H\u030b\3\2\2\2J\u031e\3\2"+
		"\2\2L\u0360\3\2\2\2N\u03c9\3\2\2\2P\u03cb\3\2\2\2R\u03cd\3\2\2\2T\u03d0"+
		"\3\2\2\2V\u03e0\3\2\2\2X\u03e2\3\2\2\2Z\u03e4\3\2\2\2\\\u03e6\3\2\2\2"+
		"^\u03e8\3\2\2\2`\u03ea\3\2\2\2b\u03ec\3\2\2\2d\u03ee\3\2\2\2f\u03f0\3"+
		"\2\2\2h\u03f2\3\2\2\2j\u03f6\3\2\2\2l\u03f8\3\2\2\2n\u03fb\3\2\2\2p\u03ff"+
		"\3\2\2\2r\u0409\3\2\2\2tu\5\6\4\2uw\5\4\3\2vx\5(\25\2wv\3\2\2\2wx\3\2"+
		"\2\2x\3\3\2\2\2y|\5\b\5\2z|\5\22\n\2{y\3\2\2\2{z\3\2\2\2|~\3\2\2\2}\177"+
		"\7i\2\2~}\3\2\2\2~\177\3\2\2\2\177\5\3\2\2\2\u0080\u0081\7W\2\2\u0081"+
		"\u0082\7m\2\2\u0082\7\3\2\2\2\u0083\u0085\5\34\17\2\u0084\u0083\3\2\2"+
		"\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0099\5\n\6\2\u0087\u0099"+
		"\5\f\7\2\u0088\u0099\5\36\20\2\u0089\u0099\5 \21\2\u008a\u008b\7f\2\2"+
		"\u008b\u008c\5\22\n\2\u008c\u008d\7g\2\2\u008d\u0099\3\2\2\2\u008e\u0099"+
		"\5\16\b\2\u008f\u0099\5\20\t\2\u0090\u0099\5$\23\2\u0091\u0099\7j\2\2"+
		"\u0092\u0094\5\34\17\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0099\5\"\22\2\u0096\u0099\5&\24\2\u0097\u0099\5l\67\2"+
		"\u0098\u0084\3\2\2\2\u0098\u0087\3\2\2\2\u0098\u0088\3\2\2\2\u0098\u0089"+
		"\3\2\2\2\u0098\u008a\3\2\2\2\u0098\u008e\3\2\2\2\u0098\u008f\3\2\2\2\u0098"+
		"\u0090\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0097\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c\7i\2\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\t\3\2\2\2\u009d\u009e\5f\64\2"+
		"\u009e\u009f\7a\2\2\u009f\u00a1\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\5d\63\2\u00a3\13\3\2\2\2\u00a4"+
		"\u00a9\5\n\6\2\u00a5\u00a9\7j\2\2\u00a6\u00a9\5&\24\2\u00a7\u00a9\5l\67"+
		"\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7"+
		"\3\2\2\2\u00a9\u00b1\3\2\2\2\u00aa\u00af\7\3\2\2\u00ab\u00b0\5\n\6\2\u00ac"+
		"\u00b0\7j\2\2\u00ad\u00b0\5&\24\2\u00ae\u00b0\5l\67\2\u00af\u00ab\3\2"+
		"\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\r\3\2\2\2\u00b5\u00b6\7d\2\2\u00b6\u00b7"+
		"\5\22\n\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7^\2\2\u00b9\u00c5\3\2\2\2\u00ba"+
		"\u00bb\7d\2\2\u00bb\u00bc\5\22\n\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7_\2"+
		"\2\u00be\u00c5\3\2\2\2\u00bf\u00c0\7d\2\2\u00c0\u00c1\5\22\n\2\u00c1\u00c2"+
		"\7e\2\2\u00c2\u00c3\7`\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b5\3\2\2\2\u00c4"+
		"\u00ba\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c5\17\3\2\2\2\u00c6\u00c7\7d\2\2"+
		"\u00c7\u00c8\5\22\n\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7^\2\2\u00ca\u00d1"+
		"\7j\2\2\u00cb\u00d2\t\2\2\2\u00cc\u00cf\7_\2\2\u00cd\u00ce\7j\2\2\u00ce"+
		"\u00d0\7`\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2\u00e1\3\2\2\2\u00d3"+
		"\u00d4\7d\2\2\u00d4\u00d5\5\22\n\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7_\2"+
		"\2\u00d7\u00de\7j\2\2\u00d8\u00df\t\3\2\2\u00d9\u00dc\7^\2\2\u00da\u00db"+
		"\7j\2\2\u00db\u00dd\7`\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00d9\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00c6\3\2\2\2\u00e0\u00d3\3\2\2\2\u00e1\21\3\2\2\2\u00e2\u00e3"+
		"\5\24\13\2\u00e3\23\3\2\2\2\u00e4\u00ec\5\26\f\2\u00e5\u00e8\7`\2\2\u00e6"+
		"\u00e9\5\26\f\2\u00e7\u00e9\5\b\5\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3"+
		"\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\25\3\2\2\2\u00ee\u00ec\3\2\2"+
		"\2\u00ef\u00f7\5\30\r\2\u00f0\u00f3\7_\2\2\u00f1\u00f4\5\30\r\2\u00f2"+
		"\u00f4\5\b\5\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f0\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\27\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\5\b\5"+
		"\2\u00fb\u00fd\5\32\16\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"\u0105\3\2\2\2\u00fe\u0101\7^\2\2\u00ff\u0102\5\b\5\2\u0100\u0102\5\32"+
		"\16\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u0104\3\2\2\2\u0103"+
		"\u00fe\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\31\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\5\b\5\2\u0109\u010a"+
		"\7]\2\2\u010a\u010b\5\b\5\2\u010b\33\3\2\2\2\u010c\u010d\7b\2\2\u010d"+
		"\u010e\7\34\2\2\u010e\u0113\7c\2\2\u010f\u0110\7b\2\2\u0110\u0111\7&\2"+
		"\2\u0111\u0113\7c\2\2\u0112\u010c\3\2\2\2\u0112\u010f\3\2\2\2\u0113\35"+
		"\3\2\2\2\u0114\u0116\7\4\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\5V,\2\u0118\u012b\7b\2\2\u0119\u011d\5\b\5"+
		"\2\u011a\u011d\5\22\n\2\u011b\u011d\5L\'\2\u011c\u0119\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011b\3\2\2\2\u011d\u0126\3\2\2\2\u011e\u0122\7^\2\2\u011f"+
		"\u0123\5\b\5\2\u0120\u0123\5\22\n\2\u0121\u0123\5L\'\2\u0122\u011f\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0125\3\2\2\2\u0124"+
		"\u011e\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u011c\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7c\2\2\u012f\37\3\2\2\2\u0130\u0131"+
		"\7\5\2\2\u0131\u0132\5V,\2\u0132\u0145\7b\2\2\u0133\u0137\5\b\5\2\u0134"+
		"\u0137\5\22\n\2\u0135\u0137\5L\'\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0136\u0135\3\2\2\2\u0137\u0140\3\2\2\2\u0138\u013c\7^\2\2\u0139"+
		"\u013d\5\b\5\2\u013a\u013d\5\22\n\2\u013b\u013d\5L\'\2\u013c\u0139\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\u013f\3\2\2\2\u013e"+
		"\u0138\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0136\3\2\2\2\u0144"+
		"\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7c\2\2\u0149!\3\2\2\2\u014a\u014b"+
		"\5X-\2\u014b\u014c\7d\2\2\u014c\u014d\5\n\6\2\u014d\u014e\7e\2\2\u014e"+
		"#\3\2\2\2\u014f\u0150\7\63\2\2\u0150\u0151\7b\2\2\u0151\u0152\5L\'\2\u0152"+
		"\u0153\7c\2\2\u0153\u0154\7P\2\2\u0154\u0155\7b\2\2\u0155\u0156\5\22\n"+
		"\2\u0156\u0157\7c\2\2\u0157\u0158\7(\2\2\u0158\u0159\7b\2\2\u0159\u015a"+
		"\5\22\n\2\u015a\u015b\7c\2\2\u015b\u0165\3\2\2\2\u015c\u015d\7b\2\2\u015d"+
		"\u015e\5L\'\2\u015e\u015f\7c\2\2\u015f\u0160\7]\2\2\u0160\u0161\5\22\n"+
		"\2\u0161\u0162\7\6\2\2\u0162\u0163\5\22\n\2\u0163\u0165\3\2\2\2\u0164"+
		"\u014f\3\2\2\2\u0164\u015c\3\2\2\2\u0165%\3\2\2\2\u0166\u0167\b\24\1\2"+
		"\u0167\u0168\7b\2\2\u0168\u0169\5&\24\2\u0169\u016a\7c\2\2\u016a\u0173"+
		"\3\2\2\2\u016b\u016c\5f\64\2\u016c\u016d\7a\2\2\u016d\u016f\3\2\2\2\u016e"+
		"\u016b\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0173\5d"+
		"\63\2\u0171\u0173\7j\2\2\u0172\u0166\3\2\2\2\u0172\u016e\3\2\2\2\u0172"+
		"\u0171\3\2\2\2\u0173\u017c\3\2\2\2\u0174\u0175\f\4\2\2\u0175\u0176\t\4"+
		"\2\2\u0176\u017b\5&\24\5\u0177\u0178\f\3\2\2\u0178\u0179\t\5\2\2\u0179"+
		"\u017b\5&\24\4\u017a\u0174\3\2\2\2\u017a\u0177\3\2\2\2\u017b\u017e\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\'\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017f\u0182\5,\27\2\u0180\u0182\5*\26\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0180\3\2\2\2\u0182)\3\2\2\2\u0183\u0184\7r\2\2\u0184\u0185\b\26\1\2"+
		"\u0185+\3\2\2\2\u0186\u018f\5.\30\2\u0187\u0189\7h\2\2\u0188\u0187\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018e\5.\30\2\u018d\u0188\3\2\2\2\u018e\u0191\3\2"+
		"\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0195\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0192\u0194\7h\2\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196-\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0198\u019b\5\60\31\2\u0199\u019b\5<\37\2\u019a\u0198\3\2\2\2"+
		"\u019a\u0199\3\2\2\2\u019b/\3\2\2\2\u019c\u019e\7V\2\2\u019d\u019f\7K"+
		"\2\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a5\5H%\2\u01a1\u01a2\7^\2\2\u01a2\u01a4\5H%\2\u01a3\u01a1\3\2\2\2"+
		"\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a9"+
		"\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u019c\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01b0\5\62\32\2\u01ab\u01ac\5@!\2\u01ac\u01ad\5\62"+
		"\32\2\u01ad\u01af\3\2\2\2\u01ae\u01ab\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01bd\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b3\u01b4\7H\2\2\u01b4\u01b5\7\36\2\2\u01b5\u01ba\5J&\2\u01b6\u01b7"+
		"\7^\2\2\u01b7\u01b9\5J&\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bd\u01b3\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c5\3\2\2\2\u01bf"+
		"\u01c0\7>\2\2\u01c0\u01c3\5L\'\2\u01c1\u01c2\t\6\2\2\u01c2\u01c4\5L\'"+
		"\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01bf"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\61\3\2\2\2\u01c7\u01c9\7O\2\2\u01c8"+
		"\u01ca\t\7\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cb\u01d0\5\66\34\2\u01cc\u01cd\7^\2\2\u01cd\u01cf\5\66\34\2\u01ce"+
		"\u01cc\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01c7\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01df\7/\2\2\u01d6\u01db\58\35"+
		"\2\u01d7\u01d8\7^\2\2\u01d8\u01da\58\35\2\u01d9\u01d7\3\2\2\2\u01da\u01dd"+
		"\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01e0\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01de\u01e0\5B\"\2\u01df\u01d6\3\2\2\2\u01df\u01de\3\2"+
		"\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01e3\5\64\33\2\u01e2\u01e1\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\63\3\2\2\2\u01e4\u01e5\7U\2\2\u01e5\u01e6\5L\'\2"+
		"\u01e6\u01f5\3\2\2\2\u01e7\u01e8\7\61\2\2\u01e8\u01e9\7\36\2\2\u01e9\u01ee"+
		"\5L\'\2\u01ea\u01eb\7^\2\2\u01eb\u01ed\5L\'\2\u01ec\u01ea\3\2\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f3\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\7\62\2\2\u01f2\u01f4\5L\'\2\u01f3"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01e7\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u0214\3\2\2\2\u01f7\u01f8\7S\2\2\u01f8"+
		"\u01f9\7b\2\2\u01f9\u01fe\5L\'\2\u01fa\u01fb\7^\2\2\u01fb\u01fd\5L\'\2"+
		"\u01fc\u01fa\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff"+
		"\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0210\7c\2\2\u0202"+
		"\u0203\7^\2\2\u0203\u0204\7b\2\2\u0204\u0209\5L\'\2\u0205\u0206\7^\2\2"+
		"\u0206\u0208\5L\'\2\u0207\u0205\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207"+
		"\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c"+
		"\u020d\7c\2\2\u020d\u020f\3\2\2\2\u020e\u0202\3\2\2\2\u020f\u0212\3\2"+
		"\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0214\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0213\u01e4\3\2\2\2\u0213\u01f7\3\2\2\2\u0214\u0246\3\2"+
		"\2\2\u0215\u0216\7U\2\2\u0216\u0218\5L\'\2\u0217\u0215\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\7\61\2\2\u021a\u021b\7\36\2\2"+
		"\u021b\u0220\5L\'\2\u021c\u021d\7^\2\2\u021d\u021f\5L\'\2\u021e\u021c"+
		"\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0225\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7\62\2\2\u0224\u0226\5"+
		"L\'\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0244\3\2\2\2\u0227"+
		"\u0228\7S\2\2\u0228\u0229\7b\2\2\u0229\u022e\5L\'\2\u022a\u022b\7^\2\2"+
		"\u022b\u022d\5L\'\2\u022c\u022a\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022e\3\2\2\2\u0231"+
		"\u0240\7c\2\2\u0232\u0233\7^\2\2\u0233\u0234\7b\2\2\u0234\u0239\5L\'\2"+
		"\u0235\u0236\7^\2\2\u0236\u0238\5L\'\2\u0237\u0235\3\2\2\2\u0238\u023b"+
		"\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b"+
		"\u0239\3\2\2\2\u023c\u023d\7c\2\2\u023d\u023f\3\2\2\2\u023e\u0232\3\2"+
		"\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0217\3\2\2\2\u0243\u0227\3\2"+
		"\2\2\u0244\u0246\3\2\2\2\u0245\u0213\3\2\2\2\u0245\u0243\3\2\2\2\u0246"+
		"\65\3\2\2\2\u0247\u0254\7\7\2\2\u0248\u0249\5`\61\2\u0249\u024a\7a\2\2"+
		"\u024a\u024b\7\7\2\2\u024b\u0254\3\2\2\2\u024c\u0251\5L\'\2\u024d\u024f"+
		"\7\33\2\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2"+
		"\u0250\u0252\5b\62\2\u0251\u024e\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254"+
		"\3\2\2\2\u0253\u0247\3\2\2\2\u0253\u0248\3\2\2\2\u0253\u024c\3\2\2\2\u0254"+
		"\67\3\2\2\2\u0255\u0256\5^\60\2\u0256\u0257\7a\2\2\u0257\u0259\3\2\2\2"+
		"\u0258\u0255\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025f"+
		"\5`\61\2\u025b\u025d\7\33\2\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2"+
		"\u025d\u025e\3\2\2\2\u025e\u0260\5f\64\2\u025f\u025c\3\2\2\2\u025f\u0260"+
		"\3\2\2\2\u0260\u0266\3\2\2\2\u0261\u0262\7\66\2\2\u0262\u0263\7\36\2\2"+
		"\u0263\u0267\5h\65\2\u0264\u0265\7B\2\2\u0265\u0267\7\66\2\2\u0266\u0261"+
		"\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0285\3\2\2\2\u0268"+
		"\u0272\7b\2\2\u0269\u026e\58\35\2\u026a\u026b\7^\2\2\u026b\u026d\58\35"+
		"\2\u026c\u026a\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f"+
		"\3\2\2\2\u026f\u0273\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0273\5B\"\2\u0272"+
		"\u0269\3\2\2\2\u0272\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0279\7c"+
		"\2\2\u0275\u0277\7\33\2\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u027a\5f\64\2\u0279\u0276\3\2\2\2\u0279\u027a\3\2"+
		"\2\2\u027a\u0285\3\2\2\2\u027b\u027c\7b\2\2\u027c\u027d\5<\37\2\u027d"+
		"\u0282\7c\2\2\u027e\u0280\7\33\2\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2"+
		"\2\2\u0280\u0281\3\2\2\2\u0281\u0283\5f\64\2\u0282\u027f\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u0285\3\2\2\2\u0284\u0258\3\2\2\2\u0284\u0268\3\2"+
		"\2\2\u0284\u027b\3\2\2\2\u02859\3\2\2\2\u0286\u0287\t\b\2\2\u0287;\3\2"+
		"\2\2\u0288\u028a\7V\2\2\u0289\u028b\7K\2\2\u028a\u0289\3\2\2\2\u028a\u028b"+
		"\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u0291\5H%\2\u028d\u028e\7^\2\2\u028e"+
		"\u0290\5H%\2\u028f\u028d\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2"+
		"\2\u0291\u0292\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0288"+
		"\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u029c\5> \2\u0297"+
		"\u0298\5@!\2\u0298\u0299\5> \2\u0299\u029b\3\2\2\2\u029a\u0297\3\2\2\2"+
		"\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a9"+
		"\3\2\2\2\u029e\u029c\3\2\2\2\u029f\u02a0\7H\2\2\u02a0\u02a1\7\36\2\2\u02a1"+
		"\u02a6\5J&\2\u02a2\u02a3\7^\2\2\u02a3\u02a5\5J&\2\u02a4\u02a2\3\2\2\2"+
		"\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02aa"+
		"\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u029f\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa"+
		"\u02b1\3\2\2\2\u02ab\u02ac\7>\2\2\u02ac\u02af\5L\'\2\u02ad\u02ae\t\6\2"+
		"\2\u02ae\u02b0\5L\'\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2"+
		"\3\2\2\2\u02b1\u02ab\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2=\3\2\2\2\u02b3"+
		"\u02b5\7O\2\2\u02b4\u02b6\t\7\2\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2"+
		"\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02bc\5\66\34\2\u02b8\u02b9\7^\2\2\u02b9"+
		"\u02bb\5\66\34\2\u02ba\u02b8\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3"+
		"\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf"+
		"\u02b3\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02cb\7/"+
		"\2\2\u02c2\u02c7\58\35\2\u02c3\u02c4\7^\2\2\u02c4\u02c6\58\35\2\u02c5"+
		"\u02c3\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2"+
		"\2\2\u02c8\u02cc\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cc\5B\"\2\u02cb"+
		"\u02c2\3\2\2\2\u02cb\u02ca\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02cf\5\64"+
		"\33\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf?\3\2\2\2\u02d0\u02d6"+
		"\7Q\2\2\u02d1\u02d2\7Q\2\2\u02d2\u02d6\7\31\2\2\u02d3\u02d6\78\2\2\u02d4"+
		"\u02d6\7+\2\2\u02d5\u02d0\3\2\2\2\u02d5\u02d1\3\2\2\2\u02d5\u02d3\3\2"+
		"\2\2\u02d5\u02d4\3\2\2\2\u02d6A\3\2\2\2\u02d7\u02e1\58\35\2\u02d8\u02db"+
		"\5D#\2\u02d9\u02dc\5B\"\2\u02da\u02dc\58\35\2\u02db\u02d9\3\2\2\2\u02db"+
		"\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\5F$\2\u02de\u02e0\3\2\2"+
		"\2\u02df\u02d8\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2"+
		"\3\2\2\2\u02e2C\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02fa\7^\2\2\u02e5\u02e7"+
		"\7@\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02f6\3\2\2\2\u02e8"+
		"\u02ea\7<\2\2\u02e9\u02eb\7I\2\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2"+
		"\2\u02eb\u02f7\3\2\2\2\u02ec\u02ee\7M\2\2\u02ed\u02ef\7I\2\2\u02ee\u02ed"+
		"\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f7\3\2\2\2\u02f0\u02f2\7.\2\2\u02f1"+
		"\u02f3\7I\2\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f7\3\2"+
		"\2\2\u02f4\u02f7\7\67\2\2\u02f5\u02f7\7\"\2\2\u02f6\u02e8\3\2\2\2\u02f6"+
		"\u02ec\3\2\2\2\u02f6\u02f0\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f5\3\2"+
		"\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fa\7;\2\2\u02f9"+
		"\u02e4\3\2\2\2\u02f9\u02e6\3\2\2\2\u02faE\3\2\2\2\u02fb\u02fc\7F\2\2\u02fc"+
		"\u030a\5L\'\2\u02fd\u02fe\7R\2\2\u02fe\u02ff\7b\2\2\u02ff\u0304\5d\63"+
		"\2\u0300\u0301\7^\2\2\u0301\u0303\5d\63\2\u0302\u0300\3\2\2\2\u0303\u0306"+
		"\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\3\2\2\2\u0306"+
		"\u0304\3\2\2\2\u0307\u0308\7c\2\2\u0308\u030a\3\2\2\2\u0309\u02fb\3\2"+
		"\2\2\u0309\u02fd\3\2\2\2\u0309\u030a\3\2\2\2\u030aG\3\2\2\2\u030b\u0317"+
		"\5`\61\2\u030c\u030d\7b\2\2\u030d\u0312\5d\63\2\u030e\u030f\7^\2\2\u030f"+
		"\u0311\5d\63\2\u0310\u030e\3\2\2\2\u0311\u0314\3\2\2\2\u0312\u0310\3\2"+
		"\2\2\u0312\u0313\3\2\2\2\u0313\u0315\3\2\2\2\u0314\u0312\3\2\2\2\u0315"+
		"\u0316\7c\2\2\u0316\u0318\3\2\2\2\u0317\u030c\3\2\2\2\u0317\u0318\3\2"+
		"\2\2\u0318\u0319\3\2\2\2\u0319\u031a\7\33\2\2\u031a\u031b\7b\2\2\u031b"+
		"\u031c\5<\37\2\u031c\u031d\7c\2\2\u031dI\3\2\2\2\u031e\u0321\5L\'\2\u031f"+
		"\u0320\7!\2\2\u0320\u0322\5\\/\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2"+
		"\2\u0322\u0324\3\2\2\2\u0323\u0325\t\t\2\2\u0324\u0323\3\2\2\2\u0324\u0325"+
		"\3\2\2\2\u0325K\3\2\2\2\u0326\u0327\b\'\1\2\u0327\u0361\5\b\5\2\u0328"+
		"\u0361\7l\2\2\u0329\u032a\5^\60\2\u032a\u032b\7a\2\2\u032b\u032d\3\2\2"+
		"\2\u032c\u0329\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f"+
		"\5f\64\2\u032f\u0330\7a\2\2\u0330\u0332\3\2\2\2\u0331\u032c\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0361\5d\63\2\u0334\u0335\5P"+
		")\2\u0335\u0336\5L\'\26\u0336\u0361\3\2\2\2\u0337\u0338\7b\2\2\u0338\u0339"+
		"\5L\'\2\u0339\u033a\7c\2\2\u033a\u0361\3\2\2\2\u033b\u033c\7 \2\2\u033c"+
		"\u033d\7b\2\2\u033d\u033e\5L\'\2\u033e\u033f\7\33\2\2\u033f\u0340\5T+"+
		"\2\u0340\u0341\7c\2\2\u0341\u0361\3\2\2\2\u0342\u0344\7B\2\2\u0343\u0342"+
		"\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0347\7,\2\2\u0346"+
		"\u0343\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\7b"+
		"\2\2\u0349\u034a\5<\37\2\u034a\u034b\7c\2\2\u034b\u0361\3\2\2\2\u034c"+
		"\u034e\7\37\2\2\u034d\u034f\5L\'\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2"+
		"\2\2\u034f\u0355\3\2\2\2\u0350\u0351\7T\2\2\u0351\u0352\5L\'\2\u0352\u0353"+
		"\7P\2\2\u0353\u0354\5L\'\2\u0354\u0356\3\2\2\2\u0355\u0350\3\2\2\2\u0356"+
		"\u0357\3\2\2\2\u0357\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u035b\3\2"+
		"\2\2\u0359\u035a\7(\2\2\u035a\u035c\5L\'\2\u035b\u0359\3\2\2\2\u035b\u035c"+
		"\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\7)\2\2\u035e\u0361\3\2\2\2\u035f"+
		"\u0361\5p9\2\u0360\u0326\3\2\2\2\u0360\u0328\3\2\2\2\u0360\u0331\3\2\2"+
		"\2\u0360\u0334\3\2\2\2\u0360\u0337\3\2\2\2\u0360\u033b\3\2\2\2\u0360\u0346"+
		"\3\2\2\2\u0360\u034c\3\2\2\2\u0360\u035f\3\2\2\2\u0361\u03c6\3\2\2\2\u0362"+
		"\u0363\f\25\2\2\u0363\u0364\7\3\2\2\u0364\u03c5\5L\'\26\u0365\u0366\f"+
		"\24\2\2\u0366\u0367\t\4\2\2\u0367\u03c5\5L\'\25\u0368\u0369\f\23\2\2\u0369"+
		"\u036a\t\5\2\2\u036a\u03c5\5L\'\24\u036b\u036c\f\22\2\2\u036c\u036d\t"+
		"\n\2\2\u036d\u03c5\5L\'\23\u036e\u036f\f\21\2\2\u036f\u0370\t\13\2\2\u0370"+
		"\u03c5\5L\'\22\u0371\u037e\f\20\2\2\u0372\u037f\7\22\2\2\u0373\u037f\7"+
		"\23\2\2\u0374\u037f\7\24\2\2\u0375\u037f\7\25\2\2\u0376\u037f\79\2\2\u0377"+
		"\u0378\79\2\2\u0378\u037f\7B\2\2\u0379\u037f\7\65\2\2\u037a\u037f\7=\2"+
		"\2\u037b\u037f\7\60\2\2\u037c\u037f\7?\2\2\u037d\u037f\7L\2\2\u037e\u0372"+
		"\3\2\2\2\u037e\u0373\3\2\2\2\u037e\u0374\3\2\2\2\u037e\u0375\3\2\2\2\u037e"+
		"\u0376\3\2\2\2\u037e\u0377\3\2\2\2\u037e\u0379\3\2\2\2\u037e\u037a\3\2"+
		"\2\2\u037e\u037b\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037d\3\2\2\2\u037f"+
		"\u0380\3\2\2\2\u0380\u03c5\5L\'\21\u0381\u0382\f\17\2\2\u0382\u0383\7"+
		"\32\2\2\u0383\u03c5\5L\'\20\u0384\u0385\f\16\2\2\u0385\u0386\7G\2\2\u0386"+
		"\u03c5\5L\'\17\u0387\u0388\f\b\2\2\u0388\u038a\79\2\2\u0389\u038b\7B\2"+
		"\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u03c5"+
		"\5L\'\t\u038d\u038f\f\7\2\2\u038e\u0390\7B\2\2\u038f\u038e\3\2\2\2\u038f"+
		"\u0390\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\7\35\2\2\u0392\u0393\5"+
		"L\'\2\u0393\u0394\7\32\2\2\u0394\u0395\5L\'\b\u0395\u03c5\3\2\2\2\u0396"+
		"\u0397\f\13\2\2\u0397\u0398\7!\2\2\u0398\u03c5\5\\/\2\u0399\u039b\f\n"+
		"\2\2\u039a\u039c\7B\2\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u039d\3\2\2\2\u039d\u039e\t\f\2\2\u039e\u03a1\5L\'\2\u039f\u03a0\7*\2"+
		"\2\u03a0\u03a2\5L\'\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03c5"+
		"\3\2\2\2\u03a3\u03a8\f\t\2\2\u03a4\u03a9\7:\2\2\u03a5\u03a9\7C\2\2\u03a6"+
		"\u03a7\7B\2\2\u03a7\u03a9\7D\2\2\u03a8\u03a4\3\2\2\2\u03a8\u03a5\3\2\2"+
		"\2\u03a8\u03a6\3\2\2\2\u03a9\u03c5\3\2\2\2\u03aa\u03ac\f\6\2\2\u03ab\u03ad"+
		"\7B\2\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae"+
		"\u03c2\7\65\2\2\u03af\u03b9\7b\2\2\u03b0\u03ba\5<\37\2\u03b1\u03b6\5L"+
		"\'\2\u03b2\u03b3\7^\2\2\u03b3\u03b5\5L\'\2\u03b4\u03b2\3\2\2\2\u03b5\u03b8"+
		"\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8"+
		"\u03b6\3\2\2\2\u03b9\u03b0\3\2\2\2\u03b9\u03b1\3\2\2\2\u03b9\u03ba\3\2"+
		"\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03c3\7c\2\2\u03bc\u03bd\5^\60\2\u03bd"+
		"\u03be\7a\2\2\u03be\u03c0\3\2\2\2\u03bf\u03bc\3\2\2\2\u03bf\u03c0\3\2"+
		"\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\5`\61\2\u03c2\u03af\3\2\2\2\u03c2"+
		"\u03bf\3\2\2\2\u03c3\u03c5\3\2\2\2\u03c4\u0362\3\2\2\2\u03c4\u0365\3\2"+
		"\2\2\u03c4\u0368\3\2\2\2\u03c4\u036b\3\2\2\2\u03c4\u036e\3\2\2\2\u03c4"+
		"\u0371\3\2\2\2\u03c4\u0381\3\2\2\2\u03c4\u0384\3\2\2\2\u03c4\u0387\3\2"+
		"\2\2\u03c4\u038d\3\2\2\2\u03c4\u0396\3\2\2\2\u03c4\u0399\3\2\2\2\u03c4"+
		"\u03a3\3\2\2\2\u03c4\u03aa\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2"+
		"\2\2\u03c6\u03c7\3\2\2\2\u03c7M\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03ca"+
		"\t\r\2\2\u03caO\3\2\2\2\u03cb\u03cc\t\16\2\2\u03ccQ\3\2\2\2\u03cd\u03ce"+
		"\5j\66\2\u03ceS\3\2\2\2\u03cf\u03d1\5R*\2\u03d0\u03cf\3\2\2\2\u03d1\u03d2"+
		"\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03de\3\2\2\2\u03d4"+
		"\u03d5\7b\2\2\u03d5\u03d6\5n8\2\u03d6\u03d7\7c\2\2\u03d7\u03df\3\2\2\2"+
		"\u03d8\u03d9\7b\2\2\u03d9\u03da\5n8\2\u03da\u03db\7^\2\2\u03db\u03dc\5"+
		"n8\2\u03dc\u03dd\7c\2\2\u03dd\u03df\3\2\2\2\u03de\u03d4\3\2\2\2\u03de"+
		"\u03d8\3\2\2\2\u03de\u03df\3\2\2\2\u03dfU\3\2\2\2\u03e0\u03e1\5j\66\2"+
		"\u03e1W\3\2\2\2\u03e2\u03e3\5Z.\2\u03e3Y\3\2\2\2\u03e4\u03e5\t\17\2\2"+
		"\u03e5[\3\2\2\2\u03e6\u03e7\5j\66\2\u03e7]\3\2\2\2\u03e8\u03e9\5j\66\2"+
		"\u03e9_\3\2\2\2\u03ea\u03eb\5j\66\2\u03eba\3\2\2\2\u03ec\u03ed\t\20\2"+
		"\2\u03edc\3\2\2\2\u03ee\u03ef\5j\66\2\u03efe\3\2\2\2\u03f0\u03f1\5j\66"+
		"\2\u03f1g\3\2\2\2\u03f2\u03f3\5j\66\2\u03f3i\3\2\2\2\u03f4\u03f7\5:\36"+
		"\2\u03f5\u03f7\7m\2\2\u03f6\u03f4\3\2\2\2\u03f6\u03f5\3\2\2\2\u03f7k\3"+
		"\2\2\2\u03f8\u03f9\7n\2\2\u03f9m\3\2\2\2\u03fa\u03fc\t\5\2\2\u03fb\u03fa"+
		"\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\7j\2\2\u03fe"+
		"o\3\2\2\2\u03ff\u0400\7J\2\2\u0400\u0405\7b\2\2\u0401\u0406\7\64\2\2\u0402"+
		"\u0403\t\21\2\2\u0403\u0404\7^\2\2\u0404\u0406\5r:\2\u0405\u0401\3\2\2"+
		"\2\u0405\u0402\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\7c\2\2\u0408q\3"+
		"\2\2\2\u0409\u040a\7n\2\2\u040as\3\2\2\2\u0090w{~\u0084\u0093\u0098\u009b"+
		"\u00a0\u00a8\u00af\u00b3\u00c4\u00cf\u00d1\u00dc\u00de\u00e0\u00e8\u00ec"+
		"\u00f3\u00f7\u00fc\u0101\u0105\u0112\u0115\u011c\u0122\u0126\u012b\u0136"+
		"\u013c\u0140\u0145\u0164\u016e\u0172\u017a\u017c\u0181\u018a\u018f\u0195"+
		"\u019a\u019e\u01a5\u01a8\u01b0\u01ba\u01bd\u01c3\u01c5\u01c9\u01d0\u01d3"+
		"\u01db\u01df\u01e2\u01ee\u01f3\u01f5\u01fe\u0209\u0210\u0213\u0217\u0220"+
		"\u0225\u022e\u0239\u0240\u0243\u0245\u024e\u0251\u0253\u0258\u025c\u025f"+
		"\u0266\u026e\u0272\u0276\u0279\u027f\u0282\u0284\u028a\u0291\u0294\u029c"+
		"\u02a6\u02a9\u02af\u02b1\u02b5\u02bc\u02bf\u02c7\u02cb\u02ce\u02d5\u02db"+
		"\u02e1\u02e6\u02ea\u02ee\u02f2\u02f6\u02f9\u0304\u0309\u0312\u0317\u0321"+
		"\u0324\u032c\u0331\u0343\u0346\u034e\u0357\u035b\u0360\u037e\u038a\u038f"+
		"\u039b\u03a1\u03a8\u03ac\u03b6\u03b9\u03bf\u03c2\u03c4\u03c6\u03d2\u03de"+
		"\u03f6\u03fb\u0405";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}