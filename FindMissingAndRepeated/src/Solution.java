public class Solution {

    int[] array;

    public int[] mergeArrays(int[] nums1, int[] nums2) {

        return null;
    }

    public int[] swap(int lb, int ub)
    {
        int temp = array[ub];
        array[ub] = array[lb];
        array[lb] = temp;

        return array;
    }

    public int partition(int lb,int ub)
    {
        int start, end;
        start= lb;
        end = ub;
        int pivot = lb;


        while(lb < ub) {
            while (array[lb] <= array[pivot] && lb < end) {
                lb++;
            }
            while (array[ub] > array[pivot] && ub >= start ) {
                ub--;
            }
            if (ub > lb) {
               array = swap(lb,ub);
            }
        }
        array = swap(ub,pivot);
        return ub;
    }

    public void quickSort(int lb, int ub)
    {
        if(lb < ub)
        {
            int loc = partition(lb, ub);

            quickSort(lb, loc-1);
            quickSort(loc+1,lb);
        }
    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        array = mergeArrays(grid[0], grid[1]);

       for(int i: array)
       {
           System.out.print(i+"  ");
       }
        System.out.println("");
      quickSort(0,array.length-1);

        for(int i: array)
        {
            System.out.print(i+"  ");
        }

        return null;
    }
}
