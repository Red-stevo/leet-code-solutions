package ke.dci.BottomUpSolution;

import lombok.Builder;

import java.util.Arrays;

@Builder
public class Solution {

    private int[] cost;

    public int run() {
        if (cost.length == 0) return 0;

        return solution(new int[cost.length], cost.length-1);
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
}
