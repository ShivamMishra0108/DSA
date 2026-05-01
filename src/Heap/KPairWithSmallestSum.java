package Heap;

import java.util.*;
class triplet implements Comparable<triplet>{
    int sum;
    int x;
    int y;

    triplet(int sum,int x ,int y){
        this.sum = sum;
        this.x = x;
        this.y = y;
    }

    public int compareTo(triplet t){
        return Integer.compare(this.sum,t.sum);
    }
}

public class KPairWithSmallestSum {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<triplet> pq = new PriorityQueue<triplet>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                pq.add(new triplet(nums1[i]+nums2[j],nums1[i],nums2[j]));
            }
        }
        for(int i=0; i<k; i++){
            triplet top = pq.remove();
            list.add(top.x);
            list.add(top.y);
            ans.add(list);
            list.clear();
        }
        return ans;

    }
}
