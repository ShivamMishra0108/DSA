package MultiDiArray;

public class B_one {
    public static void main(String[] args) {

        // GREATEST SUM OF EACH ROW

        int [][] arr = {{2,44,4,4},{3,84,5,6},{2,95,6,4}};
        int maxSum =0;
        int row = -1;

        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
            }
            if(sum >maxSum){
                maxSum = sum;
                row = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(row);




        // FIND THE MINIMUM ELEMENT OUT OF THE MAXIMUM ELEMENTS OF EACH ROW




        int Rmin  = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int max = 0;
            for(int j=0; j<arr[0].length; j++){
               if(arr[i][j] >max){
                   max = arr[i][j];
               }
            }
            if(max <Rmin){
                Rmin = max;
            }
        }

        System.out.println(Rmin);
    }
}
