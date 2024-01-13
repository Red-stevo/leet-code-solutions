public class OptimumSolution {

    public int[] findMissingAndRepeatedValues(int[][] grid)
    {
        long sum = 0;
        long squareSum = 0;

        int n = grid.length * grid[0].length;
        int missing;
        int repeated;

        System.out.println(n);

        //calculating the actual sum and squared sum
        long  sn = ((((long) n * n) + n)/2);
        long  sn2 = (sn * (((2L * n) + 1)/3));


        System.out.println("sn : "+sn+" sn**2 : "+sn2);

        //calculating the square sum and the sum of the given array
        for(int[] array : grid)
        {
            for(int i : array)
            {
                sum +=i;
                squareSum += (long) i *i;
            }
        }

        System.out.println("sn : "+sum+" sn**2 : "+squareSum);

        //find the repeated and the missing number.
        int value1 = (int) (sum - sn);
        int value2 = (int) (squareSum - sn2);
        value2 = value2/value1;

        repeated = ((value2 / value1) + value1) /2;

        missing = repeated - value1;

      return new int[]{repeated, missing};
    }
}
