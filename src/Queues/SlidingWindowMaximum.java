package Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class SlidingWindowMaximum {
    public static void main(String[] args) {


        int [] arr = {1,-1};
        int k = 1;

        System.out.println(Arrays.toString(sol(arr, k)));
    }
    public static int[] sol(int[] arr, int k){
        Queue<Integer> q = new ArrayDeque<>();

        int m = Integer.MIN_VALUE;
        int n = arr.length;

        int [] ans = new int[n-k+1];

        for(int i=0; i<n; i++){
            q.add(arr[i]);
        }

        int x = q.remove();
        int y = q.remove();
        int z = q.peek();

        m = Math.max(x,y);
        m = Math.max(m,z);
        ans[0] = m;

        int i=0;
        while(i <n-k){
            x = y;
            y = q.remove();
            z = q.peek();

            m = Math.max(x,y);
            m = Math.max(m,z);
            ans[i+1] = m;

            i++;

        }

        return ans;

    }
}
