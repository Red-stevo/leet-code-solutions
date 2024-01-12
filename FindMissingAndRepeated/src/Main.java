public class Main {



    public static void main(String[] args)
    {
        int[][] grid = {{1,4},{4,2}};

      /*  Solution3 solution = new Solution3();

        int[] ans = solution.findMissingAndRepeatedValues(grid);

        for(int i : ans)
        {
            System.out.printf(i+" ");
        }*/

        Solution4 solution4 = new Solution4();

        int[] ans = solution4.findMissingAndRepeatedValues(grid);

        for(int i : ans)
        {
            System.out.printf(i + " ");
        }

    }
}
