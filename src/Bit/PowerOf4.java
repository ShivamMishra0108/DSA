package Bit;

public class PowerOf4 {
    public boolean isPowerOfFour(int n) {
        return (powerOFTwo(n) && isRoot(n));
    }

    boolean powerOFTwo(int n){
        return (n > 0 && (n & (n-1)) == 0);
    }

    boolean isRoot(int n){
        int root = (int)(Math.sqrt(n));
        return (root*root == n);
    }
}
