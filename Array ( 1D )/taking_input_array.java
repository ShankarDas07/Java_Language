package one_D_array;

import java.util.Scanner;
public class taking_input_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many input in the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
