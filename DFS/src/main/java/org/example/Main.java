package org.example;

import DFS.DepthFirstSearch;
import DFS.Node;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        Node root = createGraph();
        depthFirstSearch.dfs(root);

    }

    public static Node createGraph(){

        Node nodeK = new Node('K');
        Node nodeJ = new Node('J');
        Node nodeL = new Node('L');
        Node nodeE = new Node('E');
        Node nodeF = new Node('F');
        Node nodeH = new Node('H');
        Node nodeM = new Node('M');
        Node nodeN = new Node('N');
        Node nodeD = new Node('D');
        Node nodeI = new Node('I');
        Node nodeG = new Node('G');
        Node nodeO = new Node('O');
        Node nodeC = new Node('C');
        Node nodeB = new Node('B');
        Node nodeA = new Node('A');

        nodeA.setChildren(List.of(nodeB, nodeC));
        nodeB.setChildren(List.of(nodeO, nodeG));
        nodeC.setChildren(List.of(nodeI, nodeD));
        nodeD.setChildren(List.of(nodeM, nodeN));
        nodeO.setChildren(List.of(nodeK, nodeJ));
        nodeG.setChildren(List.of(nodeL, nodeE));
        nodeI.setChildren(List.of(nodeF, nodeH));
        nodeJ.setChildren(null);
        nodeK.setChildren(null);
        nodeL.setChildren(null);
        nodeM.setChildren(null);
        nodeN.setChildren(null);
        nodeE.setChildren(null);
        nodeF.setChildren(null);
        nodeH.setChildren(null);

        return nodeA;
    }
}