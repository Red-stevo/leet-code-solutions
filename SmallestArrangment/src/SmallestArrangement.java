public class SmallestArrangement {

    /*get the number and convert it to a character array*/
    public Long arrange(Long number){

        char[] chars = String.valueOf(Math.abs(number)).toCharArray();
        int[] arr = new int[chars.length];

        for (int i = 0; i < chars.length; i++)
            arr[i] = Integer.parseInt(String.valueOf(chars[i]));

        arr = quickSort(arr, 0, arr.length-1);

        if(number < 0){
            reverse(arr);
        }
        else {
            if(arr[0] == 0){
                int i;
                for (i = 1; i < chars.length; i++)
                    if(arr[i] > 0) break;
                swap(arr,0, i);
            }
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
        int pivot = start;

        while (start < end){
            while (arr[start] <= arr[pivot] && start < end) start++;

            while (arr[end] > arr[pivot] && start <= end) end--;

            if(start < end){
                swap(arr,start,end);
            }
        }
        swap(arr, pivot,end);
        return start;
    }

    private void reverse(int[] arr){
        int start = 0, end = arr.length-1;

        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}
