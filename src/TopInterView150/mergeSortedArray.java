package TopInterView150;

public class mergeSortedArray {
    public static void main(String[] args) {

    }
    public void solution(int [] a, int [] b, int m, int n){

        int i=0;
        int j = 0;
        int k=0;

        while(i<m && j<n){
            if(a[i]<b[j])a[k++] = a[i++];
            else a[k++] = b[j++];
        }
        while (j<n){
            a[k++]  = b[j++];
        }
    }

}
