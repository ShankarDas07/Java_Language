package loops;

public class MultipleOfFiveAndSeven {
    public static void main(String[] args) {
        int num = 1;
        while (true) {
            if (num % 5 == 0 && num % 7 == 0) {
                System.out.println("The first multiple of 5 and 7 is: " + num);
                break;
            }
            num++;
        }
    }
}
