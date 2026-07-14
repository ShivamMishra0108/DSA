package Bit;

class Powerof2 {
    public boolean isPowerOfTwo(int n) {

        return ((n & (n-1)) == 0);

    }
}