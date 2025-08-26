package recursion;

import java.util.Scanner;
public class fibonacci_no {
    static int fibo(int n){
        if (n==0 || n==1) return n;
        int prev=fibo(n-1);
        int prevprev=fibo(n-2);
        return prev+prevprev;
//        return fibo(n-1)+(n-2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n= sc.nextInt();
        System.out.println("The fibonacci No is : "+fibo(n));
    }
}
