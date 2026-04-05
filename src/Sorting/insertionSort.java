package Sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {

        int [] arr = {6,6,48,83,29,29-8,-3,-1};
        int n = arr.length;

        for(int i = 0; i<n; i++){
            int  j = i;
            while (j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
