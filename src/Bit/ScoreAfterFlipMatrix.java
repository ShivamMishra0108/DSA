package Bit;

// MAKE FIRST COLUMN ALL ELEMENT ONE
// FLIP REMAINING COLUMN HAVING 0 > 1


public class ScoreAfterFlipMatrix {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0; i<n; i++){
            if(grid[i][0] == 0){
                flipR(i,grid);
            }
        }


        for(int j=0; j<m; j++){
            int zero = 0; int one =0;
            for(int i=0; i<n; i++){
                if(grid[i][j] == 1) one++;
                else zero++;
            }
            if(zero > one){
             flipC(j,grid);
            }

        }
        int sum =0; int pow = 1;

        for(int j=m-1; j>=0; j--){
            int ones=0;
            for(int i=0; i<n; i++){
                if(grid[i][j] == 1)ones++;
            }
            sum += pow*ones;
            pow *= 2;
        }
        return sum;

    }


    public void flipC(int j, int[][]grid){
        for(int k=0; k<grid.length; k++){
            if(grid[k][j] == 1) grid[k][j] = 0;
            else grid[k][j] = 1;
        }
    }

    public void flipR(int i, int[][] grid){
        for(int k=0; k<grid[0].length; k++){
            grid[i][k] ^= 1;
        }
    }
}
