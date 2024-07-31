package KnapSackProblem;

import java.util.Arrays;

public class KnapSackSolution {

    public int[] knapSackSolution(int[] weight, int[] profit, int maxWeight){
        int maxW = maxWeight + 1;
        int lenProduct = weight.length+1;
        int[][] matrix = new int[lenProduct][maxW];

        for (int j = 1; j < lenProduct; j++) {
            for (int i = 1; i < maxW; i++) {
                if(i >= weight[j-1])
                    matrix[j][i] = Math.max(matrix[j-1][i], profit[j-1]+matrix[j-1][i - weight[j-1]]);
                else
                    matrix[j][i] = matrix[j-1][i];
            }
        }

        for(int[] arr : matrix){
            System.out.println(Arrays.toString(arr));
        }
        return matrixAnalysis(matrix,weight, maxW);
    }

    private int[] matrixAnalysis(int[][] matrix,int[] weight, int columns){
        int row = weight.length;
        int column = columns-1;
        int[] analysisAns = new int[weight.length];

        while (row > 1) {
            if (matrix[row][column] == matrix[row - 1][column])
                row -= 1;

            if (matrix[row][column] != matrix[row - 1][column]) {
                analysisAns[row - 1] = 1;
                column = column - weight[row - 1];
            }
        }
        return analysisAns;
    }
}
