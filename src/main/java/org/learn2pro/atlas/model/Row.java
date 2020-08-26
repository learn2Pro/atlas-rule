package org.learn2pro.atlas.model;

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
