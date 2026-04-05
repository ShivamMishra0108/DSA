package Arrays;

import java.util.Arrays;

public class sortArrayBuiltIn {
    public static void main(String[] args) {

        int [] arr = {23, 1, -3, 4, 5,-7, -2};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }
    public static void print(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
