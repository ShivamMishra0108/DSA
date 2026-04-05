package Stacks;

import java.util.Stack;

public class BasicOperations {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st+ " "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        int s = st.pop();
        System.out.println(s);

        st.push(40);
        st.push(60);
        st.push(80);

        Stack<Integer> st2 = new Stack<>();

        while(st.size()>0){
            System.out.print(st2.push(st.pop())+" ");
        }

        System.out.println();
        while(st2.size()>0){
            System.out.print(st.push(st2.pop())+" ");
        }

    }
}
