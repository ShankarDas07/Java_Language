package binary_search;

import java.util.Scanner;

public class squreRoot {
    static int squre(int no){
        int ans=-1;
        int st=0; int end=no;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (mid*mid==no) return mid;
            else if (mid*mid >=no) {
                end=mid-1;
            }else {
                ans = mid;
                st = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No : ");
        int no= sc.nextInt();
        int x=squre(no);
        System.out.print("The square root of "+no+" is : "+x);
    }
}
