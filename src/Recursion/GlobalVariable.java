package Recursion;

import java.util.Scanner;

public class GlobalVariable {
    static int x = 10;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         print(1);
        fun();
        x = 9;
        System.out.println(x);
        int x = 6;
        System.out.println(x);
    }

    public static void print(int x){
        if(x>n)return;
        System.out.println(x);
        print(x+1);
    }
    public static void fun(){
        x = 20;
        System.out.println(x);
    }
}
