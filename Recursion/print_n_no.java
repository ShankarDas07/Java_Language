package recursion;

import java.util.Scanner;
public class print_n_no {
    static void printIncreasing(int n){
        if (n==1){
            System.out.println(n); // or (1)
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No : ");
       int n= sc.nextInt();
       printIncreasing(n);
    }
}


