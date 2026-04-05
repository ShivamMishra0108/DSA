package Arrays;

import java.util.Arrays;

public class firstMissPositive {
    public static void main(String[] args) {

       int [] nums = {-1,1,2,3,4};


        int index = 0;
        int k = 0;
        int n = nums.length;

        for(int i=0; i<n-1; i++) {
            if(nums[i] == 1){
                index = i;
            }
        }
        for(int i=index; i<n-1; i++){
            if((nums[i+1] - nums[i]) > 1 ){
                k = nums[i] + 1;
                break;
            }
            else{
                k = nums[n-1] + 1;
            }

        }
        System.out.println(Arrays.toString(nums));
        System.out.println(k);
    }

    static int idx = 0;
    public static int fun(int [] arr){

        if(!contain1(arr)){
            return 1;
        }else{
            for(int i=idx; i<arr.length; i++){
                if(arr[i+1]-arr[i] >1 ){
                    return arr[i]+1;
                }else{
                    return  arr[arr.length-1]+1;
                }
            }
        }
        return 0;
    }


    public static boolean contain1(int [] arr){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                idx = i;
                return true;
            }
        }
        return false;
    }

}
