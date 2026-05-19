package TopInterView150;

import java.util.*;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] t) {

        Stack<Integer> st = new Stack<>();

        for(String s: t){

            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/" )){
                int b = st.pop();
                int a = st.pop();

                if(s.equals("+")){
                    st.push(a+b);
                }
                if(s.equals("-")){
                    st.push(a-b);
                }
                if(s.equals("*")){
                    st.push(a*b);
                }
                if(s.equals("/")){
                    st.push(a/b);
                }
            }
            st.push(Integer.parseInt(s));
        }
        return st.pop();

    }
}
