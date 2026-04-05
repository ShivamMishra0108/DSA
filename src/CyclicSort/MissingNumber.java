package CyclicSort;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 8, 1, 2, 3};

        System.out.println(miss(arr));
    }

        public static int miss(int[]arr){
        int n = 1+arr.length;
        int i = 0;

        while (i< arr.length){
            if(arr[i] == i+1 || arr[i] == n)i++;
            else{
                int idx = arr[i]-1;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }

            }

        for ( i=0; i<arr.length; i++){
            if(arr[i] != i+1)return i+1;
        }
            return n;


    }

}
