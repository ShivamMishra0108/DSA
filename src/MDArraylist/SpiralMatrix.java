package MDArraylist;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {

        int [][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        int m = mat.length;
        int n = mat[0].length;

        int fc= 0;
        int lc = n-1;
        int fr = 0;
        int lr = m-1;

        while(fc<=lc && fr<=lr){
            for(int j=fc; j<=lc; j++){
                System.out.println(mat[fr][j]);
            }
            fr++;

            for(int i=fr; i<=lr; i++){
                System.out.println(mat[i][lc]);
            }
            lc--;

            for(int j=lc; j>= fc; j--){
                System.out.println(mat[lr][j]);
            }
            lr--;

            for(int i=lr; i>=fr; i--){
                System.out.println(mat[i][fc]);
            }
            fc++;

        }
    }
}
