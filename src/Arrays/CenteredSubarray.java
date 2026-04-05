package Arrays;

import java.util.HashSet;

public class CenteredSubarray {
    public static void main(String[] args) {

        int[] arr = {-1, 1, 0};

        System.out.println(centeredSubarrays(arr));

    }


    public static int centeredSubarrays(int[] arr) {
        int n = arr.length;
        int result = 0;
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0; i<n; i++){
            int sum = 0;

            for(int j=i; j<n; j++){
            sum += arr[j];
            hash.add(arr[j]);
                if(hash.contains(sum)){
                    result++;
                }
            }

        }
        System.out.println(hash);
        return result;
    }
}
