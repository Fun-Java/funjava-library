package com.funjava.ml.domain.data;

/**
 * Class ini digunakan untuk bagian
 * Preprocessing data seeprti resize, decode, scale, dll.
 *
 * @author Ghozi-Waridi
 *
 */
public interface Transform<I, O> {
  O apply(I input);
}
