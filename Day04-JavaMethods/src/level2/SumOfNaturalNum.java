import java.util.Scanner;
public class SumOfNaturalNum {
        public static int recursiveSum(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n + recursiveSum(n - 1);
            }
        }
        public static int formulaSum(int n) {
            return (n * (n + 1)) / 2;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a natural number (n): ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Error: Please enter a natural number greater than 0.");
            } else {

                int sumRecursive = recursiveSum(n);
                int sumFormula = formulaSum(n);
                System.out.println("Sum of first " + n + " natural numbers (Recursive): " + sumRecursive);
                System.out.println("Sum of first " + n + " natural numbers (Formula): " + sumFormula);
                if (sumRecursive == sumFormula) {
                    System.out.println("Result Verified: Both computations match!");
                } else {
                    System.out.println("Error: Computations do not match!");
                }
            }
            sc.close();
        }
    }


