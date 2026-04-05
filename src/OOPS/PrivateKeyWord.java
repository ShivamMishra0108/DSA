package OOPS;

class Students{
    String name;
    private int rno;
    double cgpa;

    void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }

    int getRno(){
        return rno;
    }
    void setRno(int x){
        rno = x;
    }

}

public class PrivateKeyWord {
    public static void main(String[] args) {
    Students s = new Students();
    s.print();
    s.cgpa =5.4;
    s.name = "frweg";
    //s.getRno(45);
    s.print();
        System.out.println(s.getRno());
    }
}
