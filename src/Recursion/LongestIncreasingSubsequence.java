package Recursion;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] arr) {

        return helper(0,-1,arr);
    }

    public int helper(int idx, int prev, int []arr){
        if(idx == arr.length)return 0;
        int skip = helper(idx+1,prev,arr);
        if(prev != -1 && arr[idx]<=arr[prev])return skip;
        int pick = 1+helper(idx+1,idx,arr);
        return Math.max(pick,skip);
    }
}
