package one_D_array;

import java.util.Scanner;
public class repeat_first_value {
    int repectValue(int [] arr){
        int i=0;
        for (; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        repeat_first_value obj=new repeat_first_value();

        System.out.print("Enter how many element in the array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter "+n+" element in the array : ");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int x=obj.repectValue(arr);
        if(x==-1){
            System.out.print("There is no repeating value is :");
        }else {
            System.out.print("The repeating value is : " + x);
        }
    }
}
