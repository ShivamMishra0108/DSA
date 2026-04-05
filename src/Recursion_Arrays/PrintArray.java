package Recursion_Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,76,45,5,6,7,};
        f(arr,0);
        System.out.println( exists(arr,76,0));
    }
    public static boolean exists(int [] arr, int n,int i){
        if(i == arr.length)return false;
       if(arr[i] == n)return true;
       return exists(arr,n,i+1);
    }

    public static void f(int [] arr, int i){
        if(i == arr.length)return ;
        System.out.println(arr[i]);
         f(arr, i+1);
    }

}
