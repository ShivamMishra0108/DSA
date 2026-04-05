package MultiDiArray;

import java.util.ArrayList;

public class BestReachableTower {
    public static void main(String[] args) {

        int[][] tower = new int[][]{{1, 2, 5}, {5, 1, 7}, {6, 1, 9}};
        int [] center = {1,1};
        int radius = 2;

        int n = tower.length;
        ArrayList<Integer> arr = new ArrayList<>();
        int [] ans = new int[2];

        for(int i=0; i<n; i++){
            int m = Math.abs(tower[i][0]-center[0])+Math.abs(tower[i][1]-center[1]);

            if(m <= radius){
                arr.add(i);
            }
        }

        if(arr.size() == 0){
            ans[0] = -1;
            ans[1] = -1;
        }
        if(arr.size() == 1){
            ans[0] = tower[arr.get(0)][0];
            ans[1] = tower[arr.get(0)][1];
        }

    }



}
