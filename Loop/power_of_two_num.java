package loops;

import java.util.Scanner;
public class power_of_two_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No : ");
        int a=sc.nextInt();
        System.out.print("what is the power of the No : ");
        int b= sc.nextInt();
        int pow=1;
        int i=1;
        for(; i<=b ;i++){
            pow=a*pow;

        }
        System.out.println("The squre is : "+pow);
    }
}
