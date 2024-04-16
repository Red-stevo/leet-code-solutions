import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final TreeNode root = new TreeNode("Root");
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter Your String data : ");
            String data = scanner.next();

            createBinaryTree(data);
        }
    }

    private static void createBinaryTree(String data){

         // This node will be used in the creation process of the tree
        TreeNode tempNode;

        TreeNode newNode = new TreeNode(data);

        tempNode = root;

        // This loop break in only the new node gets a rightful position to be placed.
        while (true) {
            if (tempNode.getLeft() == null) {
                tempNode.setLeft(newNode);
                break;
            } else if (tempNode.getRight() == null) {
                tempNode.setRight(newNode);
                break;
            } else if (tempNode.getLeft().getLeft() == null || tempNode.getLeft().getRight() == null) {
                tempNode = tempNode.getLeft();
            } else if (tempNode.getRight().getLeft() == null || tempNode.getRight().getRight() == null) {
                tempNode = tempNode.getRight();
            }
        }
    }
}