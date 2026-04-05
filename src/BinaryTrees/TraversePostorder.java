package BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TraversePostorder {
    public static void main(String[] args) {

    }
    public List<Integer> postorderTraversal(Node root) {
             List<Integer> ans = new ArrayList<>();
             if(root == null)return ans;
             Stack<Node> st = new Stack<>();

             st.push(root);
             while(st.size()>0){
                 Node top = st.pop();
                 ans.add(top.val);
                 if(top.left!=null)st.push(top.left);
                 if(top.right!=null)st.push(top.right);
             }
             Collections.reverse(ans);
             return ans;
          }



    }
