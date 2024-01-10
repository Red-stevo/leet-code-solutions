public class Main {



    public static void main(String[] args)
    {
        Solution3 solution = new Solution3();
        int[][] grid = { {2,3,4,1}, {5,6,7,1} };

        int[] ans = solution.findMissingAndRepeatedValues(grid);

        for(int i : ans)
        {
            System.out.printf(i+" ");
        }
    }
}
