package A__java_Basic;//public class calculate_area_circle {
//        public static void main(String[] args) {
//            double radius = 5.0; //  radius
//            double area = Math.PI * radius * radius; // Area calculation using Math.PI
//            System.out.println("Area of the circle with radius " + radius + " is: " + area);
//
//        }
//}

//output: Area of the circle with radius 5.0 is: 78.53981633974483

import java.util.Scanner;

public class calculate_area_circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble(); // Read the user input for radius
        double area = Math.PI * radius * radius; // Area calculation using Math.PI
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
        scanner.close(); // Close the scanner object
    }
}
