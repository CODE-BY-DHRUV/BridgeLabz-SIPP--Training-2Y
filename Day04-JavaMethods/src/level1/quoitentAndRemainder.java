import java.util.Scanner;
public class quoitentAndRemainder {
        public static int findQuotient(int num1, int num2) {
            return num1 / num2;
        }
        public static int findRemainder(int num1, int num2) {
            return num1 % num2;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the first number (dividend): ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number (divisor): ");
            int num2 = sc.nextInt();

            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed!");
            } else {
                int quotient = findQuotient(num1, num2);
                int remainder = findRemainder(num1, num2);

                System.out.println("Quotient = " + quotient);
                System.out.println("Remainder = " + remainder);
            }
            sc.close();
        }
    }


