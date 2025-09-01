package recursion;

import java.util.Scanner;
public class square_of_two_no {
//    static int square(int p, int q){
//            //base case
//        if(q==0) return 1;
//            //recursive work
//        int pow=square(p,q-1);
//            //self work
//        return p*pow;
//    }

                //optimize code
        static int square(int p, int q){
            //base case
           if(q==0) return 1;

           //recursive work
            int Pow = square(p, q / 2);
            if (q%2==0) {  //even square no
                return Pow*Pow;
            }
            else { //odd square no
                return Pow*Pow*p;
            } 
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no : ");
        int p= sc.nextInt();
        System.out.print("Enter the Square no : ");
        int q= sc.nextInt();
        int x=square(p,q);
        System.out.println(p+" power "+q+" is: "+x);
    }
}
