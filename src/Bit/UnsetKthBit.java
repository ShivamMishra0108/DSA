package Bit;


class UnsetKthBit {
    int replaceBit(int n, int k) {
        // code here
        return n & (~(1<<k));
    }
}