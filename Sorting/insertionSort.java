package shorting;

import java.util.Scanner;

public class insertionSort {
    static void insertion(int [] arr){
        for (int i=1; i< arr.length; i++){
            int j=i;
            while (j>0 && arr[j] < arr[j-1]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
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
        insertion(arr);
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
