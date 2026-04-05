package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {
     static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,};

        int n = arr.length;
        int k = sc.nextInt();

        rotate(arr, 0, n-1);
        rotate(arr, 0, k-1);
        rotate(arr, k, n-1);

    }

    public static void rotate(int [] arr, int i, int j){
        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;

        }
        System.out.println(Arrays.toString(arr));
    }
}







