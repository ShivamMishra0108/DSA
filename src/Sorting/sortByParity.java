package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class sortByParity {
    public static void main(String[] args)

     {

        int [] arr = {5,5,6,4,6,8,9,};
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();


            for(int j=0; j<n; j++){
                if(arr[j] %2 == 0){
                    ans.add(arr[j]);
                }
            }


            for(int i=0; i<n; i++){
                if(arr[i] %2 != 0){
                    ans.add(arr[i]);
                }
            }

        int k = ans.size();

         int[] array = new int[ans.size()];

         // Copy values manually
         for (int i = 0; i < ans.size(); i++) {
             array[i] = ans.get(i);
         }
         System.out.println(Arrays.toString(array));
    }
}
