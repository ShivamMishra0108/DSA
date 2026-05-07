package TopInterView150;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWtRepeating {
    public int lengthOfLongestSubstring(String s) {

        int st=0;
        int maxLength=0;
        int end=0;
        List<Character> list = new ArrayList<>();

        while(end<s.length()){

            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;

                maxLength = Math.max(maxLength,list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(st)));
                st++;
            }
        }
        return maxLength;

    }
}
