public class Solution3 {

    public int[] merge(int[] nums1, int[] nums2) {

        int length = nums1.length;

        int[] mergedArray = new int[length * 2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < length * 2) {
            if (j < length) {
                mergedArray[i] = nums1[j];
                ++j;
                ++i;
            }

            if (k < length) {
                mergedArray[i] = nums2[k];
                ++k;
                ++i;
            }
        }
        return mergedArray;
    }


    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int[] array = merge(grid[0], grid[1]);
        int[] ans = new int[2];
        int sum=0,correctSum,n;

        //find the repeated number.
        for (int a = 0; a < array.length; a++) {
            for (int i = 0; i < array.length; i++) {
                if(array[a] == array[i] && a != i)
                {
                    ans[0] = array[i];
                    break;
                }
            }

        }
        //find the missing number
        for(int i : array)
        {
            sum +=i;
        }

        sum = sum - ans[0];

        n = array.length;
        correctSum = (n*n + n)/2;


        ans[1] = correctSum - sum;

        return ans;
    }


}
