package Arrays;

public class productOfElemnts {
    public static void main(String[] args) {


        int [] arr = {3,7,5,12,3,5};
        int mult = 1;

        for(int i=0; i<arr.length; i++){
            mult *= arr[i];
        }
        System.out.println(mult);
    }
}
