public class Main {



    public static void main(String[] args)
    {
        int[][] grid = {{1,2,3,4,4,6}};

       OptimumSolution solution = new OptimumSolution();

       int[] ans = solution.findMissingAndRepeatedValues(grid);

       for(int i : ans)
       {
           System.out.print(i+" ");
       }
    }
}
