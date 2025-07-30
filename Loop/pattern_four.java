package loops;

import java.util.Scanner;

public class pattern_four {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the No : ");
            int n = sc.nextInt();
            int i = 0;
            for (; i<n; i++) {                      //for(int i=n; i<=1; i--){
                for (int j = 1; j <=n-i; j++) {     //   for(j=1; j<=i; j++)
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
}

