package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListMultipleIndex {
    static ArrayList<Integer> listIndices(int [] arr, int ter, int idx){

        if (idx>= arr.length) return new ArrayList<Integer>() ;

        ArrayList<Integer> ans=new ArrayList<>();
        if (ter==arr[idx]) {
            ans.add(idx);  // only first index ware put in the ans variable
        }
        ArrayList<Integer> otherIndices=listIndices(arr,ter,idx+1);
        ans.addAll(otherIndices);   //addAll is a method name.
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many element put in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target : ");
        int ter = sc.nextInt();

        System.out.println(listIndices(arr,ter,0));
    }
}
