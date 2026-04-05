package Heap;

import java.util.PriorityQueue;

public class minimumCostOfRopes {
    static void main() {
        int[] arr = {4,2,7,6,9};
        System.out.println(minCost(arr));
    }

    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele: arr){
            pq.add(ele);
        }

        int cost = 0;

        while(pq.size()>1){
            int x = pq.remove();
            int y = pq.remove();
            cost += x+y;
            pq.add(x+y);
        }

        return cost;
    }
}
