package BinaryTrees;

import java.util.*;


class Pair{
    int level;
    Node node;
    Pair(Node node, int level){
        this.level = level;
        this.node = node;
    }
}

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

    void Display(){
        System.out.println(max+" "+min+" "+sum+" "+level);
    }
}

public class Implementation {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;


        //       1
        //     /   \
        //    2     3
        //   / \   / \
        //  4  5   6  7


//        System.out.println(size(a));
//        System.out.println();
//        System.out.println(sum(a));
//        System.out.println(product(a));
//        System.out.println(max(a));
//        System.out.println(levels(a));
//
//        preorder(a);
//        System.out.println();
//        inorder(a);
//        System.out.println();
//        postorder(a);
//
//        mirror(a);
//        System.out.println();
//        postorder(a);
//        System.out.println();
//        System.out.println(checkMirror(a));
//        pathSum(a,9);
//
//
//        levelOrder(a);
//        System.out.println();
//        ImprovedLevelOrder(a);
//        System.out.println();
//        improvedLevelOrder(a);
//        System.out.println();
//        zigZagLevelOrder(a);
//
//        System.out.println(rightView(a));
//
//        for(int i=1; i<levels(a); i++){
//            KthLeve(a,0,i);
//            System.out.println();
//        }
//
//        int m = 0;
//        int i=0;
//        for ( i=0; i<levels(a); i++){
//            System.out.println((SumKthLevel(a,0,i)));
//        }
//
//        System.out.println(SumRootLeaf(a));


        four(a).Display();


    }

    private static int size(Node root) {
        if(root==null)return 0;
        int l = size(root.left);
        int r = size(root.right);
        return 1+l+r;
    }
    private static int sum(Node root) {
        if(root==null)return 0;
        int l = sum(root.left);
        int r = sum(root.right);
        return root.val+l+r;
    }
    private static int product(Node root) {
        if(root==null)return 1;
        int l = product(root.left);
        int r = product(root.right);
        return root.val*l*r;
    }
    private static int max(Node root) {
        if(root==null)return 0;
        int l = max(root.left);
        int r = max(root.right);
        int m = Math.max(root.val,l);
        return Math.max(m,r);
    }
    private static int sMax(Node root){
        if(root==null)return 0;
        int l = max(root.left);
        int r = max(root.right);
        int M = Math.max(Math.max(l,r),root.val);
        int sm = 0;
        if(sm <M ){

        }
        return sm;
    }
    private static int levels(Node root){
        if(root == null)return 0;
        int l = levels(root.left);
        int r = levels(root.right);
        return 1 + Math.max(l,r);
    }


    // D I S P L A Y :

    private static  void preorder(Node root){
        if(root == null)return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);

    }
    private static  void inorder(Node root){
        if(root == null)return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);

    }
    private static  void postorder(Node root){
        if(root == null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");

    }


    // M I R R O R  I N V E R T :

    private static  boolean checkMirror(Node root){
        boolean ans = true;
        if(root == null)return true;

        ans = root.left == root.right;

        checkMirror(root.left);
        checkMirror(root.right);

        return ans;

    }
    private static void mirror(Node root){
        if(root == null)return;

       Node temp = root.left;
       root.left = root.right;
       root.right = temp;

       mirror(root.left);
       mirror(root.right);
    }
    private static boolean twoSame(Node p, Node q){
        if (p==null && q ==null)return true;
        if(p==null || q==null)return false;
        if(!twoSame(p.left,q.left))return false;
        if(!twoSame(p.right,q.right))return false;
        if(p.val != q.val)return false;
        return true;
    }


    // P A T H :

    private static boolean pathSum(Node root, int tar){
        if( root == null)return true;
        tar = root.val-tar;
        pathSum(root.left, tar);
        pathSum(root.right, tar);
        if(!pathSum(root.left, tar))return false;
        if(!pathSum(root.right, tar))return false;
        return true;
    }
    static int sum = 0;
    public static int SumRootLeaf(Node root) {

        dfs(root,0);
        return sum;


    }
    private static void dfs(Node root, int cur) {

        if(root == null)return ;

        cur = cur*10+root.val;

        if(root.left == null && root.right ==null){
            sum += cur;
            return;
        }

        dfs(root.left,cur);
        dfs(root.right,cur);

    }



    // LEVEL ORDER TRAVERSAL :

    private static void levelOrder(Node root) {

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while (q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+ " ");

            if(front.left != null) q.add(front.right);
            if(front.left != null) q.add(front.left);

        }

    }
    private static void ImprovedLevelOrder(Node root) {

        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root,0));
        int curlevel=0;
        while (!q.isEmpty()){
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;

           if(level != curlevel){
               curlevel++;
               System.out.println();
            }

            System.out.print(node.val+" ");

            if(node.left != null) q.add(new Pair(node.right, level+1));
            if(node.left != null) q.add(new Pair(node.left, level+1));
        }


    }
    private static void improvedLevelOrder(Node root) {

        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root,0));
        int curlevel=0;
        while (!q.isEmpty()){
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;

            if(level != curlevel){
                curlevel++;
                ll.add(l);
                l = new ArrayList<>();


            }

            l.add(node.val);


            if(node.right != null) q.add(new Pair(node.right, level+1));
            if(node.left != null) q.add(new Pair(node.left, level+1));

//            if(curlevel %2 != 0){
//                Collections.reverse(l);
//            }
        }
        if(curlevel %2 != 0){
            Collections.reverse(l);
        }
        ll.add(l);
        System.out.println(ll);

    }
    private static void zigZagLevelOrder(Node root) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root,0));
        int curlevel=0;
        while (!q.isEmpty()){
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;

            if(level != curlevel){

                if(curlevel %2 != 0){
                    Collections.reverse(l);
                }
                curlevel++;


                ll.add(l);
                l = new ArrayList<>();

            }

            l.add(node.val);

            if(node.right != null) q.add(new Pair(node.right, level+1));
            if(node.left != null) q.add(new Pair(node.left, level+1));


        }
        if(curlevel %2 != 0){
            Collections.reverse(l);
        }
        ll.add(l);
        System.out.println(ll);
    }
    public static void  KthLeve(Node root, int level, int k){
        if(root == null) return;
        if(level == k) System.out.print(root.val+ " ");
        KthLeve(root.right,level+1,k);
        KthLeve(root.left, level+1,k);
    }
    public static int SumKthLevel(Node root, int level, int k){
        int m = 0;
        if(root == null) return 0;
        if(level == k)  return root.val;
        m =  Math.max(m,SumKthLevel(root.left,level+1,k) +
                SumKthLevel(root.right, level+1,k));
        return k;
    }


    // V I E W S :-


    private static List<Integer> rightView(Node root){
        List<Integer> ans = new ArrayList<>();
        view(root, 0, ans);
        return ans;
    }
    private static void view(Node root, int level, List<Integer> ans) {
        if(root==null)return;
        if(level>=ans.size())ans.add(root.val);
        else ans.set(level, root.val);
        view(root.right, level+1, ans);
        view(root.left, level+1, ans);
    }


    // Pair of Quad

    public static quad four(Node root){
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
