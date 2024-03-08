public class QuickSortImpl implements IQuickSort{


    private final int[] arr;

    public QuickSortImpl(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int partition(int start, int end) {
        int pivot = end;
        int temp;

        if(start < end){
            while (arr[start] < arr[end]){
                start++;
            }
            while (arr[end] >= arr[end]){
                end--;
            }
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
        temp = arr[pivot];
        arr[pivot] = arr[end];
        arr[end] = temp;
        return end;
    }

    @Override
    public int[] quickSort(int start, int end) {
        partition(start, end);

        return arr;
    }
}
