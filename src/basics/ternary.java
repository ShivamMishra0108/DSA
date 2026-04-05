package basics;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        System.out.println((n%2==0) ? "Its even" :  "Its odd");

        // HERE WE DID: IF ELSE IN SHORTCUT: Its done within the sout statement.
    }
}
