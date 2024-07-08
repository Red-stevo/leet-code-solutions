import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

       mergeSort.mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }
}