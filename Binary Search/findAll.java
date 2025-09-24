package BinaryTree;

public class findAll {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val=val;
        }
    }

    static int size(Node root){
        if (root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    static int sum(Node root){
        if (root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    static int maxi(Node root){
        if (root==null) return Integer.MIN_VALUE;
        int a = root.val;
        int mx = maxi(root.left);
        int mx2 = maxi(root.right);
        return Math.max(a,Math.max(mx,mx2));
    }

    static int height(Node root){
        if (root==null) return 0;
        if (root.left == null && root.right == null) return 0;
        int a = height(root.left);
        int b = height(root.right);
        return 1 + Math.max(a , b);
    }

    static int product(Node root){
        if (root==null) return 1;
        return root.val * sum(root.left) * sum(root.right);
    }

    static int min(Node root){
        if (root==null) return Integer.MAX_VALUE;
        int a = root.val;
        int mx = maxi(root.left);
        int mx2 = maxi(root.right);
        return Math.min(a,Math.min(mx,mx2));
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

        Node e = new Node(11);
        root.right.right = e;

        Node f = new Node(41);
        b.left =f;

        System.out.println("The size (Total Node) of the Tree : "+ size(root));

        System.out.println("The sum of the Tree : "+ sum(root));

        System.out.println("The max Ele of the Tree : "+ maxi(root));

        System.out.println("The Height of the Tree : "+ height(root));

        System.out.println("The product of the Tree : "+ product(root));

        System.out.println("The min Ele of the Tree : "+ min(root));
    }
}
