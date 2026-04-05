package Queues;

class CircularQueue{
    int [] arr;
    int f;
    int r;
    int size;

    CircularQueue(int capacity){
        arr = new int[capacity];
    }

    void add(int val){
        if(size == arr.length){
            System.out.println("Queue is full");
            return;
        }
        arr[r++] = val;
        if(r == arr.length)r= 0;
        size++;
    }

    int remove(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return -1;
        }
        int front = arr[f];
        f++;
        if(f == arr.length)f = 0;
        size--;
        return front;
    }

    int peek(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[f];
    }

    void Display(){
        if(size ==0 )return;

        if(f>=r){
            for(int i=f; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0; i<r; i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i=f; i<r; i++){
                System.out.print(arr[i] +" ");
            }
        }
        System.out.println();
    }

}
public class CircularArray {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(4);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.Display();
        System.out.println(q.remove());
        q.Display();
        q.add(50);
        q.Display();

        int [] a = q.arr;
        for(int ele: a) System.out.print(ele+" ");
    }
}
