package org.learn2pro.atlas.expr.func.builtin;

import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.UnaryExpression;
import org.learn2pro.atlas.expr.literal.NumericLiteral;
import org.learn2pro.atlas.model.Row;

public class Substr extends UnaryExpression {

  /**
   * the child
   */
  private Expression successor;
  private Expression startExpr;
  private Expression sizeExpr;

  public Substr(Expression successor, Expression start) {
    this(successor, start, new NumericLiteral("-1"));
  }

  public Substr(Expression successor, Expression start, Expression size) {
    this.successor = successor;
    this.startExpr = start;
    this.sizeExpr = size;
  }

  @Override
  public Expression child() {
    return successor;
  }

  @Override
  public Object eval(Row row) {
    String ref = String.valueOf(successor.eval(row));
    int size = ((Number) sizeExpr.eval(row)).intValue();
    int start = ((Number) startExpr.eval(row)).intValue();
    int end = size == -1 ? ref.length() : start + size;
    return ref.substring(start, end);
  }
}
