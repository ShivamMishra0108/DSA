package TopInterView150;

import java.util.*;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;

        HashMap<String,List<String>> hm = new HashMap<>();

        for(String s: strs){

            char[]arr = s.toCharArray();

            Arrays.sort(arr);

            String key = new String(arr);

            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<>());
            }
            hm.get(key).add(s);
        }
        return new ArrayList<>(hm.values());

    }
}
