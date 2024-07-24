
public class Main {
    public static void main(String[] args) {

    }

    public static int coinChange(int[] coins, int amount){

        //working array.
        int[][] working_arr = new int[coins.length + 1][amount + 1];

        for(int i = 0; i < coins.length; i++)
            working_arr[i][0] = 0;

        for (int i = 0; i < coins.length + 1; i++) {
            for (int j = 0; j < amount + 1; j++){
                if(coins[i] > i)
                    working_arr[i][j] = 0;
                else

            }
        }
        return 0;
    }
}