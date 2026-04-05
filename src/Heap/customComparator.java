package Heap;

import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int roll;
    double cgpa;

    Student(String name, int roll, double cgpa){
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
    }
    public int compareTo(Student s){
        //return this.name.compareTo(s.name);
       // return Integer.compare(this.roll,s.roll);
        return Double.compare(this.cgpa,s.cgpa);
//        if(this.cgpa == s.cgpa)
//            return this.roll-s.roll;

    }
}

public class customComparator {
    static void main() {

        Student s1 = new Student("shivam",01,7.8);
        Student s2 = new Student("shiv",22,8.4);
        Student s3 = new Student("aman",43,9.2);
        Student s4 = new Student("vikas",64,6.8);
        Student s5 = new Student("gopi",15,7.9);
        Student[] arr = {s1,s2,s3,s4,s5};

        Arrays.sort(arr);
        for (Student s: arr){
            System.out.println(s.name+ " "+s.roll+" "+s.cgpa);
        }
    }
}
