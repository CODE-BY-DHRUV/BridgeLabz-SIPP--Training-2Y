import java.util.Scanner;
public class QuoitentRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        int quotient = number1 / number2; // Division
        int remainder = number1 % number2; // Modulus

        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d%n",
                quotient, remainder, number1, number2);
    }
}
