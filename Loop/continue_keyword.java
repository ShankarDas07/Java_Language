package loops;

import java.util.Scanner;
public class continue_keyword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No : ");
        int num=sc.nextInt();
        for(int i=1; i<=num; i++){
            if (i%3==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
