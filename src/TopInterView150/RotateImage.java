package TopInterView150;

public class RotateImage {
    public void rotate(int[][] a) {


        for(int i=0; i<a.length; i++){
            for(int j=0; j<i; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        for(int i=0; i<a.length; i++){
            int st = 0;
            int end = a[0].length-1;
            while(st<end){
                int temp = a[i][st];
                a[i][st] = a[i][end];
                a[i][end] = temp;
                st++;
                end--;

            }

        }

    }
}
