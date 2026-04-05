package OOPS;
class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}
class Manager extends Employee {
    void attendMeeting() {
        System.out.println("Manager is attending a meeting");
    }
}
public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
        m.attendMeeting();
    }
}
