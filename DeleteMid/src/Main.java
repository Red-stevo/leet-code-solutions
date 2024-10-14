
/*
* public class Node {
*    public Node(Character value) {
*        this.value = value;
*        this.nextNode = null;
*    }
*
*    Character value;
*
*    Node nextNode;
*}
*
*
*
* */

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        char[] values = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        Node root = main.createLinkedList(values);
        main.print(root);
        main.deleteMidNode(root, 'b');
        System.out.println();
        main.print(root);


    }

    //delete the "mid-node".
    public void deleteMidNode(Node node, char c){
        //handle null root.
        if (node == null) return;

        //traverse the linkedList to delete the node.
        //node.nextNode.nextNode != null -> prevent deleting from the end(last) node.
        while (node.nextNode.nextNode != null){
            /*Help prevent first node deletion and look-forward for the node to delete.*/
            if (node.nextNode.value == c){
                node.nextNode = node.nextNode.nextNode;
                return;
            }
            node = node.nextNode;
        }
    }


    //print linked list
    public void print(Node root){
        while (root != null){
            System.out.print(root.value+"\t");
            root = root.nextNode;
        }
    }

    //Method to create the linked list.
    public Node createLinkedList(char[] values){
        Node rootNode = null, temp = null;

        for (char c : values){
            Node node = new Node(c);

            if (rootNode == null)
                rootNode = temp= node;

            temp.nextNode = node;
            temp = temp.nextNode;
        }
       return rootNode;
    }
}