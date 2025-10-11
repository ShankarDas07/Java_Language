package A__java_Basic;

import java.util.Scanner;
public class div_three_or_five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No : ");
        int no = sc.nextInt();
        if (no % 5 == 0 || no % 3 == 0) {
            System.out.println("The "+no+" is  Divisibal by 3 or 5");
        }
    }
}