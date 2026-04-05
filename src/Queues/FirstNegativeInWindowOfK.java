package Queues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class FirstNegativeInWindowOfK {

    public static void main(String[] args) {

    }

    public ArrayList sol(int []arr, int k){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] <0)q.add(i);

        }
        for(int i=0; i<=n-k; i++) {
            while (q.size()>0 && q.peek()<i)q.remove();
            if(q.size()>0 && q.peek()<=i+k-1)ans.add(arr[q.peek()]);
            else ans.add(0);
        }

        return ans;
    }
}
