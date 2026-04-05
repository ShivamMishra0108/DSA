//package MDArraylist;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PascalTriangle_2 {
//
//    public static void main(String[] args) {
//        System.out.println(generate(5));
//    }
//    public static List<List<Integer>>generate(int n){
//        List<List<Integer>> ans  = new ArrayList<>();
//
//        for (int i=0; i<n; i++){
//            ans.add(new ArrayList<>());
//            for(int j=0; j<=i; j++){
//                if(j ==0 || j==i){
//                    ans.get(i).add(1);
//                }else{
//                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
//                    ans.get(i).add(val);
//                }
//            }
//        }
//        return ans;
//    }
//
//    public static List<List<Integer>>row(int row){
//        int n = row+1;
//        List<List<Integer>> ans  = new ArrayList<>();
//
//        for (int i=0; i<n; i++){
//            List<Integer> list = new ArrayList<>();
//            for(int j=0; j<=i; j++){
//                if(j ==0 || j==i){
//                    list.add(1);
//                    ans.get(i).set(j,1);
//                }else{
//                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
//                    list.add(val);
//                    ans.add(list);
//                }
//            }
//        }
//        return ans.get(row);
//    }
//
//}
