package one_D_array;//import java.util.Scanner;
//public class odd_even_sort {
//    static void printArray(int arr[]){
//        int n= arr.length;
//        for (int i=0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    int [] sort(int [] arr){
//        int n= arr.length;
//        int [] count=new int[n];
//        int j=0;
//        for (int i=0; i<n; i++){
//            if (arr[i]%2==0){
//                 count[j++]=arr[i];
//            }
//        }
//        for (int i=0; i<n; i++){
//            if (arr[i]%2!=0){
//                count[j++]=arr[i];
//            }
//        }
//        return count;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        odd_even_sort obj=new odd_even_sort();
//
//        System.out.print("Enter how many element put in the Array : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter " + n + " Array element : ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int []x=obj.sort(arr);
//        printArray(x);
//    }
//}

            //OPTIMIZE CODE USING TWO POINTER APPROACH

import java.util.Scanner;
public class odd_even_sort {
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
    static void reverseArray(int [] arr){
        int n= arr.length;
        int i=0; int j=n-1;
        while (i<j){
            if(arr[i]%2==1 && arr[j]%2==0) {
                swapArray(arr, i, j);
                i++; j--;
            }
            if (arr[i]%2==0){
                i++;
            }
            if (arr[j]%2==1){
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many element put in the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " Array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        printArray(arr);
    }
}
