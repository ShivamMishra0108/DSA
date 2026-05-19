package TopInterView150;
import java.util.*;

public class MergeIntervals {
    static void main() {
        int [][] n = {{1,3},{2,6},{8,10},{15,18}};
        merge(n);
    }
    public static int[][] merge(int[][] num) {

        Arrays.sort(num);
        int n = num.length;
        if (n==1)return num;

        HashMap<Integer,Integer> hm  = new HashMap<>();

        for(int i=0; i<n-1; i++){
            if(num[i][1] < num[i+1][0]){
                hm.put(num[i][0],num[i][1]);
            }
            else{
                hm.put(num[i][0],num[i+1][1]);
                i++;
            }
        }
        int [][] ans = new int [hm.size()][2];

        int i=0;

        for(Map.Entry<Integer,Integer>entry: hm.entrySet()){
            ans[i][0] = entry.getKey();
            ans[i][1] = entry.getValue();
            i++;
        }

        return ans;
    }
}
