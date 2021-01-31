// Generated from /Users/tangyun/export/rule-engine/rule-core/src/main/resources/Atlas.g4 by ANTLR 4.8

    package com.tencent.atlas.antlr;

import com.tencent.atlas.feature.org.antlr.v4.runtime.atn.*;
import com.tencent.atlas.feature.org.antlr.v4.runtime.dfa.DFA;
import com.tencent.atlas.feature.org.antlr.v4.runtime.*;
import com.tencent.atlas.feature.org.antlr.v4.runtime.misc.*;
import com.tencent.atlas.feature.org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AtlasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17,
		T__17=18, NULL_LITERAL=19, NULL_SPEC_LITERAL=20, AND=21, CASE=22, IF=23,
		ELSE=24, WHEN=25, THEN=26, END=27, OR=28, IS=29, NOT=30, REGEXP=31, LIKE=32,
		RLIKE=33, STRING_LITERAL=34, DECIMAL_LITERAL=35, HEXADECIMAL_LITERAL=36,
		IN=37, TRUE=38, FALSE=39, FROM=40, FOR=41, ESCAPE=42, IDENTIFIER=43, SUBSTR=44,
		SUBSTRING=45, CHAR_LENGTH=46, ZERO_DECIMAL=47, ONE_DECIMAL=48, TWO_DECIMAL=49,
		DOT=50, LR_BRACKET=51, RR_BRACKET=52, COMMA=53, SPACE=54;
	public static final int
		RULE_expressions = 0, RULE_expression = 1, RULE_predicate = 2, RULE_expressionAtom = 3,
		RULE_functionCall = 4, RULE_specificFunction = 5, RULE_caseFuncAlternative = 6,
		RULE_functionArgs = 7, RULE_functionArg = 8, RULE_constant = 9, RULE_stringLiteral = 10,
		RULE_booleanLiteral = 11, RULE_hexadecimalLiteral = 12, RULE_decimalLiteral = 13,
		RULE_floatLiteral = 14, RULE_nullNotnull = 15, RULE_unaryOperator = 16,
		RULE_comparisonOperator = 17, RULE_logicalOperator = 18, RULE_bitOperator = 19,
		RULE_mathOperator = 20, RULE_dataview = 21, RULE_feature = 22, RULE_attribute = 23,
		RULE_fullId = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"expressions", "expression", "predicate", "expressionAtom", "functionCall",
			"specificFunction", "caseFuncAlternative", "functionArgs", "functionArg",
			"constant", "stringLiteral", "booleanLiteral", "hexadecimalLiteral",
			"decimalLiteral", "floatLiteral", "nullNotnull", "unaryOperator", "comparisonOperator",
			"logicalOperator", "bitOperator", "mathOperator", "dataview", "feature",
			"attribute", "fullId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'NOT'", "'not'", "'!'", "'-'", "'~'", "'+'", "'='", "'>'", "'<'",
			"'&'", "'|'", "'^'", "'*'", "'/'", "'%'", "'@@'", "'**'", "'$$'", null,
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, "'0'", "'1'", "'2'", "'.'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, "NULL_LITERAL", "NULL_SPEC_LITERAL",
			"AND", "CASE", "IF", "ELSE", "WHEN", "THEN", "END", "OR", "IS", "NOT",
			"REGEXP", "LIKE", "RLIKE", "STRING_LITERAL", "DECIMAL_LITERAL", "HEXADECIMAL_LITERAL",
			"IN", "TRUE", "FALSE", "FROM", "FOR", "ESCAPE", "IDENTIFIER", "SUBSTR",
			"SUBSTRING", "CHAR_LENGTH", "ZERO_DECIMAL", "ONE_DECIMAL", "TWO_DECIMAL",
			"DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", "SPACE"
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
	public String getGrammarFileName() { return "Atlas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AtlasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AtlasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AtlasParser.COMMA, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			expression(0);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(51);
				match(COMMA);
				setState(52);
				expression(0);
				}
				}
				setState(57);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }

		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IsExpressionContext extends ExpressionContext {
		public Token isOrNot;
		public Token testValue;
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode IS() { return getToken(AtlasParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(AtlasParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AtlasParser.FALSE, 0); }
		public IsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterIsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitIsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitIsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public Token notOperator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicateExpressionContext extends ExpressionContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicateExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterPredicateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitPredicateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitPredicateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(59);
				((NotExpressionContext)_localctx).notOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
					((NotExpressionContext)_localctx).notOperator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(60);
				expression(4);
				}
				break;
			case 2:
				{
				_localctx = new IsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				predicate(0);
				setState(62);
				match(IS);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==T__1) {
					{
					setState(63);
					((IsExpressionContext)_localctx).isOrNot = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
						((IsExpressionContext)_localctx).isOrNot = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(66);
				((IsExpressionContext)_localctx).testValue = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((IsExpressionContext)_localctx).testValue = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				_localctx = new PredicateExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				predicate(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=com.tencent.atlas.feature.org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(71);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(72);
					logicalOperator();
					setState(73);
					expression(4);
					}
					}
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }

		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionAtomPredicateContext extends PredicateContext {
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public ExpressionAtomPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterExpressionAtomPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitExpressionAtomPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitExpressionAtomPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InPredicateContext extends PredicateContext {
		public Token isOrNot;
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode IN() { return getToken(AtlasParser.IN, 0); }
		public TerminalNode LR_BRACKET() { return getToken(AtlasParser.LR_BRACKET, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(AtlasParser.RR_BRACKET, 0); }
		public InPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterInPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitInPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryComparasionPredicateContext extends PredicateContext {
		public PredicateContext left;
		public PredicateContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public BinaryComparasionPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterBinaryComparasionPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitBinaryComparasionPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitBinaryComparasionPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsNullPredicateContext extends PredicateContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode IS() { return getToken(AtlasParser.IS, 0); }
		public NullNotnullContext nullNotnull() {
			return getRuleContext(NullNotnullContext.class,0);
		}
		public IsNullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterIsNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitIsNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitIsNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikePredicateContext extends PredicateContext {
		public Token isOrNot;
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(AtlasParser.LIKE, 0); }
		public TerminalNode ESCAPE() { return getToken(AtlasParser.ESCAPE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AtlasParser.STRING_LITERAL, 0); }
		public LikePredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterLikePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitLikePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitLikePredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegexpPredicateContext extends PredicateContext {
		public Token isOrNot;
		public Token regex;
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode REGEXP() { return getToken(AtlasParser.REGEXP, 0); }
		public TerminalNode RLIKE() { return getToken(AtlasParser.RLIKE, 0); }
		public RegexpPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterRegexpPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitRegexpPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitRegexpPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		return predicate(0);
	}

	private PredicateContext predicate(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PredicateContext _localctx = new PredicateContext(_ctx, _parentState);
		PredicateContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExpressionAtomPredicateContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(81);
			expressionAtom(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=com.tencent.atlas.feature.org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryComparasionPredicateContext(new PredicateContext(_parentctx, _parentState));
						((BinaryComparasionPredicateContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(83);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(84);
						comparisonOperator();
						setState(85);
						((BinaryComparasionPredicateContext)_localctx).right = predicate(5);
						}
						break;
					case 2:
						{
						_localctx = new RegexpPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(87);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(89);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__0 || _la==T__1) {
							{
							setState(88);
							((RegexpPredicateContext)_localctx).isOrNot = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==T__0 || _la==T__1) ) {
								((RegexpPredicateContext)_localctx).isOrNot = (Token)_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(91);
						((RegexpPredicateContext)_localctx).regex = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==REGEXP || _la==RLIKE) ) {
							((RegexpPredicateContext)_localctx).regex = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(92);
						predicate(3);
						}
						break;
					case 3:
						{
						_localctx = new InPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(93);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(95);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__0 || _la==T__1) {
							{
							setState(94);
							((InPredicateContext)_localctx).isOrNot = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==T__0 || _la==T__1) ) {
								((InPredicateContext)_localctx).isOrNot = (Token)_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(97);
						match(IN);
						setState(98);
						match(LR_BRACKET);
						setState(99);
						expressions();
						setState(100);
						match(RR_BRACKET);
						}
						break;
					case 4:
						{
						_localctx = new IsNullPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(102);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(103);
						match(IS);
						setState(104);
						nullNotnull();
						}
						break;
					case 5:
						{
						_localctx = new LikePredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(105);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(107);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__0 || _la==T__1) {
							{
							setState(106);
							((LikePredicateContext)_localctx).isOrNot = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==T__0 || _la==T__1) ) {
								((LikePredicateContext)_localctx).isOrNot = (Token)_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(109);
						match(LIKE);
						setState(110);
						predicate(0);
						setState(113);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(111);
							match(ESCAPE);
							setState(112);
							match(STRING_LITERAL);
							}
							break;
						}
						}
						break;
					}
					}
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ExpressionAtomContext extends ParserRuleContext {
		public ExpressionAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAtom; }

		public ExpressionAtomContext() { }
		public void copyFrom(ExpressionAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryExpressionAtomContext extends ExpressionAtomContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public UnaryExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterUnaryExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitUnaryExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitUnaryExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeExpressionAtomContext extends ExpressionAtomContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributeExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterAttributeExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitAttributeExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitAttributeExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantExpressionAtomContext extends ExpressionAtomContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterConstantExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitConstantExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitConstantExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionAtomContext extends ExpressionAtomContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterFunctionCallExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitFunctionCallExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitFunctionCallExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitExpressionAtomContext extends ExpressionAtomContext {
		public ExpressionAtomContext left;
		public ExpressionAtomContext right;
		public BitOperatorContext bitOperator() {
			return getRuleContext(BitOperatorContext.class,0);
		}
		public List<ExpressionAtomContext> expressionAtom() {
			return getRuleContexts(ExpressionAtomContext.class);
		}
		public ExpressionAtomContext expressionAtom(int i) {
			return getRuleContext(ExpressionAtomContext.class,i);
		}
		public BitExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterBitExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitBitExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitBitExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FeatureExpressionAtomContext extends ExpressionAtomContext {
		public FeatureContext feature() {
			return getRuleContext(FeatureContext.class,0);
		}
		public FeatureExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterFeatureExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitFeatureExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitFeatureExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedExpressionAtomContext extends ExpressionAtomContext {
		public TerminalNode LR_BRACKET() { return getToken(AtlasParser.LR_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(AtlasParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AtlasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AtlasParser.COMMA, i);
		}
		public NestedExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterNestedExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitNestedExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitNestedExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExpressionAtomContext extends ExpressionAtomContext {
		public ExpressionAtomContext left;
		public ExpressionAtomContext right;
		public MathOperatorContext mathOperator() {
			return getRuleContext(MathOperatorContext.class,0);
		}
		public List<ExpressionAtomContext> expressionAtom() {
			return getRuleContexts(ExpressionAtomContext.class);
		}
		public ExpressionAtomContext expressionAtom(int i) {
			return getRuleContext(ExpressionAtomContext.class,i);
		}
		public MathExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterMathExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitMathExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitMathExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAtomContext expressionAtom() throws RecognitionException {
		return expressionAtom(0);
	}

	private ExpressionAtomContext expressionAtom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionAtomContext _localctx = new ExpressionAtomContext(_ctx, _parentState);
		ExpressionAtomContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressionAtom, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(121);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new FeatureExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				feature();
				}
				break;
			case 3:
				{
				_localctx = new AttributeExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				attribute();
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				functionCall();
				}
				break;
			case 5:
				{
				_localctx = new UnaryExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				unaryOperator();
				setState(126);
				expressionAtom(4);
				}
				break;
			case 6:
				{
				_localctx = new NestedExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(LR_BRACKET);
				setState(129);
				expression(0);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(130);
					match(COMMA);
					setState(131);
					expression(0);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(RR_BRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=com.tencent.atlas.feature.org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new BitExpressionAtomContext(new ExpressionAtomContext(_parentctx, _parentState));
						((BitExpressionAtomContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(141);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(142);
						bitOperator();
						setState(143);
						((BitExpressionAtomContext)_localctx).right = expressionAtom(3);
						}
						break;
					case 2:
						{
						_localctx = new MathExpressionAtomContext(new ExpressionAtomContext(_parentctx, _parentState));
						((MathExpressionAtomContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(145);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(146);
						mathOperator();
						setState(147);
						((MathExpressionAtomContext)_localctx).right = expressionAtom(2);
						}
						break;
					}
					}
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }

		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SpecificFunctionCallContext extends FunctionCallContext {
		public SpecificFunctionContext specificFunction() {
			return getRuleContext(SpecificFunctionContext.class,0);
		}
		public SpecificFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterSpecificFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitSpecificFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitSpecificFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UdfFunctionCallContext extends FunctionCallContext {
		public FullIdContext fullId() {
			return getRuleContext(FullIdContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(AtlasParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(AtlasParser.RR_BRACKET, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public UdfFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterUdfFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitUdfFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitUdfFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataviewFunctionCallContext extends FunctionCallContext {
		public DataviewContext dataview() {
			return getRuleContext(DataviewContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(AtlasParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(AtlasParser.RR_BRACKET, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public DataviewFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterDataviewFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitDataviewFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitDataviewFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionCall);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case IF:
			case SUBSTR:
			case SUBSTRING:
			case CHAR_LENGTH:
				_localctx = new SpecificFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				specificFunction();
				}
				break;
			case IDENTIFIER:
				_localctx = new UdfFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				fullId();
				setState(156);
				match(LR_BRACKET);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NULL_LITERAL) | (1L << NULL_SPEC_LITERAL) | (1L << CASE) | (1L << IF) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << DECIMAL_LITERAL) | (1L << HEXADECIMAL_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER) | (1L << SUBSTR) | (1L << SUBSTRING) | (1L << CHAR_LENGTH) | (1L << ZERO_DECIMAL) | (1L << ONE_DECIMAL) | (1L << TWO_DECIMAL) | (1L << LR_BRACKET))) != 0)) {
					{
					setState(157);
					functionArgs();
					}
				}

				setState(160);
				match(RR_BRACKET);
				}
				break;
			case T__15:
				_localctx = new DataviewFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				dataview();
				setState(163);
				match(LR_BRACKET);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NULL_LITERAL) | (1L << NULL_SPEC_LITERAL) | (1L << CASE) | (1L << IF) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << DECIMAL_LITERAL) | (1L << HEXADECIMAL_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER) | (1L << SUBSTR) | (1L << SUBSTRING) | (1L << CHAR_LENGTH) | (1L << ZERO_DECIMAL) | (1L << ONE_DECIMAL) | (1L << TWO_DECIMAL) | (1L << LR_BRACKET))) != 0)) {
					{
					setState(164);
					functionArgs();
					}
				}

				setState(167);
				match(RR_BRACKET);
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

	public static class SpecificFunctionContext extends ParserRuleContext {
		public SpecificFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specificFunction; }

		public SpecificFunctionContext() { }
		public void copyFrom(SpecificFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetLengthFunctionCallContext extends SpecificFunctionContext {
		public ExpressionContext sourceExpression;
		public TerminalNode CHAR_LENGTH() { return getToken(AtlasParser.CHAR_LENGTH, 0); }
		public TerminalNode LR_BRACKET() { return getToken(AtlasParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(AtlasParser.RR_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GetLengthFunctionCallContext(SpecificFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterGetLengthFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitGetLengthFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitGetLengthFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseFunctionCallContext extends SpecificFunctionContext {
		public FunctionArgContext elseArg;
		public TerminalNode CASE() { return getToken(AtlasParser.CASE, 0); }
		public TerminalNode END() { return getToken(AtlasParser.END, 0); }
		public List<CaseFuncAlternativeContext> caseFuncAlternative() {
			return getRuleContexts(CaseFuncAlternativeContext.class);
		}
		public CaseFuncAlternativeContext caseFuncAlternative(int i) {
			return getRuleContext(CaseFuncAlternativeContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AtlasParser.ELSE, 0); }
		public FunctionArgContext functionArg() {
			return getRuleContext(FunctionArgContext.class,0);
		}
		public CaseFunctionCallContext(SpecificFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterCaseFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitCaseFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitCaseFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfFunctionCallContext extends SpecificFunctionContext {
		public FunctionArgContext ifconsequent;
		public FunctionArgContext elseconsequent;
		public List<TerminalNode> IF() { return getTokens(AtlasParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(AtlasParser.IF, i);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode THEN() { return getToken(AtlasParser.THEN, 0); }
		public TerminalNode END() { return getToken(AtlasParser.END, 0); }
		public List<FunctionArgContext> functionArg() {
			return getRuleContexts(FunctionArgContext.class);
		}
		public FunctionArgContext functionArg(int i) {
			return getRuleContext(FunctionArgContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AtlasParser.ELSE, 0); }
		public IfFunctionCallContext(SpecificFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterIfFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitIfFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitIfFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstrFunctionCallContext extends SpecificFunctionContext {
		public StringLiteralContext sourceString;
		public ExpressionContext sourceExpression;
		public DecimalLiteralContext fromDecimal;
		public ExpressionContext fromExpression;
		public DecimalLiteralContext forDecimal;
		public ExpressionContext forExpression;
		public TerminalNode LR_BRACKET() { return getToken(AtlasParser.LR_BRACKET, 0); }
		public TerminalNode FROM() { return getToken(AtlasParser.FROM, 0); }
		public TerminalNode RR_BRACKET() { return getToken(AtlasParser.RR_BRACKET, 0); }
		public TerminalNode SUBSTR() { return getToken(AtlasParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(AtlasParser.SUBSTRING, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<DecimalLiteralContext> decimalLiteral() {
			return getRuleContexts(DecimalLiteralContext.class);
		}
		public DecimalLiteralContext decimalLiteral(int i) {
			return getRuleContext(DecimalLiteralContext.class,i);
		}
		public TerminalNode FOR() { return getToken(AtlasParser.FOR, 0); }
		public SubstrFunctionCallContext(SpecificFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterSubstrFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitSubstrFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitSubstrFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecificFunctionContext specificFunction() throws RecognitionException {
		SpecificFunctionContext _localctx = new SpecificFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_specificFunction);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBSTR:
			case SUBSTRING:
				_localctx = new SubstrFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				match(LR_BRACKET);
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(173);
					((SubstrFunctionCallContext)_localctx).sourceString = stringLiteral();
					}
					break;
				case 2:
					{
					setState(174);
					((SubstrFunctionCallContext)_localctx).sourceExpression = expression(0);
					}
					break;
				}
				setState(177);
				match(FROM);
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(178);
					((SubstrFunctionCallContext)_localctx).fromDecimal = decimalLiteral();
					}
					break;
				case 2:
					{
					setState(179);
					((SubstrFunctionCallContext)_localctx).fromExpression = expression(0);
					}
					break;
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(182);
					match(FOR);
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(183);
						((SubstrFunctionCallContext)_localctx).forDecimal = decimalLiteral();
						}
						break;
					case 2:
						{
						setState(184);
						((SubstrFunctionCallContext)_localctx).forExpression = expression(0);
						}
						break;
					}
					}
				}

				setState(189);
				match(RR_BRACKET);
				}
				break;
			case CHAR_LENGTH:
				_localctx = new GetLengthFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(CHAR_LENGTH);
				setState(192);
				match(LR_BRACKET);
				setState(193);
				((GetLengthFunctionCallContext)_localctx).sourceExpression = expression(0);
				setState(194);
				match(RR_BRACKET);
				}
				break;
			case CASE:
				_localctx = new CaseFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(CASE);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(197);
					caseFuncAlternative();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(202);
					match(ELSE);
					setState(203);
					((CaseFunctionCallContext)_localctx).elseArg = functionArg();
					}
				}

				setState(206);
				match(END);
				}
				break;
			case IF:
				_localctx = new IfFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(IF);
				setState(209);
				predicate(0);
				setState(210);
				match(THEN);
				setState(211);
				((IfFunctionCallContext)_localctx).ifconsequent = functionArg();
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(212);
					match(ELSE);
					setState(213);
					((IfFunctionCallContext)_localctx).elseconsequent = functionArg();
					}
				}

				setState(216);
				match(END);
				setState(217);
				match(IF);
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

	public static class CaseFuncAlternativeContext extends ParserRuleContext {
		public PredicateContext condition;
		public FunctionArgContext consequent;
		public TerminalNode WHEN() { return getToken(AtlasParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(AtlasParser.THEN, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public FunctionArgContext functionArg() {
			return getRuleContext(FunctionArgContext.class,0);
		}
		public CaseFuncAlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseFuncAlternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterCaseFuncAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitCaseFuncAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitCaseFuncAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseFuncAlternativeContext caseFuncAlternative() throws RecognitionException {
		CaseFuncAlternativeContext _localctx = new CaseFuncAlternativeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_caseFuncAlternative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(WHEN);
			setState(222);
			((CaseFuncAlternativeContext)_localctx).condition = predicate(0);
			setState(223);
			match(THEN);
			setState(224);
			((CaseFuncAlternativeContext)_localctx).consequent = functionArg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgsContext extends ParserRuleContext {
		public List<FunctionArgContext> functionArg() {
			return getRuleContexts(FunctionArgContext.class);
		}
		public FunctionArgContext functionArg(int i) {
			return getRuleContext(FunctionArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AtlasParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AtlasParser.COMMA, i);
		}
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterFunctionArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitFunctionArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitFunctionArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			functionArg();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(227);
				match(COMMA);
				setState(228);
				functionArg();
				}
				}
				setState(233);
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

	public static class FunctionArgContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FeatureContext feature() {
			return getRuleContext(FeatureContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterFunctionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitFunctionArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitFunctionArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgContext functionArg() throws RecognitionException {
		FunctionArgContext _localctx = new FunctionArgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionArg);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				feature();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				attribute();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				expression(0);
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

	public static class ConstantContext extends ParserRuleContext {
		public Token nullLiteral;
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public HexadecimalLiteralContext hexadecimalLiteral() {
			return getRuleContext(HexadecimalLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode NULL_LITERAL() { return getToken(AtlasParser.NULL_LITERAL, 0); }
		public TerminalNode NULL_SPEC_LITERAL() { return getToken(AtlasParser.NULL_SPEC_LITERAL, 0); }
		public TerminalNode NOT() { return getToken(AtlasParser.NOT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constant);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				stringLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				decimalLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				floatLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(T__3);
				setState(245);
				decimalLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				hexadecimalLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				booleanLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(248);
					match(NOT);
					}
				}

				setState(251);
				((ConstantContext)_localctx).nullLiteral = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL_LITERAL || _la==NULL_SPEC_LITERAL) ) {
					((ConstantContext)_localctx).nullLiteral = (Token)_errHandler.recoverInline(this);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(AtlasParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(AtlasParser.STRING_LITERAL, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stringLiteral);
		try {
			int _alt;
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(254);
				match(STRING_LITERAL);
				}
				setState(256);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(255);
						match(STRING_LITERAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(258);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=com.tencent.atlas.feature.org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(STRING_LITERAL);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(AtlasParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AtlasParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
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

	public static class HexadecimalLiteralContext extends ParserRuleContext {
		public TerminalNode HEXADECIMAL_LITERAL() { return getToken(AtlasParser.HEXADECIMAL_LITERAL, 0); }
		public HexadecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterHexadecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitHexadecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitHexadecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalLiteralContext hexadecimalLiteral() throws RecognitionException {
		HexadecimalLiteralContext _localctx = new HexadecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hexadecimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(HEXADECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(AtlasParser.DECIMAL_LITERAL, 0); }
		public TerminalNode ZERO_DECIMAL() { return getToken(AtlasParser.ZERO_DECIMAL, 0); }
		public TerminalNode ONE_DECIMAL() { return getToken(AtlasParser.ONE_DECIMAL, 0); }
		public TerminalNode TWO_DECIMAL() { return getToken(AtlasParser.TWO_DECIMAL, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_decimalLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << ZERO_DECIMAL) | (1L << ONE_DECIMAL) | (1L << TWO_DECIMAL))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public List<DecimalLiteralContext> decimalLiteral() {
			return getRuleContexts(DecimalLiteralContext.class);
		}
		public DecimalLiteralContext decimalLiteral(int i) {
			return getRuleContext(DecimalLiteralContext.class,i);
		}
		public TerminalNode DOT() { return getToken(AtlasParser.DOT, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			decimalLiteral();
			setState(270);
			match(DOT);
			setState(271);
			decimalLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullNotnullContext extends ParserRuleContext {
		public Token isOrNot;
		public TerminalNode NULL_LITERAL() { return getToken(AtlasParser.NULL_LITERAL, 0); }
		public TerminalNode NULL_SPEC_LITERAL() { return getToken(AtlasParser.NULL_SPEC_LITERAL, 0); }
		public NullNotnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullNotnull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterNullNotnull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitNullNotnull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitNullNotnull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullNotnullContext nullNotnull() throws RecognitionException {
		NullNotnullContext _localctx = new NullNotnullContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nullNotnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(273);
				((NullNotnullContext)_localctx).isOrNot = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
					((NullNotnullContext)_localctx).isOrNot = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(276);
			_la = _input.LA(1);
			if ( !(_la==NULL_LITERAL || _la==NULL_SPEC_LITERAL) ) {
			_errHandler.recoverInline(this);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(AtlasParser.NOT, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparisonOperator);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(T__8);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				match(T__8);
				setState(284);
				match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				match(T__7);
				setState(286);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				match(T__8);
				setState(288);
				match(T__7);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(289);
				match(T__2);
				setState(290);
				match(T__6);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(291);
				match(T__8);
				setState(292);
				match(T__6);
				setState(293);
				match(T__7);
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

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(AtlasParser.AND, 0); }
		public TerminalNode OR() { return getToken(AtlasParser.OR, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logicalOperator);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(AND);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(T__9);
				setState(298);
				match(T__9);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(OR);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				match(T__10);
				setState(301);
				match(T__10);
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

	public static class BitOperatorContext extends ParserRuleContext {
		public BitOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterBitOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitBitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitBitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitOperatorContext bitOperator() throws RecognitionException {
		BitOperatorContext _localctx = new BitOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bitOperator);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(T__8);
				setState(305);
				match(T__8);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(T__7);
				setState(307);
				match(T__7);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(T__9);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				match(T__11);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				match(T__10);
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

	public static class MathOperatorContext extends ParserRuleContext {
		public MathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterMathOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitMathOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitMathOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOperatorContext mathOperator() throws RecognitionException {
		MathOperatorContext _localctx = new MathOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mathOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class DataviewContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENTIFIER() { return getToken(AtlasParser.IDENTIFIER, 0); }
		public DataviewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataview; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterDataview(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitDataview(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitDataview(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataviewContext dataview() throws RecognitionException {
		DataviewContext _localctx = new DataviewContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dataview);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__15);
			setState(316);
			((DataviewContext)_localctx).name = match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeatureContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENTIFIER() { return getToken(AtlasParser.IDENTIFIER, 0); }
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_feature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(T__16);
			setState(319);
			((FeatureContext)_localctx).name = match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
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
		public Token name;
		public TerminalNode IDENTIFIER() { return getToken(AtlasParser.IDENTIFIER, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__17);
			setState(322);
			((AttributeContext)_localctx).name = match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullIdContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENTIFIER() { return getToken(AtlasParser.IDENTIFIER, 0); }
		public FullIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).enterFullId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtlasListener ) ((AtlasListener)listener).exitFullId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AtlasVisitor ) return ((AtlasVisitor<? extends T>)visitor).visitFullId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullIdContext fullId() throws RecognitionException {
		FullIdContext _localctx = new FullIdContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fullId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			((FullIdContext)_localctx).name = match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
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
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 2:
			return predicate_sempred((PredicateContext)_localctx, predIndex);
		case 3:
			return expressionAtom_sempred((ExpressionAtomContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean predicate_sempred(PredicateContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expressionAtom_sempred(ExpressionAtomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0149\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3C\n\3\3\3\3\3\3\3\5\3H\n\3\3\3\3\3\3\3\3\3\7\3N\n\3\f\3\16\3Q\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\\\n\4\3\4\3\4\3\4\3\4\5\4b\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\4\3\4\3\4\3\4\5"+
		"\4t\n\4\7\4v\n\4\f\4\16\4y\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5\u0087\n\5\f\5\16\5\u008a\13\5\3\5\3\5\5\5\u008e\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0098\n\5\f\5\16\5\u009b\13\5\3\6\3\6"+
		"\3\6\3\6\5\6\u00a1\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a8\n\6\3\6\3\6\5\6\u00ac"+
		"\n\6\3\7\3\7\3\7\3\7\5\7\u00b2\n\7\3\7\3\7\3\7\5\7\u00b7\n\7\3\7\3\7\3"+
		"\7\5\7\u00bc\n\7\5\7\u00be\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7"+
		"\u00c9\n\7\r\7\16\7\u00ca\3\7\3\7\5\7\u00cf\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00d9\n\7\3\7\3\7\3\7\5\7\u00de\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\7\t\u00e8\n\t\f\t\16\t\u00eb\13\t\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00f2\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00fc\n\13\3\13"+
		"\5\13\u00ff\n\13\3\f\3\f\6\f\u0103\n\f\r\f\16\f\u0104\3\f\5\f\u0108\n"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\5\21\u0115\n\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0129\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0131\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u013a\n\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\2\5\4"+
		"\6\b\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\13\3\2"+
		"\3\5\3\2\3\4\3\2()\4\2!!##\3\2./\3\2\25\26\4\2%%\61\63\4\2\5\b  \5\2\6"+
		"\6\b\b\17\21\2\u0170\2\64\3\2\2\2\4G\3\2\2\2\6R\3\2\2\2\b\u008d\3\2\2"+
		"\2\n\u00ab\3\2\2\2\f\u00dd\3\2\2\2\16\u00df\3\2\2\2\20\u00e4\3\2\2\2\22"+
		"\u00f1\3\2\2\2\24\u00fe\3\2\2\2\26\u0107\3\2\2\2\30\u0109\3\2\2\2\32\u010b"+
		"\3\2\2\2\34\u010d\3\2\2\2\36\u010f\3\2\2\2 \u0114\3\2\2\2\"\u0118\3\2"+
		"\2\2$\u0128\3\2\2\2&\u0130\3\2\2\2(\u0139\3\2\2\2*\u013b\3\2\2\2,\u013d"+
		"\3\2\2\2.\u0140\3\2\2\2\60\u0143\3\2\2\2\62\u0146\3\2\2\2\649\5\4\3\2"+
		"\65\66\7\67\2\2\668\5\4\3\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2"+
		"\2\2:\3\3\2\2\2;9\3\2\2\2<=\b\3\1\2=>\t\2\2\2>H\5\4\3\6?@\5\6\4\2@B\7"+
		"\37\2\2AC\t\3\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\t\4\2\2EH\3\2\2\2FH"+
		"\5\6\4\2G<\3\2\2\2G?\3\2\2\2GF\3\2\2\2HO\3\2\2\2IJ\f\5\2\2JK\5&\24\2K"+
		"L\5\4\3\6LN\3\2\2\2MI\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\5\3\2\2\2"+
		"QO\3\2\2\2RS\b\4\1\2ST\5\b\5\2Tw\3\2\2\2UV\f\6\2\2VW\5$\23\2WX\5\6\4\7"+
		"Xv\3\2\2\2Y[\f\4\2\2Z\\\t\3\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\t\5"+
		"\2\2^v\5\6\4\5_a\f\b\2\2`b\t\3\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\'"+
		"\2\2de\7\65\2\2ef\5\2\2\2fg\7\66\2\2gv\3\2\2\2hi\f\7\2\2ij\7\37\2\2jv"+
		"\5 \21\2km\f\5\2\2ln\t\3\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\"\2\2p"+
		"s\5\6\4\2qr\7,\2\2rt\7$\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2uU\3\2\2\2uY"+
		"\3\2\2\2u_\3\2\2\2uh\3\2\2\2uk\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x"+
		"\7\3\2\2\2yw\3\2\2\2z{\b\5\1\2{\u008e\5\24\13\2|\u008e\5.\30\2}\u008e"+
		"\5\60\31\2~\u008e\5\n\6\2\177\u0080\5\"\22\2\u0080\u0081\5\b\5\6\u0081"+
		"\u008e\3\2\2\2\u0082\u0083\7\65\2\2\u0083\u0088\5\4\3\2\u0084\u0085\7"+
		"\67\2\2\u0085\u0087\5\4\3\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008c\7\66\2\2\u008c\u008e\3\2\2\2\u008dz\3\2\2\2\u008d|\3"+
		"\2\2\2\u008d}\3\2\2\2\u008d~\3\2\2\2\u008d\177\3\2\2\2\u008d\u0082\3\2"+
		"\2\2\u008e\u0099\3\2\2\2\u008f\u0090\f\4\2\2\u0090\u0091\5(\25\2\u0091"+
		"\u0092\5\b\5\5\u0092\u0098\3\2\2\2\u0093\u0094\f\3\2\2\u0094\u0095\5*"+
		"\26\2\u0095\u0096\5\b\5\4\u0096\u0098\3\2\2\2\u0097\u008f\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\t\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00ac\5\f\7\2\u009d\u009e"+
		"\5\62\32\2\u009e\u00a0\7\65\2\2\u009f\u00a1\5\20\t\2\u00a0\u009f\3\2\2"+
		"\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\66\2\2\u00a3"+
		"\u00ac\3\2\2\2\u00a4\u00a5\5,\27\2\u00a5\u00a7\7\65\2\2\u00a6\u00a8\5"+
		"\20\t\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\7\66\2\2\u00aa\u00ac\3\2\2\2\u00ab\u009c\3\2\2\2\u00ab\u009d\3"+
		"\2\2\2\u00ab\u00a4\3\2\2\2\u00ac\13\3\2\2\2\u00ad\u00ae\t\6\2\2\u00ae"+
		"\u00b1\7\65\2\2\u00af\u00b2\5\26\f\2\u00b0\u00b2\5\4\3\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\7*\2\2\u00b4"+
		"\u00b7\5\34\17\2\u00b5\u00b7\5\4\3\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3"+
		"\2\2\2\u00b7\u00bd\3\2\2\2\u00b8\u00bb\7+\2\2\u00b9\u00bc\5\34\17\2\u00ba"+
		"\u00bc\5\4\3\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\7\66\2\2\u00c0\u00de\3\2\2\2\u00c1\u00c2\7\60\2\2\u00c2\u00c3\7"+
		"\65\2\2\u00c3\u00c4\5\4\3\2\u00c4\u00c5\7\66\2\2\u00c5\u00de\3\2\2\2\u00c6"+
		"\u00c8\7\30\2\2\u00c7\u00c9\5\16\b\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00cd\7\32\2\2\u00cd\u00cf\5\22\n\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\35\2\2\u00d1\u00de\3\2\2\2\u00d2"+
		"\u00d3\7\31\2\2\u00d3\u00d4\5\6\4\2\u00d4\u00d5\7\34\2\2\u00d5\u00d8\5"+
		"\22\n\2\u00d6\u00d7\7\32\2\2\u00d7\u00d9\5\22\n\2\u00d8\u00d6\3\2\2\2"+
		"\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\35\2\2\u00db\u00dc"+
		"\7\31\2\2\u00dc\u00de\3\2\2\2\u00dd\u00ad\3\2\2\2\u00dd\u00c1\3\2\2\2"+
		"\u00dd\u00c6\3\2\2\2\u00dd\u00d2\3\2\2\2\u00de\r\3\2\2\2\u00df\u00e0\7"+
		"\33\2\2\u00e0\u00e1\5\6\4\2\u00e1\u00e2\7\34\2\2\u00e2\u00e3\5\22\n\2"+
		"\u00e3\17\3\2\2\2\u00e4\u00e9\5\22\n\2\u00e5\u00e6\7\67\2\2\u00e6\u00e8"+
		"\5\22\n\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2"+
		"\u00e9\u00ea\3\2\2\2\u00ea\21\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f2"+
		"\5\24\13\2\u00ed\u00f2\5.\30\2\u00ee\u00f2\5\60\31\2\u00ef\u00f2\5\n\6"+
		"\2\u00f0\u00f2\5\4\3\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\23\3\2\2\2\u00f3"+
		"\u00ff\5\26\f\2\u00f4\u00ff\5\34\17\2\u00f5\u00ff\5\36\20\2\u00f6\u00f7"+
		"\7\6\2\2\u00f7\u00ff\5\34\17\2\u00f8\u00ff\5\32\16\2\u00f9\u00ff\5\30"+
		"\r\2\u00fa\u00fc\7 \2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00ff\t\7\2\2\u00fe\u00f3\3\2\2\2\u00fe\u00f4\3\2"+
		"\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe"+
		"\u00f9\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff\25\3\2\2\2\u0100\u0102\7$\2\2"+
		"\u0101\u0103\7$\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0108\7$\2\2\u0107"+
		"\u0100\3\2\2\2\u0107\u0106\3\2\2\2\u0108\27\3\2\2\2\u0109\u010a\t\4\2"+
		"\2\u010a\31\3\2\2\2\u010b\u010c\7&\2\2\u010c\33\3\2\2\2\u010d\u010e\t"+
		"\b\2\2\u010e\35\3\2\2\2\u010f\u0110\5\34\17\2\u0110\u0111\7\64\2\2\u0111"+
		"\u0112\5\34\17\2\u0112\37\3\2\2\2\u0113\u0115\t\3\2\2\u0114\u0113\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\t\7\2\2\u0117"+
		"!\3\2\2\2\u0118\u0119\t\t\2\2\u0119#\3\2\2\2\u011a\u0129\7\t\2\2\u011b"+
		"\u0129\7\n\2\2\u011c\u0129\7\13\2\2\u011d\u011e\7\13\2\2\u011e\u0129\7"+
		"\t\2\2\u011f\u0120\7\n\2\2\u0120\u0129\7\t\2\2\u0121\u0122\7\13\2\2\u0122"+
		"\u0129\7\n\2\2\u0123\u0124\7\5\2\2\u0124\u0129\7\t\2\2\u0125\u0126\7\13"+
		"\2\2\u0126\u0127\7\t\2\2\u0127\u0129\7\n\2\2\u0128\u011a\3\2\2\2\u0128"+
		"\u011b\3\2\2\2\u0128\u011c\3\2\2\2\u0128\u011d\3\2\2\2\u0128\u011f\3\2"+
		"\2\2\u0128\u0121\3\2\2\2\u0128\u0123\3\2\2\2\u0128\u0125\3\2\2\2\u0129"+
		"%\3\2\2\2\u012a\u0131\7\27\2\2\u012b\u012c\7\f\2\2\u012c\u0131\7\f\2\2"+
		"\u012d\u0131\7\36\2\2\u012e\u012f\7\r\2\2\u012f\u0131\7\r\2\2\u0130\u012a"+
		"\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\'\3\2\2\2\u0132\u0133\7\13\2\2\u0133\u013a\7\13\2\2\u0134\u0135\7\n\2"+
		"\2\u0135\u013a\7\n\2\2\u0136\u013a\7\f\2\2\u0137\u013a\7\16\2\2\u0138"+
		"\u013a\7\r\2\2\u0139\u0132\3\2\2\2\u0139\u0134\3\2\2\2\u0139\u0136\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a)\3\2\2\2\u013b\u013c"+
		"\t\n\2\2\u013c+\3\2\2\2\u013d\u013e\7\22\2\2\u013e\u013f\7-\2\2\u013f"+
		"-\3\2\2\2\u0140\u0141\7\23\2\2\u0141\u0142\7-\2\2\u0142/\3\2\2\2\u0143"+
		"\u0144\7\24\2\2\u0144\u0145\7-\2\2\u0145\61\3\2\2\2\u0146\u0147\7-\2\2"+
		"\u0147\63\3\2\2\2%9BGO[amsuw\u0088\u008d\u0097\u0099\u00a0\u00a7\u00ab"+
		"\u00b1\u00b6\u00bb\u00bd\u00ca\u00ce\u00d8\u00dd\u00e9\u00f1\u00fb\u00fe"+
		"\u0104\u0107\u0114\u0128\u0130\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
