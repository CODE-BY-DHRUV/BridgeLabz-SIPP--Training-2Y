import java.util.Scanner;

public class ComparisonOfSumUsingFor {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a natural number (a positive integer): ");
            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                input.close();
                return;
            }

            int n = input.nextInt();

            if (n <= 0) {
                System.out.println("That's not a natural number. Please enter a positive integer.");
                input.close();
                return;
            }
            long sumWithFormula = (long) n * (n + 1) / 2;
            long sumWithLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumWithLoop += i;
            }
            System.out.println("\n--- Results ---");
            System.out.println("Sum calculated with the formula: " + sumWithFormula);
            System.out.println("Sum calculated with the for loop: " + sumWithLoop);

            if (sumWithFormula == sumWithLoop) {
                System.out.println("\n The results match! Both methods produced the same sum.");
            } else {
                System.out.println("\n The results do not match. There might be an error in the logic.");
            }

            input.close();
        }
    }

