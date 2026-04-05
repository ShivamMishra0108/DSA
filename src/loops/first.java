package loops;

public class first {
    public static void main(String[] args) {

        // BAD LOOP: NUMBERS OF ITERATIONS ARE MORE:-

        for (int i = 17; i <= 170; i++) {
            if (i % 17 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        // GOOD LOOP: NUMBERS OF ITERATION IS LESS:-

        for(int i=17; i<=170; i=i+17){
            System.out.println(i);
        }

        System.out.println();

        // GOOD LOOP:-

        for(int i=1; i<=10; i++){
            System.out.println(i*17);
        }

        // QUESTION:

        for(int i=1; i<=100; i++){
            if(i%2!=0){
                if(i%3==0){
                    System.out.println(i);
                }
            }
        }
    }
}
