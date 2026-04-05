package Strings;

public class subString {
    public static void main(String[] args) {
//
//        String s =  "jaiShankar";
//        System.out.println(s.substring(3));
//        System.out.println(s.substring(1,5));

        String s = "Gop";
        int x = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                System.out.print(s.substring(i,j) + " ");
                int z = 0;
                if(s.substring(i,j).length()>1){
                    while (z<s.substring(i,j).length()) {

                        if (s.substring(i, j).charAt(z) == s.substring(i, j).charAt(z + 1)){
                            x++;
                        }
                        z++;
                    }
                }
                if(s.substring(i,j).length()%3==z){
                    x++;
                }
            }
            System.out.println();
        }
        System.out.println(x);

//        String s = "6784";
//        String  sr = "";
//        int sum = 0;
//        int n = 0;
//        for(int i=0; i<s.length(); i++) {
//            for (int j = i + 1; j <= s.length(); j++) {
//                 sr = s.substring(i, j) + " ";
//                 System.out.println(sr);
//                 n += Integer.parseInt(sr.trim());
//
//            }
//
//            }
//        System.out.println(n);
//        for(int i=0; i<sr.length(); i++){
//            sum += n;
//        }
//        System.out.println(sum);





    }
}
