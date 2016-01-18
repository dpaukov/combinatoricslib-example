package org.paukov.combinatoricslibexample;


import org.paukov.combinatorics.Factory;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;

public class CombinationsExample {

    static void simpleCombinationsExample() {

        System.out.println("===== Simple Combinations: =====");

        // Create the initial vector
        ICombinatoricsVector<String> initialVector = Factory
                .createVector(new String[]{"red", "black", "white", "green",
                        "blue"});

        // Create a simple combination generator to generate 3-combinations of
        // the initial vector
        Generator<String> gen = Factory.createSimpleCombinationGenerator(
                initialVector, 3);

        // Print all possible combinations
        for (ICombinatoricsVector<String> combination : gen) {
            System.out.println(combination);
        }

    }

    static void multiCombinationsExample() {

        System.out.println("===== Multi Combinations: =====");

        // Create the initial vector of (apple, orange)
        ICombinatoricsVector<String> initialVector = Factory
                .createVector(new String[]{"apple", "orange"});

        // Create a multi-combination generator to generate 3-combinations of
        // the initial vector
        Generator<String> gen = Factory.createMultiCombinationGenerator(
                initialVector, 3);

        // Print all possible combinations
        for (ICombinatoricsVector<String> combination : gen) {
            System.out.println(combination);
        }

    }


}
