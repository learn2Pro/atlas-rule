package org.learn2pro.atlas.expr;

import org.learn2pro.atlas.model.Row;
import org.learn2pro.atlas.model.TreeNode;

/**
 * the base expression impl
 */
public abstract class Expression extends TreeNode<Expression> {

  /**
   * the constructor
   */
  public Expression() {
    super(Expression.class);
  }

  /**
   * evaluate the expression
   *
   * @param row input
   * @return after eval
   */
  public abstract Object eval(Row row);

  public String genCode() {
    throw new UnsupportedOperationException("not supported code gen now!");
  }
}
