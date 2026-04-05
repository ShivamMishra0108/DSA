package Arrays;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {

        ArrayList<Integer> ans = new ArrayList<>();

        int [] n1 = {4,9,8,4};
        int [] n2 = {4,9,5,8};

        int m = n1.length;
        int n = n2.length;


        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(n1[i] == n2[j]&& !ans.contains(n1[i])){
                        ans.add(n1[i]);
                }
            }
        }
        System.out.println(ans);
    }
}
