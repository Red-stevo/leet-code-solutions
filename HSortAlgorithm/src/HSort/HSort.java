package HSort;

import InsertionSort.InsertionSort;

public class HSort<T extends Comparable<T>> {

    public T[] hsort(T[] items){
        int len = items.length,h = len,j;
        while (true) {
            h = ((h/4) - 1);
            if (h < len) h = 1;
            int i = 0;
            while (i < len) {
                j = i + h;
                while (j >= h && j < len) {
                    if (items[j - h].compareTo(items[j]) > 0)
                        swap(j-h, j, items);
                    j -= h;
                }
                ++i;
            }
            System.out.println(h);
            if (h == 1) return items;
           /* for (T k : items) System.out.print(k + ",\t");
            System.out.println("\n");*/
        }
    }

    private void swap(int i, int h, T[] items) {
        T temp = items[i];
        items[i] = items[h];
        items[h] = temp;
        //System.out.println("swapped item at "+ i+" : "+items[i]+" with item at "+h+" : "+items[h]);
    }
}
