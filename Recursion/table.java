package recursion;

import java.util.Scanner;
public class table {
//        static int table(int n, int k){
//            if (k==0){
//                return 1;
//            }
//            table(n,k-1);
//            int ans=n*k;
//            System.out.println(ans);
//            return 0;
//        }

    //BOTH CODE ARE WORKING

    static void table(int n, int k){
        if (k==1){
            System.out.println(n);
            return;
        }
        table(n,k-1);
        System.out.println(n*k);
    }
    static void table2(int n, int k){
        if (k==0){
            return;
        }
        table(n,k-1);
        System.out.println(n*k);
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("which Table we want : ");
            int n= sc.nextInt();
            System.out.print("Table upto which No: ");
            int k= sc.nextInt();
            table2(n,k);

            System.out.println();

            table(n,k);
        }
}
