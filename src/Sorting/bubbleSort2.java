package Sorting;

import java.util.Arrays;

public class bubbleSort2 {
    public static void main(String[] args) {

        // set even indices in ascending and odd in descending:

        int [] arr = {36,45,32,31,15,41,9,46,36,6,15,16,33,26,27,31,44,34};
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=0; j+2<n; j+=2){
                if(arr[j] > arr[j+2]){
                    int temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2] = temp;
                }
            }
        }
        for(int i=0; i<n-1; i++){
            for(int j=1; j<n-2-i; j+=2){
                if(arr[j] < arr[j+2]){
                    int temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j + 2] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){

            }
        }
    }
}
