public class Solution {

    //method for inserting an element in an array
    public int insertNum(int[] arr,int num){
        for(int i = 0;i< arr.length; i++){
            if(arr[i] < num){
                continue;
            }
            return i;
        }
        return arr.length;
    }

}
