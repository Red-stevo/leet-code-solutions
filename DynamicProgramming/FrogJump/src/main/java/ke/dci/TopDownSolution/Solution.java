package ke.dci.TopDownSolution;

import lombok.Builder;

import java.lang.reflect.Array;
import java.util.Arrays;

@Builder
public class Solution {

    private int[] cost;

    public int run(){

        if (cost.length == 0) return 0;

        int[] mem = new int[cost.length];
        Arrays.fill(mem, -1);

        return solution(mem, cost.length - 1);
    }


    private int solution(int[] mem, int index) {

        if (index == 0) return 0;

        if (mem[index] != -1) return mem[index];

        int minus1 = solution(mem, index - 1) + Math.abs(cost[index] - cost[index-1]);

        int minus2 = Integer.MAX_VALUE;
        if (index > 1)
            minus2 = solution(mem, index - 2) + Math.abs(cost[index] - cost[index-2]);

        mem[index] = Math.min(minus1, minus2);
        return mem[index];
    }

}
