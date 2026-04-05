package Stacks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class NextGreaterLinkedList {
    public static void main(String[] args) {

        Node head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(5);

        System.out.println(Arrays.toString(sol(head)));

    }
    public static int[] sol(Node head) {

        if (head == null) {
            return new int[0];
        }

        ArrayList<Integer> arr = new ArrayList<>();

        Node temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        int n = arr.size();
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr.get(i)) {
                st.pop();
            }

            if(st.isEmpty())ans[i] =0 ;
            else ans[i] =st.peek();
            st.push(arr.get(i));
        }

        return ans;
    }







//    public static int[] sol(Node head){
//
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        Node temp = head;
//        while(temp != null){
//            arr.add(temp.val);
//            temp = temp.next;
//        }
//
//        int n = arr.size();
//
//        int [] ans = new int[n];
//        ans[n-1] = 0;
//
//        Stack<Integer> st = new Stack<>();
//        st.push(arr.get(n - 1));
//
//        for(int i=n-2; i>=0; i++){
//            while (!st.isEmpty() && st.peek() <= arr.get(i)) {
//                st.pop();
//            }
//
//            if(st.size() == 0)ans[i] =0;
//            else ans[i] = st.peek();
//            st.push(arr.get(i));
//
//        }
//
//        return ans;
//    }
}
