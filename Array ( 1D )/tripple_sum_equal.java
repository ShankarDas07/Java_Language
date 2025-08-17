package one_D_array;

import java.util.Scanner;
public class tripple_sum_equal{
    int triuplrSum(int y,int [] arr){
        int count=0;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                for (int k=j+1; k< arr.length; k++){
                    if (y==arr[i]+arr[j]+arr[k]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        tripple_sum_equal obj=new tripple_sum_equal();
        Scanner sc =new Scanner(System.in);


        System.out.print("Enter how many Element in the array : ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.print("enter "+n+" 1element in the array : ");
        for (int i=0; i <n; i++){
            arr[i]= sc.nextInt();
        }
        int y=15;
        int x=obj.triuplrSum(y,arr);
        System.out.println(x+" : pairs is equal to x= "+y);
    }
}
