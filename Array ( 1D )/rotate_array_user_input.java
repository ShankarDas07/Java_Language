package one_D_array;

import java.util.Scanner;
public class rotate_array_user_input {
    int [] rotateArray(int k, int [] arr){
        k=k % arr.length;
        int [] ans=new int[arr.length];
        int j=0;
        for (int i=arr.length-k; i< arr.length; i++ ){
            ans[j++]=arr[i];
        }
        for (int i=0; i< arr.length-k; i++){
            ans[j++]=arr[i];
        }
        return ans;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        rotate_array_user_input obj=new rotate_array_user_input();


        System.out.print("Enter how many element in the array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter "+n+" element in the array : ");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("How many time rotate the array : ");
        int k=sc.nextInt();
        int [] x= obj.rotateArray(k,arr);
        System.out.print("The rotate Array is : ");
        for (int i=0; i<x.length; i++){
        System.out.print(x[i]+" ");
        }

    }
}
