package H__strings;

import java.util.Scanner;

public class dup_char_count {
    static String duplichar(String str){
        String ans = ""+str.charAt(0); //a3   b
        int count=1;
        for (int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char pre = str.charAt(i-1);
            if (curr==pre){
               count++;
            }else {
                if (count>1) ans+=count; //update the value of last i th char
                count=1; //when come a new another character then count is 1
                ans+=curr; //putting the next another character
            }
        }
        if (count>1) ans+=count;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the various duplicate character : ");
        String str = new String(sc.nextLine());
        System.out.println("the duplicate char count is :"+duplichar(str));
    }
}
