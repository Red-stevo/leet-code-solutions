public class Main {
    public static void main(String[] args) {


        int[] arr = {1,9,6,5,1,0,2,4,5,12,9,3,7,256,0,52,7,3,14,87,2,5,9,2,4,4,4,4,4,4,4,4,4,4,3,72,2,46,0,-23,53};

        IQuickSort iQuickSort = new QuickSortImpl();


       arr = iQuickSort.quickSort(arr,0,arr.length-1);


       for(int i : arr){
           System.out.print("\t" + i);
       }
    }
}

