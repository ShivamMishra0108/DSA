package DoublyLinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
    }
}

class DLL{
    ListNode head;
    ListNode tail;
    int size;

    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head == null)head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head == null)head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead(){
        head = head.next;
        head.prev = null;
        size--;

    }

    void deleteAtTail(){
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    void insertElement(int idx, int val){
        ListNode t = head;
        ListNode a = new ListNode(val);
        for(int i=1; i<idx; i++){
            t = t.next;
        }
        a.next = t.next;
        a.next.prev = a;
        t.next = a;
        a.prev  = t;

        size ++;
    }

    // IF LL HAS ONLY ONE ELEMENT:

    void deleteElement(){
        head = tail = null;
    }

    void Display(){
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void DisplayReverse(){
        ListNode temp = tail;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }


}

public class DoubleyLL {
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);

        list.Display();
        list.DisplayReverse();

//        list.deleteAtHead();
//        list.deleteAtTail();

        list.insertElement(1,35);

        list.DisplayReverse();




    }
}
