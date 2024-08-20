package Solution;

public class ToLinkedList {

    public Node toLinkedList(int[] array){

        Node root = null;
        Node temp = null;

        for (int i : array){
            Node node = new Node(i);

            if (root == null){
                root = node;
                node.setPreviousNode(null);
                temp = node;
            }else {
                temp.setNextNode(node);
                node.setPreviousNode(temp);
                temp = temp.getNextNode();
            }
        }
        return root;
    }
}
