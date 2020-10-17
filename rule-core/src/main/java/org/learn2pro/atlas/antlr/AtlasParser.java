// Generated from /Users/tangyun/export/rule-engine/rule-core/src/main/resources/Atlas.g4 by ANTLR 4.8

    package org.learn2pro.atlas.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AtlasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, NULL_LITERAL=17, 
		NULL_SPEC_LITERAL=18, AND=19, OR=20, IS=21, NOT=22, REGEXP=23, LIKE=24, 
		RLIKE=25, STRING_LITERAL=26, DECIMAL_LITERAL=27, HEXADECIMAL_LITERAL=28, 
		IDENTIFIER=29, SUBSTR=30, SUBSTRING=31, CHAR_LENGTH=32, FROM=33, FOR=34, 
		ESCAPE=35, IN=36, TRUE=37, FALSE=38, ZERO_DECIMAL=39, ONE_DECIMAL=40, 
		TWO_DECIMAL=41, DOT=42, LR_BRACKET=43, RR_BRACKET=44, COMMA=45, SPACE=46;
	public static final int
		RULE_expressions = 0, RULE_expression = 1, RULE_predicate = 2, RULE_expressionAtom = 3, 
		RULE_functionCall = 4, RULE_specificFunction = 5, RULE_functionArgs = 6, 
		RULE_functionArg = 7, RULE_constant = 8, RULE_stringLiteral = 9, RULE_booleanLiteral = 10, 
		RULE_hexadecimalLiteral = 11, RULE_decimalLiteral = 12, RULE_floatLiteral = 13, 
		RULE_nullNotnull = 14, RULE_unaryOperator = 15, RULE_comparisonOperator = 16, 
		RULE_logicalOperator = 17, RULE_bitOperator = 18, RULE_mathOperator = 19, 
		RULE_dataview = 20, RULE_feature = 21, RULE_attribute = 22, RULE_fullId = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"expressions", "expression", "predicate", "expressionAtom", "functionCall", 
			"specificFunction", "functionArgs", "functionArg", "constant", "stringLiteral", 
			"booleanLiteral", "hexadecimalLiteral", "decimalLiteral", "floatLiteral", 
			"nullNotnull", "unaryOperator", "comparisonOperator", "logicalOperator", 
			"bitOperator", "mathOperator", "dataview", "feature", "attribute", "fullId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'-'", "'~'", "'+'", "'='", "'>'", "'<'", "'&'", "'|'", 
			"'^'", "'*'", "'/'", "'%'", "'@@'", "'**'", "'$$'", "'NULL'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'IN'", null, null, "'0'", "'1'", "'2'", "'.'", 
			"'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "NULL_LITERAL", "NULL_SPEC_LITERAL", "AND", 
			"OR", "IS", "NOT", "REGEXP", "LIKE", "RLIKE", "STRING_LITERAL", "DECIMAL_LITERAL", 
			"HEXADECIMAL_LITERAL", "IDENTIFIER", "SUBSTR", "SUBSTRING", "CHAR_LENGTH", 
			"FROM", "FOR", "ESCAPE", "IN", "TRUE", "FALSE", "ZERO_DECIMAL", "ONE_DECIMAL", 
			"TWO_DECIMAL", "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", "SPACE"
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
			setState(48);
			expression(0);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(49);
				match(COMMA);
				setState(50);
				expression(0);
				}
				}
				setState(55);
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
		public Token testValue;
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode IS() { return getToken(AtlasParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(AtlasParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AtlasParser.FALSE, 0); }
		public TerminalNode NOT() { return getToken(AtlasParser.NOT, 0); }
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
		public TerminalNode NOT() { return getToken(AtlasParser.NOT, 0); }
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(57);
				((NotExpressionContext)_localctx).notOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==NOT) ) {
					((NotExpressionContext)_localctx).notOperator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(58);
				expression(4);
				}
				break;
			case 2:
				{
				_localctx = new IsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				predicate(0);
				setState(60);
				match(IS);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(61);
					match(NOT);
					}
				}

				setState(64);
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
				setState(66);
				predicate(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(69);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(70);
					logicalOperator();
					setState(71);
					expression(4);
					}
					} 
				}
				setState(77);
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
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode IN() { return getToken(AtlasParser.IN, 0); }
		public TerminalNode LR_BRACKET() { return getToken(AtlasParser.LR_BRACKET, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(AtlasParser.RR_BRACKET, 0); }
		public TerminalNode NOT() { return getToken(AtlasParser.NOT, 0); }
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
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(AtlasParser.LIKE, 0); }
		public TerminalNode NOT() { return getToken(AtlasParser.NOT, 0); }
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
		public Token regex;
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode REGEXP() { return getToken(AtlasParser.REGEXP, 0); }
		public TerminalNode RLIKE() { return getToken(AtlasParser.RLIKE, 0); }
		public TerminalNode NOT() { return getToken(AtlasParser.NOT, 0); }
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

			setState(79);
			expressionAtom(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryComparasionPredicateContext(new PredicateContext(_parentctx, _parentState));
						((BinaryComparasionPredicateContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(81);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(82);
						comparisonOperator();
						setState(83);
						((BinaryComparasionPredicateContext)_localctx).right = predicate(5);
						}
						break;
					case 2:
						{
						_localctx = new RegexpPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(85);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(87);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(86);
							match(NOT);
							}
						}

						setState(89);
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
						setState(90);
						predicate(3);
						}
						break;
					case 3:
						{
						_localctx = new InPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(91);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(93);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(92);
							match(NOT);
							}
						}

						setState(95);
						match(IN);
						setState(96);
						match(LR_BRACKET);
						setState(97);
						expressions();
						setState(98);
						match(RR_BRACKET);
						}
						break;
					case 4:
						{
						_localctx = new IsNullPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(100);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(101);
						match(IS);
						setState(102);
						nullNotnull();
						}
						break;
					case 5:
						{
						_localctx = new LikePredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(103);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(105);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(104);
							match(NOT);
							}
						}

						setState(107);
						match(LIKE);
						setState(108);
						predicate(0);
						setState(111);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(109);
							match(ESCAPE);
							setState(110);
							match(STRING_LITERAL);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(117);
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
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(119);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new FeatureExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				feature();
				}
				break;
			case 3:
				{
				_localctx = new AttributeExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				attribute();
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				functionCall();
				}
				break;
			case 5:
				{
				_localctx = new UnaryExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				unaryOperator();
				setState(124);
				expressionAtom(4);
				}
				break;
			case 6:
				{
				_localctx = new NestedExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(LR_BRACKET);
				setState(127);
				expression(0);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(128);
					match(COMMA);
					setState(129);
					expression(0);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(RR_BRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new BitExpressionAtomContext(new ExpressionAtomContext(_parentctx, _parentState));
						((BitExpressionAtomContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(139);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(140);
						bitOperator();
						setState(141);
						((BitExpressionAtomContext)_localctx).right = expressionAtom(3);
						}
						break;
					case 2:
						{
						_localctx = new MathExpressionAtomContext(new ExpressionAtomContext(_parentctx, _parentState));
						((MathExpressionAtomContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(143);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(144);
						mathOperator();
						setState(145);
						((MathExpressionAtomContext)_localctx).right = expressionAtom(2);
						}
						break;
					}
					} 
				}
				setState(151);
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
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBSTR:
			case SUBSTRING:
			case CHAR_LENGTH:
				_localctx = new SpecificFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				specificFunction();
				}
				break;
			case IDENTIFIER:
				_localctx = new UdfFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				fullId();
				setState(154);
				match(LR_BRACKET);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << NULL_LITERAL) | (1L << NULL_SPEC_LITERAL) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << DECIMAL_LITERAL) | (1L << HEXADECIMAL_LITERAL) | (1L << IDENTIFIER) | (1L << SUBSTR) | (1L << SUBSTRING) | (1L << CHAR_LENGTH) | (1L << TRUE) | (1L << FALSE) | (1L << ZERO_DECIMAL) | (1L << ONE_DECIMAL) | (1L << TWO_DECIMAL) | (1L << LR_BRACKET))) != 0)) {
					{
					setState(155);
					functionArgs();
					}
				}

				setState(158);
				match(RR_BRACKET);
				}
				break;
			case T__13:
				_localctx = new DataviewFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				dataview();
				setState(161);
				match(LR_BRACKET);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << NULL_LITERAL) | (1L << NULL_SPEC_LITERAL) | (1L << NOT) | (1L << STRING_LITERAL) | (1L << DECIMAL_LITERAL) | (1L << HEXADECIMAL_LITERAL) | (1L << IDENTIFIER) | (1L << SUBSTR) | (1L << SUBSTRING) | (1L << CHAR_LENGTH) | (1L << TRUE) | (1L << FALSE) | (1L << ZERO_DECIMAL) | (1L << ONE_DECIMAL) | (1L << TWO_DECIMAL) | (1L << LR_BRACKET))) != 0)) {
					{
					setState(162);
					functionArgs();
					}
				}

				setState(165);
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
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBSTR:
			case SUBSTRING:
				_localctx = new SubstrFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(170);
				match(LR_BRACKET);
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(171);
					((SubstrFunctionCallContext)_localctx).sourceString = stringLiteral();
					}
					break;
				case 2:
					{
					setState(172);
					((SubstrFunctionCallContext)_localctx).sourceExpression = expression(0);
					}
					break;
				}
				setState(175);
				match(FROM);
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(176);
					((SubstrFunctionCallContext)_localctx).fromDecimal = decimalLiteral();
					}
					break;
				case 2:
					{
					setState(177);
					((SubstrFunctionCallContext)_localctx).fromExpression = expression(0);
					}
					break;
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(180);
					match(FOR);
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(181);
						((SubstrFunctionCallContext)_localctx).forDecimal = decimalLiteral();
						}
						break;
					case 2:
						{
						setState(182);
						((SubstrFunctionCallContext)_localctx).forExpression = expression(0);
						}
						break;
					}
					}
				}

				setState(187);
				match(RR_BRACKET);
				}
				break;
			case CHAR_LENGTH:
				_localctx = new GetLengthFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(CHAR_LENGTH);
				setState(190);
				match(LR_BRACKET);
				setState(191);
				((GetLengthFunctionCallContext)_localctx).sourceExpression = expression(0);
				setState(192);
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
		enterRule(_localctx, 12, RULE_functionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			functionArg();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(197);
				match(COMMA);
				setState(198);
				functionArg();
				}
				}
				setState(203);
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
		enterRule(_localctx, 14, RULE_functionArg);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				feature();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				attribute();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
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
		enterRule(_localctx, 16, RULE_constant);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				stringLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				decimalLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				floatLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(T__1);
				setState(215);
				decimalLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				hexadecimalLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				booleanLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(218);
					match(NOT);
					}
				}

				setState(221);
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
		enterRule(_localctx, 18, RULE_stringLiteral);
		try {
			int _alt;
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(224);
				match(STRING_LITERAL);
				}
				setState(226); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(225);
						match(STRING_LITERAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(228); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
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
		enterRule(_localctx, 20, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
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
		enterRule(_localctx, 22, RULE_hexadecimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		enterRule(_localctx, 24, RULE_decimalLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		enterRule(_localctx, 26, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			decimalLiteral();
			setState(240);
			match(DOT);
			setState(241);
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
		public TerminalNode NULL_LITERAL() { return getToken(AtlasParser.NULL_LITERAL, 0); }
		public TerminalNode NULL_SPEC_LITERAL() { return getToken(AtlasParser.NULL_SPEC_LITERAL, 0); }
		public TerminalNode NOT() { return getToken(AtlasParser.NOT, 0); }
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
		enterRule(_localctx, 28, RULE_nullNotnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(243);
				match(NOT);
				}
			}

			setState(246);
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
		enterRule(_localctx, 30, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << NOT))) != 0)) ) {
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
		enterRule(_localctx, 32, RULE_comparisonOperator);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(T__6);
				setState(254);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				match(T__5);
				setState(256);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				match(T__6);
				setState(258);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(259);
				match(T__0);
				setState(260);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
				match(T__6);
				setState(262);
				match(T__4);
				setState(263);
				match(T__5);
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
		enterRule(_localctx, 34, RULE_logicalOperator);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(AND);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(T__7);
				setState(268);
				match(T__7);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(OR);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(T__8);
				setState(271);
				match(T__8);
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
		enterRule(_localctx, 36, RULE_bitOperator);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(T__6);
				setState(275);
				match(T__6);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__5);
				setState(277);
				match(T__5);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(T__7);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(T__9);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				match(T__8);
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
		enterRule(_localctx, 38, RULE_mathOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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
		enterRule(_localctx, 40, RULE_dataview);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__13);
			setState(286);
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
		enterRule(_localctx, 42, RULE_feature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__14);
			setState(289);
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
		enterRule(_localctx, 44, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__15);
			setState(292);
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
		enterRule(_localctx, 46, RULE_fullId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u012b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3A\n"+
		"\3\3\3\3\3\3\3\5\3F\n\3\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4l\n\4\3\4\3\4\3\4\3\4\5\4r\n\4\7"+
		"\4t\n\4\f\4\16\4w\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5\u0085\n\5\f\5\16\5\u0088\13\5\3\5\3\5\5\5\u008c\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5\u0096\n\5\f\5\16\5\u0099\13\5\3\6\3\6\3\6\3\6\5"+
		"\6\u009f\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a6\n\6\3\6\3\6\5\6\u00aa\n\6\3"+
		"\7\3\7\3\7\3\7\5\7\u00b0\n\7\3\7\3\7\3\7\5\7\u00b5\n\7\3\7\3\7\3\7\5\7"+
		"\u00ba\n\7\5\7\u00bc\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c5\n\7\3\b"+
		"\3\b\3\b\7\b\u00ca\n\b\f\b\16\b\u00cd\13\b\3\t\3\t\3\t\3\t\3\t\5\t\u00d4"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00de\n\n\3\n\5\n\u00e1\n\n\3"+
		"\13\3\13\6\13\u00e5\n\13\r\13\16\13\u00e6\3\13\5\13\u00ea\n\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\5\20\u00f7\n\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u010b\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0113\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u011c\n\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\2\5\4\6\b\32\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\n\4\2\3\3\30\30\3"+
		"\2\'(\4\2\31\31\33\33\3\2 !\3\2\23\24\4\2\35\35)+\4\2\3\6\30\30\5\2\4"+
		"\4\6\6\r\17\2\u014e\2\62\3\2\2\2\4E\3\2\2\2\6P\3\2\2\2\b\u008b\3\2\2\2"+
		"\n\u00a9\3\2\2\2\f\u00c4\3\2\2\2\16\u00c6\3\2\2\2\20\u00d3\3\2\2\2\22"+
		"\u00e0\3\2\2\2\24\u00e9\3\2\2\2\26\u00eb\3\2\2\2\30\u00ed\3\2\2\2\32\u00ef"+
		"\3\2\2\2\34\u00f1\3\2\2\2\36\u00f6\3\2\2\2 \u00fa\3\2\2\2\"\u010a\3\2"+
		"\2\2$\u0112\3\2\2\2&\u011b\3\2\2\2(\u011d\3\2\2\2*\u011f\3\2\2\2,\u0122"+
		"\3\2\2\2.\u0125\3\2\2\2\60\u0128\3\2\2\2\62\67\5\4\3\2\63\64\7/\2\2\64"+
		"\66\5\4\3\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\3\3\2"+
		"\2\29\67\3\2\2\2:;\b\3\1\2;<\t\2\2\2<F\5\4\3\6=>\5\6\4\2>@\7\27\2\2?A"+
		"\7\30\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\t\3\2\2CF\3\2\2\2DF\5\6\4\2"+
		"E:\3\2\2\2E=\3\2\2\2ED\3\2\2\2FM\3\2\2\2GH\f\5\2\2HI\5$\23\2IJ\5\4\3\6"+
		"JL\3\2\2\2KG\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\5\3\2\2\2OM\3\2\2"+
		"\2PQ\b\4\1\2QR\5\b\5\2Ru\3\2\2\2ST\f\6\2\2TU\5\"\22\2UV\5\6\4\7Vt\3\2"+
		"\2\2WY\f\4\2\2XZ\7\30\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\t\4\2\2\\t"+
		"\5\6\4\5]_\f\b\2\2^`\7\30\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7&\2\2b"+
		"c\7-\2\2cd\5\2\2\2de\7.\2\2et\3\2\2\2fg\f\7\2\2gh\7\27\2\2ht\5\36\20\2"+
		"ik\f\5\2\2jl\7\30\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\32\2\2nq\5\6\4"+
		"\2op\7%\2\2pr\7\34\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sS\3\2\2\2sW\3\2\2"+
		"\2s]\3\2\2\2sf\3\2\2\2si\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\7\3\2"+
		"\2\2wu\3\2\2\2xy\b\5\1\2y\u008c\5\22\n\2z\u008c\5,\27\2{\u008c\5.\30\2"+
		"|\u008c\5\n\6\2}~\5 \21\2~\177\5\b\5\6\177\u008c\3\2\2\2\u0080\u0081\7"+
		"-\2\2\u0081\u0086\5\4\3\2\u0082\u0083\7/\2\2\u0083\u0085\5\4\3\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7.\2\2\u008a"+
		"\u008c\3\2\2\2\u008bx\3\2\2\2\u008bz\3\2\2\2\u008b{\3\2\2\2\u008b|\3\2"+
		"\2\2\u008b}\3\2\2\2\u008b\u0080\3\2\2\2\u008c\u0097\3\2\2\2\u008d\u008e"+
		"\f\4\2\2\u008e\u008f\5&\24\2\u008f\u0090\5\b\5\5\u0090\u0096\3\2\2\2\u0091"+
		"\u0092\f\3\2\2\u0092\u0093\5(\25\2\u0093\u0094\5\b\5\4\u0094\u0096\3\2"+
		"\2\2\u0095\u008d\3\2\2\2\u0095\u0091\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\t\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u009a\u00aa\5\f\7\2\u009b\u009c\5\60\31\2\u009c\u009e\7-\2\2\u009d\u009f"+
		"\5\16\b\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2"+
		"\u00a0\u00a1\7.\2\2\u00a1\u00aa\3\2\2\2\u00a2\u00a3\5*\26\2\u00a3\u00a5"+
		"\7-\2\2\u00a4\u00a6\5\16\b\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\7.\2\2\u00a8\u00aa\3\2\2\2\u00a9\u009a\3\2"+
		"\2\2\u00a9\u009b\3\2\2\2\u00a9\u00a2\3\2\2\2\u00aa\13\3\2\2\2\u00ab\u00ac"+
		"\t\5\2\2\u00ac\u00af\7-\2\2\u00ad\u00b0\5\24\13\2\u00ae\u00b0\5\4\3\2"+
		"\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4"+
		"\7#\2\2\u00b2\u00b5\5\32\16\2\u00b3\u00b5\5\4\3\2\u00b4\u00b2\3\2\2\2"+
		"\u00b4\u00b3\3\2\2\2\u00b5\u00bb\3\2\2\2\u00b6\u00b9\7$\2\2\u00b7\u00ba"+
		"\5\32\16\2\u00b8\u00ba\5\4\3\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\u00bc\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00be\7.\2\2\u00be\u00c5\3\2\2\2\u00bf\u00c0\7\"\2\2\u00c0"+
		"\u00c1\7-\2\2\u00c1\u00c2\5\4\3\2\u00c2\u00c3\7.\2\2\u00c3\u00c5\3\2\2"+
		"\2\u00c4\u00ab\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c5\r\3\2\2\2\u00c6\u00cb"+
		"\5\20\t\2\u00c7\u00c8\7/\2\2\u00c8\u00ca\5\20\t\2\u00c9\u00c7\3\2\2\2"+
		"\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\17"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d4\5\22\n\2\u00cf\u00d4\5,\27\2"+
		"\u00d0\u00d4\5.\30\2\u00d1\u00d4\5\n\6\2\u00d2\u00d4\5\4\3\2\u00d3\u00ce"+
		"\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\21\3\2\2\2\u00d5\u00e1\5\24\13\2\u00d6\u00e1\5\32"+
		"\16\2\u00d7\u00e1\5\34\17\2\u00d8\u00d9\7\4\2\2\u00d9\u00e1\5\32\16\2"+
		"\u00da\u00e1\5\30\r\2\u00db\u00e1\5\26\f\2\u00dc\u00de\7\30\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\t\6"+
		"\2\2\u00e0\u00d5\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e0"+
		"\u00d8\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dd\3\2"+
		"\2\2\u00e1\23\3\2\2\2\u00e2\u00e4\7\34\2\2\u00e3\u00e5\7\34\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00ea\7\34\2\2\u00e9\u00e2\3\2\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\25\3\2\2\2\u00eb\u00ec\t\3\2\2\u00ec\27\3\2\2\2\u00ed"+
		"\u00ee\7\36\2\2\u00ee\31\3\2\2\2\u00ef\u00f0\t\7\2\2\u00f0\33\3\2\2\2"+
		"\u00f1\u00f2\5\32\16\2\u00f2\u00f3\7,\2\2\u00f3\u00f4\5\32\16\2\u00f4"+
		"\35\3\2\2\2\u00f5\u00f7\7\30\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2"+
		"\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\t\6\2\2\u00f9\37\3\2\2\2\u00fa\u00fb"+
		"\t\b\2\2\u00fb!\3\2\2\2\u00fc\u010b\7\7\2\2\u00fd\u010b\7\b\2\2\u00fe"+
		"\u010b\7\t\2\2\u00ff\u0100\7\t\2\2\u0100\u010b\7\7\2\2\u0101\u0102\7\b"+
		"\2\2\u0102\u010b\7\7\2\2\u0103\u0104\7\t\2\2\u0104\u010b\7\b\2\2\u0105"+
		"\u0106\7\3\2\2\u0106\u010b\7\7\2\2\u0107\u0108\7\t\2\2\u0108\u0109\7\7"+
		"\2\2\u0109\u010b\7\b\2\2\u010a\u00fc\3\2\2\2\u010a\u00fd\3\2\2\2\u010a"+
		"\u00fe\3\2\2\2\u010a\u00ff\3\2\2\2\u010a\u0101\3\2\2\2\u010a\u0103\3\2"+
		"\2\2\u010a\u0105\3\2\2\2\u010a\u0107\3\2\2\2\u010b#\3\2\2\2\u010c\u0113"+
		"\7\25\2\2\u010d\u010e\7\n\2\2\u010e\u0113\7\n\2\2\u010f\u0113\7\26\2\2"+
		"\u0110\u0111\7\13\2\2\u0111\u0113\7\13\2\2\u0112\u010c\3\2\2\2\u0112\u010d"+
		"\3\2\2\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0113%\3\2\2\2\u0114"+
		"\u0115\7\t\2\2\u0115\u011c\7\t\2\2\u0116\u0117\7\b\2\2\u0117\u011c\7\b"+
		"\2\2\u0118\u011c\7\n\2\2\u0119\u011c\7\f\2\2\u011a\u011c\7\13\2\2\u011b"+
		"\u0114\3\2\2\2\u011b\u0116\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011a\3\2\2\2\u011c\'\3\2\2\2\u011d\u011e\t\t\2\2\u011e)\3"+
		"\2\2\2\u011f\u0120\7\20\2\2\u0120\u0121\7\37\2\2\u0121+\3\2\2\2\u0122"+
		"\u0123\7\21\2\2\u0123\u0124\7\37\2\2\u0124-\3\2\2\2\u0125\u0126\7\22\2"+
		"\2\u0126\u0127\7\37\2\2\u0127/\3\2\2\2\u0128\u0129\7\37\2\2\u0129\61\3"+
		"\2\2\2\"\67@EMY_kqsu\u0086\u008b\u0095\u0097\u009e\u00a5\u00a9\u00af\u00b4"+
		"\u00b9\u00bb\u00c4\u00cb\u00d3\u00dd\u00e0\u00e6\u00e9\u00f6\u010a\u0112"+
		"\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}