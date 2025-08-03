package loops;

import java.util.Scanner;
public class sum_n_natural_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while (i<=n){
            sum +=i;
            //System.out.print("The sum is : "+sum);
            // under the loop sout create problen because everytime print the statement
            i++;
        }
        System.out.print("The sum is : "+sum);
    }
}
