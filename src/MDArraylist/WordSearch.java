package MDArraylist;

public class WordSearch {
    public static void main(String[] args) {
        String [][] board = {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"},{"G","R","G","J"}};
              String   s = "ABCCED";

              int i=0; int j=0;

              while (i<board.length-1 && j<board[0].length-1){
                  if(s.charAt(0) == board[0][0].charAt(0)){
                      for(int k=0; k<s.length(); k++){
                          if(s.charAt(k+1) == board[i+1][j].charAt(0))i++;
                          if(s.charAt(k+1) == board[i][j+1].charAt(0))j++;
                          if(i!=0){
                              if (s.charAt(k + 1) == board[i - 1][j].charAt(0)) i--;
                          }
                          if( j!=0){
                              if (s.charAt(k + 1) == board[i][j - 1].charAt(0)) j--;
                          }
                          if(s.charAt(s.length()-1) == board[i][j].charAt(0)){
                              System.out.println(s.charAt(k));
                          }
                      }
                  }
              }
    }
}
