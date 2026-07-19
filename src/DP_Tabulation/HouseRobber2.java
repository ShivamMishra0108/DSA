package DP_Tabulation;

public class HouseRobber2 {
    public int rob(int[] arr){
        int n = arr.length;

        if(n==1)return arr[0];
        if (n == 2) return Math.max(arr[0], arr[1]);

        int [] dp = new int [n-1];

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);

        for(int i=2; i<n-1; i++){
            dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        int first =dp[n-2];

        dp = new int [n-1];
        dp[0] = arr[1];
        dp[1] = Math.max(arr[1],arr[2]);

        for(int i=2; i<n-1; i++){
            dp[i] = Math.max(arr[i+1]+dp[i-2],dp[i-1]);
        }
        int second =dp [n-2];

        return Math.max(first,second);
    }
}
