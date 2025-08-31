package recursion;

import java.util.Scanner;

public class seriesSum {
    static int seriesAdd(int n){
        if (n==0) return 0;
        //n=5 then +1 -2 +3 -4 +5 = 3
        if (n%2==0){
          return seriesAdd(n-1)-n;
        }else {
          return seriesAdd(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the No: ");
        int n=sc.nextInt();
        System.out.println(seriesAdd(n));

    }
}
