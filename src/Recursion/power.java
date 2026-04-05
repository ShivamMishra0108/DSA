package Recursion;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println(pow(2,5));
        System.out.println(pow(2,4));
        System.out.println(pow(2,-4));

//        for(int i=1; i<=n; i*=3){
//            if (i == n){
//                System.out.println(true);
//            }else {
//                System.out.println(false);
//                break;
//            }
//        }

    }

//    public static int pow(int a, int b){
//        if(b==0)return 1;
//        return a*pow(a,b-1);
//    }

    public static int pow(int a, int b){

        if(b==0)return 1;
        int calli = pow(a,-b/2);
        int call = pow(a,b/2);
        if(b%2==0) return call*call;
        else if(b<0){
            if( b%2 == 0)return 1/(calli*calli);
            else return 1/(a*calli*calli);
        }
        else return a*call*call;
    }




}
