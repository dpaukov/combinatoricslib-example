package org.paukov.combinatoricslibexample;


import static org.paukov.combinatorics.CombinatoricsFactory.createPermutationGenerator;
import static org.paukov.combinatorics.CombinatoricsFactory.createPermutationWithRepetitionGenerator;
import static org.paukov.combinatorics.CombinatoricsFactory.createVector;

import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;

public class PermutationExample {

  static void permutationWithRepetitions() {

    System.out.println("===== Permutation With Repetitions: =====");

    // Create the initial set/vector of 2 elements (apple, orange)
    ICombinatoricsVector<String> originalVector = createVector("apple", "orange", "chery");

    // Create the generator by calling the appropriate method in the Factory
    // class
    Generator<String> gen = createPermutationWithRepetitionGenerator(originalVector, 2);

    // Print the result
    for (ICombinatoricsVector<String> perm : gen) {
      System.out.println(perm);
    }

  }

  static void permutationWithoutRepetitions() {

    System.out.println("===== Permutations Without Repetitions: =====");

    // Create the initial set/vector of 3 elements (apple, orange, cherry)
    ICombinatoricsVector<String> originalVector = createVector("apple", "orange", "chery");

    // Create the permutation generator by calling the appropriate method in
    // the Factory class
    Generator<String> gen = createPermutationGenerator(originalVector);

    // Print the result
    for (ICombinatoricsVector<String> perm : gen) {
      System.out.println(perm);
    }

  }

}
