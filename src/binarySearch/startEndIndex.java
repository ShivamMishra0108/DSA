package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class startEndIndex {
    public static void main(String[] args) {

        int [] arr = {1,3,5,5,5,5,7,123,125};
        int x = 5;
        int [] ans = {-1,-1};
        int n = arr.length;


        for(int i=0; i<n; i++){
            if(arr[i] == x){
                ans[0] = i;
                break;
            }else {

            }
        }
        for(int i=n-1; i>=0; i--) {
            if (arr[i] == x) {
                ans[1] = i;
                break;
            }
        }


        System.out.println(Arrays.toString(ans));
    }
}
