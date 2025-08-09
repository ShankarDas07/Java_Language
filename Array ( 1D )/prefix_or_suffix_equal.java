package one_D_array;

import java.util.Scanner;
public class prefix_or_suffix_equal {

    static int totalSum(int [] arr){
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        return sum;

    }

    static boolean prefixOrSuffix(int [] arr){
        int Totalsum=totalSum(arr);
        int preffixSum=0;
        int n= arr.length;
        for (int i=0; i<n; i++){
            preffixSum+=arr[i];
            int suffixSum=Totalsum-preffixSum;
            if(suffixSum==preffixSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("How many element in the array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter the "+n+" element in the array : ");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Equal partition possible : "+ prefixOrSuffix(arr));
    }
}
