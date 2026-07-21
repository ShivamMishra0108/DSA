package DP_Space_Opt_Tabulation;

public class Fibonacci {
    public int fib(int n){
        if(n<=1)return n;
        int [] dp = new int [3];
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[2] = dp[1] + dp[0];
            dp[0] = dp[1];
            dp[1] = dp[2];

        }
        return dp[2];
    }
}
