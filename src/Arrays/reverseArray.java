package Arrays;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        int [] arr = {23,4,5,6,45,76,34,90};

        int n = arr.length;


        System.out.println(Arrays.toString(arr) + " ");

//        for( int i=0; i<n/2; i++){
//            int temp = arr[i];
//            arr[i] = arr[n-1-i];
//            arr[n-1-i] = temp;
//        }


        int i=0;
        int j = n-1;
        while (i<j){
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
            i++;
            j--;
        }


        // IF WANT TO SWAP A PART OF ARRAY LIKE {FROM INDEX 3 TO 5);


//        int i = 2, j=5;
//        while (i<j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//            i++;
//            j--;
//        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
