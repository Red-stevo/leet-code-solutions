package KnapSackProblem;

import java.util.Arrays;

public class KnapSackSolution {

    public int[] knapSackSolution(int[] weight, int[] profit, int maxWeight){
        int maxW = maxWeight + 1;
        int lenProduct = weight.length+1;
        int[][] matrix = new int[lenProduct][maxW];

        for (int k = 0; k < maxW; k++) {
            matrix[0][k] = 0;
            if(k < lenProduct)
                matrix[k][0] = 0;
        }


        for (int j = 1; j < lenProduct; j++) {
            for (int i = 1; i < maxW; i++) {
                if(i >= weight[j-1])
                    matrix[j][i] = Math.max(matrix[j-1][i], profit[j-1]+matrix[j-1][i - weight[j-1]]);
                else
                    matrix[j][i] = matrix[j-1][i];
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        return null;
    }
}
