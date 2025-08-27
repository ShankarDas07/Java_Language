package recursion;

import java.util.Scanner;

public class gcd {

    static int lgcd(int x, int y){
        while (x % y != 0) {
            int remander = x%y;
            x = y;
            y = remander;
        }
        return y;
    }

    static int gcd(int x, int y){
        if (y==0) return x;
        return gcd(y,x%y);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 1st No : ");
        int x= sc.nextInt();
        System.out.println("Enter 2nd No : ");
        int y= sc.nextInt();

        System.out.println("Using Loop The "+x+" & "+ y+ " GCD is : "+lgcd(x,y));

        System.out.println("Using Recursion The "+x+" & "+ y+ " GCD is : "+gcd(x,y));
    }
}
