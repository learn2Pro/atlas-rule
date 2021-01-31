package com.tencent.atlas.expr.compare;

import com.tencent.atlas.ann.CmpOp;
import com.tencent.atlas.expr.BinaryPredicate;
import com.tencent.atlas.expr.Expression;
import com.tencent.atlas.feature.com.google.common.collect.Maps;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.apache.velocity.tools.generic.MathTool;
import com.tencent.atlas.feature.org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CompareExpr extends BinaryPredicate {

    protected static MathTool MATH_TOOL = new MathTool();
    private static Reflections REF = new Reflections("com.tencent.atlas.expr");
    private static Map<String, Class<?>> SUPPLIER = Maps.newHashMap();
    public static final Logger LOGGER = LoggerFactory.getLogger(CompareExpr.class);

    static {
        REF.getTypesAnnotatedWith(CmpOp.class).forEach(klass -> {
            String[] symbol = klass.getAnnotation(CmpOp.class).value();
            for (String s : symbol) {
                SUPPLIER.put(s, klass);
            }
        });
    }

    /**
     * create by math operator symbol
     */
    public static CompareExpr create(String symbol, Expression left, Expression right) {
        if (!SUPPLIER.containsKey(symbol)) {
            throw new UnsupportedOperationException("not found the compare [" + symbol + "] expression!");
        }
        try {
            Constructor<?> ctor = SUPPLIER.get(symbol)
                    .getConstructor(Expression.class, Expression.class);
            return (CompareExpr) ctor.newInstance(left, right);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            LOGGER.error("instantiate operator failed,pls check!", e);
            return null;
        }
    }

}
