package one_D_array;

import java.util.Arrays;
import java.util.Scanner;
public class short_and_small_and_big_ele {
        int [] sortedEle(int [] arr) {
            Arrays.sort(arr);        //methods bota Array.sort ta ata nija nija sort kora dey
            int [] ans ={arr[0], arr[arr.length-1]};
            return ans;

        }
        public static void main(String[] args) {
            short_and_small_and_big_ele obj=new short_and_small_and_big_ele();
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter how many element put in the Array : ");
            int n=sc.nextInt();
            int [] arr=new int[n];
            System.out.print("Enter "+n+" Array element : ");
            for (int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            int [] ans=obj.sortedEle(arr);
            System.out.println("Smallest element of the Array : "+ans[0]); //2 to value save a6a array ta
            System.out.println("Largest element of the Array : "+ans[1]); // 1ti 0th index a r 2nd ta 1th index aa



        }
    }

//                                        //BOTH CODE ARE CORRECT
//import java.util.Scanner;
//
//public class short_and_small_and_big_ele {
//
//    // Method to find the smallest element in the array
//    int findSmallestElement(int[] arr) {
//        int smallest = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < smallest) {
//                smallest = arr[i];
//            }
//        }
//        return smallest;
//    }
//
//    // Method to find the highest element in the array
//    int findHighestElement(int[] arr) {
//        int highest = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > highest) {
//                highest = arr[i];
//            }
//        }
//        return highest;
//    }
//
//    public static void main(String[] args) {
//        short_and_small_and_big_ele obj = new short_and_small_and_big_ele();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter how many elements to put in the Array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter " + n + " Array elements: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int smallest = obj.findSmallestElement(arr);
//        int highest = obj.findHighestElement(arr);
//
//        System.out.println("The smallest element in the Array is: " + smallest);
//        System.out.println("The highest element in the Array is: " + highest);
//    }
//}



