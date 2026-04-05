package Arrays;

import java.util.Arrays;

public class sortZeroOne {
    public static void main(String[] args) {

        int []arr = {1,0,1,1,0,2,0,1,0,1,2};
        int n = arr.length;
        int r = 0;
        int w = 0;
        int b = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                r++;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                w++;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] == 2){
                b++;
            }
        }
        System.out.println(r);
        System.out.println(w);
        System.out.println(b);
        int i = 0;
        while(i<r){
            arr[i++] = 0;
        }
        while(i<r+w){
            arr[i++] = 1;
        }
        while(i<n){
            arr[i++] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }
}
