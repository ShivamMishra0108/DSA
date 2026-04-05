package Arrays;

public class kthLargest {
    public static void main(String[] args) {

        int [] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        System.out.println( kth(arr, k));
    }
    public static  int kth(int[]arr, int k){

        int max= Integer.MIN_VALUE;
        int count = 0;

        for(int i=0; i<arr.length; i++){
           if(arr[i] > arr[0]){
               max = arr[i];
           }
        }
        for (int i =0; i<arr.length; i++){
        }
        return k;
    }
}
