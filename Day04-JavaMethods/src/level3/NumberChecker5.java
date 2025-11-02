import java.util.Arrays;
public class NumberChecker5 {
        public static int sumOfProperDivisors(int num) {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) { // Proper divisors are < num
                if (num % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }
        public static boolean isPerfectNumber(int num) {
            if (num <= 0) return false;
            return sumOfProperDivisors(num) == num;
        }
        public static boolean isAbundantNumber(int num) {
            if (num <= 0) return false;
            return sumOfProperDivisors(num) > num;
        }
        public static boolean isDeficientNumber(int num) {
            if (num <= 0) return false;
            return sumOfProperDivisors(num) < num;
        }
        public static int factorial(int n) {
            int fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }

        public static boolean isStrongNumber(int num) {
            int temp = num;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp /= 10;
            }
            return sum == num;
        }
        public static void main(String[] args) {
            int number = 28;
            System.out.println("Number: " + number);

            System.out.println("Is Perfect Number? " + isPerfectNumber(number));
            System.out.println("Is Abundant Number? " + isAbundantNumber(number));
            System.out.println("Is Deficient Number? " + isDeficientNumber(number));
            System.out.println("Is Strong Number? " + isStrongNumber(number));
        }
    }

