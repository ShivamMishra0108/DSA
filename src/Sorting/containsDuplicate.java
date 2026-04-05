package Sorting;
import java.util.Arrays;
public class containsDuplicate {
    public static void main(String[] args) {

        int [] arr = {1,2,3,1};
        int  n= arr.length;
        boolean flag = false;
        Arrays.sort(arr);

        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                flag = true;
            }
        }
        System.out.println(flag);
    }
}
