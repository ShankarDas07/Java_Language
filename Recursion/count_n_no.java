package recursion;

import java.util.Scanner;
public class count_n_no {
    static int countOfDigit(int n){
        // Base case: if n becomes 0, we stop recursion
        if (n==0) return 0;
        // Recursive case: remove the last digit and count it
        return 1 + countOfDigit(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n = sc.nextInt();
        // Special case for input 0, as 0 has 1 digit
        if (n == 0) {
        System.out.println("The count of digits is: 1");
        } else {
        int x= countOfDigit(n);
        System.out.println("The count of digits is: " +x);
        }
    }
}
