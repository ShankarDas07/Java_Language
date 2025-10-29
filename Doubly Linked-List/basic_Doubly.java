package K__Doubly_Linkedlist;
public class basic_Doubly {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int val){
            this.val = val;
        }
    }

     static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
         System.out.println();
    }

    static void displaypre(ListNode tail){
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.val+"-->");
            temp = temp.prev;
        }
        System.out.println();
    }

    static void displayran(ListNode random){
        ListNode temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }
        //Now temp is now head
        while(temp != null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b =new  ListNode(5);
        ListNode c =new ListNode(4);
        ListNode d =new ListNode(1);
        ListNode e =new ListNode(2);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        System.out.print("The LinkedList is : ");
        display(a);
        System.out.print("The Reverse LinkedList is : ");
        displaypre(e);

        displayran(c);

    }
}
