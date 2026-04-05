package OOPS;

class Person {
    void displayName() {
        System.out.println("Name: Aryan");
    }
}
class Student extends Person {
    void displayClass() {
        System.out.println("Class: 12th");
    }
}
class Monitor extends Student {
    void checkDiscipline() {
        System.out.println("Monitor is checking discipline");
    }
}
public class people {
    public static void main(String[] args) {
        Monitor mon = new Monitor();
        mon.displayName();
        mon.displayClass();
        mon.checkDiscipline();
    }
}
