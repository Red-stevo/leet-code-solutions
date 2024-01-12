public class Solution4 {

    public int compareArrays(int[] array1, int[] array2)
    {

        //finding repeated value.
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = i; j < array2.length; j++)
            {
                if(array1 == array2)
                {
                    if(array1[i] == array2[j] && i != j)
                    {
                        return array1[i];
                    }
                }
                else
                {
                    if(array1[i] == array2[j])
                    {
                        return array1[i];
                    }
                }
            }
        }
        return 0;
    }

    public int[] findMissingAndRepeatedValues(int[][] grid)
    {
        int[] ans = new int[2];
        int gridSum = 0,gridLength,correctSum;

        //loop through the arrays one at a time passing them to a method
        //to compare them.
        //Finding the repeated value.
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = i; j < grid.length; j++)
            {
                ans[0] = compareArrays(grid[i],grid[j]);
                if(ans[0] != 0)
                {
                    break;
                }
            }
            if(ans[0] != 0)
            {
                break;
            }
        }

        //Calculating the sum of the provided grid
        for(int[] array : grid)
        {
            for(int num : array)
            {
                gridSum += num;
            }
        }

        //finding sum without any repetition.
        gridLength = grid[0].length * grid.length;

        correctSum = (((gridLength * gridLength) + gridLength)/2);

        //finding the missing number.
        gridSum -= ans[0]; //subtract the repeated number to remain correctSum + missing number.

        ans[1] = correctSum - gridSum;

        return ans;
    }
}