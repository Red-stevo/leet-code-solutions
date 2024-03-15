public class SmallestValueOfNumber {

    public Long solution(long number){
        char[] chars = String.valueOf(number).toCharArray();
        int[] arr = new int[chars.length];
        int pointer = 0;
        for(int i : chars){
            arr[pointer] = i;
        }

        arr = quickSort(arr,0,arr.length);

        for(int i : arr){
            System.out.println("SmallestValueOfNumber.solution");
            System.out.println(i +"\t");
        }

        return number;
    }

    private int[] quickSort(int[] arr, int start, int end){

        int pivot = partition(arr,start,end);



    }

    private int partition(int[] arr, int start, int stop){
        int pivot = start;

        while(start < stop){
                while(arr[start] <= arr[pivot] && start < stop)
                    ++start;
                while(arr[stop] > arr[pivot] && stop >= start)
                    --stop;

                swap(arr,start, stop);
        }
        swap(arr,pivot,stop);
        return stop;
    }

    private void swap(int[] arr, int point1, int point2){
        int temp = arr[point1];
        arr[point1] = arr[point2];
        arr[point2] = temp;
    }
}
