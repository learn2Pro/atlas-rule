package org.learn2pro.atlas.expr.compare;

import org.learn2pro.atlas.ann.CmpOp;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.model.Row;

@CmpOp(">")
public class GT extends CompareExpr {

  /**
   * left expr
   */
  private Expression left;
  /**
   * right expr
   */
  private Expression right;

  public GT(Expression left, Expression right) {
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
    return MATH_TOOL.sub(left.eval(row), right.eval(row)).doubleValue() > 0.0;
  }
}
