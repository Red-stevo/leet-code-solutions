package LinkedListQueue;

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


    }
}
