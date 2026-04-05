package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class AddingOne {
    public static void main(String[] args) {

        int [] arr = {9,9,9};
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 9;

        for(int i=n-1; i>=0; i--){
            int x = arr[i] +carry;
            if( x<10){
                ans.add(x);
                carry = 0;
            }else{
                ans.add(x%10);
                carry = x/10;
            }
        }
        if(carry != 0) {
            ans.add(carry);
        }
        Collections.reverse(ans);
        System.out.println(ans);



    }

}
