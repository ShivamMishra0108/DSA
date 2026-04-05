package BST;

import java.util.ArrayList;

public class BstToGst {
    static void main() {

    }

    int Sum = 0;
    public Node convert(Node root){
        if(root == null)return root;
        convert(root.right);
        Sum = sum +root.val;
        root.val = Sum;
        convert(root.left);
        return root;
    }


    //  A L T E R   W A Y :


    int sum = 0;
    int k = 0;
    public Node convertBST(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        for(int i=arr.size()-1; i>=0; i--){
            sum  = sum+arr.get(i);
            arr.set(i,sum);
        }
        orderIn(root,arr);
        return root;
    }
    public void inorder(Node root, ArrayList<Integer> arr){
        if(root == null)return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
    public void orderIn(Node root, ArrayList<Integer> arr){
        if(root == null)return;
        orderIn(root.left, arr);
        root.val = arr.get(k);
        k++;
        orderIn(root.right, arr);
    }



}
