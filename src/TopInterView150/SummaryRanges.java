package TopInterView150;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    static void main() {
        summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9});
    }
    public static List<String> summaryRanges(int[] nums) {

        int n = nums.length;
        List<String> l = new ArrayList<>();

        if(n==0)return l;
        int start = nums[0];

        for(int i=0; i<n; i++){

            if(i == n-1 || nums[i+1] != nums[i]+1){
                int end = nums[i];

                if(start == end){
                    l.add(String.valueOf(start));
                }

                else{
                    l.add(start+"->"+end);
                }

                if(i != n-1){
                    start = nums[i+1];
                }
            }
        }
        return l;

    }
}
