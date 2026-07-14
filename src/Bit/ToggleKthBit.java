package Bit;

public class ToggleKthBit {
    static int toggleKthBit(int n, int k) {
        // code here
        return n ^ (1<<k);
    }
}
