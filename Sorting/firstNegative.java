package shorting;

import java.util.Scanner;

public class firstNegative {
    static void firstNeg(int [] arr){
        int st=0;
        int end= arr.length-1;
        while (st < end){
            while (arr[st] <= 0) st++;
            while (arr[end] > 0) end--;
            if (st < end){
                //swap
                int temp=arr[st];
                arr[st]=arr[end];
                arr[end]=temp;
                st++; end--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" How many element in the array : ");
        int n= sc.nextInt();
        int []arr=new int[n];
        System.out.print("Enter the Element : ");
        for(int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        firstNeg(arr);
        for (int num: arr){
            System.out.print(num+ " ");
        }
    }
}
