package basics;

public class typeCasting {
    public static void main(String[] args) {

        // typeCasting => conversion from one datatype to another; (like int to char or char to int);

        // ASCII values of alphabets and numbers

        // for small letter start with 97:
        // a = 97
        // b = 98
        // c = 99
        // d = 100 and so on

        // for capital letter start with 65:
        // A = 65
        // B = 66
        // C = 67
        // D = 68 and so on

        // for integers0 it starts with 48:
        // 0 = 48
        // 1 = 49
        // 2 = 50
        // 3 = 51 and so on

        // IMPLICIT TYPECASTING:

        char ch = 'D';
        int x = ch;
        System.out.println(x);

        // EXPLICIT TYPECASTING:

        char name = 'd';
        int y = (int)name;
        System.out.println(y);

        // NOW FROM INTEGER TO CHARACTER:

        int n = 90;
        char ch1 = (char)n;
        System.out.println(ch1);

        // SMART WAY:

        char ch2 = 'c';
        System.out.println(ch2+0);
    }
}
