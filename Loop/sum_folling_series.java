package loops;

import java.util.Scanner;
public class sum_folling_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n= sc.nextInt();
        int sum=0;
        int i=1;
        for(;i<=n; i++){
            if(i%2==0){
                sum=sum-i;
            }else{
                sum=sum+i;
            }
        }
        System.out.println("The eqution is :"+sum);


    }
}
