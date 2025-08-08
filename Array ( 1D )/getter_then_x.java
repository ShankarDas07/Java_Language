package one_D_array;

import java.util.Scanner;
public class getter_then_x {
    int getter(int [] arr,int x){
        int count=0;
      for (int i=0;i<arr.length;i++){
          if(x<arr[i]){
            count++;
          }
      }
      return count;
    }

    public static void main(String[] args) {
        getter_then_x obj =new getter_then_x();
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter how many element in the Array : ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter "+n+" element in the Array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Input the getter value : ");
        int y=sc.nextInt();
        int x=obj.getter(arr,y);
        System.out.print("All Getter value is : "+x);
    }
}
