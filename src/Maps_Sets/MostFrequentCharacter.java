package Maps_Sets;

import java.util.HashMap;

public class MostFrequentCharacter {
    public static void main() {
        System.out.println(getMaxOccuringChar("testsample"));
    }
    public static char getMaxOccuringChar(String s){

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(hm.containsKey(ch)){
                hm.compute(ch, (k, freq) -> freq + 1);
            }
            else hm.put(ch,1);
        }

        int maxFreq=0;
        char ans = s.charAt(0);
        for(char ch: hm.keySet()){
            int freq = hm.get(ch);
            if(freq>maxFreq) {
                maxFreq=freq;
                ans = ch;
            }
        }
        return ans;

    }
}
