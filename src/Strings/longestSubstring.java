package Strings;

import java.util.ArrayList;
import java.util.List;

public class longestSubstring {
    public static void main(String[] args) {

        String s = "abacabbac";
        int n = s.length();
        int start = 0;
        int end = 0;
        List<Character> list = new ArrayList<>();
        int maxlength = 0;
        while (end<s.length()){

            if(!list.contains(s.charAt(end))){

                list.add(s.charAt(end));
                end++;

                maxlength = Math.max(maxlength,list.size());

            }
            else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;


            }
        }

        System.out.println(maxlength);
    }
}
