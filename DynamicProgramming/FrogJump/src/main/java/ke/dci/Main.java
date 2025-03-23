package ke.dci;



import ke.dci.BottomUpSolution.Solution;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 100000000;
        int[] cost = new int[size];

        for (int i = 0; i < size; i++){
            Random r = new Random();
            cost[i] = r.nextInt(-30, -20);
        }

       // int[] cost = new int[]{20, 0, 60, 30, 60, 10};
        
        Solution solution = Solution
                .builder()
                .cost( cost )
                .build();

        System.out.println(solution.run(1));
    }
}