package org.learn2pro.atlas.expr.compare;

import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.model.Row;

public class IsOrNotNull extends CompareExpr {

  /**
   * left expr
   */
  private Expression left;
  /**
   * right expr
   */
  private Expression right;

  public IsOrNotNull(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public Expression left() {
    return left;
  }

  @Override
  public Expression right() {
    return right;
  }

  @Override
  public Boolean eval(Row row) {
    Object rightAnswer = right.eval(row);
    Object leftAnswer = left.eval(row);
    return (rightAnswer == null) == (leftAnswer == null);
  }
}
