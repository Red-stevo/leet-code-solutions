public class Main {
    public static void main(String[] args) {


        int[] arr = {1,5,8,3,9,0,3,87,24,13,567,2,7,24,78,467,98};

        IQuickSort iQuickSort = new QuickSortImpl();


       arr = iQuickSort.quickSort(arr,0,arr.length-1);


       for(int i : arr){
           System.out.print("\t" + i);
       }
    }
}

