//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};

        IslandPerimeter islandPerimeter = new IslandPerimeter();

        int ans = islandPerimeter.islandPerimeter(grid);

        System.out.println(ans);
    }
}