package shorting;

import java.util.Scanner;

public class countSort {
    static int max(int []arr){
        int mx=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (mx<arr[i]){
                mx=arr[i];
            }
        }
       return mx;
    }
    //OPTIMIZE CODE with STABLE condition fulfill
    static void opCount(int [] arr){
        int[] output=new int[arr.length];
        int maxVal=max(arr);  // Find the largest element of the arr

        // Creating frequency array
        int [] count=new int[maxVal+1];
        for (int i=0;i< arr.length;i++){
            count[arr[i]]++;
        }

        // Make prefix sum array of count array
         for (int i=1; i< count.length; i++){
             count[i] += count[i-1];
         }

         // Find the index of each element in the original array and put it in output array
         for (int i=arr.length-1; i>=0; i--){
             int idx=count[arr[i]]-1;
             output[idx]=arr[i];
             count[arr[i]]--;
         }
         // copy all elements of output to arr
        for(int i = 0; i < arr.length; i++){
        arr[i] = output[i];
        }
    }


    //NOT OPTIMIZE CODE.   STABLE condition not fulfill
    static void basicCount(int [] arr){
        int maxVal=max(arr);
        int [] count=new int[maxVal+1];
        for (int i=0;i< arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for (int i=0;i<count.length;i++){
            for (int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }


    static void display(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many element in the arr : ");
        int n= sc.nextInt();
        int [] arr=new int [n];
        System.out.print("Enter the elements : ");
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
       // basicCount(arr);
        opCount(arr);
        System.out.print("The Shorting Element is : ");
        display(arr);

    }
}
