package J__Singly_LinkedList;

public class InsertAtEnd_Beg_Any {
    static class Node{
        int data; Node next;
        // parameterized constructor
        Node(int data){ // psvm pass the data is here
            this.data = data;
        }
    }
    public static class LinkedList {
        Node head = null;
        Node tail = null;

        //Insert at End
        void insertEnd(int data){
            Node temp = new Node(data);
            if (head==null){
                head = temp;
                //tail = temp;
            }else {
                tail.next = temp;
                //tail = temp;
            }
            tail = temp;
        }

        //insert At Begining
        void insertBeg(int data){
            Node temp = new Node(data);
            if (head == null){ // Empty list
                head = temp;  //head = tail = temp; OR insertEnd(data);
            }else{     // Nonempty List
                temp.next = head; // Connect the new node to head
                head = temp;
            }
        }

        //Insert At Any Index
        void insertAny(int idx, int data){
            Node box = new Node(data);
            Node temp = head;
            if (idx==0){
                insertBeg(data);
            }
            else if (idx == size()){  //if we don't write this tail don't update
                insertEnd(data);  // when we put last index at any value
                return;
            } else if (idx < 0 || idx > size()) {
                System.out.println("Wrong Index");
            }
            for (int i=1; i<idx; i++){
                temp = temp.next;
            }
            box.next = temp.next;
            temp.next = box;
        }
            //Get Value With Passing Index
        int getAt(int idx){
            Node temp = head;
            if (idx < 0 || idx >= size()) {
                System.out.print("Wrong Index : ");
                return -1;
            }
            for (int i=0; i<idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void delete(int idx) {
            if (idx < 0 || idx >= size()) {
                System.out.println("Wrong Index");
                return;
            }
            if (idx == 0) {  // Case: Deleting first element
                head = head.next;
                if (head == null) { // If list becomes empty
                    tail = null;
                }
                return;
            }
            Node temp = head;
            for (int i = 1; i < idx ; i++) {  // Fix: Start at 0 and run until idx - 1
                temp = temp.next;
            }
            temp.next = temp.next.next;

            if (idx == size() - 1) { // Case: Deleting last element
                tail = temp;
            }
        }

        // SIZE METHOD
        int size(){ //
            Node temp = head;
            int count=0;
            while (temp!=null){
                count++;
                temp = temp.next;
            }
            return count; //size() correctly returns 8, but the valid indices range from 0 to 7
        }
         // DISPLAY METHOD
        void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+"-->");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertEnd(5);
        ll.insertEnd(7);
        ll.insertEnd(555);
        ll.display();
        ll.insertBeg(1);
        ll.display();
        ll.insertBeg(0);
        ll.display();
        ll.insertAny(2,3);
        ll.display();
        ll.insertAny(3,4);
        ll.display();
        ll.insertAny(0,777);
        ll.display();

        System.out.println("The LinkedList size is : "+ll.size());

        System.out.println("The Tail data of the LinkedList is : "+ll.tail.data);

        int index = 6; // Change this index dynamically
        System.out.println("The " + index + "th Position Element is: " + ll.getAt(index));
        //System.out.println(ll.getAt(6));

        int idx = 4;
        System.out.print("After "+idx+" index delete LinkedList is: ");
        ll.delete(idx);
        ll.display();
        System.out.println("The Tail data of the LinkedList is : "+ll.tail.data);
    }
}
