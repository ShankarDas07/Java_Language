package loops;

import java.util.Scanner;

public class holo_pyramid_number_pattern {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int r = sc.nextInt();
            for (int i = 1; i <= r; i++) {
                // Printing spaces before numbers
                for (int j = 1; j <= r - i; j++) {
                    System.out.print(" ");
                }
                // Printing numbers and spaces within the pyramid
                for (int k = 1; k <= 2 * i - 1; k++) {
                    if (i == r || k == 1 || k == 2 * i - 1) {
                        System.out.print(i);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // Move to the next line after each row
            }
        }
}
