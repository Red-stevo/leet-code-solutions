import LinkedListQueue.Queue;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            queue.enqueue(random.nextInt(100));
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(queue.dequeue()+"\t");
        }
    }
}