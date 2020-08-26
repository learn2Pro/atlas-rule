package org.learn2pro.atlas.expr.bits;

import com.google.common.collect.ImmutableList;
import org.learn2pro.atlas.ann.MathOp;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.math.BinaryArithmetic;
import org.learn2pro.atlas.model.Row;
import java.util.List;

@MathOp("<<")
public class LeftShift extends BinaryArithmetic {

  /**
   * left expression
   */
  private Expression left;
  /**
   * right expression
   */
  private Expression right;

  public LeftShift(Expression left, Expression right) {
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
  public Number eval(Row row) {
    int shift = ((Number) right.eval(row)).intValue();
    return ((Number) left().eval(row)).longValue() >>> shift;
  }

  @Override
  public List<Expression> children() {
    return ImmutableList.of(left, right);
  }
}
