import BruteForceSolution.Solution;

import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Generating the Matrix.
        Random random = new Random();

        //matrix length.
        int length = 4;

        //matrix
        int[][] matrix = new int[length][length];

        //generating the matrix randomly
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = random.nextInt(0, 2);
            }
        }
        for(int[] arr : matrix)
            System.out.println(Arrays.toString(arr));

        Solution solution = new Solution();
        System.out.println("The Row Index is : "+solution.maxOnes(matrix, length));
    }
}