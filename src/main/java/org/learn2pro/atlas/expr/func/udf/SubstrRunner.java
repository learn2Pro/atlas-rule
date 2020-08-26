package org.learn2pro.atlas.expr.func.udf;

import org.learn2pro.atlas.ann.UDF;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.ExpressionGroup;
import org.learn2pro.atlas.model.Row;

@UDF({"substr", "SUBSTR"})
public class SubstrRunner implements UDFRunner {

  @Override
  public Object eval(Row row, ExpressionGroup group) {
    Expression successor = group.get(0);
    Expression startExpr = group.get(1);
    Expression sizeExpr = group.size() <= 2 ? null : group.get(2);
    String ref = String.valueOf(successor.eval(row));
    int size = sizeExpr == null ? -1 : ((Number) sizeExpr.eval(row)).intValue();
    int start = ((Number) startExpr.eval(row)).intValue();
    int end = Math.min(ref.length(), size == -1 ? ref.length() : start + size);
    if (start >= end) {
      return "";
    }
    return ref.substring(start, end);
  }
}
