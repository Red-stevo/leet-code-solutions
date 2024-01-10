public class Solution2 {



    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeated = 0, sum = 0,missing,sum2;

        for (int k = 0; k < 2; k++) {
            for (int h = 0; h < grid[0].length; h++) {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < grid[0].length; j++) {
                        if ((grid[i][j] == grid[k][h]) && (i != k) && (j != h))
                        {
                            repeated = grid[k][h];
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("Repeated value : "+repeated);
        for(int i = 0; i < 2;i++)
        {
            for (int j = 0; j < grid[0].length; j++) {
                sum += grid[i][j];
            }
        }

        System.out.println("first addition  : "+ sum);

        int n = (grid[0].length * 2);

        System.out.println(n);

        sum -= repeated;

        System.out.println("Sum after removal of the redundant value : "+sum);
        sum2 = ((n*n) + n)/2;
        System.out.println("sum2 : "+sum2);
        missing = sum2 - sum;

        return new int[] {repeated,missing};
    }


}
