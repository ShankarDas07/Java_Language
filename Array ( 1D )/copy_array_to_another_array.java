package one_D_array;

import java.util.Scanner;
class printArray{          //class create
    void loop(int [] arr){ //method name
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class copy_array_to_another_array{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printArray output=new printArray();

        System.out.print("How many input in the Array : ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter "+n+" element : ");
        for (int i =0; i<n; i++ ){
            arr[i]= sc.nextInt();
        }
        System.out.print("The "+n+" array is : ");
        output.loop(arr);

        // copping array to another:(arr_2) array
        int [] arr_2 =arr;

        System.out.print("the copy array is : ");
        output.loop(arr_2);

        //changing the arr_2 element
        arr_2[0]=5;
        arr_2[1]=554;
        System.out.print("Original array After changing array_2 : ");
        output.loop(arr);
        System.out.print("changing the array_2 element : ");
        output.loop(arr_2);
    }
}

