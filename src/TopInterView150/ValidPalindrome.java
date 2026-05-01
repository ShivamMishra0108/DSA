package TopInterView150;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        s.toLowerCase();

        int i=0;
        int j=s.length()-1;

        while (i<j ){
            if( i<j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            if( i<j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            if( s.charAt(i) != s.charAt(j))return false;

            i++;
            j--;
        }
        return true;
    }

}
