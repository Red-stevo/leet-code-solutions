package BruteForceSolution;

public class Solution {

    public int maxOnes(int[][] max, int length){
        int maxValue=0, index=-1;

        for (int i = 0; i < length; i++) {
            int value = 0;
            for (int j = 0;j < length ; j++) {
                value += max[i][j];
            }
            if(value > maxValue && value > 0){
                maxValue = value;
                index = i;
            }
        }
        return index;
    }
}
