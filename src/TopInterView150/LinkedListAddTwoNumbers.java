package TopInterView150;

import LinkedList.ListNode;

public class LinkedListAddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode t3 = dummy;

        ListNode t1 = l1;
        ListNode t2 = l2;
        int carry = 0;

        while(t1 != null || t2 != null || carry != 0){
            int v1 = (t1 != null)?t1.val:0;
            int v2 = (t2 != null)?t2.val:0;

            int sum = v1+v2+carry;
            carry = sum/10;

            t3.next = new ListNode(sum%10);
            t3 = t3.next;

            if(t1 != null)t1 = t1.next;
            if(t2 != null)t2 = t2.next;

        }
        return dummy.next;
    }
}
