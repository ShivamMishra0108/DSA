package Arrays;

import java.util.Arrays;

public class waveArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        int n  = arr.length;

        for (int i=0; i<n; i+=2) {
            if (i + 1 < n) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
