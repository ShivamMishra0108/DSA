package Maps_Sets;
import java.util.*;

class Pair{
    TreeNode node;
    int dist;
    Pair(TreeNode node, int dist){
        this.node = node;
        this.dist = dist;
    }
}


class Solution {
    static TreeNode start;
    static HashMap<TreeNode, TreeNode> parent;
    public int amountOfTime(TreeNode root, int target) {

        start = null;
        parent = new HashMap<>();
        dfs(root, target);

        Queue<Pair> q = new LinkedList<>();
        HashSet<TreeNode> burnt = new HashSet<>();
        q.add(new Pair(start,0));
        burnt.add(start);
        int time = 0;

        while(q.size()>0){
            Pair front = q.remove();
            TreeNode n = front.node;
            int dist = front.dist;
            time = Math.max(time,dist);


            if(n.left != null && !burnt.contains(n.left)){
                q.add(new Pair(n.left,dist+1));
                burnt.add(n.left);
            }
            if(n.right != null && !burnt.contains(n.right)){
                q.add(new Pair(n.right,dist+1));
                burnt.add(n.right);
            }
            if(parent.containsKey(n) && !burnt.contains(parent.get(n))){
                q.add(new Pair(parent.get(n),dist+1));
                burnt.add(parent.get(n));
            }
        }

        return time;
    }

    private void dfs(TreeNode root, int target) {
        if(root == null)return;
        if(root.val == target) start = root;
        if(root.left != null) parent.put(root.left,root);
        if(root.right != null) parent.put(root.right,root);
        dfs(root.left,target);
        dfs(root.right,target);
    }
}