package TopInterView150;

import java.util.HashMap;

public class IntegerToRoman {
    static void main() {
        int t = 3749;
        System.out.println(intToRoman(t));

    }
    public static String intToRoman(int num) {

        int [] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        String [] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder result = new StringBuilder();

        for(int i=0; i<value.length; i++){
            while (num>=value[i]){
                num -= value[i];
                result.append(symbol[i]);
            }
        }
        return result.toString();


    }

}
