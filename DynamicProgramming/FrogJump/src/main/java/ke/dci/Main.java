package ke.dci;

import ke.dci.TopDownSolution.Solution;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int size = 7000;
        int[] cost = new int[size];

        for (int i = 0; i < size; i++){
            Random r = new Random();
            cost[i] = r.nextInt(-30, -20);
        }

        //int[] cost = new int[]{20, 40, 60, 10, 60};


        Solution solution = Solution
                .builder()
                .cost( cost )
                .build();

        System.out.println(solution.run());
    }
}