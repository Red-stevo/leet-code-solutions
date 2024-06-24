package AddTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        while(l1.next != null || l2.next != null){
            if(l1.next == null){


            } else if (l2.next == null) {


            }else {

                l1 = l1.next;
                l2 = l2.next;
            }
        }
    }
}
