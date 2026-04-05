package BinaryTrees;

public class ConstructPostInorder {
    public static void main(String[] args) {

    }

    public Node buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(0,n-1,0,n-1,inorder,postorder);
    }
    public Node build(int plo,int phi,int ilo, int ihi,int [] inorder,int [] postorder){
        if(plo>phi)return null;

        int val = postorder[phi];
        Node root = new Node(val);

        int r = 0;
        for(int i=ilo; i<=ihi; i++){
            if(inorder[i] == val){
                r = i;
            }
        }

        int cnt = ihi-r;

        root.right = build(phi-cnt, phi-1, r+1, ihi,inorder,postorder);
        root.left = build(plo, phi-cnt-1,ilo,r-1,inorder,postorder );

        return root;
    }
}
