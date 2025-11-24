import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.print("Enter an integer: ");
                int number = sc.nextInt();
                int sum = 0;
                int n = number;
                while (n != 0) {
                    int digit = n % 10;
                    sum += digit;
                    n = n / 10;
                }
                if (number % sum == 0) {
                    System.out.println(number + " is a Harshad Number.");
                } else {
                    System.out.println(number + " is NOT a Harshad Number.");
                }
            }
        }



