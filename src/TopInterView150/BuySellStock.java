package TopInterView150;

class BuySellStock {
    public int maxProfit(int[] nums) {

        int profit = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(nums[i]<min)min = nums[i];
            else profit = Math.max(profit,nums[i]-min);
        }
        return profit;
    }
}