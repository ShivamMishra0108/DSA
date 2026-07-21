package DP_Space_Opt_Tabulation;

public class ClimbingStairs {
    public int climbStairs(int n){
        if(n==1)return 1;
        int [] dp = new int[3];

        dp[0] = 1;
        dp[1] = 2;

        if(n==2)return 2;

        for(int i=2; i<n; i++){
            dp[2] = dp[1] +dp[0];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }
}
