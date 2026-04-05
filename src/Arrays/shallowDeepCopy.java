package Arrays;

import java.util.Arrays;

public class shallowDeepCopy {
    public static void main(String[] args) {

        int []arr = {10,34,56,23};

        // SHallow copy

        int[] x = arr;
        System.out.println(arr[0]);
        x[0] = 100;
        System.out.println(arr[0]);

        // DEEP copy

        int[] y = Arrays.copyOf(arr, arr.length);
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
