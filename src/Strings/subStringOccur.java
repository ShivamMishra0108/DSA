package Strings;

public class subStringOccur {
    public static void main(String[] args) {

        String haystack = "butsad";
        String needle = "sad";
        int  k = -1;
        for(int i=0; i<haystack.length()-needle.length()+1; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i,needle.length()+i).equals(needle) ){
                    k =  i;
                    break;
                }
            }
        }
        System.out.println(k);
    }
}
