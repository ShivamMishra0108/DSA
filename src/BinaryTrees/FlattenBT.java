package BinaryTrees;

import java.util.ArrayList;

public class FlattenBT {


    //  B Y   M O R I S  T R A V E R S A L :

    public void flatten(Node root){
        Node curr = root;
        while(curr != null){
            if(curr.left != null){
                Node pred = curr.left;
                while(pred.right != null)pred = pred.right;

                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;

        }
    }

    private void Flatten(Node root){

        Node lst = root.left;
        Node rst = root.right;
        root.left = null;
        root.right = null;
        Flatten(lst);
        Flatten(rst);
        if(lst == null)root.right = rst;
        else{
            root.right = lst;
            Node last = lst;
            while (last.right != null) {
                last = last.right;
            }
            last.right = rst;
        }
    }


    // A L T E R   W A Y :


    private static void FLatten(Node root){
        ArrayList<Node> ans = new ArrayList<>();
        dfs(root,ans);
        for(int i=0; i<ans.size()-1; i++){
            Node a = ans.get(i);
            Node b = ans.get(i+1);
            a.right = b;
            a.left = null;
        }
        Node last = ans.get(ans.size()-1);
        last.right= null;
        last.left=null;
    }

    private static  void dfs(Node root,ArrayList ans ){

        if(root == null)return;
        ans.add(root);
        dfs(root.left,ans);
        dfs(root.right, ans);

    }



}
