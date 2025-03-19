package ke.dci.addnumbers.Solution;

import ke.dci.addnumbers.Model.ListNode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {


    /**
     *
     * @param nums a list of number to be added into a linked list
     * @return root ListListNode of the generated linked list.
     *
     */
    public ListNode generateList(int[] nums) {

        ListNode root = null, temp = null;

        for (int i : nums){
            ListNode newListNode = new ListNode(i);

            if (root == null) {
                root = newListNode;
                temp = root;
            }else {
                temp.next = newListNode;
                temp = temp.next;
            }
        }
        return root;
    }


    /**
     *
     * @param l1 a linked list of numbers.
     * @param l2 a linked list of numbers.
     * @return a new ListNode that has a linked list of the sum of l1 and l2.
     *
     */
    public ListNode add(ListNode l1, ListNode l2){
        boolean check = false;
        int rem = 0;
        ListNode ListNode = null, temp = null;

        while (true) {
            if (l1 != null && l2 != null) {
                String sum = String.valueOf((l1.val + l2.val + rem));
                ListNode ans = null;
                if (sum.length() > 1) {
                    ans = new ListNode(Integer.parseInt(String.valueOf(sum.charAt(1))));
                    rem = Integer.parseInt(String.valueOf(sum.charAt(0)));
                    check = true;
                }else {
                    ans = new ListNode(Integer.parseInt(sum));
                    if (ans.val > 0) check = true;
                    rem = 0;
                }

                if (ListNode == null){
                    ListNode = ans;
                    temp = ListNode;
                } else {
                    temp.next = ans;
                    temp = temp.next;
                }

                l1 = l1.next;
                l2 = l2.next;
            }else if(l1 != null) {
                ListNode listNode2 = l1;
                int rem1 = rem;
                ListNode listNode = ListNode;
                ListNode temp1 = temp;
                boolean check1 = check;
                while (true){
                    if (listNode2 == null) {
                        if (rem1 > 0)
                            temp1.next = new ListNode(rem1);
                        return check1 ? listNode : new ListNode(0);
                    }


                    String sum = String.valueOf((listNode2.val + rem1));
                    ListNode ans;

                    if (sum.length() > 1) {
                        ans = new ListNode(Integer.parseInt(String.valueOf(sum.charAt(1))));
                        rem1 = Integer.parseInt(String.valueOf(sum.charAt(0)));
                        check1 = true;
                    }else {
                        ans = new ListNode(Integer.parseInt(sum));
                        if (ans.val > 0) check1 = true;
                        rem1 = 0;
                    }

                    if (listNode == null){
                        listNode = ans;
                        temp1 = listNode;
                    } else {
                        temp1.next = ans;
                        temp1 = temp1.next;
                    }

                    listNode2 = listNode2.next;
                }

            } else if (l2 != null) {
                ListNode listNode2 = l2;
                int rem1 = rem;
                ListNode listNode = ListNode;
                ListNode temp1 = temp;
                boolean check1 = check;
                while (true){
                    if (listNode2 == null) {
                        if (rem1 > 0)
                            temp1.next = new ListNode(rem1);
                        return check1 ? listNode : new ListNode(0);
                    }


                    String sum = String.valueOf((listNode2.val + rem1));
                    ListNode ans;

                    if (sum.length() > 1) {
                        ans = new ListNode(Integer.parseInt(String.valueOf(sum.charAt(1))));
                        rem1 = Integer.parseInt(String.valueOf(sum.charAt(0)));
                        check1 = true;
                    }else {
                        ans = new ListNode(Integer.parseInt(sum));
                        if (ans.val > 0) check1 = true;
                        rem1 = 0;
                    }

                    if (listNode == null){
                        listNode = ans;
                        temp1 = listNode;
                    } else {
                        temp1.next = ans;
                        temp1 = temp1.next;
                    }

                    listNode2 = listNode2.next;
                }

            }else {
                if (rem > 0){
                    temp.next = new ListNode(rem);
                }
                break;
            }
        }

        return check ? ListNode : new ListNode(0);
    }

}
