package DFS;

import java.util.Stack;

public class DepthFirstSearch {

    public void dfs(Node root){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node node = stack.pop();

            if(node.isVisited())
                continue;

            node.setVisited(true);
            System.out.println(node.getData());
            if(node.getChildren() != null)
               stack.addAll(node.getChildren());
        }
    }
}
