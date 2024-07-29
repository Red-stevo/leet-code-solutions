package Kruskal;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Help {

    private List<Node<Character>> nodes;

    private List<Edge<Character>> edges;

}
