package OOPS;

public class Revision {
    public static class pokemon{
        int power;
        String name;
        String type;

        pokemon(){

        }
    }

    public static void main(String[] args) {
        pokemon p1 = new pokemon();
        p1.name = "pikcachu"; p1.power = 70; p1.type = "Fire";
        pokemon p2 = new pokemon();
        p2.name = "pikcachu"; p2.power = 70; p2.type = "Fire";
        pokemon p3 = p1;     //SHALLOW COPY
        p3.type = "Water";
        System.out.println(p1.type);
    }
}
