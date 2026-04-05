package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NumberOfVisiblePeople {      // Leetcode 1944
    public static void main(String[] args) {

        int [] arr = {10,6,8,5,11,9};

        System.out.println(Arrays.toString(sol(arr)));
    }
    public static int [] sol(int [] arr){

        int n = arr.length;
        int [] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        st.push(arr[n-1]);
        ans[n-1] = 0;

        for(int i=n-2; i>=0; i--){
            int count = 0;
            while(st.size()>0 && arr[i] >st.peek()) {
                count++;
                st.pop();
            }
                if(st.size()>0 )count++;

                ans[i] = count;
                st.push(arr[i]);
            }

        return  ans;
    }


}
