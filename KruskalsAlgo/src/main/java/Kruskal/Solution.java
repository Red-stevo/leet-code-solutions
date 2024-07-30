package Kruskal;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

@Data
@AllArgsConstructor
public class Solution {

    private List<Node<Character>> nodes;

    private List<Edge<Character>> edges;
    public void solution(){
        PriorityQueue<Edge<Character>> queue = new PriorityQueue<>();
        List<Edge<Character>> MST = new ArrayList<>();
        queue.addAll(edges);
        int edgeCount = 0;

        while (edgeCount < nodes.size()-1){
            Edge<Character> edge = queue.poll();

            Node<Character> source = edge.getSource();
            Node<Character> destination = edge.getDestination();

            if(getAbsoluteParent(nodes, source) != getAbsoluteParent(nodes, destination)){
                MST.add(edge);
                ++edgeCount;

                if (source.getRank() <= destination.getRank()) {
                    destination.setParent(source.getData());
                    if(source.getRank() == destination.getRank())
                        source.setRank(source.getRank()+1);
                }else {
                    source.setParent(destination.getData());
                }

            }
        }

        int mst = 0;
        for (Edge<Character> edge : MST){
            mst +=edge.getWeight();
            System.out.println(edge.getSource().getData()+"-"+edge.getWeight()+"-"+edge.getDestination().getData());
        }
        System.out.println(mst);
    }

    private Character getAbsoluteParent(List<Node<Character>> nodeMatrix, Node<Character> node){

        if(node.getData() == node.getParent())
            return node.getData();

        for (Node<Character> parent: nodeMatrix)
            if(node.getParent() == parent.getData()){
                node = parent;
                break;
            }
        return getAbsoluteParent(nodeMatrix, node);
    }

}
