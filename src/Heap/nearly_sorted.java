package Heap;

import java.util.PriorityQueue;

public class nearly_sorted {
    public void nearlySorted(int[] arr, int k) {
        // code here
        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele: arr){
            pq.add(ele);

            if(pq.size()>k){
                int top = pq.remove();
                arr[idx++] = top;
            }
        }
        while(pq.size()!=0){
            arr[idx++]=pq.remove();
        }

    }
}
