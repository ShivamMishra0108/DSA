package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {

        int [] nums1 = {4,1,2};
        int [] nums2 = {1,3,4,2};

        System.out.println(Arrays.toString(sol(nums1, nums2)));
    }
    public static int [] sol(int [] num1, int [] arr){
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

        int [] ng2 = new int[num1.length];

        for(int i=0; i<num1.length; i++){
            for(int j=0; j<n; j++){
                if(num1[i] == arr[j]){
                    ng2[i] = nge[j];
                }
            }
        }
        return ng2;
     }
}
