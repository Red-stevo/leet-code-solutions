import java.util.Arrays;

public class Solution {

    public int coinChange(int[] coins, int amount){
        ++amount;
        int[] arr = new int[amount];
        Arrays.fill(arr, amount);
        arr[0] = 0;
        for (int i = 0; i < amount; i++) {
            for(int coin : coins){
                if(i >= coin)
                    arr[i] = Math.min(1 + arr[i-coin], arr[i]);
            }
        }

        System.out.println(Arrays.toString(arr));

        return arr[amount-1] == amount ? -1: arr[amount-1];
    }
}
