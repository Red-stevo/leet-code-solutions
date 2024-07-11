import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {

    public Vertex(T data) {
        this.data = data;
    }

    private List<Vertex<T>> neighbours = new ArrayList<>();
    private Boolean isVisited = false;
    private T data;

    public List<Vertex<T>> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Vertex<T>> neighbours) {
        this.neighbours = neighbours;
    }

    public Boolean getVisited() {
        return isVisited;
    }

    public void setVisited(Boolean visited) {
        isVisited = visited;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}