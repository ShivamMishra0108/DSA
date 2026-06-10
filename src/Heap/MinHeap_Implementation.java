package Heap;



class Heap{
    int [] arr;
    int idx = 1;

    int peak(){
        return arr[1];
    }

    int remove(){
        if(idx==1) {
            System.out.println("Heap is Empty");
            return -1;
        }
        int min = arr[1];
        arr[1] = arr[idx-1];
        idx--;
        //rearrange
        int root = 1;
        while(root<=size()){
            int left = 2*root, right = 2*root+1;
            int leftVal = (left<=size())?left : Integer.MAX_VALUE;
            int rightVal = (right<=size())?right : Integer.MAX_VALUE;
            if(arr[root]<leftVal && arr[root] < rightVal)break;
            else{
                if(leftVal<rightVal){
                    int temp = arr[root];
                    arr[root] = arr[left];
                    arr[left] = temp;
                    root = left;
                }
                else{
                    int temp = arr[root];
                    arr[root] = arr[right];
                    arr[right] = temp;
                    root = right;
                }
            }
        }
        return min;
    }

    void add(int ele){
        if(idx == arr.length){
            System.out.println("Heap is full");
            return;
        }
        arr[idx++] = ele;
        // rearrangement
        int root = idx-1;
        while(root != 1){
            int parent = root/2;
            if(arr[root]<arr[parent]){
                int temp = arr[root];
                arr[root] = arr[parent];
                arr[parent] = temp;
                root = parent;
            }
            else break;
        }
    }

    int size(){
        return idx-1;
    }

    void Display(){
        for(int i=1; i<idx; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    Heap(int capacity){
        arr = new int[capacity+1];
    }
}
public class MinHeap_Implementation {
    static void main() {
        Heap h = new Heap(10);

        h.add(8); h.add(10);  h.add(4);  h.add(3); h.add(9);

        h.Display();

        System.out.println(h.remove());

        h.Display();


    }
}
