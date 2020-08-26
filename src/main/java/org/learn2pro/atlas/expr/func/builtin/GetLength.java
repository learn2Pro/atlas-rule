package org.learn2pro.atlas.expr.func.builtin;

import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.UnaryExpression;
import org.learn2pro.atlas.model.Row;

public class GetLength extends UnaryExpression {

  /**
   * the next
   */
  private Expression successor;

  public GetLength(Expression successor) {
    this.successor = successor;
  }

  @Override
  public Expression child() {
    return successor;
  }

  @Override
  public Object eval(Row row) {
    return String.valueOf(successor.eval(row)).length();
  }
}
