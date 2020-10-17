package org.learn2pro.test.atlas.rule;

import org.learn2pro.atlas.expr.Expression;
import org.learn2pro.atlas.expr.invoke.AttributeRef;
import org.learn2pro.atlas.expr.invoke.DataModelRef;
import org.learn2pro.atlas.expr.invoke.FeatureRef;
import org.learn2pro.atlas.transform.Resolver;

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
