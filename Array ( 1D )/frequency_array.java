package one_D_array;

import java.util.Scanner;
public class frequency_array {
    int [] frequencyArray(int [] arr){
        int [] frequency= new int[100005];
        for (int i=0;i< arr.length; i++){
            frequency[arr[i]]++;
        }
        return frequency;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        frequency_array obj=new frequency_array();

        System.out.print("Enter how many elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int [] frequency=obj.frequencyArray(arr);

        System.out.print("Enter the No queries : ");
        int q=sc.nextInt();

        while (q>0){
            System.out.print("Enter the search element : ");
            int x=sc.nextInt();
            if (frequency[x] >0){
                System.out.println("The no "+x+" is present in the array");
            }else {
                System.out.println("The no " + x + " is not present in the array");
            }
            q--;
        }
    }
}
