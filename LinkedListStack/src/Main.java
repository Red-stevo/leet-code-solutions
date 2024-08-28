import LinkedListStack.Stack;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < 10000000; i++)
            stack.push(random.nextInt(50));

        System.out.println();

        for (int i = 0; i < 100000; i++)
            System.out.print(stack.pop()+",\t");

    }
}