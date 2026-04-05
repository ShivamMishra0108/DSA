package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

        int [] arr = {1, 8, 3, 4, 2, 1, 6, 4};
        System.out.println(Arrays.toString(nextGreater(arr)));
    }

    public static int[] nextGreater(int [] arr){
        int n = arr.length;
        int [] nge = new int[n];

        nge[n-1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);

        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && arr[i]>st.peek())st.pop();
            if(st.size() == 0)nge[i] = -1;
            else nge[i] = st.peek();
            st.push(arr[i]);
        }
        return nge;
    }
}
