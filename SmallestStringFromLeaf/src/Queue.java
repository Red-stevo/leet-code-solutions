public class Queue {

    private int start, end = -1;

    private int full = 100;
    private TreeNode[] queue = new TreeNode[full];

    public void enqueue(){
        start++;
        if(end == -1) end++;
    }

    public TreeNode dequeue(){
        end++;

      return null;
    }

    private Boolean isEmpty(){
        return start == end;
    }

    private Boolean isFull(){
        return start == full;
    }
}
