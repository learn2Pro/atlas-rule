package org.learn2pro.atlas.expr.literal;

import org.learn2pro.atlas.expr.LeafExpression;
import org.learn2pro.atlas.model.Row;

/**
 * the constant expression
 */
public class ConstantExpr extends LeafExpression {

  /**
   * the inner entity
   */
  private Object entity;

  public ConstantExpr(Object entity) {
    this.entity = entity;
  }

  @Override
  public Object eval(Row row) {
    return entity;
  }
}
