package basics;

import java.util.Scanner;

public class ternaryInVariable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n  = sc.nextInt();

        String number = (n%2==0) ? "Its Even" : "Its odd";

        System.out.println(number);

    }
}
