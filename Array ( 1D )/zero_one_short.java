package one_D_array;//import java.util.Scanner;
//public class zero_one_short {
//    static void printArray(int arr[]){
//        int n= arr.length;
//        for (int i=0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    static void sort(int [] arr){
//        int n=arr.length;
//        int  count=0;
//        for (int i=0; i<n;  i++){
//            if(arr[i]==0){
//                count++;
//            }
//        }
//        for (int i=0; i<n;  i++){
//            if(i<j){
//                arr[i]=0;
//            }else {
//                arr[i] = 1;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter how many element put in the Array : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter " + n + " Array element : ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("The original array : ");
//        printArray(arr);
//        sort(arr);
//        System.out.print("The Sorted array : ");
//        printArray(arr);
//
//    }
//}
            //BELLOW CODE IS WELL OPTIMIZE
import java.util.Scanner;
public class zero_one_short {
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
            if(arr[i]==1 && arr[j]==0) {
                swapArray(arr, i, j);
                i++; j--;
            }
            if (arr[i]==0){
                i++;
            }
            if (arr[j]==1){
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
        System.out.print("The original array : ");
        printArray(arr);
        reverseArray(arr);
        System.out.print("The Sorted array : ");
        printArray(arr);
    }
}
