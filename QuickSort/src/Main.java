public class Main {
    public static void main(String[] args) {


        int[] arr = {1,5,8,3,9,0,3,87,24,13,567,2,7,24,78,467,98};


        IQuickSort iQuickSort = new QuickSortImpl(arr);

        int start = 0;
        int end = arr.length-1;

        arr = iQuickSort.quickSort(start, end);

        for(int i : arr){
            System.out.println(i+"\t");
        }
    }
}

