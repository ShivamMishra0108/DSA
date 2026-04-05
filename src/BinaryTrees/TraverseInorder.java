package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TraverseInorder {
    public static void main(String[] args) {

    }

    public List<Integer> fun(Node root){

        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();

        Node cur = root;

        while(st.size()>0 || cur != null ){
            if(cur!=null){
                if(cur.left!=null){
                    st.push(cur);
                    cur = cur.left;
                }
                else{
                    ans.add(cur.val);
                    cur = cur.right;
                }
            }
            else{
                Node top = st.pop();
                ans.add(top.val);
                cur = top.right;
            }
        }
        return ans;
    }


}
