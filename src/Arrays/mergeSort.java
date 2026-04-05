package Arrays;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {

        int [] arr = {5,6,8,7,4,3,5,7,8,4,3};

        sort(arr);

        System.out.println(Arrays.toString(arr));

    }
    public static  void   sort(int [] arr){
       int n = arr.length;
       if(n==1)return;
       int [] a = new int[n/2];
       int [] b = new int[n-n/2];

       int idx = 0;

       for(int i=0; i<a.length; i++)a[i] = arr[idx++];
       for(int j=0; j<b.length; j++)b[j] = arr[idx++];

       sort(a);
       sort(b);

       merge(a,b,arr);


    }

    public static void merge(int [] a, int [] b, int [] arr){
        int i=0, j=0, k=0;

        while (i<a.length && j<b.length){
            if(a[i]<= b[j])arr[k++] = a[i++];
            else arr[k++]  = b[j++];
        }

        while (i<a.length)arr[k++] =a[i++];
        while (j<b.length)arr[k++] =b[j++];


    }
}
