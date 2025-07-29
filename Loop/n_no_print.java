package loops;

import java.util.Scanner;
public class n_no_print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the the No : ");
        int num=sc.nextInt();
        System.out.print("The No is : ");
        int i=1;
        while (i<=num){
            System.out.print("  "+i);
            i++;
        }
    }
}