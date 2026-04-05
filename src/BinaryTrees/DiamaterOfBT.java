package BinaryTrees;

public class DiamaterOfBT {
    public static void main(String[] args) {

    }
    private int Diamater(Node root){
        return levels(root.left)+ levels(root.right);
    }

    private int levels(Node root) {
        if(root == null)return 0;
        int leftLevel = levels(root.left);
        int rightLevel = levels(root.right);
        return 1+leftLevel+rightLevel;
    }



    // If Diameter can be from anywhere (without root)
    static int max;
    public int diameterOfBinaryTree(Node root) {
        max = 0;
        level(root);
        return max;
    }

    public int level(Node root) {
        if(root == null)return 0;
        int leftLevel = level(root.left);
        int rightLevel = level(root.right);
        max = Math.max(max,leftLevel+rightLevel);
        return 1+ Math.max(leftLevel,rightLevel);
    }

}
