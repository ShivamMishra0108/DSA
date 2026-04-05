package BinaryTrees;

public class PerfectBT {

    // Perfect binary tree is a tree where each node has exactly 2 children and
    // Every leaf nodes have same level or depth.

    boolean flag2 = true;
    boolean flag = false;
    public boolean isPerfect(Node root){

        if(root == null)return true;

        if(root.left == null && root.right == null) flag = true;

        if(root.left != null && root.right != null ){
            return isPerfect(root.left)
                    && isPerfect(root.right);
        }
        levels(root);
        return flag && flag2;
    }

    public int levels(Node root ) {
        if(root == null)return 0;
        if(root.left==null && root.right == null){
        }
        int  leftLevel = levels(root.left);
        int  rightLevel = levels(root.right);
        if(leftLevel != rightLevel)flag2 = false;
        return 1+Math.max(leftLevel,rightLevel);

    }
}
