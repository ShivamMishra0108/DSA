package Arrays;

import java.util.List;

public class subArrays {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        int n = arr.length;

        for (int st=0; st<n; st++){
            for(int end =st; end<n; end++){
                for(int i=st; i<=end; i++){
                    System.out.print(arr[i]);
                }
                System.out.println(" ");
            }
            System.out.println();
        }
}


}
