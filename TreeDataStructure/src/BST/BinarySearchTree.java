package BST;

public class BinarySearchTree {

    private Node root;
    public void insertData(Integer data){
        root = createBST(root, data);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void printDesc(){
        inorderDesc(root);
    }

    public void printAsc(){
        inorderAsc(root);
    }

    public void printPreorder(){
        preorder(root);
    }

    public void printPostorder(){
        postorder(root);
    }
    private void inorderAsc(Node node) {
        if (node != null) {
            inorderAsc(node.getLeft());
            System.out.print("==> " + node.getData());
            inorderAsc(node.getRight());
        }
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
    private void inorderDesc(Node node) {
        if (node != null) {
            inorderDesc(node.getRight());
            System.out.print("==> " + node.getData());
            inorderDesc(node.getLeft());
        }
    }


    private void preorder(Node node){
        if(node != null){
            System.out.print("==> "+node.getData());
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    private void postorder(Node node){
        if(node != null){
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print("==> "+node.getData());
        }
    }
}
