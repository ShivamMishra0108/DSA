package Recursion;

public class ReachNthStair {
    public static void main(String[] args) {
        System.out.println(fun(5));

    }
    public static int fun(int n){
        if(n<=2)return n;
        return fun(n-1) + fun(n-2);
    }
}
