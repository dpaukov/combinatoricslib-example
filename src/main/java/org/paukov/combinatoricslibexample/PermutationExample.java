package org.paukov.combinatoricslibexample;


import org.paukov.combinatorics.Factory;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;

public class PermutationExample {

    static void permutationWithRepetitions() {

        System.out.println("===== Permutation With Repetitions: =====");

        // Create the initial set/vector of 2 elements (apple, orange)
        ICombinatoricsVector<String> originalVector = Factory
                .createVector(new String[]{"apple", "orange"});

        // Create the generator by calling the appropriate method in the Factory
        // class
        Generator<String> gen = Factory
                .createPermutationWithRepetitionGenerator(originalVector, 3);

        // Print the result
        for (ICombinatoricsVector<String> perm : gen)
            System.out.println(perm);

    }

    static void permutationWithoutRepetitions() {

        System.out.println("===== Permutations Without Repetitions: =====");

        // Create the initial set/vector of 3 elements (apple, orange, cherry)
        ICombinatoricsVector<String> originalVector = Factory
                .createVector(new String[]{"apple", "orange", "cherry"});

        // Create the permutation generator by calling the appropriate method in
        // the Factory class
        Generator<String> gen = Factory
                .createPermutationGenerator(originalVector);

        // Print the result
        for (ICombinatoricsVector<String> perm : gen)
            System.out.println(perm);

    }

}
