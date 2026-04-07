package Heap;


class Node{
    int val;
    Node left;
    Node right;
    Node (int val) {
        this.val = val;
    }
}

public class IsBinaryTreeHeap {
    static int s;


    public boolean isHeap(Node root) {
        s = size(root);
        return isMaxHeap(root) && isCBT(root,1);

    }


    public int size(Node root){
        if(root == null)return 0;
        return 1+ size(root.left)+ size(root.right);
    }


    public boolean isCBT(Node root, int idx){
        if(root == null) return true;
        if(idx>s) return false;
        return isCBT(root.left,2*idx) && isCBT(root.right,2*idx+1);

    }


    public boolean isMaxHeap(Node root){
        if(root == null)return true;
        int leftval = (root.left != null) ? root.left.val : Integer.MIN_VALUE;
        int rightval = (root.right != null) ? root.right.val : Integer.MIN_VALUE;
        if(root.val <= leftval && root.val <= rightval) return false;
        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }
}
