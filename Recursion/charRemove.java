package recursion;

import java.util.Scanner;

public class charRemove {

    static String delete2 (String ch){
        if (ch.length()==0) return "";
        String small=delete2(ch.substring(1));
        char currentchar=ch.charAt(0);
        if (currentchar!='a') {
            return currentchar+small;
        }
        return small;
    }

    static String delete (String ch,int idx){
        if (idx==ch.length()) return "";
        String small=delete(ch,idx+1);
        char currentchar=ch.charAt(idx);
        if (currentchar!='a') {
            return currentchar+small;
        }
        return small;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String ch=sc.nextLine();
        System.out.println(delete(ch,0));

        System.out.println(delete2(ch));

    }
}
