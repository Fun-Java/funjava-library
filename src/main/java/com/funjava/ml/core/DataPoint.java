package com.funjava.ml.core;

import java.util.Map;

/**
 * Representasi dari data itu sendiri.
 * Anggaplah ini merupakan datanya.
 */

public class DataPoint {
  private final Map<String, Object> features;
  private final Object label;

  public DataPoint(Map<String, Object> features, Object label) {
    this.features = features;
    this.label = label;
  }
}
