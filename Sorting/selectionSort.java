package shorting;

import java.util.Scanner;

public class selectionSort {
    static void selection(int [] arr){
        for (int i=0; i< arr.length-1; i++){
            int min_idx=i;
            for (int j=i+1; j< arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
                //swap current element and minimum element --> current index i will be current element
                if (min_idx!=i){
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("how many element in the arrar : ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter the array element : ");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        selection(arr);
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
