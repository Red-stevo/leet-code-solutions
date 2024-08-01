package SalesManProblem;

import java.util.*;


public class Solution {

    public int solution(){
        int size = 4;
        Random random = new Random();
        int[][] matrix = new int[size][size];
        HashMap<Character, Integer> maker = new HashMap<>();
        List<Character> towns = new ArrayList<>(List.of('A', 'B', 'C', 'D'));
        for (char c : towns) maker.put(c,towns.indexOf(c));
        for (int i = 0; i < size; i++) for (int j = 0; j < size; j++) matrix[i][j] = random.nextInt(1,2);
        List<Integer> value = new ArrayList<>();
        g(towns.get(0), towns, matrix, value, maker);
        return 0;
    }

    public int g(Character A, List<Character> set, int[][] matrix, List<Integer> values, HashMap<Character, Integer> marker){
        set.remove(set.indexOf(A));
        int value = 0;
        if (set.isEmpty()) return matrix[marker.get(A)][0];

        for (Character i : set){
            for(Character j : set){
                if(i == j) continue;
                value += matrix[marker.get(A)][marker.get(j)] + g(i, new ArrayList<>(set), matrix,new ArrayList<>(), marker);
                values.add(value);
            }
        }

        return value;
    }
}

