package org.learn2pro.atlas.model;

import java.util.List;
import java.util.Optional;

/**
 * the internal row without schema
 */
public class InternalRow implements Row {

    /**
     * the values
     */
    private Object[] values;

    public InternalRow(Object[] values) {
        this.values = values;
    }

    @Override
    public Object get(int i) {
        return Optional.ofNullable(values).map(arr -> arr[i]).orElse(null);
    }

    public Object[] getValues() {
        return values;
    }

    @Override
    public Object getByName(String name) {
        throw new UnsupportedOperationException("not supported getByName in this impl, pls check!");
    }

    public static InternalRow of(Object... values) {
        return new InternalRow(values);
    }

    public static InternalRow of(List<Object> values) {
        return new InternalRow(values.toArray(new Object[values.size()]));
    }
}
