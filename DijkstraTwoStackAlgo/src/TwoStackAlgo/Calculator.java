package TwoStackAlgo;

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
        return null;
    }
}
