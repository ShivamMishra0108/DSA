package Maps_Sets;

import java.util.HashSet;

public class LongestSubstringWTReaptingChar {
    public int lengthOfLongestSubstring(String s) {

        int i =0;
        int maxLength=1;
        int j=0;
        HashSet<Character> st = new HashSet<>();

        while(j < s.length()){
            char ch = s.charAt(j);
            if(!st.contains(ch)){
                st.add(ch);
                j++;
            }
            else{
                int len = j-i;
                maxLength = Math.max(maxLength,len);
                while(s.charAt(i)!=s.charAt(j)){
                    st.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        int len = j-i;
        maxLength = Math.max(maxLength,len);
        return maxLength;


    }
}
