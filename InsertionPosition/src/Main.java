//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {20,34,45,78,86,99,107,110,123,134};
        int num = 89;
        Solution solution = new Solution();

        int index = solution.insertNum(arr,num);
        System.out.println("The position to insert the element is: " + index);

    }
}