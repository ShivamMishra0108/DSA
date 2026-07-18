package DynamicProgramming_Memo;

import java.util.*;

class HouseRobber {
    int [] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return loot(0,nums);
    }

    public int loot (int i, int[]arr){
        if(i>=arr.length)return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = arr[i] + loot(i+2,arr);
        int skip = loot(i+1,arr);
        return dp[i] = Math.max(pick,skip);

    }
}