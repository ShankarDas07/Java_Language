package one_D_array;

import java.util.Scanner;

public class demo_one {
    static int sum(int [] arr){
        int add=0;
        for (int i=0;i< arr.length;i++){
            add+=arr[i];
        }
        return add;
    }

    static boolean equalArray(int [] arr){
        int total=sum(arr);
         int prefix=0;
         for (int i=0;i< arr.length;i++) {
             prefix += arr[i];
             int suffix = total - prefix;
             if (prefix == suffix) {
                 return true;
             }
         }
         return false;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("how many element in the array : ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter the array element : ");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Equal partition is possible : " +equalArray(arr));
    }
}
