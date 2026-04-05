package Strings;

import java.util.Arrays;

public class AlmostEquivalent {
    public static void main(String[] args) {

        String word1 = "aaaa", word2 = "bccb";

        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        System.out.println(c1);
        System.out.println(c2);

        int freq = 0;

        for (int i=0; i<c1.length; i++){
            for(int j=0; j<c2.length; j++) {
                if (c1[i] == c2[j]) {
                    freq++;
                    if (freq >0 && freq<4) {
                        System.out.println(true);
                    } else {
                        System.out.println(false);
                    }
                }
            }
        }
    }
}
