package org.example;


import KnapSackProblem.KnapSackSolution;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] weights = {3,4,5,6};
        int[] profit = {2,3,4,1};
        int mass = 17;

        KnapSackSolution knapSackSolution = new KnapSackSolution();
        System.out.println(Arrays.toString(knapSackSolution.knapSackSolution(weights, profit, mass)));
    }
}