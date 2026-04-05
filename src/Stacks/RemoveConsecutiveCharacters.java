package Stacks;

import java.util.Stack;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        String s = "aabaa";

        System.out.println(sol(s));

    }
    public static String sol(String s){
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1; i<s.length(); i++){

            if(s.charAt(i) != st.peek()){
                st.push(s.charAt(i));
            }

        }

        String ans = " ";
        reverse(st);
        while (st.size()>0){
            ans += st.pop();
        }
        return ans;
    }

    private static void reverse(Stack<Character> st) {
        if(st.size()==0)return ;

        Character top = st.pop();
        reverse(st);
        pushAtBottom(st,top);

    }
    public static void pushAtBottom(Stack<Character> st ,Character ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        Character top = st.pop();
        pushAtBottom(st,ele);
        st.push(top);
    }
}
