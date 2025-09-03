package recursion;

import java.util.Scanner;
public class sum_of_digit {
    static int sumOfDigit(int n){
        if (n>=0 && n<=9) return n ;
        int ans=sumOfDigit(n/10);
        int sum=ans + sumOfDigit(n%10); //last digit of ant int value (n%10)
        //return sumOfDigit(n/10)+sumOfDigit(n%10);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n= sc.nextInt();
        int x=sumOfDigit(n);
        System.out.println("The sum of digits is : "+x);


    }
}
