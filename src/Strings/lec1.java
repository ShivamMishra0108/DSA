package Strings;

public class lec1 {
    public static void main(String[] args) {

//        String str = "Hello World";
//
//        str.toUpperCase();
//
//        StringBuilder str2 = new StringBuilder("HELLO");
//        str2.insert(2,"byee");
//        System.out.println(str2);
//        str2.append("World");
//        System.out.println(str2);

        String st = "i love java";

        String a [] = st.split("");
       // StringBuilder result = new StringBuilder();

        for(String ele: a){
            StringBuilder val = new StringBuilder(ele);

        }


        System.out.print(st.charAt(0) + "");

        for(int i=6; i>=1; i--){
            char ch = st.charAt(i);
            System.out.print(st.charAt(i) );

            }
        for(int i=10; i>=7; i--){
            char ch = st.charAt(i);
            System.out.print(st.charAt(i));

        }
        System.out.println();

                StringBuilder str = new StringBuilder("I love java");
        String newStr = str.toString();
        StringBuilder result = new StringBuilder();

        String arr[] = newStr.split(" ");
        for (String s : arr) {
            StringBuilder str2 = new StringBuilder(s);
            result.append(str2.reverse().append(" "));
        }

        str.reverse();
        System.out.println(result.toString().trim());






    }
}
