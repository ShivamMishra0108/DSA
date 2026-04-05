package Recursion;

public class UniquePaths {
    public static void main(String[] args) {

        System.out.println(func(3,4));
        System.out.println(paths(0,0,5-1,4-1));
    }


    public static int func(int m, int n){
        if(m==1|| n==1)return 1;
        return func(m-1,n) + func(m,n-1);
    }


    public static int paths(int cr, int cc, int lr, int lc){
        if(cr == lr && cc ==lc)return 1;
        if(cr>lr || cc>lc)return 0;
        int right = paths(cr, cc+1, lr, lc);
        int down = paths(cr+1, cc, lr, lc);
        return right + down;
    }
}
