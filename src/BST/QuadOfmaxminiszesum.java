package BST;

class quad {
    int max;
    int min;
    int sum;
    int level;

    public quad(int max, int min, int sum, int level) {
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.level = level;
    }
}

public class QuadOfmaxminiszesum {

    public quad four(Node root){
        if(root == null) return new quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,0);
        quad lst = four(root.left);
        quad rst = four(root.right);
        int max = Math.max(root.val,Math.max(lst.max,rst.max));
        int min = Math.min(root.val,Math.min(lst.min,rst.min));
        int sum = root.val+lst.sum+rst.sum;
        int level = 1+lst.level+rst.level;
        return new quad(max,min,sum,level);
    }

}

