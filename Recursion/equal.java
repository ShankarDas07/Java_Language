package recursion;

import java.util.Scanner;

public class equal {

        //find 1st index -> return index of target if target is present in array, otherwise return -1
    static int findIndex(int []arr,int ter, int idx){
        if (idx>= arr.length) return -1;
        if (arr[idx]==ter) return idx;
        return findIndex(arr, ter, idx+1);
    }

    static boolean terget(int [] arr, int ter, int idx){
        if (idx>=arr.length) return false;
        if (arr[idx]==ter) return true;

        //return terget(arr,ter,idx+1);
                //or
        if (terget(arr,ter,idx+1)) return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many element put in the array : ");
        int n= sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the element : ");
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the target : ");
        int ter= sc.nextInt();
      if( terget(arr, ter, 0)){
          System.out.println("The target is present : YES");
      }else{
          System.out.println("The target is present : No");
      }
                //find the index
        System.out.println("Target is present in the index no of : " + findIndex(arr, ter, 0));

    }
}
