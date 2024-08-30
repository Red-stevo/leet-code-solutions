package HSort;

public class HSort<T> implements Comparable<T> {

    public T[] hsort(T[] items){
        int len = items.length;
        int h = ((len/2) -1);

        for (int i = 0; i < len; i++) {
            for (h = 0; h < len; h = h + ((len/2) - 1) ) {

            }
        }
        return null;
    }
    @Override
    public int compareTo(T t) {
        return 0;
    }
}
