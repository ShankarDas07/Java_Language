package A__java_Basic;

import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No : ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("the No is EVEN");
        }
        else  {
            System.out.println("the No is ODD");
        }
    }
}
