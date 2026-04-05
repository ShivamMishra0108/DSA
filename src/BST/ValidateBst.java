package BST;

import java.util.ArrayList;

class Node{
    int val;
    BST.Node left;
    BST.Node right;
    Node (int val) {
        this.val = val;
    }
}




public class ValidateBst {


    Integer x = null;
    boolean flag = true;
    public boolean isValid(Node root) {

        if(root == null)return flag;
        isValid(root.left);
        if(x != null && root.val <= x)flag = false;
        x = root.val;
        isValid(root.right);
        return flag;
    }


    // A L T E R  W A Y :


    public boolean isValidBST(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        boolean flag = true;

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) >= arr.get(i+1))flag = false;

        }
        return flag;

    }


    public void inorder(Node root, ArrayList<Integer> arr){
        if(root == null)return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }


}
