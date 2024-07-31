package org.example;


import KnapSackProblem.KnapSackSolution;

public class Main {

    public static void main(String[] args) {

        int[] weights = {3,4,5,6};
        int[] profit = {2,3,4,1};
        int mass = 8;

        KnapSackSolution knapSackSolution = new KnapSackSolution();
        knapSackSolution.knapSackSolution(weights, profit, mass);

    }
}