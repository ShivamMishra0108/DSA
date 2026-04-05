package CyclicSort;

public class FindDuplicate {
    public static void main(String[] args) {

        int [] arr = {1,3,4,2,2};
        System.out.println(dup(arr));

    }
    public static int dup(int [] arr){
        int n = 1+arr.length;
        int i=0;

        while (i<arr.length){
            if(arr[i] == i+1)i++;
            else{
                int idx = arr[i]-1;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;

                if(arr[i] == arr[idx]){
                    return arr[i];
                }
            }
        }
        return n;
    }
}
