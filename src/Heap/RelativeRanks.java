package Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class pair implements Comparable<pair>{
    int num;
    int idx;
    pair(int num, int idx){
        this.num = num;
        this.idx = idx;
    }
    public int compareTo(pair p){
        if(this.num == p.num){
            return Integer.compare(this.idx,p.idx);
        }
        return Integer.compare(this.num,p.num);
    }
}

public class RelativeRanks {
    public static void main() {
        int [] score = {10,3,8,9,4};

        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
    public static String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String [] ans = new String[n];

        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            pq.add(new pair(score[i],i));
        }
        int rank = 1;
        while (pq.size()>0){
            pair top = pq.remove();
            if(rank == 1){
                ans[top.idx] = "Gold Medal";
            }
            else if(rank == 2){
                ans[top.idx] = "Silver Medal";
            }
            else if(rank == 3){
                ans[top.idx] = "Bronze Medal";
            }
            else
                ans[top.idx] = String.valueOf(rank);
            rank++;
        }
        return ans;



    }
}
