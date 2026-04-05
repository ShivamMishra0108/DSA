package Strings;



public class FindDifference {
    public static void main(String[] args) {


        System.out.println(fun( "abcd", "abcdg"));
    }

    public static char fun(String s, String t){
        int s1 = 0;
        int s2 = 0;

        for (char i = 0; i < s.length(); i++) {
            s1 += s.charAt(i);
        }

        for (char i = 0; i < t.length(); i++) {
            s2 += t.charAt(i);
        }

        if (s1 > s2) {
            int n = s1 - s2;
            System.out.println((char) n);
        } else if (s1 < s2) {
            int n = s2 - s1;
            System.out.println((char) n);
        }
        return ' ';
    }


}
