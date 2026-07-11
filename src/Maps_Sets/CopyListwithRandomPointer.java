package Maps_Sets;


import java.util.HashMap;

public class CopyListwithRandomPointer {
    public Node deepcopy(Node head1){
        Node temp1 = head1;
        Node head2 = new Node(-1);
        Node temp2 = head2;
        while(temp1 != null){
            Node n = new Node(temp1.val);
            temp2.next = n;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return head2;
    }

    public Node copyRandomList(Node a) {

        Node b  = deepcopy(a);
        Node temp1 = a;
        Node temp2 = b;

        HashMap<Node, Node> map = new HashMap<>();
        map.put(null,null);
        while(temp1 != null){
            map.put(temp1,temp2);
            temp2 = temp2.next;
            temp1 = temp1.next;
        }

        temp1 = a;
        while (temp1 != null){
            temp2 = map.get(temp1);
            temp2.random = map.get(temp1.random);
            temp1 = temp1.next;
        }
        return b;

    }
}
