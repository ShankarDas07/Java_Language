package one_D_array;

import java.util.Scanner;
public class unique_value_array {
    int uniqueValue(int [] arr){
        for (int i=0; i< arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for (int i=0; i< arr.length;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        unique_value_array obj=new unique_value_array();
        Scanner sc=new Scanner(System.in);


        System.out.print("Enter how many element in the Arry : ");
        int n= sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter "+n+" element in the Array : ");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int x=obj.uniqueValue(arr);
        System.out.print("The unique value is : "+x);
    }
}
