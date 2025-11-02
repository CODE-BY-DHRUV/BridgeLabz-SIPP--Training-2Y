import java.util.Scanner;
public class FactorialUsingFor {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a non-negative integer to find its factorial: ");
            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number.");
                input.close();
                return;
            }
            int number = input.nextInt();
            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers. Please enter a non-negative integer.");
                input.close();
                return;
            }
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is " + factorial + ".");
            input.close();
        }
    }

