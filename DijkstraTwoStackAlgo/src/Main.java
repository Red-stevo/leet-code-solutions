import TwoStackAlgo.Calculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String problem = "(2-((8+(5*2)-9)/7) + (5-3)+(2+9))";
        Double result = calculator.calculate(problem);

        System.out.println(problem+" = "+result);
    }
}