package com.tencent.atlas.model;

/**
 * the base row definition
 */
public interface Row {

    /**
     * get the index value
     *
     * @param i
     * @return
     */
    Object get(int i);

    /**
     * get the attribute
     *
     * @param name
     * @return
     */
    Object getByName(String name);
}
