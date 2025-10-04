package A__java_Basic;

import java.util.Scanner;
public class a_divid_by_b_a_getter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter the value of a (a > b): ");
        int a = scanner.nextInt(); // Read the first integer input

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt(); // Read the second integer input

        if (a > b) { // Check if a > b
            int remainder = a % b; // Calculate the remainder when a is divided by b
            System.out.println("The remainder when " + a + " is divided by " + b + " is: " + remainder);
        } else {
            System.out.println("Error: a must be greater than b.");
        }
    }
}
