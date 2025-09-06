package shorting;

import java.util.Scanner;

public class moveZeros {
    static void moveZero(int [] arr){
        int n= arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many element in the array : ");
        int n=sc.nextInt();
        System.out.print("Enter the array element : ");
        int [] arr=new int [n];
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        moveZero(arr);
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
