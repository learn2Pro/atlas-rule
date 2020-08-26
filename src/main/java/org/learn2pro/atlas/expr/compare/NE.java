package org.learn2pro.atlas.expr.compare;

import org.learn2pro.atlas.ann.CmpOp;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.model.Row;
import java.util.Objects;

@CmpOp({"!=","<>"})
public class NE extends CompareExpr {

  /**
   * left expr
   */
  private Expression left;
  /**
   * right expr
   */
  private Expression right;

  public NE(Expression left, Expression right) {
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
    return !Objects.equals(left.eval(row), right.eval(row));
  }
}
