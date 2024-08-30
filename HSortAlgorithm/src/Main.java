import InsertionSort.InsertionSort;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       InsertionSort<Integer> insertionSort = new InsertionSort<Integer>();
        Random random = new Random();
        int len = 100000;
        Integer[] arr = new Integer[len];

        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(i+1);
        }

        arr = insertionSort.insertionSort(arr);

        for (Integer i : arr){
            System.out.print(i+"\t");
        }

    }
}