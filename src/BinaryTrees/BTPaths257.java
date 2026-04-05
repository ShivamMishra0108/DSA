//package BinaryTrees;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class BTPaths257 {
//    public static void main(String[] args) {
//
//    }
//    public static List<String> fun(Node root){
//        if(root == null)return null;
//        List<String> ans = new ArrayList<>();
//
//        String s = root.val+"->";
//        fun(root.left);
//        fun(root.right);
//
//        ans.add(s);
//        return ans;
//    }
//}
