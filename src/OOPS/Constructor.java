package OOPS;

public  class Constructor {
    public  static class Car{
        String name;
        int price;

        Car(String name, int price){
            this.price = price;
            this.name = name;
        }
        Car(int p, String n){
           price = p ;
           name = n ;
        }
        void print (){
            int price;
            System.out.println(name+" "+this.price);  //  THIS Keyword:
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("kia", 1250000);
        c1.print();
        Car c2 = new Car(400000,"alto");
        c2.print();
    }
}
