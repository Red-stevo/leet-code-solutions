//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String hello = "abc";
        String hey = "cba";

        Solution solution = new Solution();
        boolean response = solution.isPermutation(hello, hey);

        System.out.println("Response : "+response);
    }
}