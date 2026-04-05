package Queues;


public class MaximumCircularSubarray {
    public static void main(String[] args) {

        int [] arr = {5,-3,5};


        int n = arr.length;
        int maxSum =  Integer.MIN_VALUE;

        for(int st=0; st<n; st++){

            int curSum = 0;

            for (int len = 0; len < n; len++) {

                int index = (st + len) % n;
                curSum += arr[index];

                if(curSum>maxSum){
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
