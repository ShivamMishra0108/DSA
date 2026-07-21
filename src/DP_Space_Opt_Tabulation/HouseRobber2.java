package DP_Space_Opt_Tabulation;


public class HouseRobber2 {
    public int rob(int[] arr){
        int n = arr.length;

        if(n==1)return arr[0];
        if (n == 2) return Math.max(arr[0], arr[1]);

        int [] dp = new int [3];

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);

        for(int i=2; i<n-1; i++){
            dp[2] = Math.max(arr[i]+dp[0],dp[1]);
        }
        int first =dp[2];

        dp = new int [3];
        dp[0] = arr[1];
        dp[1] = Math.max(arr[1],arr[2]);

        for(int i=2; i<n-1; i++){
            dp[i] = Math.max(arr[i+1]+dp[0],dp[1]);
        }
        int second =dp [2];

        return Math.max(first,second);
    }
}


