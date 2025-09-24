package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    static class Node{
        int val;
        Node right;
        Node left;

        public Node(int val) {
            this.val = val;
        }
    }
    static void BFS(Node root){
        Queue <Node> qu = new LinkedList<>();
        if (root != null) qu.add(root);

        while (qu.size() > 0){
            Node temp = qu.peek();
            if (temp.left != null ) qu.add(temp.left);
            if (temp.right != null ) qu.add(temp.right);
            System.out.print(temp.val+"-->");
            qu.remove();
        }
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
        BFS(root);
    }
}
