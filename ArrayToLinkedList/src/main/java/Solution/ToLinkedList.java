package Solution;

public class ToLinkedList {

    public Node toLinkedList(int[] array){

        Node root = null;

        for (int i : array){

            Node node = new Node(i);

            if (root == null){
                root = node;
            }
        }
        return root;
    }
}
