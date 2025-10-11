package A__java_Basic;

import java.util.Scanner;
public class child_adult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age=sc.nextInt();
        if (age<12){
            System.out.print("It is Child");
        }else if(age<18){
            System.out.print("It is Teenager");
        }else{
            System.out.print("It is Adult");
        }

    }
}
