package TopInterView150;

public class REverseWords {
    static void main() {
        String s = "sky is blue";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {

        String [] st = s.split(" +");

        StringBuilder sb = new StringBuilder();

        for(int i=st.length-1; i>=0; i--){
            sb.append(st[i]+" ");
        }
        return sb.toString().trim();
    }
}
