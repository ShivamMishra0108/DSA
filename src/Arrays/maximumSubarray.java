package Arrays;


public class maximumSubarray {
    public static void main(String[] args) {

        int [] arr = {5,-3,5};
        int n = arr.length;
        int maxSum =  Integer.MIN_VALUE;

        for(int st=0; st<n; st++){
            int curSum = 0;

            for(int end=st; end<n; end++){

                curSum += arr[end];

                if(maxSum < curSum){
                    maxSum = curSum;
                }

                if(curSum < 0){
                    curSum = 0;
                }

            }
        }
        System.out.println(maxSum);
    }
}
