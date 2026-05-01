package TopInterView150;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {

        int n=numbers.length;
        int [] ans = new int[2];


        for(int i=0; i<n-1; i++){
            for (int j=1; j<n; j++){
                if(numbers[i]+numbers[j] ==target){
                    ans[0] =i+1;
                    ans[1] = j++;
                }
            }
        }
        return ans;

    }
}
