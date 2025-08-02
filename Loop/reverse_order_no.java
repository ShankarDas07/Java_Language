package loops;

import java.util.Scanner;
public class reverse_order_no {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n= sc.nextInt();
        System.out.print("The Reverse No is : ");
        for (int i=n; i>=1; i--){
            System.out.print(i+" ");
        }
    }
}
