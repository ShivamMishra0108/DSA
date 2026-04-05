package Recursion;


import java.util.ArrayList;
import java.util.List;

public class subString {
    public static void main(String[] args) {
        String s = "ABC";
        List<String> list = new ArrayList<>();
        f("",s,0, list);
        System.out.println(list);

        List<List<Integer>> kist = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int [] arr = {1,2,3};
        fun(ans, arr,0,kist);
        System.out.println(kist);
    }


    public static void f(String ans, String s, int i, List<String> list){
        if(i==s.length()){
            list.add(ans);
            return;
        }
        char ch = s.charAt(i);
        f(ans+ch,s,i+1 ,list);
        f(ans,s,i+1,list);

    }

    public static void fun(List<Integer> ans, int [] arr, int i, List<List<Integer>> list){
        if(i==arr.length){
            list.add(new ArrayList<>(ans));
            return ;
        }
        ans.add(arr[i]);

        fun(ans, arr,i+1,list);
        ans.remove(ans.size() - 1);
        fun(ans,arr,i+1,list);


    }
}