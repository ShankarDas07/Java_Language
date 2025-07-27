package loops;

import java.util.Scanner;
public class count_given_no_of_n {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n=sc.nextInt();
        int original_n=n;
        int i=0;
        //while(n>0)
        for (;  n>0; i++) {
            n = n / 10;
            //System.out.println("The No of digit is : " + original_n + "=" + i);
        }
        System.out.println("The No of digit is : " + original_n + "=" + i);
        }
    }
