package BruteForceSolution;

public class Solution {

    public int maxOnes(int[][] max, int length){
        int value = 0, maxValue=0, index;

        for (int i = 0; i < length; i++) {
            for (int j = 0;j < length ; j++) {
                value += max[i][j];
            }
            if(value > maxValue){
                maxValue = value;
                index = i;
            }
        }
        return 0;
    }
}
