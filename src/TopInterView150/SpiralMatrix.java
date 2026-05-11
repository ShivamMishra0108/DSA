package TopInterView150;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] mat) {

        List<Integer> ans = new ArrayList<>();

        int fc = 0;
        int fr = 0;
        int lr = mat.length;
        int lc = mat[0].length;

        while(fc<=lc && fr<=lr){

            for(int j=fc; j<=lc; j++){
                ans.add(mat[fr][j]);
            }
            fr++;

            if(fr>lr || fc>lc)break;
            for(int i=fr; i<=lr; i++){
                ans.add(mat[i][lc]);
            }
            lc--;

            if(fr>lr || fc>lc)break;
            for(int j=lc; j>=fc; j--){
                ans.add(mat[lr][j]);
            }
            lr--;

            if(fr>lr || fc>lc)break;
            for(int i=lr; i>=fr; i--){
                ans.add(mat[i][fc]);
            }
            fc++;
        }
        return ans;
    }
}
