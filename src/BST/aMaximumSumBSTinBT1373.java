package BST;

class Quad{
    int max;
    int min;
    int sum;
    boolean isBst;
    public Quad(int max, int min, int sum, boolean isBst) {
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.isBst = isBst;
    }
}

public class aMaximumSumBSTinBT1373 {


    static int maxSum;

    public int maxSumBST(Node root){
        maxSum = 0;
        helper(root);
        return maxSum;
    }
    public Quad helper(Node root){
        if(root == null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);
        Quad lst = helper(root.left);
        Quad rst = helper(root.right);
        int max = Math.max(root.val,Math.max(lst.max,rst.max));
        int min = Math.min(root.val,Math.min(lst.min,rst.min));
        int sum = root.val+lst.sum+rst.sum;
        boolean isBst = lst.isBst && rst.isBst && (lst.max<root.val) && (rst.min>root.val);
        if(isBst)  maxSum = Math.max(maxSum,sum);
        return new Quad(max,min,sum,isBst);

    }
}
