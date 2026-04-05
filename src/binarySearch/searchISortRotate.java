package binarySearch;

public class searchISortRotate {
    public static void main(String[] args) {

        int[] arr = {5,6,7,8,9,10,1,2,3,4};
        int n = arr.length;
        int tar = 3;
        int pivot = 0;
        int ans;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                pivot = i;
            }
        }
        System.out.println(pivot);

        if(arr[0]<= tar && tar <= arr[pivot]) {
           ans =  binary(arr, 0, pivot, tar);
        }else {
           ans =  binary(arr, pivot + 1, n - 1, tar);
        }

        System.out.println(ans);


    }
    static int binary(int[] arr, int lo, int hi, int a){

        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == a) return mid;
            else if(arr[mid]<a)lo = mid+1;
            else hi = mid-1;


        }
        return -1;
    }
}

