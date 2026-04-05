package BinaryTrees;

public class FullBT {

    // Full binary tree is a tree where each node has 0 or 2 children not 1 or more than 2.

    public static void main(String[] args) {

    }
    public boolean isFullTree(Node root){
        if(root == null)return true;

        if(root.left == null && root.right == null) return true;

        if(root.left != null && root.right != null ){
            return isFullTree(root.left)
                    && isFullTree(root.right);
        }
        return false;
    }
}
