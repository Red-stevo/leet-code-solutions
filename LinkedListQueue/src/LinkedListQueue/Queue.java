package LinkedListQueue;

import java.util.logging.Logger;

public class Queue<T> {

    private Node<T> firstIn = null;

    private Node<T> lastIn = null;

    public void enqueue(T data){
        Node<T> node = new Node<>(data);
        node.setNextNode(null);
        node.setPreviousNode(null);

        if (firstIn == null && lastIn == null){
            firstIn = lastIn = node;
            return;
        }

        node.setPreviousNode(firstIn);
        firstIn.setNextNode(node);
        firstIn = node;
    }

    public T dequeue(){
      if(firstIn == null){
          System.out.println("Error, Queue is empty.");
          System.exit(1);
      }

      T data = firstIn.getData();
      firstIn = firstIn.getNextNode();

      return data;
    }
}
