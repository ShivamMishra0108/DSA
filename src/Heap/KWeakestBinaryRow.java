package Heap;

import java.util.PriorityQueue;

public class KWeakestBinaryRow {

    class duo implements Comparable<duo>{
        int num;
        int row;
        duo(int num,int row){
            this.num=num;
            this.row=row;
        }
        public int compareTo(duo d){
            if(this.num == d.num){
                return this.row-d.row;
            }
            return this.num-d.num;
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {

        PriorityQueue<duo> pq = new PriorityQueue<>();

        for(int i=0; i<mat.length; i++){
            int n=0;
            for(int j=0;j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    n++;
                }
            }
            pq.add(new duo(n,i));

        }
        int [] ans = new int[k];

        for(int i=0; i<k; i++){
            ans[i] = pq.remove().row;
        }

        return ans;
    }
}
