public class MergeSort {

    public void mergeSort(int[] Array){
        int arrayLength = Array.length;
         if(arrayLength <= 1)
             return;
         int mid = arrayLength/2;

         //create the new arrays.
        int[] leftArray = new int[mid];

        int[] rightArray = new int[arrayLength-mid];

        //copy the numbers into the new array.
        System.arraycopy(Array, 0, leftArray, 0, mid);

        System.arraycopy(Array, mid, rightArray, 0, rightArray.length);

        //recursive splitting.
        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(Array,leftArray,rightArray);

    }

    private void merge(int[] pArray, int[] lArray, int[] rArray){
        int i=0, j=0, k=0;

        while (i < lArray.length && j < rArray.length) {
            if (lArray[i] < rArray[j]) {
                pArray[k] = lArray[i];
                k++;
                i++;
            }else {
                pArray[k] = rArray[j];
                k++;
                j++;
            }
        }

        while (i < lArray.length){
            pArray[k] = lArray[i];
            k++;
            i++;
        }

        while (j < rArray.length){
            pArray[k] = rArray[j];
            j++;
            k++;
        }
    }
}
