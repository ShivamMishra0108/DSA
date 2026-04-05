package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class missingElement {

    static void main() {

    }
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];

        int j=0;

        for(int i = min;i<max;i++)
        {
            if(i!=nums[j])
            {
                list.add(i);
            }
            else
            {
                j++;
            }
        }
        return list;


    }
}
