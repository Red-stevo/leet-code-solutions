package BFS;

import DFS.Node;

import javax.swing.plaf.IconUIResource;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public void bfs(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node node = queue.poll();
            if(node.isVisited())
                continue;
            System.out.println(node.getData());
            node.setVisited(true);
            if(node.getChildren() != null)
                queue.addAll(node.getChildren());
        }
    }
}
