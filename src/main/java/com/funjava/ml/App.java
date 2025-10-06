package com.funjava.ml;

import com.funjava.ml.domain.data.DatasetLoader;

/**
 * Gerbang Utama dari APPP kita
 * 
 * @author Ghozi-Waridi
 *
 */
public class App {
  public static void main(String[] args) {
    DatasetLoader dataset = new DatasetLoader();
    dataset.loadCsv("Winedataset.csv");
    dataset.show();
  }
}
