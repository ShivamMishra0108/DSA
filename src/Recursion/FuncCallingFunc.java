package Recursion;

public class FuncCallingFunc {
    public static void main(String[] args) {
        func(10);
    }
    public static void func(int n){
        if(n==0)return;
        System.out.println(n);
        func(n-1);
    }
}
