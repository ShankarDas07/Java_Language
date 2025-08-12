package one_D_array;

import java.util.Scanner;

public class rotate_array_without_creating_another_array {
        static void swapArray(int [] arr, int i, int j){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];

        }

        static void reverseArray(int [] arr, int i, int j){
            while (i<j){
                swapArray(arr,i,j);
                i++; j--;
            }
        }

    static void rotateWithoutArray(int [] arr,int k){
        int n=arr.length;
        k=k % n;
        reverseArray(arr,0, n-k-1);
        reverseArray(arr,n-k, n-1);
        reverseArray(arr,0, n-1);
    }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//        reverse_array_without_creating_another_array obj=new reverse_array_without_creating_another_array();

            System.out.print("Enter how many elements in the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter " + n + " elements in the array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("How many time rotate the array : ");
            int k=sc.nextInt();


            rotateWithoutArray(arr,k);
            System.out.print("Rotate last "+k+" number is : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
}
