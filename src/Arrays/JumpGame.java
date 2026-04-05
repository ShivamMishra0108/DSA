package Arrays;

public class JumpGame {
    static void main(String[] args) {

        int[] arr = {1,3,1,1,4};

        int k = 0;
        int n = arr.length;

        int i = 0;
        while (i <= n) {
           k = arr[i];
           i += k;
            if(i == n-1){
                System.out.println(true);
                break;
            }else if(i>n-1){
                System.out.println(false);
                break;
            }else{
                System.out.println(false);
                break;
            }
        }

    }
    public boolean fun(int [] arr){

        int k = 0;
        int n = arr.length;

        int i=0;

        while (i<n-1){
            if(arr[i] == 0)return false;

            k = arr[i];
            i += k;

            if(i == n-1)return true;
        }
        return false;
    }

}
