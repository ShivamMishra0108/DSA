package Strings;

import java.util.Stack;

public class longestValidParenthesis {
    public static void main(String[] args) {

        String s = "(()";

        System.out.println(sol(s));

    }
    public static int sol(String s){

        if(s.length() == 1 || s.length()==0)return 0;
        Stack<Character> st = new Stack<>();
        int n = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(c);
            }else{
                if(st.size()>0){
                    st.pop();
                    n+= 2;
                }

            }
        }
        return n;
    }
}
