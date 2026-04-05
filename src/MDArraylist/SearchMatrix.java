package MDArraylist;

class SearchMatrix{
    public static void main(String[] args) {

        int [][] mat = {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int tar = 8;

        int m = mat.length;
        int n = mat[0].length;

        int i=0;
        int j = n-1;

        while(i<m && j>=0){
             if(mat[i][j] >tar)j--;
            else if(mat[i][j]  < tar)i++;
            else if(mat[i][j] == tar)System.out.println(i +","+ j);
            break;

        }

    }
}