public class SortEvenAndOddIndices {
    public int[] solutionI(int[] arr){

        for(int j = 1 ; j < arr.length; j =+2){
            int h = j -1;
            for(int i = 1; i < arr.length; i+=2){
                int k = i - 1;

                if(arr[k] > arr[h]){
                    swap(arr, k, h);
                }

                if(arr[i] < arr[j]){
                    swap(arr, i,j);
                }
            }
        }

        return null;
    }

    private void swap(int[] array, int first, int last){
        int temp = array[first];
        array[first] = array[last];
        array[last] = temp;
    }

}
