package MDArraylist;

import java.util.ArrayList;
import java.util.List;

public class One {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(2); a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4); b.add(5); b.add(6);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(7); c.add(8); c.add(9);
        ArrayList<Integer> d = new ArrayList<>();
        d.add(10); d.add(11); d.add(19);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        arr.add(a); arr.add(b); arr.add(c); arr.add(d);

//        for(int i=0; i<arr.size(); i++){
//            for(int j=0; j<arr.get(i).size(); j++){
//                System.out.print(arr.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }
        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10);
        arr.get(arr.size()-1).add(30);

        for(ArrayList<Integer> list : arr){
            for(int ele: list){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    public List<List<Integer>>generate(int n){
        List<List<Integer>> ans  = new ArrayList<>();

        for (int i=0; i<n; i++){
            ans.add(new ArrayList<>());
            for(int j=0; j<=i; j++){
                if(j ==0 || j==i){
                    ans.get(i).add(1);
                }else{
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    ans.get(i).add(val);
                }
            }
        }
        return ans;
    }
}
