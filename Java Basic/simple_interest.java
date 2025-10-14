package A__java_Basic;

import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principal : ");
        float p=sc.nextFloat();
        System.out.print("Enter the Interest : ");
        float r=sc.nextFloat();
        System.out.print("Enter the Time : ");
        float t=sc.nextFloat();
        float simpleInterest=(p*r*t)/100;
        System.out.print("The simple Interest is : "+simpleInterest);
    }
}
