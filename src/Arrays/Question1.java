package Arrays;

import java.util.Arrays;
import java.util.Scanner;




public class Question1 {
    public static void main(String[] args) {


        // Question1: Multiply 2 in odd indexed number and add 10 in even indexed number:-

//        int [] arr = {34,55,23,4,2,4,5,3,4};
//        for(int i=0; i<arr.length; i++){
//            if(i%2 != 0 ){
//                 arr[i] = arr[i]*2;
//            }else{
//                arr[i] = arr[i]+10;
//            }
//        }
//        System.out.println(Arrays.toString(arr));


        // QUESTION 2: CHECK IF A NUMBER IS PRESENT IN AN ARRAY OR NOT:-

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int [] arr2 = {22,433,24,3,223,55,3,4,3,44,3,23,724,5,33};

        boolean flag = false; //its present

        for(int i=0; i<arr2.length; i++){
            if(arr2[i] ==x ){
                 flag = true;
                 break;
            }
        }
        if(flag == true){
            System.out.println("its present at array" );
        }else{
            System.out.println("Its not in the array");
        }




    }
}
