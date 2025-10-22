package J__Singly_LinkedList;

public class Basic_linkedList {
    public  static class Node{
        int data;  Node next;

        //default constructor
        Node(){

        }
            // parameterized constructor
        Node(int data){
            this.data = data;
        }
    }

    //Display function
    public static void display (Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(99);
        Node d=new Node(88);
        Node e=new Node(657);

        System.out.println(a); // address of node a is $Node@a09ee92
        System.out.println(a.data);

            //connect each node
        a.next=b; //  5-->6 99 88 657
        a.next.next=c; // 5--> 6-->99 88 657
        c.next = d; // 5-->6--> 99-->88 657
        d.next = e; // 5-->6-->99--> 88-->657
        System.out.println(a.next.next.next.data); //
        display(a); //when we create display method under the class Node we can access [ a.display(a); ]
                     // & Don't need public static because Node class also be public Static
    }
}
