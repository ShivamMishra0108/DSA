package BST;

class Pair{
    int max;
    int min;
    Pair(int max, int min){
        this.max = max;
        this.min = min;
    }
}

public class CheckBST {

    boolean flag;
    boolean check(Node root){
         flag = true;
         maxmin(root);
         return flag;
    }
    Pair maxmin(Node root){
        if(root == null)new Pair(Integer.MIN_VALUE,Integer.MAX_VALUE);
        Pair lst = maxmin(root.left);
        Pair rst = maxmin(root.right);
        int max = Math.max(root.val,Math.max(lst.max,rst.max));
        int min = Math.min(root.val,Math.min(lst.max,rst.max));
        if(lst.max >= root.val || rst.min <= root.val)flag = false;
        return new Pair(max,min);
    }
}
