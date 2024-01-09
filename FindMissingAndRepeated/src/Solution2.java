public class Solution2 {
    public int[] mergeArrays(int[] nums1, int[] nums2) {

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
        int[] array = mergeArrays(grid[0], grid[1]);

        for(int i: array)
        {
            System.out.print(i+"  ");
        }



        return null;
    }


}
