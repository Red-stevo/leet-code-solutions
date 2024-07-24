
public class Main {
    public static void main(String[] args) {

    }

    public static int coinChange(int[] coins, int amount){

        //working array.
        int[][] working_arr = new int[coins.length + 1][amount + 1];

        for(int i = 0; i < coins.length; i++)
            working_arr[i][0] = 0;

        for (int i = 1; i < coins.length + 1; i++) {
            for (int j = 1; j < amount + 1; j++){
                if(coins[i] > i)
                    working_arr[i][j] = 0;
                else
                    working_arr[i][j] = min(1 + working_arr[i][j - coins[i]], working_arr[i-1][j]);
            }
        }
        return 0;
    }

    private static int min(int num1, int num2){

    }
}