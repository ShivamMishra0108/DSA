package BinaryTrees;


import java.util.*;

class pair{
    int level;
    Node node;
    pair(Node node, int level){
        this.level = level;
        this.node = node;
    }
}
class Solution {
    public List<List<Integer>> levelOrderBottom(Node root) {

        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        if(root == null)return ll;

        Queue<pair> q = new ArrayDeque<>();
        q.add(new pair(root,0));
        int curlevel=0;
        while (!q.isEmpty()){
            pair front = q.remove();
            Node node = front.node;
            int level = front.level;

            if(level != curlevel){
                curlevel++;
                ll.add(l);
                l = new ArrayList<>();


            }

            l.add(node.val);

            if(node.left != null) q.add(new pair(node.left, level+1));
            if(node.right != null) q.add(new pair(node.right, level+1));
        }
        ll.add(l);
        Collections.reverse(ll);


        return ll;
    }
}