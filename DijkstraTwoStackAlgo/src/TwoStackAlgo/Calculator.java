package TwoStackAlgo;

import LinkedListStack.Stack;

import java.util.logging.Logger;

/**
 * The Algorithm performs the calculation give a string of the form
 *  (2*((3+4)+5))
 * Working of the algorithm
 *  1. Create two stacks. One for the numbers and on for the arithmetic operators.
 *  2. Traverse the string from left to right,
 *      if we find a '(' we ignore it.
 *      if we find '\d' we push it to the number stack.
 *      if we find (+|*|-|/) we push the sign to the arithmetic operators stack.
 *      if we find ')' we pop the two 2 numbers and the top operator, and perform the arithmetic on them.
 *      Push the result to the number stack.
 *  3. Repeat step 2 until we get to the end of the stack.
 *  4. The result of the operation number remaining in the stack.
 */
public class Calculator {

    public Double calculate(String arithmeticProblem){
        Stack<Character> arithmeticStack = new Stack<>();
        Stack<Double> numbersStack = new Stack<>();

        for (int i = 0; i < arithmeticProblem.length(); i++) {
            if(arithmeticProblem.charAt(i) == '(' || arithmeticProblem.charAt(i) == ' ')
                continue;
            else if (arithmeticProblem.charAt(i) == '+' || arithmeticProblem.charAt(i) == '*'
            || arithmeticProblem.charAt(i) == '/' || arithmeticProblem.charAt(i) == '-') {
                arithmeticStack.push(arithmeticProblem.charAt(i));
            } else if (arithmeticProblem.charAt(i) == ')') {
                Double firstNumber, secondNumber;
                char operator = arithmeticStack.pop();
                secondNumber = numbersStack.pop();
                firstNumber = numbersStack.pop();

                numbersStack.push(performCalculation(firstNumber, operator, secondNumber));

            } else if (checkNumber(arithmeticProblem.charAt(i))) {
                numbersStack.push(Double.parseDouble(String.valueOf(arithmeticProblem.charAt(i))));
            }
        }
        return null;
    }

    private Double performCalculation(Double firstNumber, char operator, Double secondNumber) {
        if (operator == '+')
            return firstNumber + secondNumber;
        else if(operator == '*')
            return firstNumber * secondNumber;
        else if (operator == '-')
            return firstNumber - secondNumber;
        else
            return  firstNumber / secondNumber;
    }

    private boolean checkNumber(char c) {
        try {
            Double.parseDouble(String.valueOf(c));
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Invalid Character.");
            System.exit(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
