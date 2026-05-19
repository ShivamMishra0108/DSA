package TopInterView150;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {

        String [] s = path.split("/");

        Stack<String> st = new Stack<>();

        for(int i=0; i<s.length; i++){

            if(s[i].equals("") || s[i].equals(".")){
                continue;
            }
            if(s[i].equals("..")){
                if(!st.isEmpty())st.pop();
            }
            else st.push(s[i]);

        }
        StringBuilder ans = new StringBuilder();

        for(String sr: st){
            ans.append("/");
            ans.append(sr);
        }
        if(ans.length()==0)return "/";

        return ans.toString();


    }
}
