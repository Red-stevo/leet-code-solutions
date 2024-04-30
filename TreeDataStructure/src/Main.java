import BST.BinarySearchTree;
import BST.Node;
import SmallestString.SmallestString;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final TreeNode root = new TreeNode("Root");
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        SmallestString smallestString = new SmallestString();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Your Integer data : ");
            Integer data = scanner.nextInt();
            binarySearchTree.insertData(data);
        }


        Node node = binarySearchTree.getRoot();


        /*binarySearchTree.printDesc();
        System.out.println();
        binarySearchTree.printAsc();
        System.out.println();
        binarySearchTree.printPreorder();
        System.out.println();
        binarySearchTree.printPostorder();*/
    }

    /*This method is not fully effective in
    * creating more than 6 node, which I will work on later*/
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


    private static void printBinaryTree(){

        TreeNode tempNode;

        tempNode = root;

        // This loop break in only the new node gets a rightful position to be placed.
        while (true) {
            if(!tempNode.getChecked()){
                System.out.print(tempNode.getData());
                tempNode.setChecked(true);
                tempNode = root;
            } else if (tempNode.getLeft() != null && !tempNode.getLeft().getChecked()) {
                tempNode = tempNode.getLeft();
            } else if (tempNode.getRight() != null && !tempNode.getRight().getChecked()) {
                tempNode = tempNode.getRight();
            }else if(tempNode.getLeft().getLeft() != null && !tempNode.getLeft().getLeft().getChecked()){
                tempNode = tempNode.getLeft();
            } else if (tempNode.getLeft().getRight() != null && !tempNode.getLeft().getRight().getChecked()) {
                tempNode = tempNode.getLeft();
            }else if(tempNode.getRight().getLeft() != null && !tempNode.getRight().getLeft().getChecked()){
                tempNode = tempNode.getRight();
            } else if (tempNode.getRight().getRight() != null && !tempNode.getRight().getRight().getChecked()) {
                tempNode = tempNode.getRight();
            }else {
                break;
            }
        }
    }
}