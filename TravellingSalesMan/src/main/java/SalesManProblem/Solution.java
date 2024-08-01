package SalesManProblem;

import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class Solution {

    public int solution(){
        int size = 4;
        Random random = new Random();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

            }
        }




        return 0;
    }

    public int g(char A, List<Character> set, int[][] matrix, List<Integer> values, HashMap<Character, Integer> marker){
        if (set.isEmpty()) return matrix[marker.get(A)][0];
        set.remove(0);
        for (int i = 0; i < set.size(); i++)
            values.add(g(set.get(0), set, matrix, values, marker) + matrix[marker.get(A)][marker.get(set.get(i))]);

        System.out.println(values);

        return 0;
    }
}

