package Sorting;

import java.util.Arrays;

public class wiggleSort {
    public static void main(String[] args) {

        int[] arr = {5,5,5,4,4,4};
        int n = arr.length;

       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


//        for(int i=0; i<n-1; i++){
//            if(i%2 ==0 && arr[i]>arr[i+1] ||
//               i%2 ==1 && arr[i]<arr[i+1]){
//
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }

        int mid = (n+1)/2;

        int left = 0;
        int right  = mid;

        for(int i =0; i<n-1; i++){
            if(i%2 == 0){
                arr[i] = arr[left++];
                left ++;
            }
            else{
                arr[i] = arr[right++];
                right ++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
