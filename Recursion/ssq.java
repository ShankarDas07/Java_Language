package recursion;

import java.util.Scanner;

public class ssq {
    static void subsquences(String s, String currAns){
        if (s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr=s.charAt(0);
        String remain=s.substring(1);
        subsquences(remain,currAns+curr);
        subsquences(remain,currAns);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s= sc.nextLine();
        subsquences(s," ");

    }
}
