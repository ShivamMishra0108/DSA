package CyclicSort;

import java.util.ArrayList;

public class FindDuplicates {
    public static void main(String[] args) {

        int [] arr = {2,3,1,2,3};

        System.out.println(dup(arr));
    }
    public static ArrayList dup(int [] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i=0;

        while (i<n){
            int idx = arr[i]-1;
            if(arr[i] == i+1|| arr[idx] == arr[i])i++;
            else {
                int temp = arr[i];
                arr[i]  = arr[idx];
                arr[idx] = temp;
            }
        }
        for(i=0; i<n; i++){
            if(arr[i] != i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
