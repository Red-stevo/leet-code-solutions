package LinkedListStack;

public class Stack<T> {
    private Node<T> lastIn = null;

    public void push(T data){
        Node<T> node = new Node<>(data);
        node.setNextNode(null);
        node.setPreviousNode(null);

        if(lastIn == null){
              lastIn = node;
              return;
        }
        node.setPreviousNode(lastIn);
        lastIn.setNextNode(node);
        lastIn = node;
    }

    public T pop(){
        if(lastIn == null){
            System.out.println("The Stack is empty.");
            System.exit(0);
        }

        T data = lastIn.getData();

        lastIn = lastIn.getPreviousNode();

        return data;
    }
}
