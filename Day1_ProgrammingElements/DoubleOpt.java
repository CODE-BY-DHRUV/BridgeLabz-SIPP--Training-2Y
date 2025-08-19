import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

        // Performing operations (double arithmetic follows the same precedence rules)
        double result1 = a + b * c;    // Multiplication first, then addition
        double result2 = a * b + c;    // Multiplication first, then addition
        double result3 = c + a / b;    // Division first, then addition
        double result4 = a % b + c;    // Modulus first, then addition

        // Displaying results
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n",
                result1, result2, result3, result4);

        sc.close();
    }
}
