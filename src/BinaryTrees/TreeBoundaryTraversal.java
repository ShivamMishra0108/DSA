package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class TreeBoundaryTraversal {
    public static void main(String[] args) {

    }
    public List<Integer> sol(Node root){
           List<Integer> ans = new ArrayList<>();

           ans.add(root.val);
           if(root.left==null && root.right==null)return ans;
           leftfun(root.left,ans);
           leaffun(root,ans);
           rightfun(root.right,ans);
           return ans;
    }

    private void leaffun(Node root, List<Integer> ans) {
        if(root==null)return;
        if(root.left==null && root.right==null) {
            ans.add(root.val);
        }
        leaffun(root.left,ans);
        leaffun(root.right,ans);

    }

    private void rightfun(Node root, List<Integer> ans) {
        if(root==null) return;
        if(root.left==null && root.right==null)return;
        if(root.right!=null)rightfun(root.right,ans);
        else rightfun(root.left,ans);
        ans.add(root.val);
    }

    private void leftfun(Node root, List<Integer> ans) {
           if(root==null)return ;
           if(root.left==null && root.right==null)return ;
           ans.add(root.val);
           if(root.left!=null) leftfun(root.left,ans);
           else leftfun(root.right,ans);
    }
}
