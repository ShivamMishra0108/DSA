package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort2 {


    public static void sort(int[] arr, int left, int right) {

        if (left>=right) {
            return;
        }

        // divide from 0 to left
        int mid = (left + right-1) / 2;

        sort(arr, left, mid);
        sort(arr, mid+1, right);

        merge(arr, left, mid,right, new ArrayList<>());
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] arr, int l, int mid,int h, ArrayList<Integer> temp) {
        int left = l;
        int right = mid+1;
        while (left <= mid && right<=h ) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left < mid ) {
            temp.add(arr[left]);
            left++;
        }
        while (right < h) {
            temp.add(arr[right]);
            right++;
        }
        for (int i=l;i<h;i++){
            arr[i] = temp.get(i-l);
        }

    }

    public static void main(String[] args) {

        int [] arr = {4,5,6,7,6,4,3,4,6,};
        sort(arr, 0,arr.length-1);
    }

}