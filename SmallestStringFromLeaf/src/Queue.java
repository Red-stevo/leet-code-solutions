import java.util.ArrayList;

public class Queue {
    private int start, end = -1;

    private ArrayList<TreeNode> treeNodes = new ArrayList<>();

    public void enqueue(TreeNode treeNode) {
        if (end == -1) end++;
        start++;
        treeNodes.add(start, treeNode);
        }

    public TreeNode dequeue(){
       if(isEmpty()){
          return null;
       }
        end++;
      return treeNodes.get(end-1);
    }

    private Boolean isEmpty(){
        if(end == start) end = start = -1;
        return start == end;
    }
}
