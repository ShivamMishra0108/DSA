package Stacks;

import java.util.Stack;

public class removeAddAtIdx {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int idx = 2;

        Stack<Integer> st2 = new Stack<>();

        while(st.size()>idx+1){
            st2.push(st.pop());
        }
        System.out.println(st.peek());

        System.out.println(st2);

        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.print(st);

    }
}
