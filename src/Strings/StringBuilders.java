package Strings;

public class StringBuilders {
    public static void main(String[] args) {

        StringBuilder st = new StringBuilder(10);
        System.out.println(st.length() + " " + st.capacity());
        st.append("Shivam");
        System.out.println(st.length() + " " + st.capacity());

        String s = "Shivam";
        StringBuilder sb = new StringBuilder(s);
        sb.append("Mishra");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        int i=0, j=sb.length()-1;
        while (i<j){
            char t1 = sb.charAt(i);
            char t2 = sb.charAt(j);

            sb.setCharAt(i,t2);
            sb.setCharAt(j,t1);
            i++;
            j--;
        }
        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);
        sb.delete(2,5);
        System.out.println(sb);
    }
}
