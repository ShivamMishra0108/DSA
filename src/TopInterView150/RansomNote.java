package TopInterView150;

import java.util.HashMap;

public class RansomNote {
    static void main() {
        System.out.println(canConstruct("aa","aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Integer,Character> hm = new HashMap<>();

        for(int i=0; i<magazine.length(); i++){
            hm.put(i,magazine.charAt(i));
        }

        for(int i=0; i<ransomNote.length(); i++){
            if(!hm.containsKey(ransomNote.charAt(i)))return false;
        }
        return true;
    }
}
