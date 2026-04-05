package Sorting;

public class MajorityElment {
    public static void main(String[] args) {

        int [] nums = {8,8,5,5,7,7,7,9};
        int n = nums.length;
        int max = Integer.MIN_VALUE;


        for(int i=0; i<nums.length; i++){
            int count  = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > max){
                System.out.println(nums[i]);
                break;
            }
        }

    }
}
