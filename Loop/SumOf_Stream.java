package loops;

import java.util.Scanner;

    public class SumOf_Stream {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("The NO is:");

            int num = sc.nextInt();
            int sum = 0;

            while (num != -1) {
                sum += num;
                num = sc.nextInt();
            }

            System.out.print("The sum of stream is: " + sum);
        }
    }
