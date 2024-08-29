import LinkedListQueue.Queue;

import java.util.Random;

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