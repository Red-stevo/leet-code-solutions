package InsertionSort;

public class InsertionSort<T extends Comparable<T>>   {

    public T[] insertionSort(T[] t){

        for (int i = 0; i < t.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (t[j-1].compareTo(t[j]) > 0)
                    swap(j-1, j, t);
            }
        }
        return t;
    }

    private void swap(int i, int j, T[] t) {
        T temp = t[i];
        t[i] = t[j];
        t[j] = temp;
    }
}
