package ke.dci.BottomUpSolution;

import lombok.Builder;

@Builder
public class Solution {

    private int[] cost;

    public int run() {
        if (cost.length == 0) return 0;

        return solution(new int[cost.length], cost.length-1);
    }

    public int run(int n) {
        System.out.println(n);

        if (cost.length == 0) return 0;

        return solution(cost.length -1);
    }


    private int solution(int[] dp, int n) {
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int plus1 = dp[i-1] + Math.abs(cost[i] - cost[i - 1]);

            int plus2 = Integer.MAX_VALUE;
            if (i > 1)
                plus2 = dp[i -2] + Math.abs(cost[i] - cost[i - 2]);

            dp[i] = Math.min(plus1, plus2);
        }
        return dp[n];
    }


    //space optimization

    private int solution(int n) {

        int prev = 0, prev2 = 0;
        for (int i = 1; i <= n; ++i) {
            int plus1 = prev + Math.abs(cost[i] - cost[i - 1]);

            int plus2 = Integer.MAX_VALUE;
            if (i > 1)
                plus2 = prev2 + Math.abs(cost[i] - cost[i - 2]);


            int cur = Math.min(plus1, plus2);
            prev2 = prev;
            prev = cur;
        }
        return  prev;
    }
}
