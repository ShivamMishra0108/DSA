package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Parenthesis {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        int n = 5;
        generate(n,0,0," ",ans);
        System.out.println(ans);
    }
    public static  void generate(int n, int l, int r, String s, List<String> list){
        if(r==n){
            list.add(s);
            return;
        }
        if(l<n)generate(n,l+1, r, s+"(", list );
        if(r<l)generate(n, l,r+1, s+")", list);
    }
}
