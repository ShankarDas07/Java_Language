package one_D_array;

import java.util.Scanner;
public class Second_smallest_element_array {
    int minValue(int [] arr){
        int min=Integer.MAX_VALUE;
        for (int i=0; i< arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    int secondMin(int [] arr){
        int min=minValue(arr);
        for (int i=0; i< arr.length ;i++){
            if (arr[i]==min){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int secondMinValue=minValue(arr);
        return secondMinValue;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Second_smallest_element_array obj=new Second_smallest_element_array();

        System.out.print("How many element in the Array : ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter "+n+" element in the array :");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int y=obj.secondMin(arr);
        System.out.print(y);
    }
}
