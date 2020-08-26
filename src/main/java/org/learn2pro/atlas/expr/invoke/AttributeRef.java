package org.learn2pro.atlas.expr.invoke;

import com.google.common.collect.ImmutableList;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.model.Row;
import java.util.List;

/**
 * attribute ref from request
 */
public class AttributeRef extends Expression {

  /**
   * feature define name
   */
  private String name;

  public AttributeRef(String name) {
    this.name = name;
  }

  @Override
  public Object eval(Row row) {
    return row.getByName(name);
  }

  @Override
  public List<Expression> children() {
    return ImmutableList.of();
  }
}
