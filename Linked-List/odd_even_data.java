package J__Singly_LinkedList;

public class odd_even_data {
    public static class ListNode{
        int data; ListNode next;
        //Constructor
        ListNode (int data){
            this.data = data;
        }
    }
    public static class oddEven {
        static void oddeven(ListNode head){
            ListNode t = head;

            ListNode odd = new ListNode(-1);
            ListNode tempO = odd; //Odd pointer

            ListNode even = new ListNode(0);
            ListNode tempE = even ; //even pointer

            while(t != null){
                if (t.data % 2 == 0){ //even number
                    ListNode a =new ListNode(t.data);
                    tempE.next = a;
                    tempE = a;
                    t = t.next;
                }
                else{ //Odd number
                    ListNode a =new ListNode(t.data);
                    tempO.next = a;
                    tempO = a;
                    t = t.next;
                }
            }
            tempE.next = null; // Ensure last node of Even points to null
            System.out.print("Even No is : ");
            display(even.next);  // `even.next` কারণ প্রথমটি ডামি নোড

            tempO.next = null; // Ensure last node of Odd points to null
            System.out.print("Odd No is : ");
            display(odd.next); // `odd.next` কারণ প্রথমটি ডামি নোড

        }
        
        static void display(ListNode head) { // Make this static
            ListNode temp = head;
            while(temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b =new ListNode(5);
        ListNode c =new ListNode(4);
        ListNode d =new ListNode(1);
        ListNode e =new ListNode(2);
        ListNode f =new ListNode(8);
        ListNode g =new ListNode(10);
        ListNode h =new ListNode(13);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        System.out.print("The LinkedList is : ");
        oddEven.display(a);
        oddEven.oddeven(a);

    }
}
