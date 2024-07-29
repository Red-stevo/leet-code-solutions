package Kruskal;

import lombok.Data;

import java.util.List;

@Data
public class Node<T> {

    public Node(T data) {
        this.data = data;
    }

    private T data;

    private List<Node<T>> neighbours;

    private boolean isVisited;

}
