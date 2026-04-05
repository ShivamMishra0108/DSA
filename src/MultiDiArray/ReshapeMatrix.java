package MultiDiArray;

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {

        int [][] arr = {{1,2},{3,4}};

        int row = arr.length;
        int col = arr[0].length;

        int r=1;
        int c = row*col;

        if(r*c != row*col){
            System.out.println(Arrays.deepToString(arr));
        }

        int [][] ans = new int [r][c];

        int flat = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                ans[flat/c][flat%c] =arr[i][j];
                flat ++;
            }
        }

        System.out.println(Arrays.deepToString(ans));
    }
}
