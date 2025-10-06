package com.funjava.ml.domain.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * DataSet merupakan kumpulan dari DataPoint
 * class menjadi gerbang utama untuk mengelola data.
 * class ini menggunakan BUILDER Desain Pattern.
 * 
 * @author Ghozi-Waridi
 */

public class DatasetLoader {
  private List<DataPoint> dataset = new ArrayList<>();

  /**
   * Methode Load dataaset CSV
   */
  public void loadCsv(String filePath) {
    try (Scanner scanner = new Scanner(new File(filePath))) {
      List<String> labels = new ArrayList<>();
      List<List<Double>> columns = new ArrayList<>();
      boolean isFirstLine = true;
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] values = line.split(",");
        if (isFirstLine) {
          for (String v : values) {
            labels.add(v);
            columns.add(new ArrayList<>());
          }
          isFirstLine = false;
        } else {
          for (int i = 0; i < values.length; i++) {
            columns.get(i).add(Double.parseDouble(values[i]));
          }
        }
      }
      for (int i = 0; i < labels.size(); i++) {
        double[] featureArray = columns.get(i).stream().mapToDouble(Double::doubleValue).toArray();
        DataPoint dp = new DataPoint(featureArray, labels.get(i));
        dataset.add(dp);
      }

    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + filePath);
    }
  }

  public void show() {
    for (DataPoint dp : dataset) {
      System.out.print(dp.getLabel() + ": ");
      double[] f = dp.getFeatures();
      for (int i = 0; i < f.length; i++) {
        System.out.print(f[i]);
        if (i < f.length - 1)
          System.out.print(", ");
      }
      System.out.println();
    }
  }

  /**
   * Methode Load dataset Image
   */

  /**
   * Methode Convert to DataPoint
   */

  public List<DataPoint> getDataset() {
    return dataset;
  }
}
