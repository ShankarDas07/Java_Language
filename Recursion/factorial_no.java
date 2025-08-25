package recursion;

import java.util.Scanner;
public class factorial_no {
    static int factorial(int n){
           //Base case
        if (n==0) { // n==1 is also wright
            return 1;
        }

          //Sub Problem or Smaller problem
        int sub=factorial(n-1);

          //Self Work or Big problem
        int ans=n*sub;
        return ans;

//        if (n==0) return 1;
//        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n= sc.nextInt();
        System.out.println("The factorial No is : "+factorial(n));
    }
}
