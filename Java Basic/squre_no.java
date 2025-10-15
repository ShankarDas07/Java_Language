package A__java_Basic;

import java.util.Scanner;
public class squre_no {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the user input as an integer
        int square = number * number; // Calculate the square of the number
        System.out.println("The square of " + number + " is: " + square);
        scanner.close(); // Close the scanner object
    }
}
