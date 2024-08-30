import TwoStackAlgo.Calculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String problem = "(2520/(10 + ((120 + 12) + 110)))";
        Double result = calculator.calculate(problem);

        System.out.println(problem+" = "+result);
    }
}