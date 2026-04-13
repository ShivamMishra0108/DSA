package Arrays;

public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {

        int n = nums.length;

        for(int st=0; st<n-1; st++){
            int cursum = 0;

            for(int end=st; end<n; end++){
                cursum += nums[end];

                if(cursum%k == 0)return true;
            }
        }
        return false;
    }
}
