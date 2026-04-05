package Strings;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        int n = s.length();
        int max=0;
        int start = 0;
        int end = 0;

        for(int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                if(isP(s,i,j)==true ){
                    if(j-i+1 >max){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        System.out.println(s.substring(start,end+1));
    }

    public static boolean isP(String s, int i, int j){
        while ((i<j)){
            if(s.charAt(i) == s.charAt(j)){
               i++;
               j--;
            }else{
                return false;
            }
        }
        return true;

    }
}
