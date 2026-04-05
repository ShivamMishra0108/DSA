package BinaryTrees;


public class SumRootToLeaf129 {
    static void main() {

    }
    int sum = 0;
    public int fun(Node root) {

        dfs(root,0);
        return sum;


    }

    private void dfs(Node root, int cur) {

        if(root == null)return ;

        cur = cur*10+root.val;

        if(root.left == null && root.right ==null){
            sum += cur;
            return;
        }

        dfs(root.left,cur);
        dfs(root.right,cur);

    }
}
