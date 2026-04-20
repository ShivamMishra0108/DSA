package TopInterView150;

public class JumpGame2 {
    public int jump(int[] nums) {

        int curend = 0;
        int farend = 0;
        int jumps = 0;

        for(int i=0; i<nums.length-1; i++){
            farend = Math.max(farend,i+nums[i]);

            if(i==curend){
                jumps++;
                curend = farend;
            }
        }
        return jumps;
    }
}
