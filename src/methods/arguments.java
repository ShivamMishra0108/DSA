package methods;

public class arguments {

    public static void shivam(){
        System.out.println("one");
        om();
    }
    public static void om(){
        System.out.println("two");
        harsh();
    }
    public static void harsh(){
        System.out.println("three");
        shivam();
    }
    public static void main(String[] args) {
     shivam();

    // Actual arguments:
        argu(4,5);


    }
    public static void argu(int a, int b){
        int x = a +b;
        System.out.println(x);
    }
}
