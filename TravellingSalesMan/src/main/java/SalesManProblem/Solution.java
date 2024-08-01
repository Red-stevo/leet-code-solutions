package SalesManProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class Solution {

    public int solution(){
        int size = 4;
        Random random = new Random();
        int[][] matrix = new int[size][size];
        HashMap<Character, Integer> maker = new HashMap<>();
        List<Character> towns = new ArrayList<>(List.of('A', 'B', 'C', 'D'));
        for (char c : towns) maker.put(c,towns.indexOf(c));
        for (int i = 0; i < size; i++) for (int j = 0; j < size; j++) matrix[i][j] = random.nextInt();
        List<Integer> value = new ArrayList<>();
        g(towns.get(0), towns, matrix, value, maker);
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

