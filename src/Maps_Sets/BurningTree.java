package Maps_Sets;
import java.util.*;

class Pair{
    Node node;
    int dist;
    Pair(Node node, int dist){
        this.node = node;
        this.dist = dist;
    }
}

public class BurningTree {
    static Node start;
    static HashMap<Node, Node> parent;
    public int amountOfTime(Node root, int target) {

        start = null;
        parent = new HashMap<>();
        dfs(root, target);

        Queue<Pair> q = new LinkedList<>();
        HashSet<Node> burnt = new HashSet<>();
        q.add(new Pair(start,0));
        burnt.add(start);
        int time = 0;

        while(q.size()>0){
            Pair front = q.remove();
            Node node = front.node;
            int dist = front.dist;
            time = Math.max(time,dist);


            if(node.left != null && !burnt.contains(node.left)){
                q.add(new Pair(node.left,dist+1));
                burnt.add(node.left);
            }
            if(node.right != null && !burnt.contains(node.right)){
                q.add(new Pair(node.right,dist+1));
                burnt.add(node.right);
            }
            if(parent.containsKey(node) && !burnt.contains(parent.get(node))){
                q.add(new Pair(parent.get(node),dist+1));
                burnt.add(parent.get(node));
            }
        }

        return time;
    }

    private void dfs(Node root, int target) {
        if(root == null)return;
        if(root.val == target) start = root;
        if(root.left != null) parent.put(root.left,root);
        if(root.right != null) parent.put(root.right,root);
        dfs(root.left,target);
        dfs(root.right,target);
    }
}
