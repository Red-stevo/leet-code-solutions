
public class SmallestString {

    private Queue queue;

    /*To solve this problem I will implement level order tree traversal
     *for this :-
     *1. I will need to implement a queue.
     *2. Design the traversal.
     */

    public String smallestFromLeaf(TreeNode root) {
        queue = new Queue();
        TreeNode treeNode = root;

        queue.enqueue(treeNode);

        while(true){
            if(treeNode != null){
                //store the children of the node to a queue
                queue.enqueue(treeNode.left);
                queue.enqueue(treeNode.right);

                treeNode = queue.dequeue();
            }else
                break;
        }


        return null;
    }
}



