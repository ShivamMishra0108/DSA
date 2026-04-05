package MultiDiArray;

import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {
//
//        int [][] arr = {{2,44,4,4},{3,84,5,6},{2,95,6,4}};
//
//        for(int i=0; i<arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for(int i=0; i<arr[0].length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[j][i] + " ");
//            }
//            System.out.println();
//        }
//
        int [][] arr = {{1,2,3,4}, {5,6,7,8},{9,0,10,11},{12,13,14,15}};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){

                int temp  = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }

        }
        System.out.println(Arrays.deepToString(arr));

    }
}
