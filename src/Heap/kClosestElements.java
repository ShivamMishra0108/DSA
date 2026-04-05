package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int dif;
    int ele;
    Pair(int dif, int ele){
        this.dif = dif;
        this.ele = ele;
    }
    public int compareTo(Pair p){
        if(this.dif == p.dif){
            return Integer.compare(this.ele,p.ele);
        }
        return Integer.compare(this.dif,p.dif);
    }
}

public class kClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele: arr){
            int dif = Math.abs(ele-x);
            pq.add(new Pair(dif,ele));
            if(pq.size()>k) pq.remove();
        }
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<k; i++){
             Pair top = pq.remove();
             ans.add(top.ele);
        }
        Collections.sort(ans);
        return ans;
    }
}

