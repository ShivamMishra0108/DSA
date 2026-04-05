package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class question2 {
    public static void main(String[] args) {





         //ADD DIGITS OF TWO ARRAY LIKE {4,5,6} + {2,7,4} = {7,3,0}:-

        int[] a1 = {4, 5, 6};
        int[] a2 = {8, 3, 8};
        int m = a1.length;
        int n = a2.length;
        int carry = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = m-1; i >= 0; i--) {
            if(a1[i] + a2[i] +carry <= 9 ) {
                arr.add(a1[i] + a2[i] + carry);
                carry = 0;
            }
            else if(a1[i] + a2[i] +carry >= 10){
                arr.add((a1[i] + a2[i])%10);
                carry = (a1[i] + a2[i])/10;


            }
        }
        if(carry != 0){
            arr.add(carry);
        }



        Collections.reverse(arr);
        System.out.println(arr);


    }

}
