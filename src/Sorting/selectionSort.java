package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {

        int [] arr ={2,4,8,9,4,1,0,-1};
        int n = arr.length;


        for(int i=0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=i; j<n; j++){
                if (arr[j] < min){
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
