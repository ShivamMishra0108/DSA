package Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class basicOperation {
    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        addAtIdx(q,3,90);
        System.out.println(q);


        removeAtIdx(q,3);
        System.out.println(q);

        System.out.println(peekAtIdx(q,4));
    }

    private static void removeAtIdx(Queue<Integer> q, int idx) {
        int n = q.size();
        if (idx < 0 || idx > n) {
            System.out.println("Invalid idx");
            return;
        }
        else{
            for(int i=0; i<idx; i++){
                q.add(q.remove());
            }
            q.remove();

            for(int i=0; i<n-idx-1; i++){
                q.add(q.remove());
            }
        }
    }

    private static int peekAtIdx(Queue<Integer> q, int idx) {

        int n = q.size();

        for(int i=0; i<idx; i++){
            q.add(q.remove());
        }
        return q.peek();
    }

    private static void addAtIdx(Queue<Integer> q, int idx, int val) {

        int n = q.size();
        if (idx < 0 || idx > n) {
            System.out.println("Invalid idx");
            return;
        }

        if (idx == n) {
            q.add(val);
        } else {
            for (int i = 0; i < idx; i++) {
                q.add(q.remove());
            }

            q.add(val);

            for (int i = 0; i < n - idx; i++) {
                q.add(q.remove());
            }
        }
    }

}
