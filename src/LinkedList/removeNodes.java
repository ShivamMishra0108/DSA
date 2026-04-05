package LinkedList;

import java.util.LinkedList;


public class removeNodes {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();


    }
    public static Node remove(Node head){

        Node i = head;
        Node j = head;
        j = j.next;
        while(j != null){
            if(j.val >= i.val){
                i.next = j;
                i = j;
            }
            else{
                j = j.next;
            }
        }

        return i;

    }


    public static Node reverseList(Node head) {

        if (head == null || head.next == null) return head;
        Node a = head.next;
        head.next = null;
        Node b = reverseList(a);
        a.next = head;
        return b;
    }

    void Display(Node head){
        if(head==null)return;
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
