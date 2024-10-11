//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /*Complexity analysis
    * Space complexity : O(1) -> constant space complexity
    * Time complexity : O(n) -> linear, where n is the length of the string
    * */
    public static void main(String[] args) {
        String str1 = "stevemuish";
        String str2 = "vmueisshet";

        Main main = new Main();
        System.out.println(main.isPermutation(str1, str2));
    }

    public boolean isPermutation(String str1, String str2) {
        /*Check if the strings have equal lengths, if not return false.*/
        if (str1.length() != str2.length()) return false;

        /*Initialize variables to hold the string prime product.*/
        long str1Prod = 1, str2Prod = 1;

        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        /*iterate through the String to get the sum of their characters.*/
        for (int i = 0; i < str1.length(); i++) {
            str1Prod *= primes[str1.charAt(i) - 97];
            str2Prod *= primes[str2.charAt(i) - 97];
        }

        /*If the sums are equal, then the isPermutation is true else false*/
        return str1Prod == str2Prod;
    }
}
