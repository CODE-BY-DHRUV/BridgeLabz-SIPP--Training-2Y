import java.util.Scanner;
public class CheckAndSumNatural {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();

            if (n > 0) {
                long sum = n * (n + 1) / 2;
                System.out.println("The sum of " + n + " natural numbers is " + sum);
            } else {
                System.out.println("The number " + n + " is not a natural number");
            }
        }
    }


