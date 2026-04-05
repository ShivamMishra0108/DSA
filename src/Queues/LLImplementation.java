package Queues;

public class LLImplementation {
    public static void main(String[] args) {

        MyQueue q = new MyQueue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        q.Display();

        q.remove();

        q.Display();
    }
}
