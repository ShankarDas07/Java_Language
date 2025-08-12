package one_D_array;

import java.util.Scanner;
public class Second_Largest_Element_Array {
    int firstMax(int [] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0; i< arr.length; i++){
          if (max<arr[i]){
              max=arr[i];
          }
        }
        return max;
    }

    int secondMax(int [] arr){
        int mx=firstMax(arr);
        for (int i=0; i< arr.length; i++){
            if (arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int highSecondValue=firstMax(arr);
        return highSecondValue;
    }



    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     Second_Largest_Element_Array obj=new Second_Largest_Element_Array();

        System.out.print("Enter how many element in the array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter "+n+" element in the array : ");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
//        int x=obj.firstMax(arr);
        int y= obj.secondMax(arr);
        System.out.print("The second Highest value is : "+y);
    }
}

                                    //USING Arrays.sort method
//import java.util.Scanner;
//import java.util.Arrays;
//
//    public class Second_Largest_Element_Array {
//
//        public int secondLargest(int[] arr) {
//            Arrays.sort(arr);
//            int ans= arr[arr.length - 2];// Corrected to get the second largest element
//            return ans;
//        }
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            Second_Largest_Element_Array obj = new Second_Largest_Element_Array();
//
//            System.out.print("Enter how many elements in the Array: ");
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            System.out.print("Enter " + n + " elements in the Array: ");
//             for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
//
//            int x = obj.secondLargest(arr);
//            System.out.println("The second largest element is: " + x);
//        }
//    }
