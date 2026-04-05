package Strings;

import java.util.Arrays;

public class ReverseVowels {
    public static void main(String[] args) {

        System.out.println(fun("IceCreAm"));


    }
    static String fun(String s) {

        char [] ch = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while (i < j) {

            if(!vowel(ch[i])){
                i++;
            }else if(!vowel(ch[j])){
                j--;
            }else {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] =temp;
                i++;
                j--;
            }
        }
        return String.valueOf(ch);

    }
    static boolean vowel(char i){
            if(i== 'a'|| i == 'e' || i == 'i'|| i== 'o' || i == 'u'
                || i== 'A'|| i == 'E' || i == 'I'|| i == 'O'|| i == 'U')
            {
               return true;

            }
            return false;
    }

}
