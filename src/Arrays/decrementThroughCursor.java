package Arrays;


public class decrementThroughCursor {
    public static void   main(String[] args) {

        int [] nums = {1,0,2,0,3};
        int n = nums.length;
        int result = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                if(allZero(nums, 1, i) ){
                    result +=1;
                }
                if(allZero(nums, -1, i) ){
                    result +=1;
                }
            }
        }

        System.out.println(result);
    }
    public static boolean allZero(int[] nums, int dir, int start){
        int [] arr = nums.clone();
        int direction = dir;
        int curr = start;

        while (curr >= 0 && curr< nums.length){
            if(arr[curr] == 0){
                curr += direction;
            }else{
                arr[curr] -= 1;
                direction = -direction;
                curr += direction;
            }
        }
        for(int x: arr){
            if(x != 0){
                return false;
            }
        }
        return true;
    }

}
