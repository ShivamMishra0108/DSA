package Arrays;

public class secondMaximum {
    public static void main(String[] args) {

        int [] arr = {5,3,5,7,9,10};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int j = 0; j < n; j++) {
            if(arr[j] > max2 && arr[j] != max){
                max2 = arr[j];
            }
        }


        System.out.println(max);
        System.out.println(max2);
    }
}
