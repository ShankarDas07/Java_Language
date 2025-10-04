package A__java_Basic;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int y = x;
        int rev = 0;
        while(y != 0){
            rev = rev*10 + y%10;
            y/=10;
        }
        System.out.println(x);
        System.out.println(rev);
        if(rev == x ) return true;
        return false;
    }

    public static boolean isArmstrong(int n) {
        int arms = 0; int sum = 0;
        while (n != 0) {
            arms = n%10;
            arms = arms*arms*arms;
            sum+=arms;
            n/=10;
        }
        System.out.println("The amos is "+sum);
        if(sum == n) return true;
        return false;
    }
    public static void main(String[] args) {
        int n = 153;
        boolean ans = isPalindrome(n);
        System.out.println(ans);


        boolean an = isArmstrong(n);
    }
}
