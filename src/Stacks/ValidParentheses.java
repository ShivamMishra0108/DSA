package Stacks;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

    String s = "{)";
        System.out.println( check(s));

    }
    public static boolean check(String s){
        if(2%s.length()==1)return false;
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '[' || ch == '{' || ch == '('){
                st.push(ch);
            }
            else{
                if(st.size()==0)return false;
                char top = st.peek();
                if(sameType(top,ch))st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }

    private static boolean sameType(char a, char b) {
        if(a == '[' && b == ']')return true;
        if(a == '{' && b == '}')return true;
        if(a == '(' && b == ')')return true;
        return false;
    }
}
