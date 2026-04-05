package Sorting;

import java.util.Arrays;

public class sortPeople {
    public static void main(String[] args) {


        String [] names = {"Mary","John","Emma"};
        int [] heights = {180,165,170};
        int n = names.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp1 = heights[j];
                    String temp = names[j];

                    heights[j] = heights[j+1];
                    names[j] = names[j + 1];

                    heights[j+1] = temp1;
                    names[j + 1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(names));
    }
}
