package DynamicProgramming;

import java.util.*;
class HouseRobber2 {
    int [] dp;
    public int rob(int[] arr) {
        int n = arr.length;

        dp = new int[n];
        Arrays.fill(dp,-1);
        int first = loot(0,n-2,arr);

        dp = new int[n];
        Arrays.fill(dp,-1);
        int second = loot(1,n-1,arr);

        return Math.max(first,second);
    }

    public int loot(int i, int end, int[]arr){
        if(i>end) return 0;

        if(dp[i] != -1) return dp[i];

        int pick = arr[i] + loot(i+2,end,arr);
        int skip = loot(i+1,end,arr);

        return dp[i] = Math.max(pick,skip);
    }
}
