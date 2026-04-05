package MultiDiArray;

public class ForEach {
    public static void main(String[] args) {

        int [][] arr = {{2,44,4,4},{3,84,5,6},{2,95,6,4}};

//        for(int i=0; i<arr.length; i++){
//            for(int ele: arr[i]){
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }

        for(int [] a: arr){
            for(int x: a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
