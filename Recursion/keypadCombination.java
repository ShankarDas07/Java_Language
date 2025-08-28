package recursion;

import java.util.Scanner;

public class keypadCombination {
    static void combiNation(String digit, String[] kp, String res){
        if (digit.length()==0){
            System.out.print(res +" ");
            return;
        }
        int currNum = digit.charAt(0)-'0'; // 2
        String currChoices = kp[currNum]; //"abc"
        for (int i=0; i<currChoices.length(); i++){    //"abc"
            combiNation(digit.substring(1), kp, res + currChoices.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the keypad digit : ");
        String digit= sc.nextLine();
        String [] kp={"","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //press keypad 0, 1,   2     3     4     5     6      7     8     9
        combiNation(digit,kp,"");
    }
}
