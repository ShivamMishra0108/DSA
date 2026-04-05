package Arrays;

public class maxMinElement {
    public static void main(String[] args) {

        int [] arr = {26,-3,4,49,76,4,-6,-17};

        int max = arr[0];  // OR max = integer.minvalue

        for(int i=0; i<arr.length; i++){
         if(max<arr[i]){
             max = arr[i];
         }
        }
        System.out.println(max);


        int min = arr[0];  //OR min = integer.maxvalue

        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
