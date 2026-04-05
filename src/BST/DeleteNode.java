package BST;

public class DeleteNode {
    static void main() {

    }
    public Node delete(Node root,int tar){

        if(root == null)return null;

        if(root.val>tar){
            root.left = delete(root.left,tar);
        }
        else if(root.val<tar){
            root.right = delete(root.right,tar);
        }
        else{
            // if its leaf node:
            if(root.left == null && root.right == null)return null;

            // if single child:
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            // node having both child:
            Node pred = root.left;
            while(pred.right!=null)pred = pred.right;

            root.val = pred.val;
            root.left = delete(root.left,pred.val);

        }
        return root;
    }
}
