package org.learn2pro.atlas.expr;

import org.learn2pro.atlas.model.Row;

/**
 * predicate if/not
 */
public abstract class Predicate extends Expression {

  /**
   * generate bool answer
   */
  @Override
  public abstract Boolean eval(Row row);
}
