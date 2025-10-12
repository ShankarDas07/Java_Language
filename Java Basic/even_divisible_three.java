package A__java_Basic;

import java.util.Scanner;
public class even_divisible_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No : ");
        int no= sc.nextInt();
        if (no%2==0 && no%3==0 ){
            System.out.println("The No is even and Divisibal by three");
        } else if (no%2==0) {
            System.out.print("The no is only even");
        } else {
            System.out.print("The Non is Odd");
        }
    }
}
