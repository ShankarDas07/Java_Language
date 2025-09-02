package recursion;

import java.util.ArrayList;
import java.util.Scanner;
public class subsSquences {
    static ArrayList<String> ssq(String s){
        ArrayList<String> ans=new ArrayList<>();
            // Base case
        if (s.length()==0){
            ans.add("");
            return ans;
        }
        char curr=s.charAt(0); // first later of ant input like abc= a.

        ArrayList<String> smallAns =ssq(s.substring(1));
        //SmallAns = "bc", "b", "c", " "

        // ans "abc", "ab", "ac", "a"
        for (String ss:smallAns){ // each and every element of smallAns , we can read a new ss variable
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s=sc.nextLine();
        System.out.println(ssq(s));


        ArrayList<String> ans=ssq(s);
        for (String ss:ans){
            System.out.print(ss+" ");
        }
    }
}
