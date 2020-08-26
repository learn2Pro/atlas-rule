package org.learn2pro.atlas.expr.func.udf;

import org.learn2pro.atlas.ann.UDF;
import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.ExpressionGroup;
import org.learn2pro.atlas.model.Row;

@UDF({"char_length", "CHAR_LENGTH"})
public class CharLengthRunner implements UDFRunner {

  @Override
  public Object eval(Row row, ExpressionGroup group) {
    Expression successor = group.first();
    return String.valueOf(successor.eval(row)).length();
  }
}
