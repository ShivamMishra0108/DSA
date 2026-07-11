package LinkedList;

public class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class DisplayList {

     void disRec(Node head) {
        Node temp = head;
        if (temp == null) return;
        System.out.println(temp.val);
        disRec(temp.next);
        System.out.println(temp.val);
    }

    void Display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();

    }

}


public class NodeOfLl{
    public static int get(Node head, int idx){
        Node temp = head;
        for(int i=1;i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(30);
        Node c = new Node(50);
        Node d = new Node(70);
        Node e = new Node(90);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        Display(a);
//        disRec(a);

        System.out.println(get(a, 3));


    }
}



