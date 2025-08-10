package one_D_array;

import java.util.Scanner;
public class repeat_last_value_pair {
    int lastValuePair(int [] arr){
        int a=-1;
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i]==arr[j]){
                    a=arr[i];
                    break;
                }
            }
        }
        return a;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        repeat_last_value_pair obj=new repeat_last_value_pair();

        System.out.print("Enter how many element in the array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter "+n+" element in the array : ");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int x=obj.lastValuePair(arr);
        if (x==-1){
            System.out.print("Value pair does not exit in the array ");
        }else {
            System.out.println("Last value pair is : " + x);
        }
    }
}
