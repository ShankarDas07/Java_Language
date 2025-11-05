package H__strings;

public class Palindrome_String {
    public static void main(String[] args) {
        String str="ABCDhCBA";
        int i=0; int j=str.length()-1;
        boolean flag=true;
        while (i<j){
            if (str.charAt(i) != str.charAt(j)) flag=false;
            i++; j--;
        }
        if (flag==true) System.out.println(" Palindrome ");
        else System.out.println(" Not Palindrome ");
    }
}
