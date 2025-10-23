package J__Singly_LinkedList;

public class find_node_endLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node endNthNode(Node head, int idx){
        Node temp = head;
        int count=0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int M = count - idx + 1;
        //Mth node to start
        temp = head; //in that time temp also be the last
        for (int i=1; i<M; i++){
            temp =  temp.next;
        }
        return temp;
    }

    static Node endNthNode2(Node head, int idx){
        Node fast = head ;
        Node slow = head;
        for (int i=1; i<=idx; i++){
            fast = fast.next;
        }
        while (fast !=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        //Node f = new Node(7);
        a.next = b;
        a.next.next = c;
        c.next = d;
        d.next = e;
       // e.next = f;

        Node temp = endNthNode(a,4); //2-->3-->4-->5-->6-->7-->null
        System.out.println(temp.data);   //1   2    3   4   5   6 - starting index
                                         //6   5    4   3   2   1  - ending index & ANS

       Node temp2 = endNthNode2(a,2);//2-->3-->4-->5-->6-->7-->null
        System.out.println(temp2.data);   //6   5    4   3   2   1  - ending index & ANS

    }
}
