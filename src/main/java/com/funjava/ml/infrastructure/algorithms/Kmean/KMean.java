// package com.funjava.ml.infrastructure.algorithms.Kmean;

// import com.funjava.ml.domain.data.DataPoint;
// import com.funjava.ml.domain.data.Model;
// import com.funjava.ml.infrastructure.algorithms.Algorithm;

// public class KMean implements Algorithm {
// private int k;
// private int maxIteration;
// private double tolerance;

// public KMean(Builder builder) {
// this.k = builder.k;
// this.maxIteration = builder.maxIteration;
// this.tolerance = builder.tolerance;
// }

// // @Override
// // public Model train(DataPoint dataset) {
// // // return new KMeanTrainer(k, maxIterations, tolerance).fit(dataset);
// // }

// public static class Builder {
// private int k = 2;
// private int maxIteration = 1000;
// private double tolerance = 0.001;

// public Builder maxIterations(int maxIterations) {
// this.maxIteration = maxIterations;
// return this;
// }

// public Builder tolerance(double tolerance) {
// this.tolerance = tolerance;
// return this;
// }

// public KMean build() {
// return new KMean(this);
// }
// }

// }
