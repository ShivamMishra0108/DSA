package TopInterView150;

public class GameOfLife {
    public void gameOfLife(int[][] board) {

        int row = board.length;
        int col = board[0].length;

        int [] dr = {-1,-1,-1,0,0,1,1,1};
        int [] dc = {-1,0,1,-1,1,-1,0,1};

        int [][] temp = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){

                int live = 0;

                for(int k=0; k<8; k++){
                    int nr = i+dr[k];
                    int nc = j+dc[k];

                    if(nr >=0 && nr<row && nc>=0 && nc<col && board[nr][nc] ==1){
                        live++;
                    }
                }

                if(board[i][j] ==1){

                    if(live==2 || live==3){
                        temp[i][j] = 1;
                    }
                }
                else{
                    if(live==3){
                        temp[i][j] = 1;
                    }
                }

            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                board[i][j] = temp[i][j];
            }
        }
    }

}
