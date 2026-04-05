package Stacks;

import java.util.Stack;

public class pushBottomRecursive {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);

        push(st,5);
        System.out.println(st);

        pushAtBottom(st, 1);
        System.out.println(st);
    }
    public static void push(Stack<Integer> st, int ele){
        if(st.size() == 0){
            st.push(ele);
            return;
        }
        Stack<Integer> st2 = new Stack<>();
        st2.push(st.pop());
        push(st,ele);
        st.push(st2.pop());
    }

    public static void pushAtBottom(Stack<Integer> st ,int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,ele);
        st.push(top);
    }

}
