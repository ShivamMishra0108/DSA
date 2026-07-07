package Maps_Sets;

import java.util.HashMap;

public class ArraySubset {
    public boolean isSubset(int a[], int b[]) {

        HashMap<Integer, Integer> map1= new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (map1.containsKey(a[i])) {
                int freq = map1.get(a[i]);
                map1.put(a[i], freq++);
            } else {
                map1.put(a[i], 1);
            }
        }


        for (int ele: b) {
            if(!map1.containsKey(ele)) return false;
            if (map2.containsKey(ele)) {
                int freq = map2.get(ele);
                map2.put(ele, freq++);
            } else {
                map2.put(ele, 1);
            }
        }

        for (int ele: map2.keySet()){
            int freq = map2.get(ele);
            int afreq = map1.get(ele);
            if(afreq<freq)return false;
        }

        return true;

    }



//    public boolean isSubset(int a[], int b[]) {
//
//        HashMap<Integer, Integer> map1= new HashMap<>();
//        // HashMap<Integer, Integer> map2 = new HashMap<>();
//
//        for (int i = 0; i < a.length; i++) {
//            if (map1.containsKey(a[i])) {
//                int freq = map1.get(a[i]);
//                map1.put(a[i], freq+1);
//            } else {
//                map1.put(a[i], 1);
//            }
//        }
//
//
//        for (int ele: b) {
//            if(!map1.containsKey(ele))return false;
//            if(map1.get(ele) == 0)return false;
//            map1.put(ele,map1.get(ele)-1);
//        }
//
//
//        return true;
//
//
//    }
}
