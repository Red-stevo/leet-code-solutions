public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        /*We are going , the solution is based on an iteration
        * through the 2D array.*/


        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid[1].length; j++) {
                if(grid[i][j] == 1){
                    perimeter +=4;

                    /*Check the top row*/
                    if(i != 0) if(grid[i-1][j] == 1) perimeter -=1;

                    /*check the previous column*/
                    if(j != 0) if(grid[i][j-1] == 1) perimeter -=1;
                }
            }
        }

        return 0;
    }
}
