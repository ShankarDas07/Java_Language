package one_D_array;

import java.util.Scanner;
//class printArra {
//     void printArr(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}
public class demo {
    static void printArr(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print( n[i] + " ");
        }
    }

    static int equal(int [] arr,int x){
        int ans=-1;
            for (int i = 0; i < arr.length; i++) {
                if (x==arr[i]) {
                    System.out.println("The No is present ");
                    break;
                }//else
//                    System.out.println("The No is not present ");
            }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //printArra obj=new printArra();
        System.out.print("Enter the Array element : ");
        int n= sc.nextInt();
        int [] arr=new int [n];
        System.out.print("Enter "+ n +" Elements in the Array : ");
        for (int i=0; i< n;i++){
            arr[i]= sc.nextInt();
        }
        int x=5;
        equal(arr,x);
        //printArr(arr);
//        for (int i=0; i< n ; i++){
//            System.out.print (arr[i] + " ");
//        }
    }
}
