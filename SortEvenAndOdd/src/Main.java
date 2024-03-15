public class Main {
    public static void main(String[] args) {

        int[] arr = {9,1,8,2,7,3,6,4,5,5,4,6,3,7,2,8,1,9};
    SortEvenAndOddIndices sortEvenAndOddIndices = new SortEvenAndOddIndices();

    arr = sortEvenAndOddIndices.solutionI(arr);

    for(int i : arr){
        System.out.print(i+"\t");
    }
    }
}