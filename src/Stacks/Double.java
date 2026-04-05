package Stacks;

import java.util.LinkedList;
import java.util.Stack;

public class Double {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(8);
        ll.add(9);

        ListNode head = new ListNode(1);
        head.next = new ListNode(8);
        head.next.next = new ListNode(9);

        System.out.println(doubleIt(head));

    }

    public static ListNode doubleIt(ListNode head) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        ListNode t1 = head;

        while(t1 != null){
            st.push(t1.val);
            t1 = t1.next;
        }
        int c = 0;

        while(st.size()>0){
            if((st.peek()*2)+c <10){
                st2.push(st.peek()*2+c);
                c = 0;
                st.pop();
            }
            else{
                int m = (st.peek()*2+c)%10;
                c = (st.peek()*2+c)/10;
                st2.push(m);
                st.pop();
            }
        }
        if(c != 0){
            st2.push(c);
        }


        while (st.size()>0){
            ListNode t2 = new ListNode(st2.pop());
             t2.next = new ListNode(st2.pop());
             t2.next.next = new ListNode(st2.pop());

        }
        return head;

    }
}
