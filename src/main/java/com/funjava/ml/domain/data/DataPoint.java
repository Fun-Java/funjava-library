package com.funjava.ml.domain.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * Representasi dari data itu sendiri.
 * Anggaplah ini merupakan datanya.
 *
 * @author Ghozi-Waridi
 */

public final class DataPoint {
  /**
   * Instance Variabel sebagai representasi dari data yang akna digunakan.
   * 
   * @var features berisi array dari 1 baris data.
   * @var label berisi nilai target dari feature.
   */
  private final double[] features;
  private final String label;

  /**
   * Constructor untuk menambahkan data baru ke intance variabel
   * 
   * @param features berisi array dari 1 baris data.
   * @param label    berisi nilai target dari feature.
   */
  public DataPoint(double[] features, String label) {
    this.features = features;
    this.label = label;
  }

  /**
   * Methode mengambil feature data.
   *
   * @return feature dari instance variabel.
   */
  public double[] getFeatures() {
    return features;
  }

  /**
   * Methode mengambil label data.
   * 
   * @return label dari instance varibel.
   */
  public String getLabel() {
    return label;
  }

  /**
   * Membandingkan dua object untuk mengetahui apakah data sama atau tidak.
   * Data yang di maksud adalah feature.
   */
  // @Override
  // public boolean equals(Object o) {
  // if (this == o)
  // return true;
  // if (o == null || getClass() != o.getClass())
  // return false;
  // DataPoint dataPoint = (DataPoint) o;
  // return Double.compare(dataPoint.label, label) == 0 && Arrays.equals(features,
  // dataPoint.features);
  // }
}
