package Bit;

public class SingleNumber3 {
    public int[] singleNumber(int[] nums) {

        int xor=0;
        for(int ele: nums){
            xor ^= ele;
        }

        int mask = (xor&(xor-1))^xor;   // RIGHTMOST SET BIT MASK FOR XOR:

        int b1=0; int b2= 0;

        for(int ele: nums){
            if((ele&mask) != 0) b1 ^= ele;
            else b2 ^= ele;

        }
        return  new int[]{b1,b2};
    }
}
