import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;

        double division;
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed.");
            division = Double.NaN;
        }

        System.out.printf(
                "The addition, subtraction, multiplication and division values of %.2f and %.2f are %.2f, %.2f, %.2f, and %s%n",
                number1, number2, addition, subtraction, multiplication,
                 division
        );

        sc.close();
    }
}
