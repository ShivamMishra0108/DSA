package MultiDiArray;

import java.util.Arrays;

public class ModifyMatrix {
    public static void main(String[] args) {

        int [][] arr = {{1,2,-1},{4,-1,6},{3,8,9}};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }




        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
               if(arr[i][j] == -1){
                   arr[i][j] = findn(arr,j);
               }
            }

        }
        System.out.println(Arrays.deepToString(arr));
    }
    public static int findn(int [][] arr,int col){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i][col] > max){
                max = arr[i][col];
            }
        }
        return max;
    }
}
