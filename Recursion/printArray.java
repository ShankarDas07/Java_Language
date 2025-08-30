package recursion;

import java.util.Scanner;

public class printArray {
    static void print(int []arr,int idx){
              // Base case
        if (idx==arr.length) return;

            //self work
        System.out.println(arr[idx]);

            // Recursive work
        print(arr,idx+1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many element put in the Array : ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.print("Enter the array element : ");
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        print(arr, 0);
    }
}
  //int []arr={11,22,33};
