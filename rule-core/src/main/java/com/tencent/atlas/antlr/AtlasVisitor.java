// Generated from /Users/tangyun/export/rule-engine/rule-core/src/main/resources/Atlas.g4 by ANTLR 4.8

    package com.tencent.atlas.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AtlasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AtlasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AtlasParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(AtlasParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link AtlasParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExpression(AtlasParser.IsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link AtlasParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(AtlasParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link AtlasParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(AtlasParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link AtlasParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateExpression(AtlasParser.PredicateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAtomPredicate(AtlasParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(AtlasParser.InPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComparasionPredicate(AtlasParser.BinaryComparasionPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullPredicate(AtlasParser.IsNullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(AtlasParser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link AtlasParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexpPredicate(AtlasParser.RegexpPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionAtom(AtlasParser.UnaryExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attributeExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeExpressionAtom(AtlasParser.AttributeExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpressionAtom(AtlasParser.ConstantExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpressionAtom(AtlasParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpressionAtom(AtlasParser.BitExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code featureExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureExpressionAtom(AtlasParser.FeatureExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpressionAtom(AtlasParser.NestedExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link AtlasParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionAtom(AtlasParser.MathExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link AtlasParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecificFunctionCall(AtlasParser.SpecificFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link AtlasParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdfFunctionCall(AtlasParser.UdfFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataviewFunctionCall}
	 * labeled alternative in {@link AtlasParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataviewFunctionCall(AtlasParser.DataviewFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link AtlasParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrFunctionCall(AtlasParser.SubstrFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getLengthFunctionCall}
	 * labeled alternative in {@link AtlasParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetLengthFunctionCall(AtlasParser.GetLengthFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#functionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgs(AtlasParser.FunctionArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#functionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArg(AtlasParser.FunctionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(AtlasParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(AtlasParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(AtlasParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiteral(AtlasParser.HexadecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(AtlasParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(AtlasParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#nullNotnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullNotnull(AtlasParser.NullNotnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(AtlasParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(AtlasParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(AtlasParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#bitOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOperator(AtlasParser.BitOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#mathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperator(AtlasParser.MathOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#dataview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataview(AtlasParser.DataviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature(AtlasParser.FeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(AtlasParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AtlasParser#fullId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullId(AtlasParser.FullIdContext ctx);
}