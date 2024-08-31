import HSort.HSort;
import InsertionSort.InsertionSort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

       /*InsertionSort<Integer> insertionSort = new InsertionSort<Integer>();
        Random random = new Random();
        int len = 100000;
        Integer[] arr = new Integer[len];

        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(i+1);
        }

        arr = insertionSort.insertionSort(arr);

        for (Integer i : arr){
            System.out.print(i+"\t");
        }*/
        hSortTest();
    }

    public static void hSortTest(){
        HSort<Integer> hSort = new HSort<Integer>();
        Random random = new Random();
        int len = 160000;
        Integer[] arr = new Integer[len];

        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(len - i);
        }
        arr = hSort.hsort(arr);

        for (Integer i : arr){
            System.out.print(i+"\t");
        }

    }
}