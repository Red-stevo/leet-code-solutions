package BST;

public class BinarySearchTree {

    private Node root;
    public void insertData(Integer data){
        createBST(root, data);
    }

    /*The method below uses recursion to create a BST*/
    private Node createBST(Node node, Integer data){
        if(node == null)
            node = new Node(data);
        else if (data < node.getData())
            node.setLeft(createBST(node.getLeft(), data));
        else
            node.setRight(createBST(node.getRight(), data));
        return  node;
    }
}
