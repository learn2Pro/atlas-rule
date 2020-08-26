package org.learn2pro.atlas.expr.literal;

import org.learn2pro.atlas.expr.LeafExpression;
import org.learn2pro.atlas.model.Row;

public class NullExpression extends LeafExpression {

  /**
   * is null?
   */
  private boolean nullable;

  public NullExpression(boolean nullable) {
    this.nullable = nullable;
  }

  @Override
  public Object eval(Row row) {
    return nullable ? null : new Object();
  }

}
