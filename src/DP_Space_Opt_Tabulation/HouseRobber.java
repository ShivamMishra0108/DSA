package DP_Space_Opt_Tabulation;

public class HouseRobber {
    public int rob(int[] arr) {
        int n = arr.length;

        int [] dp = new int [3];
        if(n==1) return arr[0];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        if(n==2) return dp[1];
        for(int i=2; i<n; i++){
            dp[2] = Math.max(arr[i]+dp[0],dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }
}
