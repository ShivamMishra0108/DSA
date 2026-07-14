package Bit;

public class BitWiseBasics {
    static void main() {

        int x = 5;

        // 1's compliment = ~x
        // 2's compliment = ~x+1
        // 2's compliment = -x

        System.out.println(~x+1);
        System.out.println(-x);
    }
}
