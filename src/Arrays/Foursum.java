//package Arrays;
//import java.util.*;
//public class Foursum {
//    public static void main(String[] args) {
//        List<List<Integer>> res = new ArrayList<>();
//        int [] nums = {3,4,5,6,5,4,2,3,5,67};
//        int target = 16;
//        int n = nums.length;
//
//
//        Arrays.sort(nums);
//
//        for(int i =0; i<n-3; i++){
//            if(i>0 && nums[i] == nums[i-1])continue;
//           for(int j=0; j<n-2; j++){
//
//               int p = j+1;
//               int q = n-1;
//
//               while(p<q){
//                    int sum = nums[i] + nums[j] + nums[p] + nums[q];
//
//                   if(sum<target){
//                       p++;
//                   }
//                   else if(sum>target){
//                       q--;
//                   }
//                   else{
//                     res.add(Arrays.asList(nums[i],nums[j],nums[p],nums[q]));
//                     p++;
//                     q--;
//                   }
//               }
//
//           }
//        }
//        System.out.println(res);
//
//
////        int i=0;
////        int j=0;
////        int k=0;
////        int l=0;
////        for( i=0; i<n; i++) {
////            for ( j=0; j<n; j++) {
////                for ( k=0; k<n; k++) {
////                    for (l=0; l<n; l++) {
////                        if (nums[i] + nums[l] + nums[j] + nums[k] == target
////                            && nums[i] != nums[j] &&  nums[j] != nums[k] &&
////                                nums[k] != nums[l] && nums[l] != nums[i]
////                        ) {
////                            p = nums[i];
////                             q = nums[j];
////                             r = nums[k];
////                             s = nums[l];
////
////                            break;
////                        }
////                    }
////                }
////            }
////        }
////        System.out.println(p);
////        System.out.println(q);
////        System.out.println(r);
////        System.out.println(s);
//
//    }
//}
