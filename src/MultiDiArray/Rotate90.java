package MultiDiArray;

import java.util.Arrays;

public class Rotate90 {
    public static void main(String[] args) {

        int [][] a = {{1,3,8,4},{7,2,1,6},{7,5,3,2},{2,9,6,0}};

        int row = a.length;
        int col = a[0].length;

        int [][] b = new int [col][row];

        for(int i=0; i<b.length; i++){
            for(int  j=0; j<=b[0].length-1; j++){
                b[i][j] = a[j][i];
            }
        }
        System.out.println(Arrays.deepToString(b));

        for(int i=0; i<b.length; i++){
            for(int j=b[0].length-1; j>=0; j--){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }


    }
}
