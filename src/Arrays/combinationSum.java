//package Arrays;
//
//import java.util.ArrayList;
//
//public class combinationSum {
//    public static void main(String[] args) {                  // TRAPPING RAIN WATER
//        int[] nums = {1, 2, 3, 4, 6};                         //
//        int target = 7;
//        ArrayList<Integer> arr = new ArrayList<>();
//        int n = nums.length;
//        int i=0; int j=0;
//
//        while(i<n && j<n){
//            if(nums[i] + nums[i] == target){
//                arr.add(nums[i]);
//                arr.add(nums[i]);
//            }
//            else if(nums[i] + nums[j] == target){
//                arr.add(nums[i]);
//                arr.add(nums[j]);
//            }
//        }
//
//
////        for(int i=0; i<n; i++){
////            for(int j =0; j<n; j++){
////                if(nums[i] + nums[i] == target ){
////                    arr.add(nums[i]);
////                    arr.add(nums[i]);
////                } else if(nums[i] + nums[j] == target){
////                    arr.add(nums[j]);
////                    arr.add(nums[i]);
////                }
////            }
////        }
//        System.out.println(arr);
//    }
//}