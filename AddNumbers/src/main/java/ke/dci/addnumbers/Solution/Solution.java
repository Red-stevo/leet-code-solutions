package ke.dci.addnumbers.Solution;

import ke.dci.addnumbers.Model.Node;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {


    /**
     *
     * @param nums a list of number to be added into a linked list
     * @return root node of the generated linked list.
     *
     */
    public Node generateList(int[] nums) {

        Node root = null, temp = null;

        for (int i : nums){
            Node newNode = Node.builder().val(i).build();

            if (root == null) {
                root = newNode;
                temp = root;
            }else {
                temp.setNext(newNode);
                temp = temp.getNext();
            }
        }
        return root;
    }


    /**
     *
     * @param node1 a linked list of numbers.
     * @param node2 a linked list of numbers.
     * @return a new node that has a linked list of the sum of node1 and node2.
     *
     */
    public Node add(Node node1, Node node2){
        int rem = 0;
        Node node = null, temp = null;

        while (true) {
            if (node1 != null && node2 != null) {

                String sum = String.valueOf((node1.getVal() + node2.getVal() + rem));

                System.out.println("sum "+sum);
                System.out.println("Rem"+ rem);

                Node ans = null;

                if (sum.length() > 1) {
                    ans = Node.builder().val(Integer.parseInt(String.valueOf(sum.charAt(1)))).build();
                    rem = Integer.parseInt(String.valueOf(sum.charAt(0)));

                    System.out.println("has rem."+ sum.charAt(0));
                }else {
                    ans = Node.builder().val(Integer.parseInt(sum)).build();
                    rem = 0;
                }

                if (node == null){
                    node = ans;
                    temp = node;
                } else {
                    temp.setNext(ans);
                    temp = temp.getNext();
                }

                node1 = node1.getNext();
                node2 = node2.getNext();
            }else if(node1 != null) {

                node1 = node1.getNext();
            } else if (node2 != null) {


                node2 = node2.getNext();
            }else {
                if (rem > 0){
                    temp.setNext(Node.builder().val(rem).build());
                }
                break;
            }
        }

        return node;
    }


}
