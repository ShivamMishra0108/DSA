package BinaryTrees;

public class BalancedBT {
    public static void main(String[] args) {

        // The level difference b/w two subtrees of every node of the tree must be
        // 1 or lesser.
    }

    // Check if balanced:

    boolean flag = false;
    public boolean isBalanced(Node root){
        if(root == null)return true;
        flag = true;
        levels(root);
        return flag;
    }

    private int levels(Node root) {
        if(root == null)return 0;
        int  leftLevel = levels(root.left);
        int  rightLevel = levels(root.right);
        if(Math.abs(leftLevel-rightLevel)>1)flag = false;
        return 1+Math.max(leftLevel,rightLevel);

    }


}

