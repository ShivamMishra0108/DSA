package Arrays;

public class MedianOfTwoArrays {
    public static void main(String[] args) {

        int [] a = {1,3};
        int [] b = {2};
        int [] c = new int[a.length+b.length];

        int i=0;
        int j=0;
        int k = 0;
        int n= c.length;

        while (i< a.length && j<b.length){
            if(a[i] <= b[j])c[k++] =a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length)c[k++] = a[i++];
        while(j<b.length)c[k++] = b[j++];

        double median;

        if (n % 2 == 0) {

            median = (c[n/2 - 1] + c[n/2]) / 2.0;
        } else {

            median = c[n/2];
        }
        System.out.println(median);
    }
}
