package J__Singly_LinkedList;

public class deleteNthEnd {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node deleteNthFromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;
        // Move 'fast' n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // Edge Case: If `fast` is null, it means we need to remove the head
        if (fast == null) {
            return head.next;
        }
        // Move both `fast` and `slow` until `fast` reaches the last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Skip the nth node from the end
        slow.next = slow.next.next;
        return head; // Return the modified list
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(7);
        a.next = b;
        a.next.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        deleteNthFromEnd(a,2);
        display(a);

    }
}
