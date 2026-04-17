package TopInterView150;

class ProductExceptItself {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int [] ans = new int[n];

        int suffix = 1;
        int prefix = 1;

        ans[0] = prefix;
        ans[n-1] = suffix;

        for(int i=1; i<n; i++){
            prefix = prefix*nums[i-1];
            ans[i] = prefix;
        }

        for(int i=n-2; i>=0; i--){
            suffix = suffix*nums[i+1];
            ans[i] = ans[i]*suffix;
        }

        return ans;



    }

}
