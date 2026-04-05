package BinaryTrees;

public class ConstructPrePost {

    public Node constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;
        return build(0,n-1,0,n-1,preorder,postorder);

    }
    private Node build(int prl, int prh, int plo, int phi, int[] preorder, int[] postorder) {

        if(prh<prl)return null;
        if(prl == prh)return   new Node(preorder[prl]);

        int val = preorder[prl];
        Node root = new Node(val);

        int pr = 0;
        for(int i=plo; i<=phi; i++){
            if(postorder[i] == preorder[prl+1]){
                pr = i;
            }
        }

        int cnt = pr-plo+1;


        root.left = build(prl+1,prl+cnt,plo,pr,preorder,postorder);
        root.right = build(prl+cnt+1,prh,pr+1,phi-1,preorder,postorder);

        return root;
    }
}

