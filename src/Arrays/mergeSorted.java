package Arrays;

import java.util.Arrays;

public class mergeSorted {
    public static void main(String[] args) {

        int [] a = {1,3,4,6,8,9};
        int [] b = {2,4,5,7,10};
        int m = a.length;
        int n = b.length;

        int [] c = new int[m+n];

        int i=0;
        int j = 0;
        int k = 0;

        while(i<m && j<n){
            if(a[i]<b[j]){
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];
            }
        }
        while(i<m){
            c[k++] = a[i++];
        }
        while(j<n){
            c[k++]  = b[j++];
        }


//        for(int i=0; i<m; i++){
//            for(int j=0; j<n; j++) {
//                if (a[i] < b[j]) {
//                    c[i] = a[i];
//
//                } else if (a[i] > b[j]) {
//                    c[i] = b[j];
//
//                } else if (a[i] == b[j]) {
//                    c[i] = a[i];
//                    c[i + 1] = b[j];
//                }
//            }
//        }
        System.out.println(Arrays.toString(c));
    }
}


//import java.util.Arrays;
//
//public class mergeSorted {
//    public static void main(String[] args) {
//
//        int[] a = {1,3,4,6,8,9};
//        int[] b = {2,4,5,7,10};
//        int m = a.length;
//        int n = b.length;
//
//        int[] c = new int[m + n];
//
//        int i = 0, j = 0, k = 0;
//
//        // Merge while both arrays have elements
//        while (i < m && j < n) {
//            if (a[i] < b[j]) {
//                c[k++] = a[i++];
//            } else {
//                c[k++] = b[j++];
//            }
//        }
//
//        // Copy remaining elements of a
//        while (i < m) {
//            c[k++] = a[i++];
//        }
//
//        // Copy remaining elements of b
//        while (j < n) {
//            c[k++] = b[j++];
//        }
//
//        System.out.println(Arrays.toString(c));
//    }
//}
//
