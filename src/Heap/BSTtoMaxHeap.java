package Heap;

import java.util.ArrayList;

public class BSTtoMaxHeap {
    static int idx;
    public static void convertToMaxHeapUtil(Node root) {

        idx = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        postorder(root,arr);

    }

    public static void postorder(Node root, ArrayList<Integer> ar){
        if(root == null)return;
        postorder(root.left,ar);
        postorder(root.right,ar);
        root.val = ar.get(idx++);
    }

    public static void inorder(Node root, ArrayList<Integer> ar){
        if(root == null)return;
        inorder(root.left,ar);
        ar.add(root.val);
        inorder(root.right,ar);
    }
}
