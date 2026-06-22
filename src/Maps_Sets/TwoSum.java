package Maps_Sets;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public int[] twoSum(int[] arr, int target){

        HashMap<Integer,Integer> hs = new HashMap();

        for(int i=0; i<arr.length; i++){

            int needed = target-arr[i];

            if(hs.containsKey(needed)){
                return new int []{hs.get(needed),i};
            }
            hs.put(arr[i],i);
        }
        return new int[]{};
    }
}
