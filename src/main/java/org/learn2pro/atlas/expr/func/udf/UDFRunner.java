package org.learn2pro.atlas.expr.func.udf;

import org.learn2pro.atlas.expr.ExpressionGroup;
import org.learn2pro.atlas.model.Row;

/**
 * udf unit runner
 */
public interface UDFRunner {

  /**
   * evaluate
   */
  Object eval(Row row, ExpressionGroup group);

}
