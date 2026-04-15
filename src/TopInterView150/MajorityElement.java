package TopInterView150;
import java.util.*;

class MajorityElement {

    static void main() {
        int [] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {


        int n=nums.length;
        if(n ==1)return nums[0];
        int c=0;
        Arrays.sort(nums);

        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                c++;
                if(c>=(n/2)){
                    int ans = nums[i];
                    return ans;
                }
            }
            else c=0;
        }
        return 0;

    }

}
