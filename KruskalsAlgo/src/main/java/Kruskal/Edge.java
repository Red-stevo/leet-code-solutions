package Kruskal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Edge<T> implements Comparable<Edge<T>> {

    private int weight;

    private Node<T> source;

    private Node<T> destination;

    @Override
    public int compareTo(Edge<T> edge) {
        return Integer.compare(this.weight, edge.getWeight());
    }
}
