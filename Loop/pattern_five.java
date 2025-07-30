package loops;

import java.util.Scanner;
public class pattern_five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n = sc.nextInt();
        int i = 1;
        for (; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {   //print 2*i-1=
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
