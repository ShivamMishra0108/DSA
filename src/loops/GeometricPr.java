package loops;

import java.util.Scanner;

public class GeometricPr {
    public static void main(String[] args) {

        // Question: Print the GP 1,2,4,8,.....  to n times:-

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =1;

//        for (int i=1; i<=n; i++){
//            System.out.println(a);
//            a*=2;
//        }

        // QUESTION: Take n as input from the user and print the sequence:-

//          1
//          n
//          2
//          n-1
//          3
//          n-2

        for(int i=1; i<=n; i++){
            System.out.println(a);
            a+=1;
            System.out.println(n);
            n-=1;
        }
    }
}
