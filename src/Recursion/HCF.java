package Recursion;

public class HCF {
    public static void main(String[] args) {
        int a = 12;
        int b = 9;
        int f = 0;

        int A=0;
        int B = 0;
        int max = Integer.MIN_VALUE;

        for(int i=1; i<a; i++){
            if(a%i == 0){
                A = i;
                A = Math.max(A,max);
            }
        }
        for(int i=1; i<b; i++){
            if(b%i == 0){
                B = i;
                B = Math.max(B,max);
            }
        }
        if(A == B){
            f = A;
        }
        System.out.println(f);
    }

}
