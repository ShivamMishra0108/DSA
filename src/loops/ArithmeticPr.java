package loops;

import java.util.Scanner;

public class ArithmeticPr {
    public static void main(String[] args) {

        // QUESTION:- Print an ap from 2,5,8,11,.... to n terms

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for(int i=2; i<=(3*n-1); i=i+3){
            System.out.println(i);

        }
        System.out.println();

        int a = 4, d = 6;

        for(int i=1; i<=n; i++){
            System.out.println(a);
            a +=d;
        }

        System.out.println();

        // QUESTION:= Print an ap from 99,95,91,87,..... upto positive numbers:-

        for(int i=99; i>0; i-=4){
            System.out.println(i);
        }
    }
}
