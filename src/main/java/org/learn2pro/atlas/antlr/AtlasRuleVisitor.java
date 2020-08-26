package org.learn2pro.atlas.antlr;

import org.learn2pro.atlas.antlr.AtlasParser.AttributeContext;
import org.learn2pro.atlas.antlr.AtlasParser.AttributeExpressionAtomContext;
import org.learn2pro.atlas.antlr.AtlasParser.BinaryComparasionPredicateContext;
import org.learn2pro.atlas.antlr.AtlasParser.BitExpressionAtomContext;
import org.learn2pro.atlas.antlr.AtlasParser.BitOperatorContext;
import org.learn2pro.atlas.antlr.AtlasParser.BooleanLiteralContext;
import org.learn2pro.atlas.antlr.AtlasParser.ComparisonOperatorContext;
import org.learn2pro.atlas.antlr.AtlasParser.ConstantContext;
import org.learn2pro.atlas.antlr.AtlasParser.ConstantExpressionAtomContext;
import org.learn2pro.atlas.antlr.AtlasParser.DecimalLiteralContext;
import org.learn2pro.atlas.antlr.AtlasParser.ExpressionAtomPredicateContext;
import org.learn2pro.atlas.antlr.AtlasParser.ExpressionsContext;
import org.learn2pro.atlas.antlr.AtlasParser.FeatureContext;
import org.learn2pro.atlas.antlr.AtlasParser.FeatureExpressionAtomContext;
import org.learn2pro.atlas.antlr.AtlasParser.FloatLiteralContext;
import org.learn2pro.atlas.antlr.AtlasParser.FullIdContext;
import org.learn2pro.atlas.antlr.AtlasParser.FunctionArgContext;
import org.learn2pro.atlas.antlr.AtlasParser.FunctionArgsContext;
import org.learn2pro.atlas.antlr.AtlasParser.FunctionCallExpressionAtomContext;
import org.learn2pro.atlas.antlr.AtlasParser.GetLengthFunctionCallContext;
import org.learn2pro.atlas.antlr.AtlasParser.HexadecimalLiteralContext;
import org.learn2pro.atlas.antlr.AtlasParser.InPredicateContext;
import org.learn2pro.atlas.antlr.AtlasParser.IsExpressionContext;
import org.learn2pro.atlas.antlr.AtlasParser.IsNullPredicateContext;
import org.learn2pro.atlas.antlr.AtlasParser.LikePredicateContext;
import org.learn2pro.atlas.antlr.AtlasParser.LogicalExpressionContext;
import org.learn2pro.atlas.antlr.AtlasParser.LogicalOperatorContext;
import org.learn2pro.atlas.antlr.AtlasParser.MathExpressionAtomContext;
import org.learn2pro.atlas.antlr.AtlasParser.MathOperatorContext;
import org.learn2pro.atlas.antlr.AtlasParser.NestedExpressionAtomContext;
import org.learn2pro.atlas.antlr.AtlasParser.NotExpressionContext;
import org.learn2pro.atlas.antlr.AtlasParser.NullNotnullContext;
import org.learn2pro.atlas.antlr.AtlasParser.PredicateExpressionContext;
import org.learn2pro.atlas.antlr.AtlasParser.RegexpPredicateContext;
import org.learn2pro.atlas.antlr.AtlasParser.SpecificFunctionCallContext;
import org.learn2pro.atlas.antlr.AtlasParser.StringLiteralContext;
import org.learn2pro.atlas.antlr.AtlasParser.SubstrFunctionCallContext;
import org.learn2pro.atlas.antlr.AtlasParser.UdfFunctionCallContext;
import org.learn2pro.atlas.antlr.AtlasParser.UnaryExpressionAtomContext;
import org.learn2pro.atlas.antlr.AtlasParser.UnaryOperatorContext;
import org.learn2pro.atlas.expr.Predicate;
import org.learn2pro.atlas.expr.compare.CompareExpr;
import org.learn2pro.atlas.expr.compare.IsOrNotNull;
import org.learn2pro.atlas.expr.func.builtin.Like;
import org.learn2pro.atlas.expr.func.builtin.RegLike;
import org.learn2pro.atlas.expr.func.udf.UDFExpr;
import org.learn2pro.atlas.expr.invoke.AttributeRef;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.ExpressionGroup;
import org.learn2pro.atlas.expr.invoke.FeatureRef;
import org.learn2pro.atlas.expr.SymbolHolder;
import org.learn2pro.atlas.expr.func.builtin.GetLength;
import org.learn2pro.atlas.expr.func.builtin.Substr;
import org.learn2pro.atlas.expr.literal.BooleanLiteral;
import org.learn2pro.atlas.expr.literal.NullExpression;
import org.learn2pro.atlas.expr.literal.NumericLiteral;
import org.learn2pro.atlas.expr.literal.StringLiteral;
import org.learn2pro.atlas.expr.logic.And;
import org.learn2pro.atlas.expr.logic.NotExpr;
import org.learn2pro.atlas.expr.logic.Or;
import org.learn2pro.atlas.expr.math.BinaryArithmetic;
import org.learn2pro.atlas.expr.math.Subtract;
import java.util.stream.Collectors;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.apache.commons.lang3.StringUtils;

/**
 * generate rule expression by atlas grammar
 */
public class AtlasRuleVisitor extends AbstractParseTreeVisitor<Expression> implements
    AtlasVisitor<Expression> {

  @Override
  public Expression visitExpressions(ExpressionsContext ctx) {
    return new ExpressionGroup(
        ctx.expression().stream().map(this::visit).collect(Collectors.toList()));
  }

  @Override
  public Expression visitIsExpression(IsExpressionContext ctx) {
    throw new UnsupportedOperationException(
        "not support expr [" + ctx.getText() + "]");
  }

  @Override
  public Expression visitNotExpression(NotExpressionContext ctx) {
    return new NotExpr((Predicate) visit(ctx.expression()));
  }

  @Override
  public Expression visitLogicalExpression(LogicalExpressionContext ctx) {
    SymbolHolder symbolHolder = (SymbolHolder) visit(ctx.logicalOperator());
    Predicate left = (Predicate) extractFirst(visit(ctx.expression(0)));
    Predicate right = (Predicate) extractFirst(visit(ctx.expression(1)));
    if (StringUtils.equalsAnyIgnoreCase(symbolHolder.getSymbol(), "and", "&&")) {
      return new And(left, right);
    } else if (StringUtils.equalsAnyIgnoreCase(symbolHolder.getSymbol(), "or", "||")) {
      return new Or(left, right);
    }
    throw new UnsupportedOperationException(
        "not support logic operator [" + ctx.logicalOperator().getText() + "]");
  }

  @Override
  public Expression visitPredicateExpression(PredicateExpressionContext ctx) {
    return visit(ctx.predicate());
  }

  @Override
  public Expression visitExpressionAtomPredicate(ExpressionAtomPredicateContext ctx) {
    return visit(ctx.expressionAtom());
  }

  @Override
  public Expression visitInPredicate(InPredicateContext ctx) {
    return null;
  }

  @Override
  public Expression visitBinaryComparasionPredicate(BinaryComparasionPredicateContext ctx) {
    SymbolHolder symbolHolder = (SymbolHolder) visit(ctx.comparisonOperator());
    return CompareExpr.create(symbolHolder.getSymbol(), visit(ctx.left), visit(ctx.right));
  }

  @Override
  public Expression visitIsNullPredicate(IsNullPredicateContext ctx) {
    return new IsOrNotNull(visit(ctx.predicate()), visit(ctx.nullNotnull()));
  }

  @Override
  public Expression visitLikePredicate(LikePredicateContext ctx) {
    if (ctx.NOT() == null) {
      return new Like(visit(ctx.predicate(0)), visit(ctx.predicate(1)));
    } else {
      return new NotExpr(new Like(visit(ctx.predicate(0)), visit(ctx.predicate(1))));
    }
  }

  @Override
  public Expression visitRegexpPredicate(RegexpPredicateContext ctx) {
    if (ctx.NOT() == null) {
      return new RegLike(visit(ctx.predicate(0)), visit(ctx.predicate(1)));
    } else {
      return new NotExpr(new RegLike(visit(ctx.predicate(0)), visit(ctx.predicate(1))));
    }
  }

  @Override
  public Expression visitUnaryExpressionAtom(UnaryExpressionAtomContext ctx) {
    SymbolHolder symbolHolder = (SymbolHolder) visit(ctx.unaryOperator());
    if (StringUtils.equalsAnyIgnoreCase(symbolHolder.getSymbol(), "not", "!", "~")) {
      return new NotExpr((Predicate) visit(ctx.expressionAtom()));
    } else if (StringUtils.equalsIgnoreCase(symbolHolder.getSymbol(), "-")) {
      return new Subtract(new NumericLiteral("0"), visit(ctx.expressionAtom()));
    } else {
      return visit(ctx.expressionAtom());
    }
  }

  @Override
  public Expression visitAttributeExpressionAtom(AttributeExpressionAtomContext ctx) {
    return visit(ctx.attribute());
  }

  @Override
  public Expression visitConstantExpressionAtom(ConstantExpressionAtomContext ctx) {
    return visit(ctx.constant());
  }

  @Override
  public Expression visitFunctionCallExpressionAtom(FunctionCallExpressionAtomContext ctx) {
    return visit(ctx.functionCall());
  }

  @Override
  public Expression visitBitExpressionAtom(BitExpressionAtomContext ctx) {
    SymbolHolder symbolHolder = (SymbolHolder) visit(ctx.bitOperator());
    return BinaryArithmetic.create(symbolHolder.getSymbol(), visit(ctx.left), visit(ctx.right));
  }

  @Override
  public Expression visitFeatureExpressionAtom(FeatureExpressionAtomContext ctx) {
    return visit(ctx.feature());
  }

  @Override
  public Expression visitNestedExpressionAtom(NestedExpressionAtomContext ctx) {
    return new ExpressionGroup(
        ctx.expression().stream().map(this::visit).collect(Collectors.toList()));
  }

  @Override
  public Expression visitMathExpressionAtom(MathExpressionAtomContext ctx) {
    SymbolHolder symbolHolder = (SymbolHolder) visit(ctx.mathOperator());
    return BinaryArithmetic.create(symbolHolder.getSymbol(), visit(ctx.left), visit(ctx.right));
  }

  @Override
  public Expression visitSpecificFunctionCall(SpecificFunctionCallContext ctx) {
    return visit(ctx.specificFunction());
  }

  @Override
  public Expression visitUdfFunctionCall(UdfFunctionCallContext ctx) {
    return new UDFExpr(ctx.fullId().getText(), (ExpressionGroup) visit(ctx.functionArgs()));
  }

  @Override
  public Expression visitSubstrFunctionCall(SubstrFunctionCallContext ctx) {
    Expression source, startExpr;
    //construct expression
    if (ctx.sourceExpression != null) {
      source = visit(ctx.sourceExpression);
    } else {
      source = new StringLiteral(ctx.sourceString.getText());
    }
    //construct start
    if (ctx.fromExpression != null) {
      startExpr = visit(ctx.fromExpression);
    } else {
      startExpr = new NumericLiteral(ctx.fromDecimal.getText());
    }
    if (ctx.forExpression == null && ctx.forDecimal == null) {
      return new Substr(source, startExpr);
    } else if (ctx.forExpression != null) {
      return new Substr(source, startExpr, visit(ctx.forExpression));
    } else {
      return new Substr(source, startExpr, new NumericLiteral(ctx.forDecimal.getText()));
    }
  }

  @Override
  public Expression visitGetLengthFunctionCall(GetLengthFunctionCallContext ctx) {
    return new GetLength(visit(ctx.sourceExpression));
  }

  @Override
  public Expression visitFunctionArgs(FunctionArgsContext ctx) {
    return new ExpressionGroup(
        ctx.functionArg().stream().map(this::visit).collect(Collectors.toList()));
  }

  @Override
  public Expression visitFunctionArg(FunctionArgContext ctx) {
    if (ctx.constant() != null) {
      return visit(ctx.constant());
    } else if (ctx.feature() != null) {
      return visit(ctx.feature());
    } else if (ctx.attribute() != null) {
      return visit(ctx.attribute());
    } else if (ctx.functionCall() != null) {
      return visit(ctx.functionCall());
    } else if (ctx.expression() != null) {
      return visit(ctx.expression());
    }
    throw new UnsupportedOperationException(
        "not supported literal [" + ctx.getText() + "] in expression!");
  }

  @Override
  public Expression visitConstant(ConstantContext ctx) {
    if (ctx.nullLiteral != null) {
      return new NullExpression(ctx.NOT() != null);
    } else if (ctx.stringLiteral() != null) {
      return visit(ctx.stringLiteral());
    } else if (ctx.decimalLiteral() != null) {
      return new NumericLiteral(ctx.getText());
    } else if (ctx.floatLiteral() != null) {
      return visit(ctx.floatLiteral());
    } else if (ctx.hexadecimalLiteral() != null) {
      return visit(ctx.hexadecimalLiteral());
    } else if (ctx.booleanLiteral() != null) {
      return visit(ctx.booleanLiteral());
    }
    throw new UnsupportedOperationException(
        "not supported literal [" + ctx.getText() + "] in expression!");
  }

  @Override
  public Expression visitStringLiteral(StringLiteralContext ctx) {
    return new StringLiteral(ctx.getText());
  }

  @Override
  public Expression visitBooleanLiteral(BooleanLiteralContext ctx) {
    return new BooleanLiteral(ctx.getText());
  }

  @Override
  public Expression visitHexadecimalLiteral(HexadecimalLiteralContext ctx) {
    return new NumericLiteral(ctx.getText(), 16);
  }

  @Override
  public Expression visitDecimalLiteral(DecimalLiteralContext ctx) {
    return new NumericLiteral(ctx.getText());
  }

  @Override
  public Expression visitFloatLiteral(FloatLiteralContext ctx) {
    return new NumericLiteral(ctx.getText());
  }

  @Override
  public Expression visitNullNotnull(NullNotnullContext ctx) {
    return new NullExpression(ctx.NOT() == null);
  }

  @Override
  public Expression visitUnaryOperator(UnaryOperatorContext ctx) {
    return new SymbolHolder(ctx.getText());
  }

  @Override
  public Expression visitComparisonOperator(ComparisonOperatorContext ctx) {
    return new SymbolHolder(ctx.getText());
  }

  @Override
  public Expression visitLogicalOperator(LogicalOperatorContext ctx) {
    return new SymbolHolder(ctx.getText());
  }

  @Override
  public Expression visitBitOperator(BitOperatorContext ctx) {
    return new SymbolHolder(ctx.getText());
  }

  @Override
  public Expression visitMathOperator(MathOperatorContext ctx) {
    return new SymbolHolder(ctx.getText());
  }

  @Override
  public Expression visitFeature(FeatureContext ctx) {
    return new FeatureRef(ctx.name.getText());
  }

  @Override
  public Expression visitAttribute(AttributeContext ctx) {
    return new AttributeRef(ctx.name.getText());
  }

  @Override
  public Expression visitFullId(FullIdContext ctx) {
    return new SymbolHolder(ctx.getText());
  }

  private Expression extractFirst(Expression left) {
    return left instanceof Predicate ? left : ((ExpressionGroup) left).first();
  }
}
