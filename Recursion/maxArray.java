package recursion;

import java.util.Scanner;

public class maxArray {
    static int maxArr(int []arr, int idx){

        //The index of the last element in the array will always be arr.length - 1 because array indexing starts from 0
        if (idx== arr.length-1) return arr[idx];

        int ans=maxArr(arr,idx+1);
        
        return Math.max(ans,arr[idx]);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many element put in the Array : ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter the element in the Array: ");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(maxArr(arr,0));
    }
}
