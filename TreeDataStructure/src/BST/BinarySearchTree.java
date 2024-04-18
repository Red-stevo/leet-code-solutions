package BST;

public class BinarySearchTree {

    private Node root;
    public void insertData(Integer data){
        root = createBST(root, data);
    }

    public void printInorder(){
        inorder(root);
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


    //method to print the BST using recursion(inorder tree traversal).
    private void inorder(Node node) {
        if (node != null) {
            inorder(node.getRight());
            System.out.print("==> " + node.getData());
            inorder(node.getLeft());
        }
    }


    private void preorder(Node node){
        if(node != null){

        }
    }
}
