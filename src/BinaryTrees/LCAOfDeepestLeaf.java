//package BinaryTrees;
//
//import java.util.ArrayList;
//
//public class LCAOfDeepestLeaf {
//    public static void main(String[] args) {
//
//    }
//
//
//    private Node Lca(Node root, int p, int q){
//        if(root == null) return null;
//        if(p == root.val || q == root.val) return root;
//
//        Node left = Lca(root.left,p,q);
//        Node right = Lca(root.right,p,q);
//
//        if(left != null && right != null)return root;
//        if(left == null) return right;
//        else return left;
//    }
//
//    public int level(Node root){
//
//    }
//
//    ArrayList<Integer> arr = new ArrayList<>();
//    int p;  int q;
//    public  void fun(Node root) {
//        if (root == null) return ;
//        if (root.left == null && root.right == null) {
//            if (level(root) == maxL){
//                arr.add(root.val);
//            }
//        }
//        fun(root.right);
//        fun(root.left);
//
//    }
//
//    int maxL = 0;
//    private static int levels(Node root){
//        if(root == null)return 0;
//        int l = levels(root.left);
//        int r = levels(root.right);
//        int maxL = 1 + Math.max(l,r);
//        return maxL;
//    }
//
//}
