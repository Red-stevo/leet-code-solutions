package Kruskal;

import lombok.Data;

import javax.swing.*;
import java.util.List;

@Data
public class Node<T> {

    public Node(T data) {
        this.data = data;
        this.parent = data;
        this.rank = 0;
    }

    private T data;

    private List<Node<T>> neighbours;

    private boolean isVisited;

    private int rank;

    private T parent;

}
