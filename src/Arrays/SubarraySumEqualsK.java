package Arrays;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {

        int n = nums.length;
        int count = 0;

        for(int st=0; st<n; st++ ){
            int cursum = 0;

            for(int end=st; end<n; end++){
                cursum  += nums[end];

                if(cursum == k)count++;
            }
        }
        return count;
    }
}
