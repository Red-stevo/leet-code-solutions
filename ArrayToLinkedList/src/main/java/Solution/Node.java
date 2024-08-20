package Solution;

import lombok.Data;

@Data
public class Node {

    public Node(int data){
        this.data = data;
    }

    private int data;

    private Node nextNode;

    private Node previousNode;

}
