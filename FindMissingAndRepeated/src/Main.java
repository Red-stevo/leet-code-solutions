public class Main {



    public static void main(String[] args)
    {
        int[][] grid = {{7,3,4,2},{11,5,16,7},{8,9,10,14},{12,13,1,15}};

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
