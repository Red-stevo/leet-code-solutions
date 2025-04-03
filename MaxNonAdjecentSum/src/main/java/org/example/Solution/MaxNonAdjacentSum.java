package org.example.Solution;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxNonAdjacentSum {

    private int max;

    public MaxNonAdjacentSum() {
        max = Integer.MIN_VALUE;
    }

    public int run(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int[] dp = new int[arr.length];

        maxNonAdjacentSum(arr, dp, dp.length - 1);

        return max;
    }

    public int maxNonAdjacentSum(int[] arr, int[] dp, int index) {

        if (index == 0) return arr[0];

        if(index == 1) return arr[1];

        if (dp[index] != 0) return dp[index];

        int left = arr[index - 2] + maxNonAdjacentSum(arr, dp, index - 1);

        System.out.println(Arrays.toString(dp));

        return maxNonAdjacentSum(arr, dp, index - 1);
    }


    /**
     *      Dynamic Programming Tabular solution.
     * @param arr the array of numbers.
     * @return the maximum sum of the non-adjacent numbers in the array.
     */
    public int maxNonAdjacentSum(int[] arr) {

        return 0;
    }
}
