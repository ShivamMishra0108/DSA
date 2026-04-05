package loops;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        // COMPOSITE NUMBERS:-
//
        for(int i=2; i<12; i++){
            if (n % i == 0) {
                System.out.println("Composite number");
                break;
            }
        }
//
//        // PRIME NUMBER:-
//
//        boolean flag = true; // its prime
//
//        for(int i=2; i<n; i++){
//            if(n%i==0){
//                flag = false;
//                break;
//            }
//        }
//        if(n==1){
//            System.out.println("Neither prime not composite");
//        }else if(flag == false){
//            System.out.println("composite number");
//        }else{
//            System.out.println("prime number");
//        }
//
//        // QUESTION: Take a number input and print all of its factors:-
//
//        for(int i=1; i<=n; i++){
//            if(n%i==0){
//                System.out.println(i);
//            }
//        }
//
//        // ANOTHER WAY FOR SAME QUESTION:-
//
//        for(int i=1; i<=Math.sqrt(n); i++){
//            if(n%i==0){
//                System.out.println(i);
//                System.out.println(n/i);
//            }
//        }

        // QUESTION:  Print the numbers of digits in a number:-

//        int n= sc.nextInt();
//        int  count = 0;
//        while(n != 0){
//            n /= 10;
//            count ++;
//        }
//        System.out.println(count);


        // QUESTION:  Print the sum of digits of a number:-

//        int sum =0;
//        while(n != 0){
//            sum += n%10;
//            n /= 10;
//        }
//        System.out.println(sum);

        // QUESTION: Print the reverse of a number:-

//        int r = 0;
//        while(n != 0){
//
//            r *= 10;
//            r += n%10;
//            n=n/10;
//        }
//        System.out.println(r);

        //QUESTION:  print the sum of given number and the reverse of that number:-

//        int a = sc.nextInt();
//        int temp = a;  // store the original number
//        int x = 0;
//
//        while (a != 0) {
//            x = x * 10 + a % 10;
//            a = a / 10;
//        }
//
//        System.out.println(temp + x);

        // QUESTION: print the number raise to the power of a number:-

//        int a = sc.nextInt();
//        int n = sc.nextInt();
//        int num = 1;
//
//        for(int i=1; i<=n; i++){
//            num *= a;
//        }
//        System.out.println(num);


    }
}
