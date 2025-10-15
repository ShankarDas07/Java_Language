package A__java_Basic;

import java.util.Scanner;
public class sum_two_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first No : ");
        int a= sc.nextInt();
        System.out.print("Enter the second No : ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum is : "+sum);
    }
}
