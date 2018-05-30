package org.paukov.combinatoricslibexample;

import static org.paukov.combinatorics.CombinatoricsFactory.createCartesianProductGenerator;
import static org.paukov.combinatorics.CombinatoricsFactory.createVector;

import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;

/**
 * Created by dpaukov on 5/30/18.
 */
public class CartesianProductExample {

  static void simpleExample() {

    System.out.println("===== Simple Cartesian Product: =====");

    ICombinatoricsVector<Integer> set01 = createVector(1, 2);
    ICombinatoricsVector<Integer> set02 = createVector(4);
    ICombinatoricsVector<Integer> set03 = createVector(5, 6);

    Generator<Integer> generator = createCartesianProductGenerator(set01, set02, set03);
    for (ICombinatoricsVector<Integer> catresianProduct : generator) {
      System.out.println(catresianProduct);
    }
  }

}
