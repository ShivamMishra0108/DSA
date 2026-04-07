package Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class pair1 implements Comparable<pair1>{
    int num;
    int idx;
    pair1(int num, int idx){
        this.num = num;
        this.idx = idx;
    }
    public int compareTo(pair1 p1){
        return Integer.compare(this.num,p1.num);
    }

}

class pair2 implements Comparable<pair2>{
    int idx;
    int num;

    pair2(int idx, int num){
        this.idx = idx;
        this.num = num;
    }
    public int compareTo(pair2 p2){
        return Integer.compare(this.idx,p2.idx);
    }

}



public class SlidingWindowMaximum {
    public static void main() {

        int [] arr = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));
    }
    public static int[] maxSlidingWindow(int[] arr, int k) {

        PriorityQueue<pair1> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<pair2> pq2 = new PriorityQueue<>();

        int n = arr.length;
        int [] ans = new int[n-k+1];

        for(int i=0; i<arr.length; i++){
            pq1.add(new pair1(arr[i],i));

            pq2.add(new pair2(i,arr[i]));
        }
        if(pq1.size()>k)pq1.remove();
        if(pq2.size()>k)pq2.remove();


        while(pq1.size()>0){
            pair1 top1 = pq1.remove();
            pair2 top2 = pq2.remove();

            ans[top2.idx] = top1.num;
        }
        return ans;



    }

}
