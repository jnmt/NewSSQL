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
		CLOSE_BRACKET=99, OPEN_BRACE=100, CLOSE_BRACE=101, SEMICOLON=102, DECORATOR=103, 
		NUMERIC_LITERAL=104, BLOB_LITERAL=105, BIND_PARAMETER=106, IDENTIFIER=107, 
		STRING_LITERAL=108, MULTI_LINE_COMMENT=109, SINGLE_LINE_COMMENT=110, WS=111, 
		UNEXPECTED_CHAR=112;
	public static final int
		RULE_query = 0, RULE_root = 1, RULE_media = 2, RULE_operand = 3, RULE_attribute = 4, 
		RULE_join_string = 5, RULE_as_pair = 6, RULE_grouper = 7, RULE_composite_iterator = 8, 
		RULE_exp = 9, RULE_d_exp = 10, RULE_v_exp = 11, RULE_h_exp = 12, RULE_n_exp = 13, 
		RULE_sorting = 14, RULE_function = 15, RULE_sqlfunc = 16, RULE_aggregate = 17, 
		RULE_if_then_else = 18, RULE_arithmetics = 19, RULE_arith = 20, RULE_from_where = 21, 
		RULE_error = 22, RULE_sql_stmt_list = 23, RULE_sql_stmt = 24, RULE_factored_select_stmt = 25, 
		RULE_select_core = 26, RULE_where_clause = 27, RULE_result_column = 28, 
		RULE_table_or_subquery = 29, RULE_keyword = 30, RULE_select_stmt = 31, 
		RULE_select_or_values = 32, RULE_compound_operator = 33, RULE_join_clause = 34, 
		RULE_join_operator = 35, RULE_join_constraint = 36, RULE_common_table_expression = 37, 
		RULE_ordering_term = 38, RULE_expr = 39, RULE_literal_value = 40, RULE_unary_operator = 41, 
		RULE_name = 42, RULE_type_name = 43, RULE_function_name = 44, RULE_ag_function_name = 45, 
		RULE_ag_keyword = 46, RULE_collation_name = 47, RULE_database_name = 48, 
		RULE_table_name = 49, RULE_column_alias = 50, RULE_column_name = 51, RULE_table_alias = 52, 
		RULE_index_name = 53, RULE_any_name = 54, RULE_sl = 55, RULE_signed_number = 56, 
		RULE_raise_function = 57, RULE_error_message = 58;
	public static final String[] ruleNames = {
		"query", "root", "media", "operand", "attribute", "join_string", "as_pair", 
		"grouper", "composite_iterator", "exp", "d_exp", "v_exp", "h_exp", "n_exp", 
		"sorting", "function", "sqlfunc", "aggregate", "if_then_else", "arithmetics", 
		"arith", "from_where", "error", "sql_stmt_list", "sql_stmt", "factored_select_stmt", 
		"select_core", "where_clause", "result_column", "table_or_subquery", "keyword", 
		"select_stmt", "select_or_values", "compound_operator", "join_clause", 
		"join_operator", "join_constraint", "common_table_expression", "ordering_term", 
		"expr", "literal_value", "unary_operator", "name", "type_name", "function_name", 
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
			setState(118);
			media();
			setState(119);
			root();
			setState(121);
			_la = _input.LA(1);
			if (_la==K_FROM || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_SELECT - 77)) | (1L << (K_WITH - 77)) | (1L << (UNEXPECTED_CHAR - 77)))) != 0)) {
				{
				setState(120);
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
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(123);
				operand();
				}
				break;
			case 2:
				{
				setState(124);
				exp();
				}
				break;
			}
			setState(128);
			_la = _input.LA(1);
			if (_la==DECORATOR) {
				{
				setState(127);
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
			setState(130);
			match(K_GENERATE);
			setState(131);
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
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(134);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESE) {
					{
					setState(133);
					sorting();
					}
				}

				setState(136);
				attribute();
				}
				break;
			case 2:
				{
				setState(138);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(137);
					sorting();
					}
					break;
				}
				setState(140);
				join_string();
				}
				break;
			case 3:
				{
				setState(142);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESE) {
					{
					setState(141);
					sorting();
					}
				}

				setState(144);
				as_pair();
				}
				break;
			case 4:
				{
				setState(145);
				function();
				}
				break;
			case 5:
				{
				setState(146);
				sqlfunc();
				}
				break;
			case 6:
				{
				setState(147);
				match(OPEN_BRACE);
				setState(148);
				exp();
				setState(149);
				match(CLOSE_BRACE);
				}
				break;
			case 7:
				{
				setState(151);
				grouper();
				}
				break;
			case 8:
				{
				setState(152);
				composite_iterator();
				}
				break;
			case 9:
				{
				setState(153);
				if_then_else();
				}
				break;
			case 10:
				{
				setState(154);
				match(NUMERIC_LITERAL);
				}
				break;
			case 11:
				{
				setState(156);
				_la = _input.LA(1);
				if (_la==OPEN_PARENTHESE) {
					{
					setState(155);
					sorting();
					}
				}

				setState(158);
				aggregate();
				}
				break;
			case 12:
				{
				setState(159);
				arithmetics(0);
				}
				break;
			case 13:
				{
				setState(160);
				sl();
				}
				break;
			}
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(163);
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
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(166);
				table_alias();
				setState(167);
				match(DOT);
				}
				break;
			}
			setState(171);
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
		public List<AggregateContext> aggregate() {
			return getRuleContexts(AggregateContext.class);
		}
		public AggregateContext aggregate(int i) {
			return getRuleContext(AggregateContext.class,i);
		}
		public List<SqlfuncContext> sqlfunc() {
			return getRuleContexts(SqlfuncContext.class);
		}
		public SqlfuncContext sqlfunc(int i) {
			return getRuleContext(SqlfuncContext.class,i);
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
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(173);
				attribute();
				}
				break;
			case 2:
				{
				setState(174);
				match(NUMERIC_LITERAL);
				}
				break;
			case 3:
				{
				setState(175);
				arithmetics(0);
				}
				break;
			case 4:
				{
				setState(176);
				sl();
				}
				break;
			case 5:
				{
				setState(177);
				aggregate();
				}
				break;
			case 6:
				{
				setState(178);
				sqlfunc();
				}
				break;
			}
			setState(190); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(181);
					match(T__0);
					setState(188);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(182);
						attribute();
						}
						break;
					case 2:
						{
						setState(183);
						match(NUMERIC_LITERAL);
						}
						break;
					case 3:
						{
						setState(184);
						arithmetics(0);
						}
						break;
					case 4:
						{
						setState(185);
						sl();
						}
						break;
					case 5:
						{
						setState(186);
						aggregate();
						}
						break;
					case 6:
						{
						setState(187);
						sqlfunc();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 12, RULE_as_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(194);
				attribute();
				}
				break;
			case 2:
				{
				setState(195);
				aggregate();
				}
				break;
			case 3:
				{
				setState(196);
				sqlfunc();
				}
				break;
			}
			setState(199);
			match(K_AS);
			{
			setState(200);
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
		enterRule(_localctx, 14, RULE_grouper);
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(OPEN_BRACKET);
				setState(203);
				exp();
				setState(204);
				match(CLOSE_BRACKET);
				setState(205);
				match(C1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(OPEN_BRACKET);
				setState(208);
				exp();
				setState(209);
				match(CLOSE_BRACKET);
				setState(210);
				match(C2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(OPEN_BRACKET);
				setState(213);
				exp();
				setState(214);
				match(CLOSE_BRACKET);
				setState(215);
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
		enterRule(_localctx, 16, RULE_composite_iterator);
		try {
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(OPEN_BRACKET);
				setState(220);
				exp();
				setState(221);
				match(CLOSE_BRACKET);
				setState(222);
				match(C1);
				setState(235);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(223);
					match(NUMERIC_LITERAL);
					setState(224);
					match(C2);
					setState(227);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(225);
						match(NUMERIC_LITERAL);
						setState(226);
						match(C3);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(229);
					match(NUMERIC_LITERAL);
					setState(230);
					match(C3);
					setState(233);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(231);
						match(NUMERIC_LITERAL);
						setState(232);
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
				setState(237);
				match(OPEN_BRACKET);
				setState(238);
				exp();
				setState(239);
				match(CLOSE_BRACKET);
				setState(240);
				match(C2);
				setState(253);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(241);
					match(NUMERIC_LITERAL);
					setState(242);
					match(C1);
					setState(245);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(243);
						match(NUMERIC_LITERAL);
						setState(244);
						match(C3);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(247);
					match(NUMERIC_LITERAL);
					setState(248);
					match(C3);
					setState(251);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(249);
						match(NUMERIC_LITERAL);
						setState(250);
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
				setState(255);
				match(OPEN_BRACKET);
				setState(256);
				exp();
				setState(257);
				match(CLOSE_BRACKET);
				setState(258);
				match(C3);
				setState(271);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(259);
					match(NUMERIC_LITERAL);
					setState(260);
					match(C1);
					setState(263);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(261);
						match(NUMERIC_LITERAL);
						setState(262);
						match(C2);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(265);
					match(NUMERIC_LITERAL);
					setState(266);
					match(C2);
					setState(269);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(267);
						match(NUMERIC_LITERAL);
						setState(268);
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
		enterRule(_localctx, 18, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 20, RULE_d_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			v_exp();
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					match(C3);
					setState(281);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(279);
						v_exp();
						}
						break;
					case 2:
						{
						setState(280);
						operand();
						}
						break;
					}
					}
					} 
				}
				setState(287);
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
			setState(288);
			h_exp();
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(289);
					match(C2);
					setState(292);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(290);
						h_exp();
						}
						break;
					case 2:
						{
						setState(291);
						operand();
						}
						break;
					}
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
			setState(301);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(299);
				operand();
				}
				break;
			case 2:
				{
				setState(300);
				n_exp();
				}
				break;
			}
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					match(C1);
					setState(306);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(304);
						operand();
						}
						break;
					case 2:
						{
						setState(305);
						n_exp();
						}
						break;
					}
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 26, RULE_n_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			operand();
			setState(314);
			match(C0);
			setState(315);
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
		enterRule(_localctx, 28, RULE_sorting);
		try {
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(OPEN_PARENTHESE);
				setState(318);
				match(K_ASC);
				setState(319);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(OPEN_PARENTHESE);
				setState(321);
				match(K_DESC);
				setState(322);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(326);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(325);
				match(T__1);
				}
			}

			setState(328);
			function_name();
			setState(329);
			match(OPEN_PARENTHESE);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << K_ABORT) | (1L << K_ALL) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLLATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_ELSE) | (1L << K_END) | (1L << K_ESCAPE) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FAIL) | (1L << K_FULL) | (1L << K_FROM) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IGNORE) | (1L << K_IN) | (1L << K_INDEXED) | (1L << K_INNER) | (1L << K_INTERSECT) | (1L << K_IS) | (1L << K_ISNULL) | (1L << K_JOIN) | (1L << K_LEFT) | (1L << K_LIKE) | (1L << K_LIMIT) | (1L << K_MATCH) | (1L << K_NATURAL) | (1L << K_NO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_THEN - 64)) | (1L << (K_UNION - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (K_GENERATE - 64)) | (1L << (K_MAX - 64)) | (1L << (K_MIN - 64)) | (1L << (K_AVG - 64)) | (1L << (K_COUNT - 64)) | (1L << (K_SUM - 64)) | (1L << (OPEN_PARENTHESE - 64)) | (1L << (OPEN_BRACKET - 64)) | (1L << (OPEN_BRACE - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (STRING_LITERAL - 64)))) != 0)) {
				{
				{
				setState(332);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(330);
					operand();
					}
					break;
				case 2:
					{
					setState(331);
					exp();
					}
					break;
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(335);
						_la = _input.LA(1);
						if (_la==C1) {
							{
							setState(334);
							match(C1);
							}
						}

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
					}
					setState(345);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
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
			setState(353);
			match(T__2);
			setState(354);
			function_name();
			setState(355);
			match(OPEN_PARENTHESE);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << K_ABORT) | (1L << K_ALL) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLLATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_ELSE) | (1L << K_END) | (1L << K_ESCAPE) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FAIL) | (1L << K_FULL) | (1L << K_FROM) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IGNORE) | (1L << K_IN) | (1L << K_INDEXED) | (1L << K_INNER) | (1L << K_INTERSECT) | (1L << K_IS) | (1L << K_ISNULL) | (1L << K_JOIN) | (1L << K_LEFT) | (1L << K_LIKE) | (1L << K_LIMIT) | (1L << K_MATCH) | (1L << K_NATURAL) | (1L << K_NO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_THEN - 64)) | (1L << (K_UNION - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (K_GENERATE - 64)) | (1L << (K_MAX - 64)) | (1L << (K_MIN - 64)) | (1L << (K_AVG - 64)) | (1L << (K_COUNT - 64)) | (1L << (K_SUM - 64)) | (1L << (OPEN_PARENTHESE - 64)) | (1L << (OPEN_BRACKET - 64)) | (1L << (OPEN_BRACE - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (STRING_LITERAL - 64)))) != 0)) {
				{
				{
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
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(360);
					match(C1);
					setState(363);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(361);
						operand();
						}
						break;
					case 2:
						{
						setState(362);
						exp();
						}
						break;
					}
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
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
			setState(377);
			ag_function_name();
			setState(378);
			match(OPEN_BRACKET);
			setState(379);
			attribute();
			setState(380);
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
		enterRule(_localctx, 36, RULE_if_then_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			switch (_input.LA(1)) {
			case K_IF:
				{
				{
				setState(382);
				match(K_IF);
				setState(383);
				match(OPEN_PARENTHESE);
				setState(384);
				expr(0);
				setState(385);
				match(CLOSE_PARENTHESE);
				setState(386);
				match(K_THEN);
				setState(387);
				match(OPEN_PARENTHESE);
				setState(388);
				exp();
				setState(389);
				match(CLOSE_PARENTHESE);
				setState(390);
				match(K_ELSE);
				setState(391);
				match(OPEN_PARENTHESE);
				setState(392);
				exp();
				setState(393);
				match(CLOSE_PARENTHESE);
				}
				}
				break;
			case OPEN_PARENTHESE:
				{
				{
				setState(395);
				match(OPEN_PARENTHESE);
				setState(396);
				expr(0);
				setState(397);
				match(CLOSE_PARENTHESE);
				setState(398);
				match(C0);
				setState(399);
				exp();
				setState(400);
				match(T__3);
				setState(401);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_arithmetics, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			switch (_input.LA(1)) {
			case OPEN_PARENTHESE:
				{
				setState(406);
				match(OPEN_PARENTHESE);
				setState(407);
				arithmetics(0);
				setState(408);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==C3) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(409);
				arithmetics(0);
				setState(410);
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
			case NUMERIC_LITERAL:
			case IDENTIFIER:
				{
				setState(412);
				arith();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(420);
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
					setState(415);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(416);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==C3) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(417);
					arithmetics(3);
					}
					} 
				}
				setState(422);
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
		enterRule(_localctx, 40, RULE_arith);
		try {
			setState(425);
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
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				attribute();
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
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
		enterRule(_localctx, 42, RULE_from_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			switch (_input.LA(1)) {
			case K_FROM:
			case K_SELECT:
			case K_WITH:
				{
				setState(427);
				sql_stmt_list();
				}
				break;
			case UNEXPECTED_CHAR:
				{
				setState(428);
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
		enterRule(_localctx, 44, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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
		enterRule(_localctx, 46, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			sql_stmt();
			setState(443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(436); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(435);
						match(SEMICOLON);
						}
						}
						setState(438); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SEMICOLON );
					setState(440);
					sql_stmt();
					}
					} 
				}
				setState(445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(446);
				match(SEMICOLON);
				}
				}
				setState(451);
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
		enterRule(_localctx, 48, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(452);
				factored_select_stmt();
				}
				break;
			case 2:
				{
				setState(453);
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
		enterRule(_localctx, 50, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(456);
				match(K_WITH);
				setState(458);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(457);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(460);
				common_table_expression();
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(461);
					match(C1);
					setState(462);
					common_table_expression();
					}
					}
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(470);
			select_core();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (K_EXCEPT - 41)) | (1L << (K_INTERSECT - 41)) | (1L << (K_UNION - 41)))) != 0)) {
				{
				{
				setState(471);
				compound_operator();
				setState(472);
				select_core();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(489);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(479);
				match(K_ORDER);
				setState(480);
				match(K_BY);
				setState(481);
				ordering_term();
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(482);
					match(C1);
					setState(483);
					ordering_term();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(497);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(491);
				match(K_LIMIT);
				setState(492);
				expr(0);
				setState(495);
				_la = _input.LA(1);
				if (_la==K_OFFSET || _la==C1) {
					{
					setState(493);
					_la = _input.LA(1);
					if ( !(_la==K_OFFSET || _la==C1) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(494);
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
		enterRule(_localctx, 52, RULE_select_core);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_la = _input.LA(1);
			if (_la==K_SELECT) {
				{
				setState(499);
				match(K_SELECT);
				setState(501);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(500);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(503);
				result_column();
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(504);
					match(C1);
					setState(505);
					result_column();
					}
					}
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(513);
			match(K_FROM);
			setState(523);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(514);
				table_or_subquery();
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(515);
					match(C1);
					setState(516);
					table_or_subquery();
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(522);
				join_clause();
				}
				break;
			}
			}
			setState(526);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (K_GROUP - 47)) | (1L << (K_VALUES - 47)) | (1L << (K_WHERE - 47)))) != 0)) {
				{
				setState(525);
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
		enterRule(_localctx, 54, RULE_where_clause);
		int _la;
		try {
			setState(625);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				switch (_input.LA(1)) {
				case K_WHERE:
					{
					{
					setState(528);
					match(K_WHERE);
					setState(529);
					expr(0);
					}
					setState(545);
					_la = _input.LA(1);
					if (_la==K_GROUP) {
						{
						setState(531);
						match(K_GROUP);
						setState(532);
						match(K_BY);
						setState(533);
						expr(0);
						setState(538);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==C1) {
							{
							{
							setState(534);
							match(C1);
							setState(535);
							expr(0);
							}
							}
							setState(540);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(543);
						_la = _input.LA(1);
						if (_la==K_HAVING) {
							{
							setState(541);
							match(K_HAVING);
							setState(542);
							expr(0);
							}
						}

						}
					}

					}
					break;
				case K_VALUES:
					{
					setState(547);
					match(K_VALUES);
					setState(548);
					match(OPEN_PARENTHESE);
					setState(549);
					expr(0);
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(550);
						match(C1);
						setState(551);
						expr(0);
						}
						}
						setState(556);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(557);
					match(CLOSE_PARENTHESE);
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(558);
						match(C1);
						setState(559);
						match(OPEN_PARENTHESE);
						setState(560);
						expr(0);
						setState(565);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==C1) {
							{
							{
							setState(561);
							match(C1);
							setState(562);
							expr(0);
							}
							}
							setState(567);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(568);
						match(CLOSE_PARENTHESE);
						}
						}
						setState(574);
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
				setState(623);
				switch (_input.LA(1)) {
				case K_GROUP:
				case K_WHERE:
					{
					setState(579);
					_la = _input.LA(1);
					if (_la==K_WHERE) {
						{
						setState(577);
						match(K_WHERE);
						setState(578);
						expr(0);
						}
					}

					{
					setState(581);
					match(K_GROUP);
					setState(582);
					match(K_BY);
					setState(583);
					expr(0);
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(584);
						match(C1);
						setState(585);
						expr(0);
						}
						}
						setState(590);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(593);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(591);
						match(K_HAVING);
						setState(592);
						expr(0);
						}
					}

					}
					}
					break;
				case K_VALUES:
					{
					setState(595);
					match(K_VALUES);
					setState(596);
					match(OPEN_PARENTHESE);
					setState(597);
					expr(0);
					setState(602);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(598);
						match(C1);
						setState(599);
						expr(0);
						}
						}
						setState(604);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(605);
					match(CLOSE_PARENTHESE);
					setState(620);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(606);
						match(C1);
						setState(607);
						match(OPEN_PARENTHESE);
						setState(608);
						expr(0);
						setState(613);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==C1) {
							{
							{
							setState(609);
							match(C1);
							setState(610);
							expr(0);
							}
							}
							setState(615);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(616);
						match(CLOSE_PARENTHESE);
						}
						}
						setState(622);
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
		enterRule(_localctx, 56, RULE_result_column);
		int _la;
		try {
			setState(639);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				table_name();
				setState(629);
				match(DOT);
				setState(630);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				expr(0);
				setState(637);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(634);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(633);
						match(K_AS);
						}
					}

					setState(636);
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
		enterRule(_localctx, 58, RULE_table_or_subquery);
		int _la;
		try {
			setState(688);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(641);
					database_name();
					setState(642);
					match(DOT);
					}
					break;
				}
				setState(646);
				table_name();
				setState(651);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(648);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						setState(647);
						match(K_AS);
						}
						break;
					}
					setState(650);
					table_alias();
					}
					break;
				}
				setState(658);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(653);
					match(K_INDEXED);
					setState(654);
					match(K_BY);
					setState(655);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(656);
					match(K_NOT);
					setState(657);
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
				setState(660);
				match(OPEN_PARENTHESE);
				setState(670);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(661);
					table_or_subquery();
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==C1) {
						{
						{
						setState(662);
						match(C1);
						setState(663);
						table_or_subquery();
						}
						}
						setState(668);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(669);
					join_clause();
					}
					break;
				}
				setState(672);
				match(CLOSE_PARENTHESE);
				setState(677);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(674);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(673);
						match(K_AS);
						}
						break;
					}
					setState(676);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(679);
				match(OPEN_PARENTHESE);
				setState(680);
				select_stmt();
				setState(681);
				match(CLOSE_PARENTHESE);
				setState(686);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(683);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						setState(682);
						match(K_AS);
						}
						break;
					}
					setState(685);
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
		enterRule(_localctx, 60, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
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
		enterRule(_localctx, 62, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(692);
				match(K_WITH);
				setState(694);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(693);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(696);
				common_table_expression();
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(697);
					match(C1);
					setState(698);
					common_table_expression();
					}
					}
					setState(703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(706);
			select_or_values();
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (K_EXCEPT - 41)) | (1L << (K_INTERSECT - 41)) | (1L << (K_UNION - 41)))) != 0)) {
				{
				{
				setState(707);
				compound_operator();
				setState(708);
				select_or_values();
				}
				}
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(725);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(715);
				match(K_ORDER);
				setState(716);
				match(K_BY);
				setState(717);
				ordering_term();
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(718);
					match(C1);
					setState(719);
					ordering_term();
					}
					}
					setState(724);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(733);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(727);
				match(K_LIMIT);
				setState(728);
				expr(0);
				setState(731);
				_la = _input.LA(1);
				if (_la==K_OFFSET || _la==C1) {
					{
					setState(729);
					_la = _input.LA(1);
					if ( !(_la==K_OFFSET || _la==C1) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(730);
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
		enterRule(_localctx, 64, RULE_select_or_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_la = _input.LA(1);
			if (_la==K_SELECT) {
				{
				setState(735);
				match(K_SELECT);
				setState(737);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(736);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(739);
				result_column();
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(740);
					match(C1);
					setState(741);
					result_column();
					}
					}
					setState(746);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			{
			setState(749);
			match(K_FROM);
			setState(759);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(750);
				table_or_subquery();
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(751);
					match(C1);
					setState(752);
					table_or_subquery();
					}
					}
					setState(757);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(758);
				join_clause();
				}
				break;
			}
			}
			setState(762);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (K_GROUP - 47)) | (1L << (K_VALUES - 47)) | (1L << (K_WHERE - 47)))) != 0)) {
				{
				setState(761);
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
		enterRule(_localctx, 66, RULE_compound_operator);
		try {
			setState(769);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				match(K_UNION);
				setState(766);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(767);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(768);
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
		enterRule(_localctx, 68, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			table_or_subquery();
			setState(781);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(772);
					join_operator();
					setState(775);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						setState(773);
						join_clause();
						}
						break;
					case 2:
						{
						setState(774);
						table_or_subquery();
						}
						break;
					}
					setState(777);
					join_constraint();
					}
					} 
				}
				setState(783);
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
		enterRule(_localctx, 70, RULE_join_operator);
		int _la;
		try {
			setState(805);
			switch (_input.LA(1)) {
			case C1:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
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
				setState(786);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(785);
					match(K_NATURAL);
					}
				}

				setState(802);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(788);
					match(K_LEFT);
					setState(790);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(789);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_RIGHT:
					{
					setState(792);
					match(K_RIGHT);
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
				case K_FULL:
					{
					setState(796);
					match(K_FULL);
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
				case K_INNER:
					{
					setState(800);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(801);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(804);
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
		enterRule(_localctx, 72, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(807);
				match(K_ON);
				setState(808);
				expr(0);
				}
				break;
			case 2:
				{
				setState(809);
				match(K_USING);
				setState(810);
				match(OPEN_PARENTHESE);
				setState(811);
				column_name();
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(812);
					match(C1);
					setState(813);
					column_name();
					}
					}
					setState(818);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(819);
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
		enterRule(_localctx, 74, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			table_name();
			setState(835);
			_la = _input.LA(1);
			if (_la==OPEN_PARENTHESE) {
				{
				setState(824);
				match(OPEN_PARENTHESE);
				setState(825);
				column_name();
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==C1) {
					{
					{
					setState(826);
					match(C1);
					setState(827);
					column_name();
					}
					}
					setState(832);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(833);
				match(CLOSE_PARENTHESE);
				}
			}

			setState(837);
			match(K_AS);
			setState(838);
			match(OPEN_PARENTHESE);
			setState(839);
			select_stmt();
			setState(840);
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
		enterRule(_localctx, 76, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			expr(0);
			setState(845);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(843);
				match(K_COLLATE);
				setState(844);
				collation_name();
				}
			}

			setState(848);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(847);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(851);
				unary_operator();
				setState(852);
				expr(20);
				}
				break;
			case 2:
				{
				setState(854);
				operand();
				}
				break;
			case 3:
				{
				setState(855);
				match(BIND_PARAMETER);
				}
				break;
			case 4:
				{
				setState(864);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(859);
					switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1:
						{
						setState(856);
						database_name();
						setState(857);
						match(DOT);
						}
						break;
					}
					setState(861);
					table_alias();
					setState(862);
					match(DOT);
					}
					break;
				}
				setState(866);
				column_name();
				}
				break;
			case 5:
				{
				setState(867);
				match(OPEN_PARENTHESE);
				setState(868);
				expr(0);
				setState(869);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 6:
				{
				setState(871);
				match(K_CAST);
				setState(872);
				match(OPEN_PARENTHESE);
				setState(873);
				expr(0);
				setState(874);
				match(K_AS);
				setState(875);
				type_name();
				setState(876);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 7:
				{
				setState(882);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(879);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(878);
						match(K_NOT);
						}
					}

					setState(881);
					match(K_EXISTS);
					}
				}

				setState(884);
				match(OPEN_PARENTHESE);
				setState(885);
				select_stmt();
				setState(886);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 8:
				{
				setState(888);
				match(K_CASE);
				setState(890);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(889);
					expr(0);
					}
					break;
				}
				setState(897); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(892);
					match(K_WHEN);
					setState(893);
					expr(0);
					setState(894);
					match(K_THEN);
					setState(895);
					expr(0);
					}
					}
					setState(899); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(903);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(901);
					match(K_ELSE);
					setState(902);
					expr(0);
					}
				}

				setState(905);
				match(K_END);
				}
				break;
			case 9:
				{
				setState(907);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1010);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1008);
					switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(910);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(911);
						match(T__0);
						setState(912);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(913);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(914);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5 || _la==C3) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(915);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(916);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(917);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(918);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(919);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(920);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(921);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(922);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(923);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(924);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(925);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(938);
						switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
						case 1:
							{
							setState(926);
							match(T__15);
							}
							break;
						case 2:
							{
							setState(927);
							match(T__16);
							}
							break;
						case 3:
							{
							setState(928);
							match(T__17);
							}
							break;
						case 4:
							{
							setState(929);
							match(T__18);
							}
							break;
						case 5:
							{
							setState(930);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(931);
							match(K_IS);
							setState(932);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(933);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(934);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(935);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(936);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(937);
							match(K_REGEXP);
							}
							break;
						}
						setState(940);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(941);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(942);
						match(K_AND);
						setState(943);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(944);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(945);
						match(K_OR);
						setState(946);
						expr(13);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(947);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(948);
						match(K_IS);
						setState(950);
						switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
						case 1:
							{
							setState(949);
							match(K_NOT);
							}
							break;
						}
						setState(952);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(953);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(955);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(954);
							match(K_NOT);
							}
						}

						setState(957);
						match(K_BETWEEN);
						setState(958);
						expr(0);
						setState(959);
						match(K_AND);
						setState(960);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(962);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(963);
						match(K_COLLATE);
						setState(964);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(965);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(967);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(966);
							match(K_NOT);
							}
						}

						setState(969);
						_la = _input.LA(1);
						if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (K_GLOB - 46)) | (1L << (K_LIKE - 46)) | (1L << (K_MATCH - 46)) | (1L << (K_REGEXP - 46)))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(970);
						expr(0);
						setState(973);
						switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
						case 1:
							{
							setState(971);
							match(K_ESCAPE);
							setState(972);
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
						setState(975);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(980);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(976);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(977);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(978);
							match(K_NOT);
							setState(979);
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
						setState(982);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(984);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(983);
							match(K_NOT);
							}
						}

						setState(986);
						match(K_IN);
						setState(1006);
						switch (_input.LA(1)) {
						case OPEN_PARENTHESE:
							{
							setState(987);
							match(OPEN_PARENTHESE);
							setState(997);
							switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
							case 1:
								{
								setState(988);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(989);
								expr(0);
								setState(994);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==C1) {
									{
									{
									setState(990);
									match(C1);
									setState(991);
									expr(0);
									}
									}
									setState(996);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(999);
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
							setState(1003);
							switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
							case 1:
								{
								setState(1000);
								database_name();
								setState(1001);
								match(DOT);
								}
								break;
							}
							setState(1005);
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
				setState(1012);
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
		enterRule(_localctx, 80, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
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
		enterRule(_localctx, 82, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
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
		enterRule(_localctx, 84, RULE_name);
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
		enterRule(_localctx, 86, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1019);
				name();
				}
				}
				setState(1022); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ALL) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_COLLATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DESC) | (1L << K_DISTINCT) | (1L << K_ELSE) | (1L << K_END) | (1L << K_ESCAPE) | (1L << K_EXCEPT) | (1L << K_EXISTS) | (1L << K_FAIL) | (1L << K_FULL) | (1L << K_FROM) | (1L << K_GLOB) | (1L << K_GROUP) | (1L << K_HAVING) | (1L << K_IF) | (1L << K_IGNORE) | (1L << K_IN) | (1L << K_INDEXED) | (1L << K_INNER) | (1L << K_INTERSECT) | (1L << K_IS) | (1L << K_ISNULL) | (1L << K_JOIN) | (1L << K_LEFT) | (1L << K_LIKE) | (1L << K_LIMIT) | (1L << K_MATCH) | (1L << K_NATURAL) | (1L << K_NO))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_SELECT - 64)) | (1L << (K_THEN - 64)) | (1L << (K_UNION - 64)) | (1L << (K_USING - 64)) | (1L << (K_VALUES - 64)) | (1L << (K_WHEN - 64)) | (1L << (K_WHERE - 64)) | (1L << (K_WITH - 64)) | (1L << (K_GENERATE - 64)) | (1L << (K_MAX - 64)) | (1L << (K_MIN - 64)) | (1L << (K_AVG - 64)) | (1L << (K_COUNT - 64)) | (1L << (K_SUM - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			setState(1034);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1024);
				match(OPEN_PARENTHESE);
				setState(1025);
				signed_number();
				setState(1026);
				match(CLOSE_PARENTHESE);
				}
				break;
			case 2:
				{
				setState(1028);
				match(OPEN_PARENTHESE);
				setState(1029);
				signed_number();
				setState(1030);
				match(C1);
				setState(1031);
				signed_number();
				setState(1032);
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
		enterRule(_localctx, 88, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
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
		enterRule(_localctx, 90, RULE_ag_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
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
		enterRule(_localctx, 92, RULE_ag_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
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
		enterRule(_localctx, 94, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
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
		enterRule(_localctx, 96, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
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
		enterRule(_localctx, 98, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
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
		enterRule(_localctx, 100, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
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
		enterRule(_localctx, 102, RULE_column_name);
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
		enterRule(_localctx, 104, RULE_table_alias);
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
		enterRule(_localctx, 106, RULE_index_name);
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
		enterRule(_localctx, 108, RULE_any_name);
		try {
			setState(1058);
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
				setState(1056);
				keyword();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057);
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
		enterRule(_localctx, 110, RULE_sl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
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
		enterRule(_localctx, 112, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			_la = _input.LA(1);
			if (_la==T__6 || _la==T__7) {
				{
				setState(1062);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1065);
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
		enterRule(_localctx, 114, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(K_RAISE);
			setState(1068);
			match(OPEN_PARENTHESE);
			setState(1073);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1069);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1070);
				_la = _input.LA(1);
				if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (K_ABORT - 21)) | (1L << (K_FAIL - 21)) | (1L << (K_ROLLBACK - 21)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1071);
				match(C1);
				setState(1072);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1075);
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
		enterRule(_localctx, 116, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
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
		case 19:
			return arithmetics_sempred((ArithmeticsContext)_localctx, predIndex);
		case 39:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3r\u043a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\5\2|\n\2\3\3\3\3\5\3\u0080\n\3\3\3\5\3\u0083\n\3\3\4\3\4\3\4\3"+
		"\5\5\5\u0089\n\5\3\5\3\5\5\5\u008d\n\5\3\5\3\5\5\5\u0091\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009f\n\5\3\5\3\5\3\5\5\5\u00a4"+
		"\n\5\3\5\5\5\u00a7\n\5\3\6\3\6\3\6\5\6\u00ac\n\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00b6\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00bf\n\7\6\7"+
		"\u00c1\n\7\r\7\16\7\u00c2\3\b\3\b\3\b\5\b\u00c8\n\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00dc\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e6\n\n\3\n\3\n\3\n\3\n\5\n\u00ec"+
		"\n\n\5\n\u00ee\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f8\n\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00fe\n\n\5\n\u0100\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u010a\n\n\3\n\3\n\3\n\3\n\5\n\u0110\n\n\5\n\u0112\n\n\5\n\u0114\n"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u011c\n\f\7\f\u011e\n\f\f\f\16\f\u0121"+
		"\13\f\3\r\3\r\3\r\3\r\5\r\u0127\n\r\7\r\u0129\n\r\f\r\16\r\u012c\13\r"+
		"\3\16\3\16\5\16\u0130\n\16\3\16\3\16\3\16\5\16\u0135\n\16\7\16\u0137\n"+
		"\16\f\16\16\16\u013a\13\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0146\n\20\3\21\5\21\u0149\n\21\3\21\3\21\3\21\3\21\5\21\u014f"+
		"\n\21\3\21\5\21\u0152\n\21\3\21\3\21\5\21\u0156\n\21\7\21\u0158\n\21\f"+
		"\21\16\21\u015b\13\21\7\21\u015d\n\21\f\21\16\21\u0160\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0169\n\22\3\22\3\22\3\22\5\22\u016e\n"+
		"\22\7\22\u0170\n\22\f\22\16\22\u0173\13\22\7\22\u0175\n\22\f\22\16\22"+
		"\u0178\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u0196\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u01a0\n\25\3\25\3\25\3\25\7\25\u01a5\n\25\f\25\16\25\u01a8\13\25"+
		"\3\26\3\26\5\26\u01ac\n\26\3\27\3\27\5\27\u01b0\n\27\3\30\3\30\3\30\3"+
		"\31\3\31\6\31\u01b7\n\31\r\31\16\31\u01b8\3\31\7\31\u01bc\n\31\f\31\16"+
		"\31\u01bf\13\31\3\31\7\31\u01c2\n\31\f\31\16\31\u01c5\13\31\3\32\3\32"+
		"\5\32\u01c9\n\32\3\33\3\33\5\33\u01cd\n\33\3\33\3\33\3\33\7\33\u01d2\n"+
		"\33\f\33\16\33\u01d5\13\33\5\33\u01d7\n\33\3\33\3\33\3\33\3\33\7\33\u01dd"+
		"\n\33\f\33\16\33\u01e0\13\33\3\33\3\33\3\33\3\33\3\33\7\33\u01e7\n\33"+
		"\f\33\16\33\u01ea\13\33\5\33\u01ec\n\33\3\33\3\33\3\33\3\33\5\33\u01f2"+
		"\n\33\5\33\u01f4\n\33\3\34\3\34\5\34\u01f8\n\34\3\34\3\34\3\34\7\34\u01fd"+
		"\n\34\f\34\16\34\u0200\13\34\5\34\u0202\n\34\3\34\3\34\3\34\3\34\7\34"+
		"\u0208\n\34\f\34\16\34\u020b\13\34\3\34\5\34\u020e\n\34\3\34\5\34\u0211"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u021b\n\35\f\35\16"+
		"\35\u021e\13\35\3\35\3\35\5\35\u0222\n\35\5\35\u0224\n\35\3\35\3\35\3"+
		"\35\3\35\3\35\7\35\u022b\n\35\f\35\16\35\u022e\13\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\7\35\u0236\n\35\f\35\16\35\u0239\13\35\3\35\3\35\7\35\u023d"+
		"\n\35\f\35\16\35\u0240\13\35\5\35\u0242\n\35\3\35\3\35\5\35\u0246\n\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u024d\n\35\f\35\16\35\u0250\13\35\3\35"+
		"\3\35\5\35\u0254\n\35\3\35\3\35\3\35\3\35\3\35\7\35\u025b\n\35\f\35\16"+
		"\35\u025e\13\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0266\n\35\f\35\16"+
		"\35\u0269\13\35\3\35\3\35\7\35\u026d\n\35\f\35\16\35\u0270\13\35\5\35"+
		"\u0272\n\35\5\35\u0274\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u027d"+
		"\n\36\3\36\5\36\u0280\n\36\5\36\u0282\n\36\3\37\3\37\3\37\5\37\u0287\n"+
		"\37\3\37\3\37\5\37\u028b\n\37\3\37\5\37\u028e\n\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0295\n\37\3\37\3\37\3\37\3\37\7\37\u029b\n\37\f\37\16\37\u029e"+
		"\13\37\3\37\5\37\u02a1\n\37\3\37\3\37\5\37\u02a5\n\37\3\37\5\37\u02a8"+
		"\n\37\3\37\3\37\3\37\3\37\5\37\u02ae\n\37\3\37\5\37\u02b1\n\37\5\37\u02b3"+
		"\n\37\3 \3 \3!\3!\5!\u02b9\n!\3!\3!\3!\7!\u02be\n!\f!\16!\u02c1\13!\5"+
		"!\u02c3\n!\3!\3!\3!\3!\7!\u02c9\n!\f!\16!\u02cc\13!\3!\3!\3!\3!\3!\7!"+
		"\u02d3\n!\f!\16!\u02d6\13!\5!\u02d8\n!\3!\3!\3!\3!\5!\u02de\n!\5!\u02e0"+
		"\n!\3\"\3\"\5\"\u02e4\n\"\3\"\3\"\3\"\7\"\u02e9\n\"\f\"\16\"\u02ec\13"+
		"\"\5\"\u02ee\n\"\3\"\3\"\3\"\3\"\7\"\u02f4\n\"\f\"\16\"\u02f7\13\"\3\""+
		"\5\"\u02fa\n\"\3\"\5\"\u02fd\n\"\3#\3#\3#\3#\3#\5#\u0304\n#\3$\3$\3$\3"+
		"$\5$\u030a\n$\3$\3$\7$\u030e\n$\f$\16$\u0311\13$\3%\3%\5%\u0315\n%\3%"+
		"\3%\5%\u0319\n%\3%\3%\5%\u031d\n%\3%\3%\5%\u0321\n%\3%\3%\5%\u0325\n%"+
		"\3%\5%\u0328\n%\3&\3&\3&\3&\3&\3&\3&\7&\u0331\n&\f&\16&\u0334\13&\3&\3"+
		"&\5&\u0338\n&\3\'\3\'\3\'\3\'\3\'\7\'\u033f\n\'\f\'\16\'\u0342\13\'\3"+
		"\'\3\'\5\'\u0346\n\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\5(\u0350\n(\3(\5(\u0353"+
		"\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u035e\n)\3)\3)\3)\5)\u0363\n)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0372\n)\3)\5)\u0375\n)\3)\3)\3)"+
		"\3)\3)\3)\5)\u037d\n)\3)\3)\3)\3)\3)\6)\u0384\n)\r)\16)\u0385\3)\3)\5"+
		")\u038a\n)\3)\3)\3)\5)\u038f\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u03ad\n)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\5)\u03b9\n)\3)\3)\3)\5)\u03be\n)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\5)\u03ca\n)\3)\3)\3)\3)\5)\u03d0\n)\3)\3)\3)\3)\3)\5)\u03d7"+
		"\n)\3)\3)\5)\u03db\n)\3)\3)\3)\3)\3)\3)\7)\u03e3\n)\f)\16)\u03e6\13)\5"+
		")\u03e8\n)\3)\3)\3)\3)\5)\u03ee\n)\3)\5)\u03f1\n)\7)\u03f3\n)\f)\16)\u03f6"+
		"\13)\3*\3*\3+\3+\3,\3,\3-\6-\u03ff\n-\r-\16-\u0400\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\5-\u040d\n-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\58\u0425\n8\39\39"+
		"\3:\5:\u042a\n:\3:\3:\3;\3;\3;\3;\3;\3;\5;\u0434\n;\3;\3;\3<\3<\3<\2\4"+
		"(P=\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtv\2\21\4\2\7\n``\4\2EE^^\4\2\31\31\'\'\4\2\27"+
		"\27\31\\\4\2\34\34&&\4\2\7\b``\3\2\t\n\4\2\5\5\13\r\3\2\16\21\6\2\60\60"+
		"==??LL\6\2#%DDjknn\5\2\t\n\26\26BB\3\2X\\\3\2mn\5\2\27\27--NN\u04d3\2"+
		"x\3\2\2\2\4\177\3\2\2\2\6\u0084\3\2\2\2\b\u00a3\3\2\2\2\n\u00ab\3\2\2"+
		"\2\f\u00b5\3\2\2\2\16\u00c7\3\2\2\2\20\u00db\3\2\2\2\22\u0113\3\2\2\2"+
		"\24\u0115\3\2\2\2\26\u0117\3\2\2\2\30\u0122\3\2\2\2\32\u012f\3\2\2\2\34"+
		"\u013b\3\2\2\2\36\u0145\3\2\2\2 \u0148\3\2\2\2\"\u0163\3\2\2\2$\u017b"+
		"\3\2\2\2&\u0195\3\2\2\2(\u019f\3\2\2\2*\u01ab\3\2\2\2,\u01af\3\2\2\2."+
		"\u01b1\3\2\2\2\60\u01b4\3\2\2\2\62\u01c8\3\2\2\2\64\u01d6\3\2\2\2\66\u0201"+
		"\3\2\2\28\u0273\3\2\2\2:\u0281\3\2\2\2<\u02b2\3\2\2\2>\u02b4\3\2\2\2@"+
		"\u02c2\3\2\2\2B\u02ed\3\2\2\2D\u0303\3\2\2\2F\u0305\3\2\2\2H\u0327\3\2"+
		"\2\2J\u0337\3\2\2\2L\u0339\3\2\2\2N\u034c\3\2\2\2P\u038e\3\2\2\2R\u03f7"+
		"\3\2\2\2T\u03f9\3\2\2\2V\u03fb\3\2\2\2X\u03fe\3\2\2\2Z\u040e\3\2\2\2\\"+
		"\u0410\3\2\2\2^\u0412\3\2\2\2`\u0414\3\2\2\2b\u0416\3\2\2\2d\u0418\3\2"+
		"\2\2f\u041a\3\2\2\2h\u041c\3\2\2\2j\u041e\3\2\2\2l\u0420\3\2\2\2n\u0424"+
		"\3\2\2\2p\u0426\3\2\2\2r\u0429\3\2\2\2t\u042d\3\2\2\2v\u0437\3\2\2\2x"+
		"y\5\6\4\2y{\5\4\3\2z|\5,\27\2{z\3\2\2\2{|\3\2\2\2|\3\3\2\2\2}\u0080\5"+
		"\b\5\2~\u0080\5\24\13\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0082\3\2\2\2"+
		"\u0081\u0083\7i\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\5\3"+
		"\2\2\2\u0084\u0085\7W\2\2\u0085\u0086\7m\2\2\u0086\7\3\2\2\2\u0087\u0089"+
		"\5\36\20\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2"+
		"\u008a\u00a4\5\n\6\2\u008b\u008d\5\36\20\2\u008c\u008b\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u00a4\5\f\7\2\u008f\u0091\5\36\20\2"+
		"\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u00a4"+
		"\5\16\b\2\u0093\u00a4\5 \21\2\u0094\u00a4\5\"\22\2\u0095\u0096\7f\2\2"+
		"\u0096\u0097\5\24\13\2\u0097\u0098\7g\2\2\u0098\u00a4\3\2\2\2\u0099\u00a4"+
		"\5\20\t\2\u009a\u00a4\5\22\n\2\u009b\u00a4\5&\24\2\u009c\u00a4\7j\2\2"+
		"\u009d\u009f\5\36\20\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a4\5$\23\2\u00a1\u00a4\5(\25\2\u00a2\u00a4\5p9\2\u00a3"+
		"\u0088\3\2\2\2\u00a3\u008c\3\2\2\2\u00a3\u0090\3\2\2\2\u00a3\u0093\3\2"+
		"\2\2\u00a3\u0094\3\2\2\2\u00a3\u0095\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3"+
		"\u009a\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009c\3\2\2\2\u00a3\u009e\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a7\7i\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\t\3\2\2\2"+
		"\u00a8\u00a9\5j\66\2\u00a9\u00aa\7a\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a8"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\5h\65\2\u00ae"+
		"\13\3\2\2\2\u00af\u00b6\5\n\6\2\u00b0\u00b6\7j\2\2\u00b1\u00b6\5(\25\2"+
		"\u00b2\u00b6\5p9\2\u00b3\u00b6\5$\23\2\u00b4\u00b6\5\"\22\2\u00b5\u00af"+
		"\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00c0\3\2\2\2\u00b7\u00be\7\3"+
		"\2\2\u00b8\u00bf\5\n\6\2\u00b9\u00bf\7j\2\2\u00ba\u00bf\5(\25\2\u00bb"+
		"\u00bf\5p9\2\u00bc\u00bf\5$\23\2\u00bd\u00bf\5\"\22\2\u00be\u00b8\3\2"+
		"\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b7\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\r\3\2\2\2\u00c4\u00c8\5\n\6\2\u00c5\u00c8\5$\23\2\u00c6\u00c8\5\"\22"+
		"\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\7\33\2\2\u00ca\u00cb\5n8\2\u00cb\17\3\2\2\2\u00cc"+
		"\u00cd\7d\2\2\u00cd\u00ce\5\24\13\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7^"+
		"\2\2\u00d0\u00dc\3\2\2\2\u00d1\u00d2\7d\2\2\u00d2\u00d3\5\24\13\2\u00d3"+
		"\u00d4\7e\2\2\u00d4\u00d5\7_\2\2\u00d5\u00dc\3\2\2\2\u00d6\u00d7\7d\2"+
		"\2\u00d7\u00d8\5\24\13\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7`\2\2\u00da\u00dc"+
		"\3\2\2\2\u00db\u00cc\3\2\2\2\u00db\u00d1\3\2\2\2\u00db\u00d6\3\2\2\2\u00dc"+
		"\21\3\2\2\2\u00dd\u00de\7d\2\2\u00de\u00df\5\24\13\2\u00df\u00e0\7e\2"+
		"\2\u00e0\u00ed\7^\2\2\u00e1\u00e2\7j\2\2\u00e2\u00e5\7_\2\2\u00e3\u00e4"+
		"\7j\2\2\u00e4\u00e6\7`\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00ee\3\2\2\2\u00e7\u00e8\7j\2\2\u00e8\u00eb\7`\2\2\u00e9\u00ea\7j\2"+
		"\2\u00ea\u00ec\7_\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee"+
		"\3\2\2\2\u00ed\u00e1\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ee\u0114\3\2\2\2\u00ef"+
		"\u00f0\7d\2\2\u00f0\u00f1\5\24\13\2\u00f1\u00f2\7e\2\2\u00f2\u00ff\7_"+
		"\2\2\u00f3\u00f4\7j\2\2\u00f4\u00f7\7^\2\2\u00f5\u00f6\7j\2\2\u00f6\u00f8"+
		"\7`\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0100\3\2\2\2\u00f9"+
		"\u00fa\7j\2\2\u00fa\u00fd\7`\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fe\7^\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00f3"+
		"\3\2\2\2\u00ff\u00f9\3\2\2\2\u0100\u0114\3\2\2\2\u0101\u0102\7d\2\2\u0102"+
		"\u0103\5\24\13\2\u0103\u0104\7e\2\2\u0104\u0111\7`\2\2\u0105\u0106\7j"+
		"\2\2\u0106\u0109\7^\2\2\u0107\u0108\7j\2\2\u0108\u010a\7_\2\2\u0109\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0112\3\2\2\2\u010b\u010c\7j\2\2\u010c"+
		"\u010f\7_\2\2\u010d\u010e\7j\2\2\u010e\u0110\7^\2\2\u010f\u010d\3\2\2"+
		"\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u0105\3\2\2\2\u0111\u010b"+
		"\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u00dd\3\2\2\2\u0113\u00ef\3\2\2\2\u0113"+
		"\u0101\3\2\2\2\u0114\23\3\2\2\2\u0115\u0116\5\26\f\2\u0116\25\3\2\2\2"+
		"\u0117\u011f\5\30\r\2\u0118\u011b\7`\2\2\u0119\u011c\5\30\r\2\u011a\u011c"+
		"\5\b\5\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u0118\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\27\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u012a\5\32\16\2\u0123"+
		"\u0126\7_\2\2\u0124\u0127\5\32\16\2\u0125\u0127\5\b\5\2\u0126\u0124\3"+
		"\2\2\2\u0126\u0125\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0123\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\31\3\2\2"+
		"\2\u012c\u012a\3\2\2\2\u012d\u0130\5\b\5\2\u012e\u0130\5\34\17\2\u012f"+
		"\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0138\3\2\2\2\u0131\u0134\7^"+
		"\2\2\u0132\u0135\5\b\5\2\u0133\u0135\5\34\17\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0131\3\2\2\2\u0137\u013a\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\33\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013b\u013c\5\b\5\2\u013c\u013d\7]\2\2\u013d\u013e\5\b\5\2\u013e"+
		"\35\3\2\2\2\u013f\u0140\7b\2\2\u0140\u0141\7\34\2\2\u0141\u0146\7c\2\2"+
		"\u0142\u0143\7b\2\2\u0143\u0144\7&\2\2\u0144\u0146\7c\2\2\u0145\u013f"+
		"\3\2\2\2\u0145\u0142\3\2\2\2\u0146\37\3\2\2\2\u0147\u0149\7\4\2\2\u0148"+
		"\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\5Z"+
		".\2\u014b\u015e\7b\2\2\u014c\u014f\5\b\5\2\u014d\u014f\5\24\13\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0159\3\2\2\2\u0150\u0152\7^"+
		"\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0156\5\b\5\2\u0154\u0156\5\24\13\2\u0155\u0153\3\2\2\2\u0155\u0154\3"+
		"\2\2\2\u0156\u0158\3\2\2\2\u0157\u0151\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015c\u014e\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7c"+
		"\2\2\u0162!\3\2\2\2\u0163\u0164\7\5\2\2\u0164\u0165\5Z.\2\u0165\u0176"+
		"\7b\2\2\u0166\u0169\5\b\5\2\u0167\u0169\5\24\13\2\u0168\u0166\3\2\2\2"+
		"\u0168\u0167\3\2\2\2\u0169\u0171\3\2\2\2\u016a\u016d\7^\2\2\u016b\u016e"+
		"\5\b\5\2\u016c\u016e\5\24\13\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2"+
		"\u016e\u0170\3\2\2\2\u016f\u016a\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0168\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7c\2\2\u017a"+
		"#\3\2\2\2\u017b\u017c\5\\/\2\u017c\u017d\7d\2\2\u017d\u017e\5\n\6\2\u017e"+
		"\u017f\7e\2\2\u017f%\3\2\2\2\u0180\u0181\7\63\2\2\u0181\u0182\7b\2\2\u0182"+
		"\u0183\5P)\2\u0183\u0184\7c\2\2\u0184\u0185\7P\2\2\u0185\u0186\7b\2\2"+
		"\u0186\u0187\5\24\13\2\u0187\u0188\7c\2\2\u0188\u0189\7(\2\2\u0189\u018a"+
		"\7b\2\2\u018a\u018b\5\24\13\2\u018b\u018c\7c\2\2\u018c\u0196\3\2\2\2\u018d"+
		"\u018e\7b\2\2\u018e\u018f\5P)\2\u018f\u0190\7c\2\2\u0190\u0191\7]\2\2"+
		"\u0191\u0192\5\24\13\2\u0192\u0193\7\6\2\2\u0193\u0194\5\24\13\2\u0194"+
		"\u0196\3\2\2\2\u0195\u0180\3\2\2\2\u0195\u018d\3\2\2\2\u0196\'\3\2\2\2"+
		"\u0197\u0198\b\25\1\2\u0198\u0199\7b\2\2\u0199\u019a\5(\25\2\u019a\u019b"+
		"\t\2\2\2\u019b\u019c\5(\25\2\u019c\u019d\7c\2\2\u019d\u01a0\3\2\2\2\u019e"+
		"\u01a0\5*\26\2\u019f\u0197\3\2\2\2\u019f\u019e\3\2\2\2\u01a0\u01a6\3\2"+
		"\2\2\u01a1\u01a2\f\4\2\2\u01a2\u01a3\t\2\2\2\u01a3\u01a5\5(\25\5\u01a4"+
		"\u01a1\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7)\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\5\n\6\2\u01aa\u01ac"+
		"\7j\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac+\3\2\2\2\u01ad\u01b0"+
		"\5\60\31\2\u01ae\u01b0\5.\30\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2"+
		"\u01b0-\3\2\2\2\u01b1\u01b2\7r\2\2\u01b2\u01b3\b\30\1\2\u01b3/\3\2\2\2"+
		"\u01b4\u01bd\5\62\32\2\u01b5\u01b7\7h\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bc\5\62\32\2\u01bb\u01b6\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3"+
		"\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c3\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0"+
		"\u01c2\7h\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c3\u01c4\3\2\2\2\u01c4\61\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c9"+
		"\5\64\33\2\u01c7\u01c9\5@!\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9"+
		"\63\3\2\2\2\u01ca\u01cc\7V\2\2\u01cb\u01cd\7K\2\2\u01cc\u01cb\3\2\2\2"+
		"\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d3\5L\'\2\u01cf\u01d0"+
		"\7^\2\2\u01d0\u01d2\5L\'\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2"+
		"\2\2\u01d6\u01ca\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01de\5\66\34\2\u01d9\u01da\5D#\2\u01da\u01db\5\66\34\2\u01db\u01dd\3"+
		"\2\2\2\u01dc\u01d9\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01eb\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\7H"+
		"\2\2\u01e2\u01e3\7\36\2\2\u01e3\u01e8\5N(\2\u01e4\u01e5\7^\2\2\u01e5\u01e7"+
		"\5N(\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01e1\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01f3\3\2\2\2\u01ed\u01ee\7>\2\2\u01ee"+
		"\u01f1\5P)\2\u01ef\u01f0\t\3\2\2\u01f0\u01f2\5P)\2\u01f1\u01ef\3\2\2\2"+
		"\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01ed\3\2\2\2\u01f3\u01f4"+
		"\3\2\2\2\u01f4\65\3\2\2\2\u01f5\u01f7\7O\2\2\u01f6\u01f8\t\4\2\2\u01f7"+
		"\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fe\5:"+
		"\36\2\u01fa\u01fb\7^\2\2\u01fb\u01fd\5:\36\2\u01fc\u01fa\3\2\2\2\u01fd"+
		"\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0202\3\2"+
		"\2\2\u0200\u01fe\3\2\2\2\u0201\u01f5\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u020d\7/\2\2\u0204\u0209\5<\37\2\u0205\u0206\7^\2"+
		"\2\u0206\u0208\5<\37\2\u0207\u0205\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207"+
		"\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020e\3\2\2\2\u020b\u0209\3\2\2\2\u020c"+
		"\u020e\5F$\2\u020d\u0204\3\2\2\2\u020d\u020c\3\2\2\2\u020e\u0210\3\2\2"+
		"\2\u020f\u0211\58\35\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\67"+
		"\3\2\2\2\u0212\u0213\7U\2\2\u0213\u0214\5P)\2\u0214\u0223\3\2\2\2\u0215"+
		"\u0216\7\61\2\2\u0216\u0217\7\36\2\2\u0217\u021c\5P)\2\u0218\u0219\7^"+
		"\2\2\u0219\u021b\5P)\2\u021a\u0218\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u0221\3\2\2\2\u021e\u021c\3\2\2\2\u021f"+
		"\u0220\7\62\2\2\u0220\u0222\5P)\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222\u0224\3\2\2\2\u0223\u0215\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0242\3\2\2\2\u0225\u0226\7S\2\2\u0226\u0227\7b\2\2\u0227\u022c\5P)\2"+
		"\u0228\u0229\7^\2\2\u0229\u022b\5P)\2\u022a\u0228\3\2\2\2\u022b\u022e"+
		"\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022f\u023e\7c\2\2\u0230\u0231\7^\2\2\u0231\u0232\7b\2"+
		"\2\u0232\u0237\5P)\2\u0233\u0234\7^\2\2\u0234\u0236\5P)\2\u0235\u0233"+
		"\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u023a\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b\7c\2\2\u023b\u023d\3\2"+
		"\2\2\u023c\u0230\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0212\3\2"+
		"\2\2\u0241\u0225\3\2\2\2\u0242\u0274\3\2\2\2\u0243\u0244\7U\2\2\u0244"+
		"\u0246\5P)\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2"+
		"\2\u0247\u0248\7\61\2\2\u0248\u0249\7\36\2\2\u0249\u024e\5P)\2\u024a\u024b"+
		"\7^\2\2\u024b\u024d\5P)\2\u024c\u024a\3\2\2\2\u024d\u0250\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0253\3\2\2\2\u0250\u024e\3\2"+
		"\2\2\u0251\u0252\7\62\2\2\u0252\u0254\5P)\2\u0253\u0251\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0272\3\2\2\2\u0255\u0256\7S\2\2\u0256\u0257\7b\2"+
		"\2\u0257\u025c\5P)\2\u0258\u0259\7^\2\2\u0259\u025b\5P)\2\u025a\u0258"+
		"\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025f\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u026e\7c\2\2\u0260\u0261\7^\2"+
		"\2\u0261\u0262\7b\2\2\u0262\u0267\5P)\2\u0263\u0264\7^\2\2\u0264\u0266"+
		"\5P)\2\u0265\u0263\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026b\7c"+
		"\2\2\u026b\u026d\3\2\2\2\u026c\u0260\3\2\2\2\u026d\u0270\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2"+
		"\2\2\u0271\u0245\3\2\2\2\u0271\u0255\3\2\2\2\u0272\u0274\3\2\2\2\u0273"+
		"\u0241\3\2\2\2\u0273\u0271\3\2\2\2\u02749\3\2\2\2\u0275\u0282\7\7\2\2"+
		"\u0276\u0277\5d\63\2\u0277\u0278\7a\2\2\u0278\u0279\7\7\2\2\u0279\u0282"+
		"\3\2\2\2\u027a\u027f\5P)\2\u027b\u027d\7\33\2\2\u027c\u027b\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\5f\64\2\u027f\u027c\3\2"+
		"\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u0275\3\2\2\2\u0281"+
		"\u0276\3\2\2\2\u0281\u027a\3\2\2\2\u0282;\3\2\2\2\u0283\u0284\5b\62\2"+
		"\u0284\u0285\7a\2\2\u0285\u0287\3\2\2\2\u0286\u0283\3\2\2\2\u0286\u0287"+
		"\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028d\5d\63\2\u0289\u028b\7\33\2\2"+
		"\u028a\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028e"+
		"\5j\66\2\u028d\u028a\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0294\3\2\2\2\u028f"+
		"\u0290\7\66\2\2\u0290\u0291\7\36\2\2\u0291\u0295\5l\67\2\u0292\u0293\7"+
		"B\2\2\u0293\u0295\7\66\2\2\u0294\u028f\3\2\2\2\u0294\u0292\3\2\2\2\u0294"+
		"\u0295\3\2\2\2\u0295\u02b3\3\2\2\2\u0296\u02a0\7b\2\2\u0297\u029c\5<\37"+
		"\2\u0298\u0299\7^\2\2\u0299\u029b\5<\37\2\u029a\u0298\3\2\2\2\u029b\u029e"+
		"\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a1\3\2\2\2\u029e"+
		"\u029c\3\2\2\2\u029f\u02a1\5F$\2\u02a0\u0297\3\2\2\2\u02a0\u029f\3\2\2"+
		"\2\u02a1\u02a2\3\2\2\2\u02a2\u02a7\7c\2\2\u02a3\u02a5\7\33\2\2\u02a4\u02a3"+
		"\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\5j\66\2\u02a7"+
		"\u02a4\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02b3\3\2\2\2\u02a9\u02aa\7b"+
		"\2\2\u02aa\u02ab\5@!\2\u02ab\u02b0\7c\2\2\u02ac\u02ae\7\33\2\2\u02ad\u02ac"+
		"\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b1\5j\66\2\u02b0"+
		"\u02ad\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u0286\3\2"+
		"\2\2\u02b2\u0296\3\2\2\2\u02b2\u02a9\3\2\2\2\u02b3=\3\2\2\2\u02b4\u02b5"+
		"\t\5\2\2\u02b5?\3\2\2\2\u02b6\u02b8\7V\2\2\u02b7\u02b9\7K\2\2\u02b8\u02b7"+
		"\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bf\5L\'\2\u02bb"+
		"\u02bc\7^\2\2\u02bc\u02be\5L\'\2\u02bd\u02bb\3\2\2\2\u02be\u02c1\3\2\2"+
		"\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf"+
		"\3\2\2\2\u02c2\u02b6\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02ca\5B\"\2\u02c5\u02c6\5D#\2\u02c6\u02c7\5B\"\2\u02c7\u02c9\3\2\2\2"+
		"\u02c8\u02c5\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb"+
		"\3\2\2\2\u02cb\u02d7\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02ce\7H\2\2\u02ce"+
		"\u02cf\7\36\2\2\u02cf\u02d4\5N(\2\u02d0\u02d1\7^\2\2\u02d1\u02d3\5N(\2"+
		"\u02d2\u02d0\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5"+
		"\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02cd\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u02df\3\2\2\2\u02d9\u02da\7>\2\2\u02da\u02dd\5P)"+
		"\2\u02db\u02dc\t\3\2\2\u02dc\u02de\5P)\2\u02dd\u02db\3\2\2\2\u02dd\u02de"+
		"\3\2\2\2\u02de\u02e0\3\2\2\2\u02df\u02d9\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"A\3\2\2\2\u02e1\u02e3\7O\2\2\u02e2\u02e4\t\4\2\2\u02e3\u02e2\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02ea\5:\36\2\u02e6\u02e7\7^"+
		"\2\2\u02e7\u02e9\5:\36\2\u02e8\u02e6\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea"+
		"\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2"+
		"\2\2\u02ed\u02e1\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"\u02f9\7/\2\2\u02f0\u02f5\5<\37\2\u02f1\u02f2\7^\2\2\u02f2\u02f4\5<\37"+
		"\2\u02f3\u02f1\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6"+
		"\3\2\2\2\u02f6\u02fa\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02fa\5F$\2\u02f9"+
		"\u02f0\3\2\2\2\u02f9\u02f8\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02fd\58"+
		"\35\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fdC\3\2\2\2\u02fe\u0304"+
		"\7Q\2\2\u02ff\u0300\7Q\2\2\u0300\u0304\7\31\2\2\u0301\u0304\78\2\2\u0302"+
		"\u0304\7+\2\2\u0303\u02fe\3\2\2\2\u0303\u02ff\3\2\2\2\u0303\u0301\3\2"+
		"\2\2\u0303\u0302\3\2\2\2\u0304E\3\2\2\2\u0305\u030f\5<\37\2\u0306\u0309"+
		"\5H%\2\u0307\u030a\5F$\2\u0308\u030a\5<\37\2\u0309\u0307\3\2\2\2\u0309"+
		"\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\5J&\2\u030c\u030e\3\2\2"+
		"\2\u030d\u0306\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310"+
		"\3\2\2\2\u0310G\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0328\7^\2\2\u0313\u0315"+
		"\7@\2\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0324\3\2\2\2\u0316"+
		"\u0318\7<\2\2\u0317\u0319\7I\2\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2"+
		"\2\u0319\u0325\3\2\2\2\u031a\u031c\7M\2\2\u031b\u031d\7I\2\2\u031c\u031b"+
		"\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0325\3\2\2\2\u031e\u0320\7.\2\2\u031f"+
		"\u0321\7I\2\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0325\3\2"+
		"\2\2\u0322\u0325\7\67\2\2\u0323\u0325\7\"\2\2\u0324\u0316\3\2\2\2\u0324"+
		"\u031a\3\2\2\2\u0324\u031e\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0323\3\2"+
		"\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\7;\2\2\u0327"+
		"\u0312\3\2\2\2\u0327\u0314\3\2\2\2\u0328I\3\2\2\2\u0329\u032a\7F\2\2\u032a"+
		"\u0338\5P)\2\u032b\u032c\7R\2\2\u032c\u032d\7b\2\2\u032d\u0332\5h\65\2"+
		"\u032e\u032f\7^\2\2\u032f\u0331\5h\65\2\u0330\u032e\3\2\2\2\u0331\u0334"+
		"\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0335\3\2\2\2\u0334"+
		"\u0332\3\2\2\2\u0335\u0336\7c\2\2\u0336\u0338\3\2\2\2\u0337\u0329\3\2"+
		"\2\2\u0337\u032b\3\2\2\2\u0337\u0338\3\2\2\2\u0338K\3\2\2\2\u0339\u0345"+
		"\5d\63\2\u033a\u033b\7b\2\2\u033b\u0340\5h\65\2\u033c\u033d\7^\2\2\u033d"+
		"\u033f\5h\65\2\u033e\u033c\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2"+
		"\2\2\u0340\u0341\3\2\2\2\u0341\u0343\3\2\2\2\u0342\u0340\3\2\2\2\u0343"+
		"\u0344\7c\2\2\u0344\u0346\3\2\2\2\u0345\u033a\3\2\2\2\u0345\u0346\3\2"+
		"\2\2\u0346\u0347\3\2\2\2\u0347\u0348\7\33\2\2\u0348\u0349\7b\2\2\u0349"+
		"\u034a\5@!\2\u034a\u034b\7c\2\2\u034bM\3\2\2\2\u034c\u034f\5P)\2\u034d"+
		"\u034e\7!\2\2\u034e\u0350\5`\61\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2"+
		"\2\2\u0350\u0352\3\2\2\2\u0351\u0353\t\6\2\2\u0352\u0351\3\2\2\2\u0352"+
		"\u0353\3\2\2\2\u0353O\3\2\2\2\u0354\u0355\b)\1\2\u0355\u0356\5T+\2\u0356"+
		"\u0357\5P)\26\u0357\u038f\3\2\2\2\u0358\u038f\5\b\5\2\u0359\u038f\7l\2"+
		"\2\u035a\u035b\5b\62\2\u035b\u035c\7a\2\2\u035c\u035e\3\2\2\2\u035d\u035a"+
		"\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\5j\66\2\u0360"+
		"\u0361\7a\2\2\u0361\u0363\3\2\2\2\u0362\u035d\3\2\2\2\u0362\u0363\3\2"+
		"\2\2\u0363\u0364\3\2\2\2\u0364\u038f\5h\65\2\u0365\u0366\7b\2\2\u0366"+
		"\u0367\5P)\2\u0367\u0368\7c\2\2\u0368\u038f\3\2\2\2\u0369\u036a\7 \2\2"+
		"\u036a\u036b\7b\2\2\u036b\u036c\5P)\2\u036c\u036d\7\33\2\2\u036d\u036e"+
		"\5X-\2\u036e\u036f\7c\2\2\u036f\u038f\3\2\2\2\u0370\u0372\7B\2\2\u0371"+
		"\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0375\7,"+
		"\2\2\u0374\u0371\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u0377\7b\2\2\u0377\u0378\5@!\2\u0378\u0379\7c\2\2\u0379\u038f\3\2\2\2"+
		"\u037a\u037c\7\37\2\2\u037b\u037d\5P)\2\u037c\u037b\3\2\2\2\u037c\u037d"+
		"\3\2\2\2\u037d\u0383\3\2\2\2\u037e\u037f\7T\2\2\u037f\u0380\5P)\2\u0380"+
		"\u0381\7P\2\2\u0381\u0382\5P)\2\u0382\u0384\3\2\2\2\u0383\u037e\3\2\2"+
		"\2\u0384\u0385\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0389"+
		"\3\2\2\2\u0387\u0388\7(\2\2\u0388\u038a\5P)\2\u0389\u0387\3\2\2\2\u0389"+
		"\u038a\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\7)\2\2\u038c\u038f\3\2"+
		"\2\2\u038d\u038f\5t;\2\u038e\u0354\3\2\2\2\u038e\u0358\3\2\2\2\u038e\u0359"+
		"\3\2\2\2\u038e\u0362\3\2\2\2\u038e\u0365\3\2\2\2\u038e\u0369\3\2\2\2\u038e"+
		"\u0374\3\2\2\2\u038e\u037a\3\2\2\2\u038e\u038d\3\2\2\2\u038f\u03f4\3\2"+
		"\2\2\u0390\u0391\f\25\2\2\u0391\u0392\7\3\2\2\u0392\u03f3\5P)\26\u0393"+
		"\u0394\f\24\2\2\u0394\u0395\t\7\2\2\u0395\u03f3\5P)\25\u0396\u0397\f\23"+
		"\2\2\u0397\u0398\t\b\2\2\u0398\u03f3\5P)\24\u0399\u039a\f\22\2\2\u039a"+
		"\u039b\t\t\2\2\u039b\u03f3\5P)\23\u039c\u039d\f\21\2\2\u039d\u039e\t\n"+
		"\2\2\u039e\u03f3\5P)\22\u039f\u03ac\f\20\2\2\u03a0\u03ad\7\22\2\2\u03a1"+
		"\u03ad\7\23\2\2\u03a2\u03ad\7\24\2\2\u03a3\u03ad\7\25\2\2\u03a4\u03ad"+
		"\79\2\2\u03a5\u03a6\79\2\2\u03a6\u03ad\7B\2\2\u03a7\u03ad\7\65\2\2\u03a8"+
		"\u03ad\7=\2\2\u03a9\u03ad\7\60\2\2\u03aa\u03ad\7?\2\2\u03ab\u03ad\7L\2"+
		"\2\u03ac\u03a0\3\2\2\2\u03ac\u03a1\3\2\2\2\u03ac\u03a2\3\2\2\2\u03ac\u03a3"+
		"\3\2\2\2\u03ac\u03a4\3\2\2\2\u03ac\u03a5\3\2\2\2\u03ac\u03a7\3\2\2\2\u03ac"+
		"\u03a8\3\2\2\2\u03ac\u03a9\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ab\3\2"+
		"\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03f3\5P)\21\u03af\u03b0\f\17\2\2\u03b0"+
		"\u03b1\7\32\2\2\u03b1\u03f3\5P)\20\u03b2\u03b3\f\16\2\2\u03b3\u03b4\7"+
		"G\2\2\u03b4\u03f3\5P)\17\u03b5\u03b6\f\b\2\2\u03b6\u03b8\79\2\2\u03b7"+
		"\u03b9\7B\2\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\3\2"+
		"\2\2\u03ba\u03f3\5P)\t\u03bb\u03bd\f\7\2\2\u03bc\u03be\7B\2\2\u03bd\u03bc"+
		"\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\7\35\2\2"+
		"\u03c0\u03c1\5P)\2\u03c1\u03c2\7\32\2\2\u03c2\u03c3\5P)\b\u03c3\u03f3"+
		"\3\2\2\2\u03c4\u03c5\f\13\2\2\u03c5\u03c6\7!\2\2\u03c6\u03f3\5`\61\2\u03c7"+
		"\u03c9\f\n\2\2\u03c8\u03ca\7B\2\2\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2"+
		"\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\t\13\2\2\u03cc\u03cf\5P)\2\u03cd"+
		"\u03ce\7*\2\2\u03ce\u03d0\5P)\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0\3\2\2"+
		"\2\u03d0\u03f3\3\2\2\2\u03d1\u03d6\f\t\2\2\u03d2\u03d7\7:\2\2\u03d3\u03d7"+
		"\7C\2\2\u03d4\u03d5\7B\2\2\u03d5\u03d7\7D\2\2\u03d6\u03d2\3\2\2\2\u03d6"+
		"\u03d3\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d7\u03f3\3\2\2\2\u03d8\u03da\f\6"+
		"\2\2\u03d9\u03db\7B\2\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03f0\7\65\2\2\u03dd\u03e7\7b\2\2\u03de\u03e8\5@"+
		"!\2\u03df\u03e4\5P)\2\u03e0\u03e1\7^\2\2\u03e1\u03e3\5P)\2\u03e2\u03e0"+
		"\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5"+
		"\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03de\3\2\2\2\u03e7\u03df\3\2"+
		"\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03f1\7c\2\2\u03ea"+
		"\u03eb\5b\62\2\u03eb\u03ec\7a\2\2\u03ec\u03ee\3\2\2\2\u03ed\u03ea\3\2"+
		"\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f1\5d\63\2\u03f0"+
		"\u03dd\3\2\2\2\u03f0\u03ed\3\2\2\2\u03f1\u03f3\3\2\2\2\u03f2\u0390\3\2"+
		"\2\2\u03f2\u0393\3\2\2\2\u03f2\u0396\3\2\2\2\u03f2\u0399\3\2\2\2\u03f2"+
		"\u039c\3\2\2\2\u03f2\u039f\3\2\2\2\u03f2\u03af\3\2\2\2\u03f2\u03b2\3\2"+
		"\2\2\u03f2\u03b5\3\2\2\2\u03f2\u03bb\3\2\2\2\u03f2\u03c4\3\2\2\2\u03f2"+
		"\u03c7\3\2\2\2\u03f2\u03d1\3\2\2\2\u03f2\u03d8\3\2\2\2\u03f3\u03f6\3\2"+
		"\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5Q\3\2\2\2\u03f6\u03f4"+
		"\3\2\2\2\u03f7\u03f8\t\f\2\2\u03f8S\3\2\2\2\u03f9\u03fa\t\r\2\2\u03fa"+
		"U\3\2\2\2\u03fb\u03fc\5n8\2\u03fcW\3\2\2\2\u03fd\u03ff\5V,\2\u03fe\u03fd"+
		"\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401"+
		"\u040c\3\2\2\2\u0402\u0403\7b\2\2\u0403\u0404\5r:\2\u0404\u0405\7c\2\2"+
		"\u0405\u040d\3\2\2\2\u0406\u0407\7b\2\2\u0407\u0408\5r:\2\u0408\u0409"+
		"\7^\2\2\u0409\u040a\5r:\2\u040a\u040b\7c\2\2\u040b\u040d\3\2\2\2\u040c"+
		"\u0402\3\2\2\2\u040c\u0406\3\2\2\2\u040c\u040d\3\2\2\2\u040dY\3\2\2\2"+
		"\u040e\u040f\5n8\2\u040f[\3\2\2\2\u0410\u0411\5^\60\2\u0411]\3\2\2\2\u0412"+
		"\u0413\t\16\2\2\u0413_\3\2\2\2\u0414\u0415\5n8\2\u0415a\3\2\2\2\u0416"+
		"\u0417\5n8\2\u0417c\3\2\2\2\u0418\u0419\5n8\2\u0419e\3\2\2\2\u041a\u041b"+
		"\t\17\2\2\u041bg\3\2\2\2\u041c\u041d\5n8\2\u041di\3\2\2\2\u041e\u041f"+
		"\5n8\2\u041fk\3\2\2\2\u0420\u0421\5n8\2\u0421m\3\2\2\2\u0422\u0425\5>"+
		" \2\u0423\u0425\7m\2\2\u0424\u0422\3\2\2\2\u0424\u0423\3\2\2\2\u0425o"+
		"\3\2\2\2\u0426\u0427\7n\2\2\u0427q\3\2\2\2\u0428\u042a\t\b\2\2\u0429\u0428"+
		"\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\7j\2\2\u042c"+
		"s\3\2\2\2\u042d\u042e\7J\2\2\u042e\u0433\7b\2\2\u042f\u0434\7\64\2\2\u0430"+
		"\u0431\t\20\2\2\u0431\u0432\7^\2\2\u0432\u0434\5v<\2\u0433\u042f\3\2\2"+
		"\2\u0433\u0430\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0436\7c\2\2\u0436u\3"+
		"\2\2\2\u0437\u0438\7n\2\2\u0438w\3\2\2\2\u0098{\177\u0082\u0088\u008c"+
		"\u0090\u009e\u00a3\u00a6\u00ab\u00b5\u00be\u00c2\u00c7\u00db\u00e5\u00eb"+
		"\u00ed\u00f7\u00fd\u00ff\u0109\u010f\u0111\u0113\u011b\u011f\u0126\u012a"+
		"\u012f\u0134\u0138\u0145\u0148\u014e\u0151\u0155\u0159\u015e\u0168\u016d"+
		"\u0171\u0176\u0195\u019f\u01a6\u01ab\u01af\u01b8\u01bd\u01c3\u01c8\u01cc"+
		"\u01d3\u01d6\u01de\u01e8\u01eb\u01f1\u01f3\u01f7\u01fe\u0201\u0209\u020d"+
		"\u0210\u021c\u0221\u0223\u022c\u0237\u023e\u0241\u0245\u024e\u0253\u025c"+
		"\u0267\u026e\u0271\u0273\u027c\u027f\u0281\u0286\u028a\u028d\u0294\u029c"+
		"\u02a0\u02a4\u02a7\u02ad\u02b0\u02b2\u02b8\u02bf\u02c2\u02ca\u02d4\u02d7"+
		"\u02dd\u02df\u02e3\u02ea\u02ed\u02f5\u02f9\u02fc\u0303\u0309\u030f\u0314"+
		"\u0318\u031c\u0320\u0324\u0327\u0332\u0337\u0340\u0345\u034f\u0352\u035d"+
		"\u0362\u0371\u0374\u037c\u0385\u0389\u038e\u03ac\u03b8\u03bd\u03c9\u03cf"+
		"\u03d6\u03da\u03e4\u03e7\u03ed\u03f0\u03f2\u03f4\u0400\u040c\u0424\u0429"+
		"\u0433";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}