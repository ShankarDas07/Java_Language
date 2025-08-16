package one_D_array;

import java.util.Scanner;
public class sum_equal_to_x {
    int  pairsCount(int [] arr,int x){
        int count=0;
        for (int i=0; i<arr.length;i++){
             for (int j=i+1; j<arr.length; j++){
                if(x==arr[i]+arr[j]){
                count++ ;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        sum_equal_to_x obj=new sum_equal_to_x();
        Scanner sc =new Scanner(System.in);


        System.out.print("Enter how many element in the Array : ");
        int n=sc.nextInt();
        int [] arr =new int[n];
        System.out.print("Enter "+n+" element in the Array : ");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int x=11;
        int ans=obj.pairsCount(arr,x);
        System.out.println(ans+" : pairs is equal to x= "+x);
    }
}
