package DynamicProgramming_Memo;

import java.util.*;

public class MinimumPathSum {
    int [][] dp;
    public int minPathSum(int[][] grid){
        int m= grid.length;
        int n = grid[0].length;

        dp = new int[m][n];
        for(int []row: dp){
            Arrays.fill(row,-1);
        }

        return sum(0,0,grid);
    }
    public int sum(int i, int j, int [][] grid){
        int m = grid.length;
        int n = grid[0].length;

        if(i>=m || j>=n)return Integer.MAX_VALUE;

        if (i == m - 1 && j == n - 1) return grid[i][j];

        if(dp[i][j] != -1)return dp[i][j];

        int down = sum(i+1,j,grid);
        int right = sum(i,j+1,grid);

        return dp[i][j] = grid[i][j] + Math.min(down,right);
    }

}
