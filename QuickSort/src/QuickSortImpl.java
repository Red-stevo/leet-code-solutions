public class QuickSortImpl implements IQuickSort {


    @Override
    public int partition(int[] arr, int start, int end) {
        int pivot = start;

        while(start < end){
            while (arr[start] <= arr[pivot] && start < end)
                start++;

            while (arr[end] > arr[pivot] && end > start)
                end--;

            if(start < end){
                swap(arr,start,end);
            }
            swap(arr,end,pivot);
            return end;
        }

        return 0;
    }

    @Override
    public int[] quickSort(int[] arr, int start, int end) {

        if(start < end){
            int pivot = partition(arr,start,end);

            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
        return arr;
    }

    private void swap(int[] arr, int start, int end){

    }
}
