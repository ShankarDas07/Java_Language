package one_D_array;

import java.util.Scanner;
public class squre_and_sorted {

    static void printArray(int arr[]){
        int n= arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swapArray(int [] arr, int i, int j){
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];

    }

    static void square(int [] arr ){
        int n= arr.length;
        for (int i=0;i<n; i++){
            arr[i]=arr[i]*arr[i];
        }
    }
    int [] sorted(int [] arr){
        int n= arr.length;
        for (int i=0; i<n;i++){
            for (int j=i+1 ; j<n; j++){
                if(arr[i]>arr[j]){
                    swapArray(arr,i,j);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        squre_and_sorted obj=new squre_and_sorted();

        System.out.print("Enter how many element put in the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " Array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The square array is : ");
        square(arr);
        printArray(arr);
        
        int [] x=obj.sorted(arr);
        System.out.print("The sorted array is : ");
        printArray(x);
    }
}
