package DP_Space_Opt_Tabulation;

public class UniquePath2 {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if(grid[0][0]  == 1)return 0;

        int [][] dp = new int[2][n];

        dp[0][0] = 1;

        for(int j=1; j<n; j++){
            if(grid[0][j] == 1) dp[0][j] = 0;
            else dp[0][j] = dp[0][j-1];
        }

        for(int i=1; i<m; i++){

            if (grid[i][0] == 1)dp[1][0] = 0;
            else  dp[1][0] = dp[0][0];

            for(int j=1; j<n; j++){
                if(grid[i][j]==1) dp[1][j] = 0;


                else {
                    dp[1][j] = dp[0][j] + dp[1][j-1];
                }

            }

            for(int j=0; j<n; j++){
                dp[0][j] =dp[1][j];
            }
        }
        return dp[0][n-1];
    }
}
