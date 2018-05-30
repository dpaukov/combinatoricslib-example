package org.paukov.combinatoricslibexample;


import static org.paukov.combinatorics.CombinatoricsFactory.createMultiCombinationGenerator;
import static org.paukov.combinatorics.CombinatoricsFactory.createSimpleCombinationGenerator;
import static org.paukov.combinatorics.CombinatoricsFactory.createVector;

import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;

public class CombinationsExample {

  static void simpleCombinationsExample() {

    System.out.println("===== Simple Combinations: =====");

    // Create the initial vector
    ICombinatoricsVector<String> initialVector = createVector("orange", "apple", "chery");

    // Create a simple combination generator to generate 3-combinations of
    // the initial vector
    Generator<String> gen = createSimpleCombinationGenerator(initialVector, 2);

    // Print all possible combinations
    for (ICombinatoricsVector<String> combination : gen) {
      System.out.println(combination);
    }
  }

  static void multiCombinationsExample() {

    System.out.println("===== Multi Combinations: =====");

    // Create the initial vector of (apple, orange)
    ICombinatoricsVector<String> initialVector = createVector("apple", "orange", "chery");

    // Create a multi-combination generator to generate 3-combinations of
    // the initial vector
    Generator<String> gen = createMultiCombinationGenerator(initialVector, 2);

    // Print all possible combinations
    for (ICombinatoricsVector<String> combination : gen) {
      System.out.println(combination);
    }
  }

}
