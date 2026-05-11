package TopInterView150;

public class SetMatrixZero {
    public void setZeroes(int[][] mat) {

        int row = mat.length;
        int col = mat[0].length;

        boolean [] rbool = new boolean[row];
        boolean [] cbool = new boolean[col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(mat[i][j] == 0){
                    rbool[i] = true;
                    cbool[j] = true;
                }
            }
        }
        for(int i=0; i<row; i++){

            if(rbool[i]){
                for(int j=0; j<col; j++){
                    mat[i][j] = 0;
                }
            }
        }

        for(int j=0; j<col; j++){

            if(cbool[j]){
                for(int i=0; i<row; i++){
                    mat[i][j] = 0;
                }
            }
        }

    }
}
