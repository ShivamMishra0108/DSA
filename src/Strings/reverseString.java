package Strings;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {

//        String [] s = {"h","e","l","l","o"};
//
//        int i=0;
//        int j = s.length-1;
//        while (i<j){
//            String temp = s[i];
//            s[i] = s[j];
//            s[j] = temp;
//            i++;
//            j--;
//        }
//        System.out.println(Arrays.toString(s));


        String st = "abcd";
        char [] s = st.toCharArray();
        int k = 3;
        StringBuilder sb = new StringBuilder();

       reverse(s,0,k-1,sb);

//       if(2*k<s.length){
//           for(int i=k; i<s.length; i++){
//               sb.append(i)
//           }
//       }

        if(2*k>s.length){

            for(int i=k; i<s.length; i++){
                sb.append(s[i]);
            }
        }else {

            for (int i = k; i <= 2 * k - 1; i++) {
                sb.append(s[i]);
            }

            if (s.length - 2 * k >= k) {
                reverse(s, 2 * k, 2 * k + k - 1, sb);
                for (int i = 2 * k + k; i < s.length; i++) {
                    sb.append(s[i]);
                }
            } else {
                for (int i = 2 * k; i < s.length; i++) {
                    sb.append(s[i]);
                }
            }
        }



        sb.toString();
        System.out.println(sb);
    }
    public static void reverse(char [] arr, int m, int n, StringBuilder sb){

        for(int i=n; i>=m; i--){
            sb.append(arr[i]);
        }
    }
}
