package DynamicProgramming_Memo;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String a, String b){
        int m = a.length(); int n = b.length();

        int [][] dp = new int [m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int x = (i-1>=0 && j-1>=0)? dp[i-1][j-1] : 0;
                int y = (i-1>=0 )? dp[i-1][j] : 0;
                int z = (j-1>=0)? dp[i][j-1] : 0;
                if(a.charAt(i) == b.charAt(j)) dp[i][j] = 1+x;
                else dp[i][j] = Math.max(y,z);

            }
        }
        return dp[m-1][n-1];
    }
}
