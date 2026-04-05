package LinkedList;


import java.util.ArrayList;

class reverseLinkedList {


    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode a = head.next;
        head.next = null;
        ListNode b = reverse(a);
        a.next = head;
        return b;
    }


  public ListNode reverseList(ListNode head){
     ListNode c = head;
     ListNode p = null;
     ListNode f = head;

     if(head == null )return head;
     while(c != null){
         f = c.next;
         c.next = p;
         p = c;
         c = f;
     }
     return p;

  }




     public ListNode reverseLis(ListNode head) {
         if(head == null)return head;
         ArrayList<ListNode> arr = new ArrayList<>();
         ListNode temp = head;
         while(temp != null){
             arr.add(temp);
             temp = temp.next;
         }
         int n = arr.size();

         for(int i=n-1; i>=1; i--){
             arr.get(i).next = arr.get(i-1);

         }
         arr.get(0).next = null;
         return arr.get(n-1);


     }

}