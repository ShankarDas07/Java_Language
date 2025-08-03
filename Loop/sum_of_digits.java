package loops;

import java.util.Scanner;
public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n= sc.nextInt();
        int input_no=n;
        int sum=0;
        int r=0;
        int i=0;
        for(; n>0; i++){
            r =n%10; //last digit of the no
            n = n /10;
            sum = sum + r;
        }
            System.out.println("The sum is:" +input_no+ "="+sum);


    }
}
