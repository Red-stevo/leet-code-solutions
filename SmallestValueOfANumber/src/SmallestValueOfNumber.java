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

        for(int i : arr){
            System.out.print(i +"\t");
        }

        return number;
    }

    private int[] quickSort(int[] arr, int start, int end){

        int pivot = partition(arr,start,end);


        return arr;
    }

    private int partition(int[] arr, int start, int stop){
        int pivot = arr[start];

        ++start;

        while(start < stop){

            while(start < stop && arr[start] <= pivot){
                arr[start-1]  = arr[start];
                start++;
            }
            while(stop > start && arr[stop] > pivot){
                stop--;
            }
            if(start < stop){
                swap(arr,start,stop);
            }
        }
        arr[start-1] = pivot;
        return start-1;
    }

    private void swap(int[] arr, int point1, int point2){
        int temp = arr[point1];
        arr[point1] = arr[point2];
        arr[point2] = temp;
    }
}
