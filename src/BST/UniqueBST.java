package BST;

public class UniqueBST {
    static void main() {

    }

    public int BST(int n){
        long com = nCr(2*n,n);
        int result  = (int)(com/(n+1));
        return result;
    }


    public long nCr(int n, int r) {
        if (r > n) return 0;

        // Because nCr = nC(n-r)
        r = Math.min(r, n - r);

        long  result = 1;

        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }

        return result;
    }

    public int factorial(int n){
        if(n==0)return n;
        n = n*factorial(n-1);
        return n;
    }
}

