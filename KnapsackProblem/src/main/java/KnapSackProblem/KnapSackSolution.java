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


        return matrixAnalysis(matrix, profit, maxW);
    }

    private int[] matrixAnalysis(int[][] matrix,int[] profit, int columns){
        int row = profit.length;
        int column = columns-1;
        int[] analysisAns = new int[profit.length];

        while(matrix[row][column] == matrix[row-1][column]){
            row -=1;

            if(row == 0) break;

            if(matrix[row][column] != matrix[row-1][column]){
                analysisAns[row-1] = 1;
                column = matrix[row][column] - profit[row-1];
            }
        }
        return analysisAns;
    }
}
