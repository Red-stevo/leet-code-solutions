package SalesManProblem;

import java.util.*;


public class Solution {

    public int solution(){
        int size = 4;
        Random random = new Random();
        int[][] matrix = new int[size][size];
        HashMap<Character, Integer> maker = new HashMap<>();
        List<Character> towns = new ArrayList<>(List.of('B', 'C', 'D'));
        maker.put('A',0);
        for (char c : towns) maker.put(c,towns.indexOf(c)+1);
        for (int i = 0; i < size; i++) for (int j = 0; j < size; j++) matrix[i][j] = random.nextInt(1,2);
        List<Integer> value = new ArrayList<>();
        g('A', towns, matrix, value, maker);
        return 0;
    }

    public int g(Character A, List<Character> set, int[][] matrix, List<Integer> values, HashMap<Character, Integer> marker){
        int value = 0;
        List<Character> set2 = new ArrayList<>(set);
        for (Character i : set){
            set2.remove(i);
            for(Character j : set2){
                System.out.println(set);
                value += matrix[marker.get(A)][marker.get(j)] + g(i, new ArrayList<>(set2), matrix,new ArrayList<>(), marker);
                values.add(value);
            }
        }
        if (set2.isEmpty()) return matrix[marker.get(A)][0];
        return value;
    }
}

