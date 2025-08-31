package recursion;

import java.util.Scanner;
public class reverseString {
    static String reverse (String s,int idx){
        if (idx==s.length()) return "";
        String val= reverse(s,idx+1);
        return val + s.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s= sc.nextLine();
        System.out.println(reverse(s,0));

    }
}
