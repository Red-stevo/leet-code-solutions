package HSort;

import InsertionSort.InsertionSort;

public class HSort<T extends Comparable<T>> {

    public T[] hsort(T[] items){
        InsertionSort<T> insertionSort = new InsertionSort<T>();
        int len = items.length;
        int h = len;
        int i = 0, j= 0;

       while(true){
           h = h/3 + 1;
           j = i + h;

           if (h < 2) return insertionSort.insertionSort(items);

           while (j < len){
               if(items[i].compareTo(items[h]) > 0) swap(i, j, items);
               j += h;
           }
           for (T k : items) System.out.print(k+"\t");

           ++i;
           System.out.println("\n");
       }
    }

    private void swap(int i, int h, T[] items) {
        T temp = items[i];
        items[i] = items[h];
        items[h] = temp;
    }
}
