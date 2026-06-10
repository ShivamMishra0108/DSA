package Recursion;

public class MergeSort {
    static int count =0;
    public static void main(String[] args) {

        int [] arr = {1,3,7,4,2,6,8};

        mergeSort(arr);
        for (int e: arr) System.out.print(e + " ");
        System.out.println();
        System.out.println(count);
    }

    private static void mergeSort(int[] arr) {


        //Step 1: make two empty arrays of n/2 size:
        int n=arr.length;
        if(n==1)return;
        int [] a = new int[n/2];
        int [] b = new int [n-n/2];

        // Step 2: copy and paste arr in a and  b:

        int idx = 0;
        for(int i=0; i<a.length; i++)a[i] = arr[idx++];
        for(int i=0; i<b.length; i++)b[i] = arr[idx++];

        // Step 3: MAGIC:

        mergeSort(a);
        mergeSort(b);

        // Step 4: Merge a and b into arr:

        merge(a,b,arr);
    }

    private static void merge(int[] a, int[] b, int[] arr) {
        int i=0;int j=0; int k=0;

    while (i<a.length && j<b.length){
        if(a[i]<=b[j])arr[k++] = a[i++];
        else{ arr[k++] = b[j++];
        count += a.length-i;
        }
    }
    while (i<a.length)arr[k++] = a[i++];
    while (j<b.length)arr[k++] = b[j++];
    }

}
