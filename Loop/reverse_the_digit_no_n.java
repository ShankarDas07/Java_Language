package loops;

import java.util.Scanner;
public class reverse_the_digit_no_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n = sc.nextInt();
        int input_no = n;
        int r = 0;
        int i = 0;
        //System.out.print("the Reverse no is : ");
        for (; n > 0; i++) {
            // r = n % 10;
            r=r*10+n%10;
            n = n / 10;

          //  System.out.print(r);
        }
        System.out.print("the Reverse no is : "+r);
    }
}
