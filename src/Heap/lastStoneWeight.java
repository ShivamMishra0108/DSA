package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class lastStoneWeight {
    static void main() {

    }

    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele: arr){
            pq.add(ele);
        }

        while(pq.size()>1){
            int x = pq.remove();
            int y = pq.remove();


            if(x != y){
                pq.add(x-y);
            }
        }

        return pq.size()==0?0:pq.peek();

    }
}
