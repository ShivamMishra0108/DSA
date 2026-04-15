package TopInterView150;

import java.util.Arrays;

public class RotateArray {

    static void main() {

        int [] n = {1,2,3,4,5,6,7};
        int k = 3;
        rotate0(n,k);
        System.out.println(Arrays.toString(n));

    }

    static void rotate0(int [] nums  , int k) {

        int n = nums.length;
        while(k>0){
            int t = nums[n - 1];
            for (int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = t;
            k--;
        }

    }

    static void rotate(int nums [] , int k) {

        int n = nums.length;
        k %= n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }

    static void reverse(int [] nums, int i, int j){
        while(i<j){
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }

    }
}
