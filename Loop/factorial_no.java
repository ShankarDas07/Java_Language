package loops;

import java.util.Scanner;
public class factorial_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n= sc.nextInt();
        int fact=1;
        int   i =1;
        for(;i<=n ; i++){
           fact=fact*i;
        }
        System.out.println("The Factorial No is : "+fact);
    }
}
