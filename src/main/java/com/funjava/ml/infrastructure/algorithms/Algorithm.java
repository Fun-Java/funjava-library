package com.funjava.ml.infrastructure.algorithms;

import com.funjava.ml.domain.data.DataPoint;
import com.funjava.ml.domain.data.Model;

public interface Algorithm {
    Model train(DataPoint dataset);
}
