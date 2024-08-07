import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
       int[] coins = {186,419,83,408};
       int amount = 6349;
    /*   int[] coins = {20, 2, 10};
        int amount = 56;*/
        System.out.println(solution.coinChange(coins, amount));
        //System.out.println(coinChange(coins, amount));
    }

    public static int coinChange(int[] coins, int amount){
        //working array.
        int[][] working_arr = new int[coins.length + 1][amount + 1];

        for (int i = 1; i < coins.length + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (coins[i - 1] > j)
                    working_arr[i][j] = working_arr[i - 1][j];
                else {
                    int num = -1;
                    if(working_arr[i][j - coins[i - 1]] == 0 && j - coins[i-1] != 0)
                        num = 0;
                    else
                        num = working_arr[i][j - coins[i - 1]] + 1;

                    working_arr[i][j] = min(num , working_arr[i - 1][j]);
                }
            }
        }

        for(int[] arr : working_arr)
            System.out.println(Arrays.toString(arr));

        if(working_arr[coins.length][amount] == 0)
            return -1;

        return working_arr[coins.length][amount];
    }


    private static int min(int num1, int num2){
        if(num2 == 0)
            return num1;
        return Math.min(num1, num2);
    }
}