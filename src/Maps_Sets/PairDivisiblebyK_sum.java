package Maps_Sets;

import java.util.HashMap;

public class PairDivisiblebyK_sum {
    public int countKDivPair(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int ele: arr){
            if(ele%k == 0){
                if(map.containsValue(0)) count++;
            }
            else {
                if(map.containsValue(k - (ele%k))) count++;
            }

            map.put(ele,ele%k);
        }
        return count;
    }


    public int countKdivPairs(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int ele : arr) {

            int rem = ele % k;

            if (rem < 0)
                rem += k;   // handles negative numbers

            int need = (k - rem) % k;

            count += map.getOrDefault(need, 0);

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}
