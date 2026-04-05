package OOPS;

public class StudentData {
   String name ;
   int rno;
   int[] marks;

   StudentData(int s){     //CONSTRUCTOR:
       marks = new int[s];
   }

    public static void main(String[] args) {
        StudentData s1 = new StudentData(4);
        StudentData s2 = new StudentData(2);

        s1.marks[0] = 88;
        s1.marks[1] = 89;
        s1.marks[2] = 87;
        s1.marks[3] = 85;

   }
}
