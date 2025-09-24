package BinaryTree;

public class Nth_level_print {
    static class Node{
        int val;
        Node right;
        Node left;

        public Node(int val) {
            this.val = val;
        }
    }

    static void levelPrint(Node root , int n){
        if (root==null) return;
        if (n==1) {
            System.out.print(root.val+" ");
            return;
        }
        levelPrint(root.left,n-1);
        levelPrint(root.right,n-1);
    }

    static int height(Node root){
        //if (root==null) return 0;
        if (root==null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);
        root.left.left = c;
        root.left.right = d;

        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        root.right.right = f;

        levelPrint(root,3); // 3rd level print
        System.out.println();

        System.out.println("Height of the tree : "+height(root));
        System.out.println();


        int n = height(root)+1 ; // height = root -1
        System.out.println("The tree is : ");
        for (int i=1; i<=n; i++){
            levelPrint(root,i);
            System.out.println();
        }
    }
}
