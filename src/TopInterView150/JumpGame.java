package TopInterView150;

public class JumpGame {
    public boolean canJump(int[] arr) {
        int n = arr.length;
        if (n == 1) return true;
        int maxreach= 0 ;


        for (int i = 0; i < n - 1; i++) {
            if(i>maxreach)return false;

            maxreach = Math.max(maxreach,i+arr[i]);

            if(maxreach>= n-1){return true;
            }
        }
        return true;

    }
}
