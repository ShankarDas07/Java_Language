package recursion;

import java.util.Scanner;

public class sumOfdigits {
    static int sumDigit(int []arr, int idx){
        if (idx== arr.length-1) return arr[idx];
        int sum= sumDigit(arr,idx+1);
        return sum+arr[idx];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many element put in the Array : ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the Element : ");
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The Sum is : "+sumDigit(arr,0));
    }
}
