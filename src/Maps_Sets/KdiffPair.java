package Maps_Sets;

import java.util.HashMap;

public class KdiffPair {
    public int findPairs(int[] a, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int ele: a){
            if(!hm.containsKey(ele))hm.put(ele,1);
            else hm.put(ele, hm.get(ele)+1);
        }

        int pairs = 0;
        for(int ele: hm.keySet()){
            int rem1 = ele-k;
            int rem2 = ele+k;

            if(hm.containsKey(rem1))  pairs += hm.get(ele)*hm.get(rem1);
            if(hm.containsKey(rem2))  pairs += hm.get(ele)*hm.get(rem2);

        }

        return pairs/2;
    }

}
