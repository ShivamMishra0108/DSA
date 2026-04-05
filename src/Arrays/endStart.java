package Arrays;

import java.util.Arrays;

public class endStart {
    public static void main(String[] args) {

        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        int n = nums.length;
        int [] ans = {0,0};

//        for(int i=0; i<n; i++){
//            if(nums[i] == target){
//                ans[0] = i;
//                ans[1] = i;
//            }
//        }

        int lo =0;
        int hi = n-1;

        while (lo<=hi){
            lo++;
            hi--;
            if(nums[lo] == target && nums[hi] == target){
                ans[0] = lo;
                ans[1] = hi;

            }
        }        System.out.println(Arrays.toString(ans));

    }
}
