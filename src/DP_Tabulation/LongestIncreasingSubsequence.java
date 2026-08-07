package DP_Tabulation;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] arr){
        int n = arr.length;

        int [] dp = new int [n];

        Arrays.fill(dp,1);
        int maxLen = 1;

        for(int i=1; i<n; i++){
            int max= 0;
            for(int j=0; j<i; j++){
                if(arr[j]<arr[i]){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] += max;
            maxLen = Math.max(maxLen,dp[i]);
        }
        return maxLen;

    }
}
