public class PalindromeCheck {

    public Boolean check(String word){

        /*variable used in the code*/
        int end = word.length() -1 ; //this is the pointer to the last character in the word(also in the char array);

        /*Convert the word into an array of characters*/
        char[] wordArray = word.toCharArray();

        /*Loop throw the character to determine whether it is an array*/
        for (int i = 0 ; i < end ; i++){
            if(wordArray[i] != wordArray[end]) //if only one of the characters fails to meet the conditions
                return false; //check for palindrome fails.
            end--;
        }
        return  true;
    }
}
