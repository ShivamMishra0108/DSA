package Heap;


import java.util.PriorityQueue;

public class PriorityQueueSTL {
     public static void main() {
         PriorityQueue<Integer> pq = new PriorityQueue();

         pq.add(10);
         pq.add(20);
         pq.add(-30);
         pq.add(30);

         System.out.println(pq.peek());
         System.out.println(pq.poll());
         System.out.println(pq.peek());
         System.out.println(pq.size());
         System.out.println(pq);


    }
}
