package org.example;

import Kruskal.Edge;
import Kruskal.Help;
import Kruskal.Node;
import lombok.Data;


import java.util.List;

@Data
public class Main {

    public static void main(String[] args) {

        List<Node<Character>> nodes = null;

        List<Edge<Character>> edges = null;

        Help helper = createGraph();

        nodes = helper.getNodes();

        edges = helper.getEdges();


    }

    public static Help createGraph(){
        List<Node<Character>> nodes = null;
        List<Edge<Character>> edges = null;

        Node<Character> nodeA = new Node<>('A');
        Node<Character> nodeB = new Node<>('B');
        Node<Character> nodeC = new Node<>('C');
        Node<Character> nodeD = new Node<>('D');
        Node<Character> nodeE = new Node<>('E');

        nodes = List.of(nodeA, nodeB,nodeC, nodeD, nodeE);

        //create the graph;
        edges = List.of(
                new Edge<>(3, nodeA, nodeB),
                new Edge<>(4, nodeB, nodeD),
                new Edge<>(2, nodeB, nodeC),
                new Edge<>(5, nodeD, nodeC),
                new Edge<>(3, nodeE, nodeB),
                new Edge<>(1, nodeA, nodeE),
                new Edge<>(11, nodeE, nodeD)
                );

        return new Help(nodes, edges);
    }
}