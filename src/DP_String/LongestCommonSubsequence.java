package DP_String;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String a, String b) {
        int m = a.length();
        int n = b.length();

        return LCS(m-1,n-1,a,b);
    }

    private int LCS(int i, int j, String a, String b) {
        if( i<0 || j<0 ) return 0;
        if(a.charAt(i) == b.charAt(j)) return 1 + LCS(i-1,j-1,a,b);
        else return Math.max(LCS(i,j-1,a,b),LCS(i-1,j,a,b));
    }
}
