package BinaryTrees;

public class ConstructPreInorder {
    public static void main(String[] args) {

    }
    public Node buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        return build(0,n-1,0,n-1,preorder,inorder);
    }

    public Node build(int plo, int phi, int inlo, int inhi, int[] preorder, int[] inorder) {
        if(plo>phi)return null;
        int val = preorder[plo];
        Node root = new Node(val);

        int r = 0;

        for(int i=inlo; i<=inhi; i++){
            if(inorder[i] == preorder[plo]){
                r  =i;
                break;
            }
        }

        int cnt = r - inlo;

        root.left = build(plo+1,plo+cnt,inlo,r-1, preorder,inorder);
        root.right = build(plo+cnt+1,phi,r+1,inhi,preorder,inorder);

        return root;
    }
}
