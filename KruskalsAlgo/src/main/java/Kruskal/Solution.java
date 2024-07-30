package Kruskal;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

@Data
@AllArgsConstructor
public class Solution {

    private List<Node<Character>> nodes;

    private List<Edge<Character>> edges;
    public void solution(){
        PriorityQueue<Edge<Character>> queue = new PriorityQueue<>();
        queue.addAll(edges);

        System.out.println(nodes);
        int edgeCount = 0;


        while (edgeCount < nodes.size()){
            break;
        }


    }

}
