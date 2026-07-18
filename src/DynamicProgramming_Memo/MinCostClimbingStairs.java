package DynamicProgramming_Memo;

import java.util.*;
class MinCostClimbingStairs {
    int [] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp,-1);
        minCost(0,cost);
        return Math.min(dp[0],dp[1]);
    }
    public int minCost(int i, int [] cost){
        if(i >= cost.length)return 0;
        if(dp[i]!=-1)return dp[i];
        return dp[i] = cost[i] + Math.min(minCost(i+1,cost),minCost(i+2,cost));
    }
}