// Generated from /Users/tangyun/export/rule-engine/rule-core/src/main/resources/Atlas.g4 by ANTLR 4.8

    package com.tencent.atlas.antlr;

import com.tencent.atlas.feature.org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AtlasParser}.
 */
public interface AtlasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AtlasParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(AtlasParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(AtlasParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link AtlasParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(AtlasParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link AtlasParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(AtlasParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link AtlasParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(AtlasParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link AtlasParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(AtlasParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link AtlasParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(AtlasParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link AtlasParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(AtlasParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link AtlasParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExpression(AtlasParser.PredicateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link AtlasParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExpression(AtlasParser.PredicateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtomPredicate(AtlasParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtomPredicate(AtlasParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(AtlasParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(AtlasParser.InPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComparasionPredicate(AtlasParser.BinaryComparasionPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComparasionPredicate(AtlasParser.BinaryComparasionPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterIsNullPredicate(AtlasParser.IsNullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitIsNullPredicate(AtlasParser.IsNullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(AtlasParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(AtlasParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterRegexpPredicate(AtlasParser.RegexpPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitRegexpPredicate(AtlasParser.RegexpPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionAtom(AtlasParser.UnaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionAtom(AtlasParser.UnaryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attributeExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterAttributeExpressionAtom(AtlasParser.AttributeExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attributeExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitAttributeExpressionAtom(AtlasParser.AttributeExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpressionAtom(AtlasParser.ConstantExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpressionAtom(AtlasParser.ConstantExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpressionAtom(AtlasParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpressionAtom(AtlasParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBitExpressionAtom(AtlasParser.BitExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBitExpressionAtom(AtlasParser.BitExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code featureExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFeatureExpressionAtom(AtlasParser.FeatureExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code featureExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFeatureExpressionAtom(AtlasParser.FeatureExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpressionAtom(AtlasParser.NestedExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpressionAtom(AtlasParser.NestedExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionAtom(AtlasParser.MathExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionAtom(AtlasParser.MathExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link AtlasParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSpecificFunctionCall(AtlasParser.SpecificFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link AtlasParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSpecificFunctionCall(AtlasParser.SpecificFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link AtlasParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterUdfFunctionCall(AtlasParser.UdfFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link AtlasParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitUdfFunctionCall(AtlasParser.UdfFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataviewFunctionCall}
	 * labeled alternative in {@link AtlasParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterDataviewFunctionCall(AtlasParser.DataviewFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataviewFunctionCall}
	 * labeled alternative in {@link AtlasParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitDataviewFunctionCall(AtlasParser.DataviewFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link AtlasParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstrFunctionCall(AtlasParser.SubstrFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link AtlasParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstrFunctionCall(AtlasParser.SubstrFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getLengthFunctionCall}
	 * labeled alternative in {@link AtlasParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterGetLengthFunctionCall(AtlasParser.GetLengthFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getLengthFunctionCall}
	 * labeled alternative in {@link AtlasParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitGetLengthFunctionCall(AtlasParser.GetLengthFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link AtlasParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCaseFunctionCall(AtlasParser.CaseFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link AtlasParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCaseFunctionCall(AtlasParser.CaseFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifFunctionCall}
	 * labeled alternative in {@link AtlasParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterIfFunctionCall(AtlasParser.IfFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifFunctionCall}
	 * labeled alternative in {@link AtlasParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitIfFunctionCall(AtlasParser.IfFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void enterCaseFuncAlternative(AtlasParser.CaseFuncAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void exitCaseFuncAlternative(AtlasParser.CaseFuncAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(AtlasParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(AtlasParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(AtlasParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(AtlasParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(AtlasParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(AtlasParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(AtlasParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(AtlasParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(AtlasParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(AtlasParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(AtlasParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(AtlasParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(AtlasParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(AtlasParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(AtlasParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(AtlasParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void enterNullNotnull(AtlasParser.NullNotnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void exitNullNotnull(AtlasParser.NullNotnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(AtlasParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(AtlasParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(AtlasParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(AtlasParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(AtlasParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(AtlasParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitOperator(AtlasParser.BitOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitOperator(AtlasParser.BitOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(AtlasParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(AtlasParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#dataview}.
	 * @param ctx the parse tree
	 */
	void enterDataview(AtlasParser.DataviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#dataview}.
	 * @param ctx the parse tree
	 */
	void exitDataview(AtlasParser.DataviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(AtlasParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(AtlasParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(AtlasParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(AtlasParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AtlasParser#fullId}.
	 * @param ctx the parse tree
	 */
	void enterFullId(AtlasParser.FullIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AtlasParser#fullId}.
	 * @param ctx the parse tree
	 */
	void exitFullId(AtlasParser.FullIdContext ctx);
}
