package Stacks;

import java.util.Stack;

class ListNode{
    ListNode next;
    int val;
    ListNode(int val){
        this.val = val;
    }

}
public class removeNodes {
    public static ListNode removeNode(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;

        while(temp != null){
            while(st.size()>0 && st.peek().val < temp.val){
                st.pop();
                st.push(temp);
            }
            while(st.size()>0){
                ListNode top = st.pop();
                top.next = temp;
                temp = top;

            }
        }
        return temp;
    }
}
