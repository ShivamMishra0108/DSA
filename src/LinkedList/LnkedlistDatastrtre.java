//package LinkedList;
//
// public class Node {
//    int val;
//    public Node next;
//
//    Node(int val) {
//        this.val = val;
//    }
//}
//
//
//class LinkedList{
//    Node head;
//    Node tail;
//    int size;
//
//
//    void addAthead(int val){
//        Node temp = new Node(val);
//        if(head==null)head = tail = temp;
//        else{
//            temp.next = head;
//            head = temp;
//        }
//        size++;
//    }
//
//    void addAtTail(int val){
//        Node temp = new Node(val);
//        if(tail==null){
//            head = tail = temp;
//        }else
//        {
//            tail.next = temp;
//            tail = temp;
//        }
//        size++;
//    }
//
//    void deleteAtHEad(){
//        if(head == null){
//            System.out.println("List is empty");
//            return;
//        }
//        head = head.next;
//        if(head==null)tail=null;
//        size--;
//    }
//
//    void Display(){
//        if(head==null)return;
//        Node temp = head;
//        while (temp!=null){
//            System.out.print(temp.val+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    int searchIdx(int val){
//        if (head==null)return -1;
//        Node temp = head;
//        int idx = 0;
//        while (temp!=null){
//            if(temp.val==val)return idx;
//            temp = temp.next;
//            idx++;
//        }
//        return idx;
//    }
//
//    void insert(int idx, int val){
//        if(idx<0 || idx>size){
//            System.out.println("Invalid idx");
//            return;
//        }
//        if(idx ==0)addAthead(val);
//        if(idx==size)addAtTail(val);
//        else{
//            Node temp = head;
//            for(int i=1; i<idx; i++){
//                temp = temp.next;
//            }
//            Node x = new Node(val);
//            x.next = temp.next;
//            temp.next = x;
//            size++;
//        }
//    }
//
//    int get(int idx){
//        Node temp = head;
//        for(int i=1; i<=idx; i++){
//            temp= temp.next;
//        }
//        return temp.val;
//    }
//
//    void delete(int idx){
//        if(idx<0 || idx >=size){
//            System.out.println("Invalid idx");
//            return;
//        }
//        if(idx == 0){
//            deleteAtHEad();
//            return;
//        }
//        Node temp = head;
//        for(int i=1; i<idx; i++){
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//        if(idx == size-1)tail = temp;
//        size --;
//    }
//
////    void deleteElement(int val){
////        if()
////    }
//
//
//}
//
//public class LnkedlistDatastrtre {
//    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//
//
//        ll.addAtTail(10);
//        ll.addAtTail(20);
//        ll.addAtTail(30);
//        ll.addAtTail(40);
//        ll.addAtTail(50);
//        ll.addAtTail(60);
//
//        ll.addAthead(5);
//        ll.Display();
//
//
//        ll.deleteAtHEad();
//        ll.Display();
//
//
//
//        System.out.println( ll.searchIdx(40));
//
//        ll.insert(3,35);
//
//        ll.Display();
//        System.out.println(ll.size);
//
//        System.out.println(ll.get(4));
//
//        ll.delete(2);
//        ll.Display();
//
//    }
//}
