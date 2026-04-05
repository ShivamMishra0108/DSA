package Stacks;

class LNode{
    int val;
    Node next;
    LNode(int val){
        this.val = val;
    }
}

class MyStack{
    Node head;
    int len;

    int peek()throws Exception{
        if(head == null) {
            throw new Exception("Stack ie Empty");
        }
        else {return head.val;}
    }

    int pop() throws Exception {
        if(head == null){
            throw new Exception("Stack ie Empty");
        }
        head = head.next;
        len--;
        return head.val;
    }

    void push(int ele){
        Node temp = new Node(ele);
        if(len == 0)head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }
    int size(){
        return len;
    }

    void Display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LLImplementaion {
    public static void main(String[] args) throws Exception{

        MyStack st = new MyStack();
        //st.peek();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.Display();
        st.pop();
        st.Display();
    }
}
