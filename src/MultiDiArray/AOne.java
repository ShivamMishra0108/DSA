package MultiDiArray;

import java.util.Scanner;

public class AOne {
    public static void main(String[] args) {

        int [][] arr = {{2,44,4,4},{3,4,5,6},{2,5,6,4}};

//        Scanner sc = new Scanner(System.in);
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j< arr.length; j++){
//                  arr[i][j] = sc.nextInt();
//               // System.out.print(arr[i][j]);
//            }

   //     }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        System.out.println("array");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[0].length; j++){
              sum += arr[i][j];
              if(arr[i][j] >max){
                  max = arr[i][j];
              }
                System.out.print(arr[i][j] +  " ");
            }
            System.out.println();
        }
        System.out.println(sum);
        System.out.println(max);

    }
}
