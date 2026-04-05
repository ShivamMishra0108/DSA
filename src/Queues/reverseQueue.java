package Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        reverse2(q);

        System.out.println(q);


    }
    public static  void reverse(Queue<Integer> q){
        int top = q.remove();
        reverse(q);
        q.add(top);
    }

    public  static  void reverse2(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();

        while (q.size()>0){
            st.push(q.remove());
        }
        while (st.size()>0){
            q.add(st.pop());
        }
    }
}
