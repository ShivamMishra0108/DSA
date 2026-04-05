package MDArraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyMatrices {
    public static void main(String[] args) {

        int [][] a = {{1,2},{3,4}};
        int [][] b = {{2,1},{4,3}};


        int m = a.length;
        int n = a[0].length;

        int [][] c = new int [m][n];

        // ArrayList <Integer> c = new ArrayList<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    c[i][j] += a[i][k]*b[k][j];

                }
            }
        }
        System.out.println(Arrays.deepToString(c));
    }
}
