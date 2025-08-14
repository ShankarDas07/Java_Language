package one_D_array;

import java.util.Scanner;
public class sorted_or_not_array {
    boolean sortedEle(int [] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;

    }

    public static void main(String[] args) {
        sorted_or_not_array obj=new sorted_or_not_array();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many element put in the Array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter "+n+" Array element : ");
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        boolean x=obj.sortedEle(arr);
        System.out.println("The Array is Sorted : "+x);


    }
}


//import java.util.Scanner;
//public class sorted_or_not_array {
//    static void checkSorted(int[] arr) {
//        for (int i = 1; i < arr.length ; i++) {
//            if (arr[i] > arr[i - 1]) {
//                System.out.println("The array is Not Sorted");
//                return;
//            }
//        }
//        System.out.println("The array is Sorted");
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter how many element put in the Array : ");
//        int n=sc.nextInt();
//        int [] arr=new int[n];
//        System.out.print("Enter "+n+" Array element : ");
//        for (int i=0; i<n; i++){
//            arr[i]=sc.nextInt();
//        }
//        checkSorted(arr);
//    }
//}


