package ke.dci;



import ke.dci.BottomUpSolution.Solution;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 1000000;
        int[] cost = new int[size];

        for (int i = 0; i < size; i++){
            Random r = new Random();
            cost[i] = r.nextInt(-30, -20);
        }

       //int[] cost = new int[]{60, 0, 10, 30, 50, 60};
        
        Solution solution = Solution
                .builder()
                .cost( cost )
                .build();

        System.out.println(solution.run(500,1));
    }
}