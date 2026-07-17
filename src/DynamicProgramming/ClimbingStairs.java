package DynamicProgramming;

import java.util.*;

class ClimbingStairs {
    int [] dp;
    public int climbStairs(int n) {

        dp = new int [n+1];
        Arrays.fill(dp,-1);
        return ways(0,n);
    }

    public int ways(int i,int n){
        if(i == n) return 1;

        if(i > n) return 0;

        if(dp[i]!=-1) return dp[i];

        return dp[i] = ways(i+1,n)+ways(i+2,n);
    }
}
