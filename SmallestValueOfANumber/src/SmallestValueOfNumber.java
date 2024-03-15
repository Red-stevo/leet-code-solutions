public class SmallestValueOfNumber {

    public Long solution(long number){
        char[] chars = String.valueOf(number).toCharArray();
        int[] arr = new int[chars.length];
        int pointer = 0;
        for(char i : chars){
            arr[pointer] = Integer.parseInt(String.valueOf(i));
            pointer++;
        }

        arr = quickSort(arr,0,arr.length-1);

        number = 0;

        for(int length = arr.length -1; length >= 0; --length){
            number += ((long) arr[1] * (10^length));
        }

        return number;
    }

    private int[] quickSort(int[] arr, int start, int end){

        if(start >= end) return arr;

        int pivot = partition(arr,start,end);

        quickSort(arr,start,pivot-1);

        quickSort(arr,pivot+1, end);

        return arr;
    }

    private int partition(int[] arr, int start, int stop){
        int pivot = arr[start];

        ++start;

        while(start < stop){

            while(start < stop && arr[start] < pivot){
                arr[start-1]  = arr[start];
                start++;
            }
            while(stop > start && arr[stop] >= pivot){
                stop--;
            }
            if(start < stop){
                swap(arr,start,stop);
            }
        }
        arr[start-1] = pivot;
        return start-1;
    }

    private int partition2(int[] arr, int start, int end){
        int pointer1 = start -1, pointer2;
        for(pointer2 = start ; pointer2  < end; pointer2++){

            if(arr[pointer2] < arr[end]){
                ++pointer1;
                swap(arr,pointer1,pointer2);
            }
            pointer1++;
            swap(arr,pointer1,end);
        }
        return pointer1;
    }


    private void swap(int[] arr, int point1, int point2){
        int temp = arr[point1];
        arr[point1] = arr[point2];
        arr[point2] = temp;
    }
}
