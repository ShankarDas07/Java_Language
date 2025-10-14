package A__java_Basic;

import java.util.Scanner;
public class read_characters {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the character:");

            char ch = sc.next().charAt(0);
            System.out.println("The character is: " + ch);
        }
}
