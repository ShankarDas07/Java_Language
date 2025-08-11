package one_D_array;

import java.util.Scanner;
public class reverse_a_array {
     int [] reverse(int [] arr){
        int j=0;
        int n= arr.length;
        int [] ans=new int[n];
        for (int i= n-1; i>=0; i--){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        reverse_a_array obj=new reverse_a_array();
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter how many element in the array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter "+n+" element in the array : ");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int[] x=obj.reverse(arr);
        System.out.print("The reverse array is : ");
//        for (int i : x){     //for each loop this is correct
        for (int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
    }
}



