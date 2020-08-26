package org.learn2pro.atlas.expr.invoke;

import com.google.common.collect.ImmutableList;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.model.Row;
import java.util.List;

/**
 * feature ref from remote
 */
public class FeatureRef extends Expression {

  /**
   * feature define name
   */
  private String name;

  public FeatureRef(String name) {
    this.name = name;
  }

  @Override
  public Object eval(Row row) {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<Expression> children() {
    return ImmutableList.of();
  }
}
