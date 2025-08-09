package one_D_array;

import java.util.Scanner;
public class prefix_sum {
    static void printArray(int arr[]){
        int n= arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void prefix(int [] arr){
        int n= arr.length;
        for (int i=1; i<n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter how many element in the array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter "+n+" element in the array : ");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        prefix(arr);
        printArray(arr);
    }
}
