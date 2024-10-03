public class Solution {

    public boolean isPermutation(String str1, String str2){
        /*Check if the strings have equal lengths, if not return false.*/
        if (str1.length() != str2.length()) return false;
        /*Initialize variable to hold string int values sum.*/
        int str1Sum = 0, str2Sum = 0;

        /*iterate through the String to get the sum of their characters.*/
        for (int i = 0; i < str1.length(); i++) {
            str1Sum += str1.charAt(i);
            str2Sum += str2.charAt(i);
        }

        /*If the sums are equal, then the isPermutation is true else false*/
        return str1Sum == str2Sum;
    }
}
