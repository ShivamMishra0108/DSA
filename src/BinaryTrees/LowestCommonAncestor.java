package BinaryTrees;

public class LowestCommonAncestor {
    public static void main(String[] args) {

    }
    private Node lca(Node root,int p, int q){
        if(root == null)return null;
        if(p == root.val || q == root.val)return root;
        boolean pLieInLeft = exists(root.left,p);
        boolean qLieInRight = exists(root.right,q);
        if(pLieInLeft && !qLieInRight) return lca(root.left,p,q);
        if(!pLieInLeft && qLieInRight) return lca(root.left,p,q);
        else return root;
    }

    private boolean exists(Node root, int p) {
        if(root == null)return false;
        if(root.val == p )return true;
        return exists(root.left,p) || exists(root.right,p);


    }


    // A L T E R   W A Y :

    private Node Lca(Node root, int p, int q){
        if(root == null) return null;
        if(p == root.val || q == root.val) return root;

        Node left = Lca(root.left,p,q);
        Node right = Lca(root.right,p,q);

        if(left != null && right != null)return root;
        if(left == null) return right;
        else return left;
    }

}
