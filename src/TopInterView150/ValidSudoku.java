package TopInterView150;


public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        // check row:
        for(int i=0; i<9; i++){

            boolean [] seen = new boolean[9];

            for(int j=0; j<9; j++){

                if(board[i][j] != '.'){
                    int num = board[i][j]-'1';
                    if(seen[num]){
                        return false;

                    }
                    seen[num] = true;
                }
            }
        }

        // check column

        for(int j=0; j<9; j++){

            boolean [] seen = new boolean[9];

            for(int i=0; i<9; i++){

                if(board[i][j] != '.'){
                    int num = board[i][j]-'1';
                    if(seen[num]) {
                        return false;
                    }
                    seen[num] = true;

                }
            }
        }

        // check 3X3 box

        for(int boxR = 0; boxR<9; boxR +=3){
            for (int boxC=0; boxC<9; boxC+=3){

                boolean [] seen = new boolean[9];

                for(int i=boxR; i<boxR+3; i++){
                    for(int j=boxC; j<boxC+3; j++){

                        if(board[i][j] != '.'){
                            int num = board[i][j]-'1';
                            if (seen[num]){
                                return false;
                            }
                            seen[num] = true;
                        }
                    }
                }
            }
        }

        return true;
    }

}
