package com.tencent.test.atlas.rule;

import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.expr.invoke.AttributeRef;
import com.tencent.atlas.expr.invoke.DataModelRef;
import com.tencent.atlas.expr.invoke.FeatureRef;
import com.tencent.atlas.transform.Resolver;

/**
 * log resolver
 */
public class LogTestResolver implements Resolver {

    @Override
    public Expression<?> resolve(Expression<?> input) {
        return input.transformDown(expr -> {
            if (expr instanceof AttributeRef) {
                System.out.println("step in attribute: " + ((AttributeRef) expr).getName());
                return expr;
            } else if (expr instanceof FeatureRef) {
                System.out.println("step in feature : " + ((FeatureRef) expr).getName());
                return expr;
            } else if (expr instanceof DataModelRef) {
                System.out.println("step in dataview :" + ((DataModelRef) expr).getName());
                return expr;
            } else {
                return expr;
            }
        });
    }
}
