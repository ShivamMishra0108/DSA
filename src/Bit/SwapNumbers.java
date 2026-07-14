package Bit;

public class SwapNumbers {
    static void main() {
        int a = 3;
        int b = 8;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
    }
}
