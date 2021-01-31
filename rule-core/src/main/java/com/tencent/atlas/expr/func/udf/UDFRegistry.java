package com.tencent.atlas.expr.func.udf;

import com.tencent.atlas.feature.com.google.common.base.Preconditions;
import com.tencent.atlas.feature.com.google.common.collect.Maps;
import com.tencent.atlas.ann.UDF;
import com.tencent.atlas.expr.ExpressionGroup;
import com.tencent.atlas.expr.math.BinaryArithmetic;
import com.tencent.atlas.model.Row;
import java.util.Map;
import org.apache.velocity.tools.generic.MathTool;
import com.tencent.atlas.feature.org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

public class UDFRegistry {

    protected static MathTool MATH_TOOL = new MathTool();
    private static Reflections REF = new Reflections("com.tencent.atlas.expr");
    private static Map<String, UDFRunner<?>> SUPPLIER = Maps.newConcurrentMap();
    public static final Logger LOGGER = LoggerFactory.getLogger(BinaryArithmetic.class);

    static {
        REF.getTypesAnnotatedWith(UDF.class).forEach(klass -> {
            String[] symbol = klass.getAnnotation(UDF.class).value();
            try {
                for (String s : symbol) {
                    SUPPLIER.put(s, (UDFRunner<?>) klass.newInstance());
                }
            } catch (InstantiationException | IllegalAccessException e) {
                LOGGER.error("instantiate the udf runner failed!");
            }
        });
    }

    public static void register(String udfName, UDFRunner<?> runner) {
        SUPPLIER.put(udfName, runner);
    }

    /**
     * evaluate the udf, return the reactive mono
     */
    public static Mono<?> eval(String name, Row row, ExpressionGroup params) {
        Preconditions
                .checkArgument(SUPPLIER.containsKey(name), "udf registry must contain this [%s]", name);
        return SUPPLIER.get(name).eval(row, params);
    }

}
