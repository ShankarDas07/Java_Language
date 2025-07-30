package loops;

import java.util.Scanner;
public class pattern_eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Raw No : ");
        int r = sc.nextInt();
        System.out.print("Enter the Column : ");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                int k=i+j;
                if (k%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }
}
