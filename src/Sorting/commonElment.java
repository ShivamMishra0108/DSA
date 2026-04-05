package Sorting;

import java.util.ArrayList;

public class commonElment {
    public static void main(String[] args) {

        int [] a = {1,2,3,6,1,5,8};
        int [] b= {1,3,2,3,4,5,6,7,};
        ArrayList<Integer> ans = new ArrayList<>();

        int m = a.length;
        int n = b.length;
        int i = 0;
        int j = 0;

        sort(a);
        sort(b);

        while (i<m && j<n){
            if(a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[i]){
                i++;
            }
            else{
                j++;
            }
        }

        System.out.println(ans);
    }
    public static int[] sort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
