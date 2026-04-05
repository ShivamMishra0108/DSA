package Strings;

import java.util.Locale;

import static java.util.Collections.replaceAll;

public class palindrome {
    public static void main(String[] args) {

//        String s = "mallam";
//        boolean flag = true;
//        int i = 0;
//        int j = s.length()-1;
//
//        while(i<=j){
//            if(s.charAt(i) != s.charAt(j)){
//                flag = false;
//                break;
//            }
//            i++;
//            j--;
//        }
//        System.out.println(flag);
//

        // leetcode question:

//        String st = "a man, a plan a canal: panama";
//
//        boolean flag = true;
//        int i = 0;
//        int j = st.length()-1;
//        String sd;
//
//        for(int x=0; x<=j; x++){
//          sd =   st.toLowerCase(Locale.ROOT);
//          sd =   st.replaceAll("[^a-z0-9]", "");
//        }
//
//        while(i<=j){
//            if(st.charAt(i) != st.charAt(j)){
//                flag = false;
//                break;
//            }
//            i++;
//            j--;
//        }
//        System.out.println(st);
//        System.out.println(flag);

        String s = "Asfigifsa";

        s.toUpperCase();

        int i= 0;
        int j =s.length()-1;
        int sum = 1;

        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){

                sum +=2;
            }
            i++;
            j--;
        }
        System.out.println(sum);


    }
}
