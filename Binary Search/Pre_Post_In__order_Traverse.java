package BinaryTree;

public class Pre_Post_In__order_Traverse {
    static class Node{
        int val;
        Node right;
        Node left;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void preOrder(Node root){
        if (root == null ) return;
        System.out.print(root.val +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if (root == null ) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val +" ");
    }

    public static void inOrder(Node root){
        if (root == null ) return;
        inOrder(root.left);
        System.out.print(root.val +" ");
        inOrder(root.right);
    }

    public static void display(Node root){
        if (root == null ) return;
        System.out.print(root.val +" --> ");
        if (root.left != null) System.out.print(root.left.val+" ");
        if (root.right != null) System.out.print(root.right.val+" ");
        System.out.println();
        display(root.left);
        display(root.right);

    }
    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;

        Node c = new Node(6);
        Node d = new Node(5);
        root.left.left = c;
        root.left.right = d;

        Node e = new Node(9);
        Node f = new Node(11);
        b.left = e;
        root.right.right = f;

        System.out.print("The pre-Order travers is : ");
        preOrder(root);
        System.out.println();

        System.out.print("The In-Order travers is : ");
        inOrder(root);
        System.out.println();

        System.out.print("The post-Order travers is : ");
        postOrder(root);
        System.out.println();

        display(root);

    }
}
