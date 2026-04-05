package BinaryTrees;

public class PathSum112 {
    public static void main(String[] args) {


    }
    static boolean flag;
    public static boolean pathSum(Node root, int tar){
        if(root == null)return false;
        if(root.left == null && root.right == null){
            if(root.val == tar){
                return true;
            }
            else return false;
        }
        return pathSum(root.left, tar-root.val) || pathSum(root.right,tar-root.val);


    }
}
