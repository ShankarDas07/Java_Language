package loops;

import java.util.Scanner;
public class rectangle_print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Raws : ");
        int r=sc.nextInt();
        System.out.print("Enter the Colomns ");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
