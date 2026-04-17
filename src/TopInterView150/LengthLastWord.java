package TopInterView150;

public class LengthLastWord {
    static void main() {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {

        int n = s.length();
        int ans = 0;

        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                ans++;
            }
            else break;
        }
        return ans;
    }
}
