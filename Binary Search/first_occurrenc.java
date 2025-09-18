package binary_search;

import java.util.Scanner;

public class first_occurrenc {
    static int firstOccur(int []arr,int tar){
        int st=0; int end= arr.length-1;
        int first=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]==tar){
                first=mid;
                end=mid-1; //st=mid+1; --> Find last occurrence change this line
            } else if (tar>mid) {
             st=mid+1;
            }else
                end=mid-1;
        }
        return first;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many element in the array : ");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter the "+n+" element in the array : ");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the target : ");
        int tar= sc.nextInt();
        int x=firstOccur(arr,tar);
        System.out.print("The index "+tar+" is: "+x);
    }
}
