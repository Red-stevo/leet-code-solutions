package InsertionSort;

public class InsertionSort<T extends Comparable<T>>   {

    public T[] insertionSort(T[] t){

        for (int i = 0; i < t.length; i++) {
            for (int j = i+1; j >= 0 ; j--) {
                if (t[i].compareTo(t[j]) < 0){

                }
            }
        }
        return null;
    }
}
