package MultiDiArray;

public class SnakePattern {
    public static void main(String[] args) {

        int [][] arr = {{2,44,4,7},{3,84,5,6},{2,95,6,4}};

        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();





        // MAKE SNAKE PATTER ROW WISE



        for(int i=0; i<arr.length; i++){

            if(i %2 == 0){
                for(int j=0; j<arr[0].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for(int j=arr[0].length-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println();




        // NOW COLUMN WISE:


        for(int i=0; i<arr[0].length; i++) {
            if( i%2 == 0){
                for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
                }
            }else {
                for(int j=arr.length-1; j>=0; j--){
                    System.out.print(arr[j][i] + " ");
                }
            }
            System.out.println();
        }
    }

}
