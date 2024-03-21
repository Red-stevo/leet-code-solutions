import java.util.Arrays;

public class SmallestArrangement {

    /*get the number and convert it to a character array*/
    public Long arrange(Long number){

        char[] chars = String.valueOf(Math.abs(number)).toCharArray();
        int[] arr = new int[chars.length];

        for (int i = 0; i < chars.length; i++)
            arr[i] = Integer.parseInt(String.valueOf(chars[i]));

        arr = quickSort(arr, 0, arr.length-1);

        if(number < 0){


        }

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (arr[i] + '0');
        }

        return Long.parseLong(String.valueOf(chars));
    }

    private  int[] quickSort(int[] arr, int start, int end){

        if(start < end){
            int pivot = partition(arr, start,end);

            quickSort(arr, start,pivot-1);
            quickSort(arr, pivot+1, end);
        }
        return arr;
    }

    private int partition(int[] arr, int start, int end) {

        return 0;
    }

    private int[] reverse(int[] arr){
        int start = 0, end = arr.length-1;

        while (start < end){
            swap(arr, start, end);

        }
    }
}
