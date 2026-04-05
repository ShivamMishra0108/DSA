package OOPS;

public class Constructors {

    public static class car{
        int seat ;
        String name;
        double length;

        car(int x, String y, double z){
            seat = x;
            name = y;
            length = z;
        }

        void print(){
            System.out.println(name+" "+seat+" "+length);
        }
    }

    public static void main(String[] args) {
        car c1 = new car(5,"Sonnet", 3.9);
        c1.print();
    }
}
