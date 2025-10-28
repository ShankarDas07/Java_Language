package J__Singly_LinkedList;

public class revise_link_bsc {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
        public Node(){
        }
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node m = new Node(5);
        Node n = new Node(25);
        Node o = new Node(76);

        m.next = n;
        n.next = o;

        display(m);
    }
}



