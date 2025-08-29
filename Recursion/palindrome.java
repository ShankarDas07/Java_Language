package recursion;

import java.util.Scanner;
public class palindrome {

    static boolean palindrome(String s,int l, int r){
        if (l>=r) return true;
        return (s.charAt(l)==s.charAt(r) && palindrome(s, l+1, r-1));
    }

        static String reverse (String s,int idx){
            if (idx==s.length()) return "";
            String val= reverse(s,idx+1);
            return val + s.charAt(idx);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the String : ");
            String s = sc.nextLine();
            String same=reverse(s, 0);
            if (same.equals(s)) {    // when we try to cheek if string is equal or not this [ if (same==s) ] condition not working.
                                    // we can car_use equals method
                System.out.println(s+" String is palindrome ");
            }
            else
                System.out.println(s+" String is not palindrome ");

            System.out.println("The String is palindrome : "+palindrome(s, 0, s.length()-1));

        }

}
