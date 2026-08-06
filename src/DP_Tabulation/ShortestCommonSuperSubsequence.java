package DP_Tabulation;

public class ShortestCommonSuperSubsequence {
    public String shortestCommonSupersequence(String a, String b){

        String lcs = PrintLCS(a,b);

        StringBuilder scs = new StringBuilder();

        int i=0; int j=0; int k=0;

        while(k < lcs.length()){

            while(a.charAt(i) != lcs.charAt(k)){
                scs.append(a.charAt(i));
                i++;
            }

            while(b.charAt(j) != lcs.charAt(k)){
                scs.append(b.charAt(j));
                j++;
            }

            scs.append(lcs.charAt(k));

            i++;
            j++;
            k++;
        }

        while(i < a.length()) scs.append(a.charAt(i++));
        while(j < b.length()) scs.append(b.charAt(j++));

        return scs.toString();
    }


    public String PrintLCS(String a, String b){
        int m = a.length(); int n = b.length();

        int [][] dp = new int[m+1][n+1];

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(a.charAt(i-1) == b.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        int i=m; int j=n;
        StringBuilder ans = new StringBuilder();
        while (i>0 && j>0){
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                ans.append(a.charAt(i - 1));
                i--;
                j--;
            } else {
                if (dp[i - 1][j] >= dp[i][j - 1]) i--;
                else j--;
            }
        }
        return ans.reverse().toString();
    }
}
