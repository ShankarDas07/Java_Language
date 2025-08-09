package one_D_array;

import java.util.Scanner;
public class queries_sum {
    static int [] queriesSum(int [] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
                //IT IS NOT OPTIMIZE CODE
//import java.util.Scanner;
//public class queries_sum {
//    static int queriesSum(int x, int y,int [] arr){
//        int n= arr.length;
//        int sum=0;
//        if (x >= 1 && y < n && x <= y) {
//            for (int i=x; i<=y; i++){
//                sum+=arr[i];
//            }
//        } else {
//            System.out.println("Invalid range for queries.");
//        }
//
//        return sum;
//    }
    public static void main(String[] args) {
        queries_sum obj=new queries_sum();
        Scanner sc=new Scanner(System.in);
        
        System.out.print("How many element in the array : ");
        int n=sc.nextInt();
        int [] arr=new int[n+1];
        System.out.print("Enter the "+n+" element in the array : ");
        for (int i=1; i<=n; i++){
            arr[i]= sc.nextInt();
        }

        int [] prefixSum =obj.queriesSum(arr);
        System.out.print("How many times queries : ");
        int q= sc.nextInt();
        while (q-->0) {
            System.out.print("Enter start queries : ");
            int x = sc.nextInt();
            System.out.print("Enter end queries : ");
            int y = sc.nextInt();
            int sum = prefixSum[y] - prefixSum[x - 1];
            System.out.println("The sum is : " + sum);
        }
    }
}
