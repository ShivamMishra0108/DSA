package Heap;

import java.util.*;

class pairs implements Comparable<pairs>{
    int freq;
    int num;
    pairs(int freq, int num){
        this.freq = freq;
        this.num = num;
    }
    public int compareTo(pairs p){
        if(this.freq == p.freq){
            return Integer.compare(this.num,p.num);
        }
        return Integer.compare(this.freq,p.freq);
    }
}

public class TopkFrequentElement {
    public int[] topKFrequent(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele: arr){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }

        PriorityQueue<pairs> pq = new PriorityQueue<pairs>();
        for(int ele: map.keySet()){
            int freq = map.get(ele);
            pq.add(new pairs(freq,ele));
            if(pq.size()>k)pq.remove();
        }

        int [] ans = new int[k];
        for (int i=0; i<k; i++){
            ans[i] = pq.remove().num;
        }
        return ans;


    }
}


