package shorting;

import java.util.Scanner;
public class radixSort {
    static void display(int []arr){
       for (int i=0; i< arr.length; i++){
           System.out.print(arr[i] +" ");
       }
    }

    static int max(int []arr){
        //Get MAXIMUM element of the given array
        int mx=Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            if (mx<arr[i]){
                mx=arr[i];
            }
        }
        return mx;
    }

    static void opCount(int []arr,int place ){

        int[] output=new int[arr.length];
        int [] count=new int[10];

        for (int i=0;i< arr.length;i++){
            count[(arr[i]/place)%10]++; // Make frequency array, arr[i] = 105, freq[5]++, where place=1;
        }                                                       // arr[i] = 105 , freq[0]++, place = 10;
                                                                // arr[i] = 105 , freq[1]++, place = 100;


        // Make prefix sum array of count array
        for (int i=1; i< count.length; i++){
            count[i] += count[i-1];
        }
        // Find the index of each element in the original array and put it in output array
        for (int i=arr.length-1; i>=0; i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        // copy all elements of output to arr
        for(int i = 0; i < arr.length; i++){
            arr[i] = output[i];
        }
    }

    static void radix(int []arr){
        int maxVal=max(arr);
        for (int place=1; maxVal/place>0; place*=10){
            opCount(arr,place);
        }
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter how many element in the arr : ");
    int n= sc.nextInt();
    int []arr=new int[n];
    System.out.print("Enter the element : ");
    for (int i=0; i<arr.length; i++){
        arr[i]= sc.nextInt();
    }
    radix(arr);
    System.out.print("The Shorting Element is : ");
    display(arr);

    }
}
