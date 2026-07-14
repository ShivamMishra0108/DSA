package Bit;

import java.util.Scanner;

public class TwoToPower {
    static void main() {

        // We have to find 2 to the power n;

        // by formula: recursive a^n = a*func(a,n-1);   O(n)

        // by formula: recursive a^n = fun(a,n/2)*fun(a,n/2);   O(logn)

        // By bit manipulation:  a^n = (1<<n);      O(1);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(1<<n);
    }


}

