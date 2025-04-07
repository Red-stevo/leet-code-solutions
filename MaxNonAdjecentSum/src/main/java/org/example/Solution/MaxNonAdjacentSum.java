package org.example.Solution;


import java.util.Arrays;

public class MaxNonAdjacentSum {

    public int run(int[] arr){
        int[] mem = new int[arr.length];
        Arrays.fill(mem, -1);
        return findMaxNonAdjacentSum(arr.length - 1, arr, mem);
    }

    private int findMaxNonAdjacentSum(int index, int[] arr, int[] mem){

        if (index == 0) return arr[0];

        if (index == -1) return 0;

        if (mem[index] != -1) return mem[index];

        int left = arr[index] + findMaxNonAdjacentSum(index-2, arr, mem);

        int right = findMaxNonAdjacentSum(index-1, arr, mem);

        mem[index] = Math.max(left, right);

        System.out.println(Arrays.toString(mem));

        return mem[index];
    }

    private int findMaxNonAdjacentSum(int[] arr){

        int pre1 = arr[0], pre2 = 0;

        for (int i = 1; i < arr.length; i++) {
            int value;
            if (i-2 < 0) value = pre2;
            else value = arr[i-2] + pre1;
            pre1 = arr[i-1];

            
        }

        return pre1;
    }

}
