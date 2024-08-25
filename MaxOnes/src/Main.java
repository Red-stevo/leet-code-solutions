import BruteForceSolution.Solution;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Generating the Matrix.
        Random random = new Random();

        //matrix length.
        int length = 10000;

        //matrix
        int[][] matrix = new int[length][length];

        //generating the matrix randomly
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = random.nextInt(0, 2);
            }
        }
        //preview the matrix
       /* for(int[] arr : matrix)
            System.out.println(Arrays.toString(arr));
*/
        Solution solution = new Solution();
        System.out.println("The Row Index is : "+solution.maxOnes(matrix, length));
    }
}