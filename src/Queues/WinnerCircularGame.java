package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class WinnerCircularGame {
    public static void main(String[] args) {

        System.out.println(win(11,4));

    }
    public static  int win(int n, int k){

        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=n; i++){
            q.add(i);
        }

        while(q.size() != 1){
            int x = 1;
            while(x <= k-1){
                q.add(q.remove());
                x++;
            }
            q.remove();
        }
        return q.peek();

    }
}
