package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(18);
        arr.add(24);
        arr.add(34);
        arr.add(28);
        arr.add(54);

        System.out.println(arr.size());

        System.out.println(arr.get(1));
        arr.set(3,50);

        System.out.println(arr);

        for(int i =0; i<arr.size(); i++) {
            System.out.print(arr.get(i) + " ");


        }
        System.out.println();

        for (int ele: arr){
            System.out.print(ele + " ");
        }

        System.out.println();

        arr.add(45);
        arr.add(1,100);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);
    }
}
