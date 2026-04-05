package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TraversePreorder {
    public static void main(String[] args) {


    }
    public  static List<Integer> fun(Node root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null)return ans;

        Stack<Node> st = new Stack<>();

        st.push(root);
        while(st.size()>0){
            Node top = st.pop();
            ans.add(top.val);
            if(top.right!=null)st.push(top.right);
            if(top.left!=null)st.push(top.left);

        }
        return ans;
    }
}
