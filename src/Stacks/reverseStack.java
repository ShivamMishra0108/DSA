package Stacks;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);

        int [] arr = new int[st.size()];
        int i=0;
        while(st.size()>0){
            arr[i]=st.pop();
            i++;
        }
        for(i=0; i<arr.length; i++) {
            st.push(arr[i]);
        }

        System.out.println(st);
 }
}
