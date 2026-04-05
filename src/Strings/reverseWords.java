package Strings;

import java.util.Arrays;

public class reverseWords {
    public static void main(String[] args) {

        String s = "the sky is blue";

        String[] words  = s.split(" ");

        System.out.println(Arrays.toString(words));

        StringBuilder sb = new StringBuilder();

        for(int i= words.length-1; i>=0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
